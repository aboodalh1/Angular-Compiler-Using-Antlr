package nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Map;
import gen.AngularLexer;
import gen.AngularParser;
import gen.AngularParserVisitor;
import nodes.SymbolTables.ComponentSymbolTable;
import nodes.SymbolTables.ServiceSemanticValidator;
import nodes.SymbolTables.mainSymbolTable;
import nodes.codegen.CodeGenerationManager;
import nodes.css_node.CssClassContentNode;
import nodes.css_node.CssContentNode;
import nodes.css_node.CssNode;
import nodes.html_node.*;
import nodes.html_node.HtmlElementNode;
import nodes.html_node.html_content.NgForNode;
import nodes.html_node.html_content.NgIfNode;
import nodes.html_node.html_content.OnChangeNodeAttr;
import nodes.html_node.html_content.OnClickAttrNode;
import nodes.statement.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import static helper.keyWords.*;
import static helper.methods.printAST;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class BaseVisitorWithCodeGen extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {

    mainSymbolTable symbolTable = new mainSymbolTable();
    ComponentSymbolTable componentSymbolTable = new ComponentSymbolTable();
    ServiceSemanticValidator serviceSymbolTable = new ServiceSemanticValidator();
    private CodeGenerationManager codeGenManager;
    private String currentScope = GLOBAL;
    Stack<String> scopeStack = new Stack<>();
    private final List<String> componentScopeNames = new ArrayList<>();
    private boolean isInsideComponent = false;
    private ProgramNode programAST;

    public BaseVisitorWithCodeGen() {
        this.codeGenManager = new CodeGenerationManager("generated");
    }

    public BaseVisitorWithCodeGen(String outputDirectory) {
        this.codeGenManager = new CodeGenerationManager(outputDirectory);
    }


    public ASTNode initialize() throws IOException {
        // 1. Parse the input and build the initial parse tree
        ParseTree tree = initializeProgram();

        // 2. Create a single SemanticAnalyzer with all necessary symbol tables
        SemanticAnalyzer analyzer = new SemanticAnalyzer(serviceSymbolTable, componentSymbolTable);

        // 3. Walk the tree to perform semantic analysis
        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(analyzer, tree);

        // 4. Print the collected semantic errors and symbol tables
        System.out.println("\n--- Semantic Analysis Results ---");
        List<String> semanticErrors = analyzer.getSemanticErrors();
        if (semanticErrors.isEmpty()) {
            System.out.println("No semantic errors found.");
        } else {
            System.err.println("Found " + semanticErrors.size() + " error(s):");
            semanticErrors.forEach(System.err::println);
        }

        System.out.println("\n--- Symbol Tables ---");
        System.out.println("--- Main Symbol Table ---");
        symbolTable.print();
        System.out.println("\n--- Service Symbol Table ---");
        serviceSymbolTable.print();
        System.out.println("\n--- Component Symbol Table ---");
        componentSymbolTable.print();

        // 5. Return the AST root node for code generation
        return visitProgram((AngularParser.ProgramContext) tree);
    }

    public void generateCode() {
        if (programAST != null) {
            System.out.println("\n--- Code Generation ---");

            // Generate all code formats
            Map<String, String> generatedCode = codeGenManager.generateAll(programAST);

            // Print generated code
            for (Map.Entry<String, String> entry : generatedCode.entrySet()) {
                String format = entry.getKey().toUpperCase();
                String code = entry.getValue();

                System.out.println("\n--- Generated " + format + " ---");
                System.out.println(code);
                System.out.println("--- End " + format + " ---\n");
            }

            // Save files
            codeGenManager.generateAndSave(programAST, "app");

            // Generate complete web application
            codeGenManager.generateWebApp(programAST, "angular-app");
        } else {
            System.err.println("No AST available for code generation");
        }
    }

    public void generateCodeForFormat(String format) {
        if (programAST != null) {
            try {
                String code = codeGenManager.generate(programAST, format);
                System.out.println("\n--- Generated " + format.toUpperCase() + " ---");
                System.out.println(code);
                System.out.println("--- End " + format.toUpperCase() + " ---\n");
            } catch (Exception e) {
                System.err.println("Error generating " + format + " code: " + e.getMessage());
            }
        }
    }

    public ParseTree initializeProgram() throws IOException {
        CharStream charStream = fromFileName(DEFAULT_SOURCE_FILE);
        AngularLexer lexer = new AngularLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(tokens);

        ParseTree tree = parser.program();
        System.out.println("Parsing completed successfully.");

        programAST = (ProgramNode) this.visitProgram((AngularParser.ProgramContext) tree);
        printAST(programAST);

        return tree;
    }

    // Getter for the AST (useful for external access)
    public ProgramNode getProgramAST() {
        return programAST;
    }

    // Getter for code generation manager
    public CodeGenerationManager getCodeGenerationManager() {
        return codeGenManager;
    }

    @Override
    public ASTNode visitProgram(AngularParser.ProgramContext ctx) {
        ProgramNode programNode = new ProgramNode();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement() != null) {
                StatementNode statementNode = visitStatement(ctx.statement(i));
                programNode.getStatements().add(statementNode);
            }
        }
        return programNode;
    }

    @Override
    public StatementNode visitStatement(AngularParser.StatementContext ctx) {
        StatementNode statement = new StatementNode();
        if (ctx.classRule() != null) {
            ClassNode anclass = visitClassRule(ctx.classRule());
            statement.setClassNodes(anclass);
        }
        if (ctx.variableDeclaration() != null) {
            VariableDeclarationNode variableDeclarationNode = visitVariableDeclaration(ctx.variableDeclaration());
            statement.setVariableDeclarationNodes(variableDeclarationNode);
        }
        if (ctx.functionDeclaration() != null) {
            FunctionDeclarationNode functionDeclarationNode = visitFunctionDeclaration(ctx.functionDeclaration());
            statement.setFunctionDeclarationNodes(functionDeclarationNode);
        }
        if (ctx.ifStatement() != null) {
            IfStatementNode ifStatementNode = visitIfStatement(ctx.ifStatement());
            statement.setIfStatementNodes(ifStatementNode);
        }
        if (ctx.whileStatement() != null) {
            WhileStatementNode whileStatementNode = visitWhileStatement(ctx.whileStatement());
            statement.setWhileStatementNodes(whileStatementNode);
        }
        if (ctx.assignmentStatement() != null) {
            AssignmentStatementNode assignmentStatementNode = visitAssignmentStatement(ctx.assignmentStatement());
            statement.setAssignmentStatementNodes(assignmentStatementNode);
        }
        if (ctx.breakStatement() != null) {
            BreakStatementNode breakStatementNode = visitBreakStatement(ctx.breakStatement());
            statement.setBreakStatementNodes(breakStatementNode);
        }
        if (ctx.continueStatement() != null) {
            ContinueStatementNode continueStatementNode = visitContinueStatement(ctx.continueStatement());
            statement.setContinueStatementNodes(continueStatementNode);
        }
        if (ctx.importStatement() != null) {
            ImportStatementNode importStatementNode = visitImportStatement(ctx.importStatement());
            statement.setImportStatementNodes(importStatementNode);
        }
        if (ctx.component() != null) {
            ComponentNode componentNode = visitComponent(ctx.component());
            statement.setComponentNodes(componentNode);
        }
        if (ctx.exportClass() != null) {
            ExportClassNode exportClassNode = visitExportClass(ctx.exportClass());
            statement.setExportClassNode(exportClassNode);
        }
        if(ctx.interface_()!=null){
            InterfaceNode interfaceNode = visitInterface(ctx.interface_());
            statement.setInterfaceNode(interfaceNode);
        }
        return statement;
    }

    @Override
    public ComponentNode visitComponent(AngularParser.ComponentContext ctx) {
        ComponentNode componentNode = new ComponentNode();
        if (ctx.decoratorArgs() != null) {
            DecoratorNode decoratorNode = visitDecoratorArgs(ctx.decoratorArgs());
            componentNode.setDecorator(decoratorNode);
        }
        if (ctx.exportClass() != null) {
            componentNode.setExportClass(visitExportClass(ctx.exportClass()));
        }
        return componentNode;
    }

    @Override
    public DecoratorNode visitDecoratorArgs(AngularParser.DecoratorArgsContext ctx) {
        DecoratorNode decoratorNode = new DecoratorNode();
        if (ctx.argument() != null) {
            for(int i=0;i<ctx.argument().size();i++){
                decoratorNode.getArguments().add(visitArgument(ctx.argument(i)));
            }
        }
        return decoratorNode;
    }

    @Override
    public ExportClassNode visitExportClass(AngularParser.ExportClassContext ctx) {
        ExportClassNode exportClassNode = new ExportClassNode();
        if (ctx.Identifier() != null) {
            exportClassNode.setName(ctx.Identifier().getText());
        }
        if(ctx.classBody()!=null){
            exportClassNode.setClassBody(visitClassBody(ctx.classBody()));
        }
        return exportClassNode;
    }

    @Override
    public ClassNode visitClassRule(AngularParser.ClassRuleContext ctx) {
        ClassNode classNode = new ClassNode();
        if (ctx.Identifier() != null) {
            classNode.setIdentifier(ctx.Identifier().getText());
        }
        if(ctx.classBody()!=null){
            classNode.setClassBody(visitClassBody(ctx.classBody()));
        }
        return classNode;
        }

    @Override
    public ClassBodyNode visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBodyNode classBodyNode = new ClassBodyNode();
        for (int i = 0; i < ctx.variableDeclaration().size(); i++) {
            if (ctx.variableDeclaration().get(i) != null) {
                classBodyNode.getVariableDeclarationNodes().add(visitVariableDeclaration(ctx.variableDeclaration(i)));

            }
        }
        for (int i = 0; i < ctx.functionDeclaration().size(); i++) {
            if (ctx.functionDeclaration().get(i) != null) {
                classBodyNode.getFunctionDeclarationNodes().add(visitFunctionDeclaration(ctx.functionDeclaration(i)));

            }
        }
        for (int i = 0; i < ctx.arrayDeclaration().size(); i++) {
            if (ctx.arrayDeclaration().get(i) != null) {
                classBodyNode.getArrayDeclarationNodeList().add(visitArrayDeclaration(ctx.arrayDeclaration(i)));

            }
        }
        for (int i = 0; i < ctx.objectDeclataion().size(); i++) {
            if (ctx.objectDeclataion().get(i) != null) {
                classBodyNode.getObjectDeclarationNodes().add(visitObjectDeclataion(ctx.objectDeclataion(i)));
            }
        }
        return classBodyNode;
    }

    @Override
    public ASTNode visitAbstractClass(AngularParser.AbstractClassContext ctx) {
        AbstractClassNode abstractClassNode = new AbstractClassNode();
        if (ctx.Identifier() != null) {
            abstractClassNode.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.classBody() != null) {
            abstractClassNode.setClassBody(visitClassBody(ctx.classBody()));
        }
        return abstractClassNode;
    }

    @Override
    public InterfaceNode visitInterface(AngularParser.InterfaceContext ctx) {

        InterfaceNode interfaceNode = new InterfaceNode();
        if (ctx.Identifier() != null) {
            interfaceNode.setName(ctx.Identifier().getText());
        }
        if (ctx.interfaceBody() != null) {
            interfaceNode.setClassBody(visitInterfaceBody(ctx.interfaceBody()));
        }
        return interfaceNode;
    }

    @Override
    public ClassBodyNode visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {
        ClassBodyNode interfaceBodyNode = new ClassBodyNode();
        for (int i = 0; i < ctx.variableDeclaration().size(); i++) {
            if (ctx.variableDeclaration().get(i) != null) {
                interfaceBodyNode.getVariableDeclarationNodes().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
            }
        }
        // Note: Interface body may not have function declarations in this grammar
        // This is a simplified implementation
        return interfaceBodyNode;
    }

    @Override
    public ASTNode visitAccessModifier(AngularParser.AccessModifierContext ctx) {
        AccessModifierNode accessModifierNode = new AccessModifierNode();
        if (ctx.getText() != null) {
            // Note: AccessModifierNode may not have setModifier method
            // This is a simplified implementation
        }
        return accessModifierNode;
    }



    @Override
    public ArgumentNode visitArgument(AngularParser.ArgumentContext ctx) {
        ArgumentNode argumentNode = new ArgumentNode();
        if (ctx.Identifier() != null) {
            argumentNode.setName(ctx.Identifier().getText());
        }
        if(ctx.html()!=null){
            System.out.println(ctx.html().getText());
            argumentNode.setHtmlNode(visitHtml(ctx.html()));
        }
        if(ctx.css()!=null){
            argumentNode.setCssNode(visitCss(ctx.css()));
        }
        return argumentNode;

    }

    @Override
    public ImportStatementNode visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatementNode importStatementNode = new ImportStatementNode();
        if (ctx.Identifier() != null) {
            importStatementNode.setIdentifier(ctx.Identifier().toString());
        }
        if (ctx.StringLiteral() != null) {
            importStatementNode.setSource(ctx.StringLiteral().getText());
        }
        return importStatementNode;
    }

    @Override
    public ASTNode visitConsoleLog(AngularParser.ConsoleLogContext ctx) {
        ConsoleLogNode consoleLogNode = new ConsoleLogNode();
        if (ctx.expression() != null) {
            // Note: ConsoleLogNode may not have setExpression method
            // This is a simplified implementation
        }
        return consoleLogNode;
    }


    @Override
    public ASTNode visitEnum(AngularParser.EnumContext ctx) {
        EnumNode enumNode = new EnumNode();
        if (ctx.Identifier() != null) {
            enumNode.setName(ctx.Identifier().getText());
        }
        if (ctx.enumValues() != null) {
            // Note: EnumNode may not have setEnumValues method
            // This is a simplified implementation
        }
        return enumNode;
    }

    @Override
    public ASTNode visitEnumValues(AngularParser.EnumValuesContext ctx) {
        // Note: Using LiteralValueNode as a simple container for enum values
        LiteralValueNode enumValues = new LiteralValueNode();
        for (int i = 0; i < ctx.enumValue().size(); i++) {
            if (ctx.enumValue().get(i) != null) {
                // Simplified implementation
            }
        }
        return enumValues;
    }

    @Override
    public ASTNode visitEnumValue(AngularParser.EnumValueContext ctx) {
        // Note: Using LiteralValueNode as a simple container for enum value
        LiteralValueNode enumValue = new LiteralValueNode();
        if (ctx.Identifier() != null) {
            // Simplified implementation
        }
        // Note: NumberLiteral method may not exist in this context
        // Simplified implementation
        return enumValue;
    }

    @Override
    public ASTNode visitAbstractFunctionDeclaration(AngularParser.AbstractFunctionDeclarationContext ctx) {
        FunctionDeclarationNode abstractFunctionNode = new FunctionDeclarationNode();
        // Note: setAbstract method may not exist
        // Simplified implementation
        if (ctx.Identifier() != null) {
            abstractFunctionNode.setIdentifier(ctx.Identifier().getText());
        }
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter().get(i) != null) {
                abstractFunctionNode.getParameters().add(visitParameter(ctx.parameter(i)));
            }
        }
        return abstractFunctionNode;
    }

    @Override
    public VariableDeclarationNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclarationNode variableDeclarationNode = new VariableDeclarationNode();
        if (ctx.Identifier() != null) {
            variableDeclarationNode.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            variableDeclarationNode.setType(visitType(ctx.type()));
        }
        if (ctx.expression() != null) {
            variableDeclarationNode.setExpression(visitExpression(ctx.expression()));
        }
        return variableDeclarationNode;
    }

    public ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        if(ctx.Identifier() != null){
            System.out.println(ctx.getText());
            expressionNode.setIdentifier(ctx.getText());
        }
        if(ctx.literalValue()!=null){
            expressionNode.setLiteralNode(visitLiteralValue(ctx.literalValue()));
        }

        return expressionNode;
    }

    @Override
    public ArrayDeclarationNode visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) {
        ArrayDeclarationNode arrayDeclarationNode = new ArrayDeclarationNode();
        if (ctx.Identifier() != null) {
            arrayDeclarationNode.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            arrayDeclarationNode.setType(visitType(ctx.type()));
        }
        return arrayDeclarationNode;
    }

    @Override
    public FunctionDeclarationNode visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclarationNode functionDeclarationNode = new FunctionDeclarationNode();
        if (ctx.Identifier() != null) {
            functionDeclarationNode.setIdentifier(ctx.Identifier().getText());
        }
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter().get(i) != null) {
                functionDeclarationNode.getParameters().add(visitParameter(ctx.parameter(i)));
            }
        }
        return functionDeclarationNode;
    }

    @Override
    public TypeNode visitType(AngularParser.TypeContext ctx) {
        TypeNode typeNode = new TypeNode();
        if (ctx.TypeNumber() != null) {
            typeNode.setNumber(ctx.TypeNumber().getText());
        }
        if (ctx.TypeBoolean() != null) {
            typeNode.setAnboolean(ctx.TypeBoolean().getText());
        }
        if (ctx.TypeString() != null) {
            typeNode.setString(ctx.TypeString().getText());
        }
        if (ctx.Array() != null) {
            typeNode.setArray(ctx.Array().getText());
        }
        return typeNode;
    }

    @Override
    public ObjectDeclarationNode visitObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) {
        ObjectDeclarationNode objectDeclarationNode = new ObjectDeclarationNode();
        if (ctx.Identifier() != null) {
//            objectDeclarationNode.setIdentifier(ctx.Identifier().getText());}
        }
        return objectDeclarationNode;
    }

    @Override
    public LiteralValueNode visitLiteralValue(AngularParser.LiteralValueContext ctx) {
        LiteralValueNode literalValueNode = new LiteralValueNode();
        if (ctx.StringLiteral() != null) {
            literalValueNode.setStirngValue(ctx.StringLiteral().getText());
        }
        if (ctx.NumberLiteral() != null) {
            literalValueNode.setNumValue(ctx.NumberLiteral().getText());
        }
        if (ctx.BooleanLiteral() != null) {
            literalValueNode.setBooleanValue(ctx.BooleanLiteral().getText());
        }
        else {
            literalValueNode.setNull(true);
        }
        if (ctx.listLiteral() != null) {
            literalValueNode.setListLiteralNode(visitListLiteral(ctx.listLiteral()));
        }
        return literalValueNode;
    }

    @Override
    public ASTNode visitMapLiteral(AngularParser.MapLiteralContext ctx) {
        // For now, return a simple AST node for map literals
        // This could be expanded to create a proper MapLiteralNode if needed
        LiteralValueNode mapLiteralNode = new LiteralValueNode();
        return mapLiteralNode;
    }

    @Override
    public ListLiteralNode visitListLiteral(AngularParser.ListLiteralContext ctx) {
        ListLiteralNode listLiteralNode =new ListLiteralNode();
        for (int i = 0; i < ctx.literalValue().size(); i++) {
            if (ctx.literalValue().get(i) != null) {
                listLiteralNode.getIdentifiers().add(ctx.getText());
            }
        }
        return listLiteralNode;
    }

    @Override
    public AssignmentStatementNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) {
        AssignmentStatementNode assignmentStatementNode = new AssignmentStatementNode();
        if (ctx.Identifier() != null) {
            assignmentStatementNode.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.expression() != null) {
            // Note: setExpression method signature may be different
            // Simplified implementation
        }
        return assignmentStatementNode;
    }

    @Override
    public ASTNode visitThisAssignment(AngularParser.ThisAssignmentContext ctx) {
        ThisIdentifierOrPropertyAssignmentNode thisAssignmentNode = new ThisIdentifierOrPropertyAssignmentNode();
        if (ctx.Identifier() != null) {
            // Note: setIdentifier method may not exist
            // Simplified implementation
        }
        // Note: expression method may not exist in this context
        // Simplified implementation
        return thisAssignmentNode;
    }

    @Override
    public ASTNode visitNewInstanceAssignment(AngularParser.NewInstanceAssignmentContext ctx) {
        ThisNewInstanceAssignmentNode newInstanceAssignmentNode = new ThisNewInstanceAssignmentNode();
        if (ctx.Identifier() != null) {
            // Note: setIdentifier method may not exist
            // Simplified implementation
        }
        // Note: argument method may not exist in this context
        // Simplified implementation
        return newInstanceAssignmentNode;
    }

    @Override
    public ASTNode visitNestedThisAccess(AngularParser.NestedThisAccessContext ctx) {
        // Note: Using LiteralValueNode as a simple container
        LiteralValueNode nestedThisAccessNode = new LiteralValueNode();
        if (ctx.Identifier() != null) {
            // Note: setPropertyName method may not exist
            // Simplified implementation
        }
        return nestedThisAccessNode;
    }

    @Override
    public ASTNode visitIdentifierOrPropertyAccess(AngularParser.IdentifierOrPropertyAccessContext ctx) {
        // Note: Using LiteralValueNode as a simple container
        LiteralValueNode propertyAccessNode = new LiteralValueNode();
        if (ctx.Identifier() != null) {
            // Note: setPropertyName method may not exist
            // Simplified implementation
        }
        return propertyAccessNode;
    }

    @Override
    public IfStatementNode visitIfStatement(AngularParser.IfStatementContext ctx) {
        IfStatementNode ifStatementNode = new IfStatementNode();
        if (ctx.expression() != null) {
            ifStatementNode.setCondition(visitExpression(ctx.expression()));
        }
        if (ctx.block() != null) {
            // Note: setIfBlock method may not exist
            // Simplified implementation
        }
        if (ctx.elseIfStatement() != null) {
            // Note: setElseIfStatement method may not exist
            // Simplified implementation
        }
        return ifStatementNode;
    }

    @Override
    public WhileStatementNode visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        WhileStatementNode whileStatementNode = new WhileStatementNode();
        if (ctx.expression() != null) {
            whileStatementNode.setCondition(visitExpression(ctx.expression()));
        }
        if (ctx.block() != null) {
            // Note: setBlock method may not exist
            // Simplified implementation
        }
        return whileStatementNode;
    }

    @Override
    public ASTNode visitElseIfStatement(AngularParser.ElseIfStatementContext ctx) {
        // Note: Using LiteralValueNode as a simple container
        LiteralValueNode elseIfStatementNode = new LiteralValueNode();
        if (ctx.expression() != null) {
            // Note: setCondition method may not exist
            // Simplified implementation
        }
        if (ctx.block() != null) {
            // Note: setBlock method may not exist
            // Simplified implementation
        }
        return elseIfStatementNode;
    }

    @Override
    public BreakStatementNode visitBreakStatement(AngularParser.BreakStatementContext ctx) {
        BreakStatementNode breakStatementNode = new BreakStatementNode();
        return breakStatementNode;
    }

    @Override
    public ContinueStatementNode visitContinueStatement(AngularParser.ContinueStatementContext ctx) {
        ContinueStatementNode continueStatementNode = new ContinueStatementNode();
        return continueStatementNode;
    }

    @Override
    public ASTNode visitBlock(AngularParser.BlockContext ctx) {
        // Note: Using LiteralValueNode as a simple container
        LiteralValueNode blockNode = new LiteralValueNode();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement().get(i) != null) {
                // Note: getStatements method may not exist
                // Simplified implementation
            }
        }
        return blockNode;
    }




    @Override
    public ParameterNode visitParameter(AngularParser.ParameterContext ctx) {
        ParameterNode parameterNode = new ParameterNode();
        if (ctx.Identifier() != null) {
            parameterNode.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            parameterNode.setType(visitType(ctx.type()));
        }
        if (ctx.literalValue() != null) {
            parameterNode.setDefaultValue(visitLiteralValue(ctx.literalValue()));
        }
         //symbolTable.getRows().add(parameterRow);
        return parameterNode;
    }

    @Override
    public ASTNode visitFunction_call(AngularParser.Function_callContext ctx) {
        FunctionCallNode functionCallNode = new FunctionCallNode();
        if (ctx.Identifier() != null) {
            // Note: setFunctionName method may not exist
            // Simplified implementation
        }
        // Note: argument method may not exist in this context
        // Simplified implementation
        return functionCallNode;
    }

    @Override
    public HtmlNode visitHtml(AngularParser.HtmlContext ctx) {
        HtmlNode htmlNode = new HtmlNode();
        if (ctx.html_content() != null) {
            htmlNode.setContent(visitHtml_content(ctx.html_content()));
        }
         //symbolTable.getRows().add(htmlRow);
        return htmlNode;
    }

    @Override
    public HtmlContentNode visitHtml_content(AngularParser.Html_contentContext ctx) {
        HtmlContentNode htmlContentNode = new HtmlContentNode();
        if (ctx.html_element() != null) {
            for (int i = 0; i < ctx.html_element().size(); i++) {
                htmlContentNode.getHtmlElementNode().add(visitHtml_element(ctx.html_element().get(i)));
            }
        }
            for(int i=0;i<ctx.expression().size();i++){
          if(ctx.expression().get(i)!=null){
              htmlContentNode.getExpression().add(visitExpression(ctx.expression().get(i)));
            }
        }
            for(int i=0;i<ctx.Identifier().size();i++){
            if(ctx.Identifier().get(i)!=null){

              System.out.println(ctx.Identifier().get(i).getText());
                htmlContentNode.getIdentifierNode().add(ctx.Identifier().get(i).getText());
            }
        }
        return htmlContentNode;
    }

    @Override
    public nodes.html_node.HtmlElementNode visitHtml_element(AngularParser.Html_elementContext ctx) {
        nodes.html_node.HtmlElementNode htmlElementNode = new HtmlElementNode();
        if(ctx.html_tag_name()!=null){
            htmlElementNode.setTagName(visitHtml_tag_name(ctx.html_tag_name(0)));
        }
        if (ctx.html_attributes() != null) {
            htmlElementNode.setAttributes(visitHtml_attributes(ctx.html_attributes()));
        }
        if (ctx.html_content() != null) {
            htmlElementNode.setContent(visitHtml_content(ctx.html_content()));
        }
        return htmlElementNode;
    }

    @Override
    public HtmlTagNode visitHtml_tag_name(AngularParser.Html_tag_nameContext ctx) {
        HtmlTagNode htmlTagNode = new HtmlTagNode();
        if (ctx.Identifier() != null) {
            htmlTagNode.setIdentifierNode(ctx.Identifier().getText());
        }
        return htmlTagNode;
    }

    @Override
    public HtmlAttributesNode visitHtml_attributes(AngularParser.Html_attributesContext ctx) {
        HtmlAttributesNode htmlAttributesNode = new HtmlAttributesNode();
        if (ctx.html_attribute() != null) {
            for (int i = 0; i < ctx.html_attribute().size(); i++) {
                htmlAttributesNode.getHtmlAttributeNodes().add(visitHtml_attribute(ctx.html_attribute(i)));
            }
        }
        return htmlAttributesNode;
    }

    @Override
    public HtmlAttributeNode visitHtml_attribute(AngularParser.Html_attributeContext ctx) {
        HtmlAttributeNode htmlAttributeNode = new HtmlAttributeNode();
        if (ctx.Identifier() != null) {
            htmlAttributeNode.setIdentifierNode(ctx.Identifier().getText());
        }
        if (ctx.Class() != null) {
            htmlAttributeNode.setIdentifierNode(ctx.Class().getText());
        }
        if (ctx.html_attribute_value() != null) {
            htmlAttributeNode.setHtmlAttributeValueNode(visitHtml_attribute_value(ctx.html_attribute_value()));
        }
        if(ctx.ngIfAttribute()!=null){
            htmlAttributeNode.setNgIfNode(visitNgIfAttribute(ctx.ngIfAttribute()));
        }
        if(ctx.ngForAttribute()!=null){
            htmlAttributeNode.setNgForNode(visitNgForAttribute(ctx.ngForAttribute()));
        }
        if(ctx.onChangeAttribute()!=null){
            htmlAttributeNode.setOnChangeNodeAttr(visitOnChangeAttribute(ctx.onChangeAttribute()));
        }
        if(ctx.onClickAttribute()!=null){
            htmlAttributeNode.setOnClickAttrNodel(visitOnClickAttribute(ctx.onClickAttribute()));
        }

        if (ctx.access_suffix() != null) {
            for (int i = 0; i < ctx.access_suffix().size(); i++) {
                htmlAttributeNode.getAccessSufNode().add(visitAccess_suffix(ctx.access_suffix().get(i)));
            }
        }
        return htmlAttributeNode;
    }

    @Override
    public AccessSufNode visitAccess_suffix(AngularParser.Access_suffixContext ctx) {
        AccessSufNode accessSufNode = new AccessSufNode();
        if (ctx.Identifier() != null) {
            // Note: setIdentifier method may not exist
            // Simplified implementation
        }
        return accessSufNode;
    }


    @Override
    public HtmlAttributeValueNode visitHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx) {
        HtmlAttributeValueNode htmlAttributeValueNode = new HtmlAttributeValueNode();
        if(ctx.expression()!=null){
            htmlAttributeValueNode.setExpression(visitExpression(ctx.expression()));
        }
        if(ctx.literalValue()!=null){
            htmlAttributeValueNode.setValue(visitLiteralValue(ctx.literalValue()));
        }
        return htmlAttributeValueNode;
    }

    @Override
    public CssNode visitCss(AngularParser.CssContext ctx) {
        CssNode cssNode = new CssNode();
        if (ctx.css_content() != null) {
            for (int i = 0; i < ctx.css_content().size(); i++) {
                cssNode.getCssContentNode().add(visitCss_content(ctx.css_content(i)));
            }
        }
        return cssNode;
    }

    @Override
    public CssContentNode visitCss_content(AngularParser.Css_contentContext ctx) {
        CssContentNode cssContentNode = new CssContentNode();
        if (ctx.css_class_content() != null) {
            for (int i = 0; i < ctx.css_class_content().size(); i++) {
                cssContentNode.getCssClassContentList().add(visitCss_class_content(ctx.css_class_content(i)));
            }
        }
        if(ctx.Identifier()!=null){
            cssContentNode.setIdentifierNode(ctx.Identifier().toString());
        }
         //symbolTable.getRows().add(cssContentRow);
        return cssContentNode;
    }

    @Override
    public CssClassContentNode visitCss_class_content(AngularParser.Css_class_contentContext ctx) {
        CssClassContentNode cssClassContentNode = new CssClassContentNode();
        if (ctx.Identifier() != null) {
            cssClassContentNode.setName(ctx.Identifier().get(0).getText());
        }
        return cssClassContentNode;
    }

    @Override
    public ASTNode visitCheckedAttribute(AngularParser.CheckedAttributeContext ctx) {
        LiteralValueNode checkedAttributeNode = new LiteralValueNode();
        return checkedAttributeNode;
    }

    @Override
    public OnChangeNodeAttr visitOnChangeAttribute(AngularParser.OnChangeAttributeContext ctx) {
        OnChangeNodeAttr onChangeAttributeNode = new OnChangeNodeAttr();
        return onChangeAttributeNode;
    }

    @Override
    public OnClickAttrNode visitOnClickAttribute(AngularParser.OnClickAttributeContext ctx) {
        OnClickAttrNode onClickAttributeNode = new OnClickAttrNode();
        return onClickAttributeNode;
    }

    @Override
    public ASTNode visitOnSubmitAttribute(AngularParser.OnSubmitAttributeContext ctx) {
        LiteralValueNode onSubmitAttributeNode = new LiteralValueNode();
        return onSubmitAttributeNode;
    }

    @Override
    public ASTNode visitGapAttribute(AngularParser.GapAttributeContext ctx) {
        LiteralValueNode gapAttributeNode = new LiteralValueNode();
        return gapAttributeNode;
    }

    @Override
    public ASTNode visitDirectionAttribute(AngularParser.DirectionAttributeContext ctx) {
        LiteralValueNode directionAttributeNode = new LiteralValueNode();
        return directionAttributeNode;
    }

    @Override
    public ASTNode visitDurationAttribute(AngularParser.DurationAttributeContext ctx) {
        LiteralValueNode durationAttributeNode = new LiteralValueNode();
        return durationAttributeNode;
    }

    @Override
    public ASTNode visitRepeatAttribute(AngularParser.RepeatAttributeContext ctx) {
        LiteralValueNode repeatAttributeNode = new LiteralValueNode();
        return repeatAttributeNode;
    }

    @Override
    public NgForNode visitNgForAttribute(AngularParser.NgForAttributeContext ctx) {
        NgForNode ngForAttributeNode = new NgForNode();
        return ngForAttributeNode;
    }

    @Override
    public NgIfNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) {
        NgIfNode ngIfAttributeNode = new NgIfNode();
        return ngIfAttributeNode;
    }


}
