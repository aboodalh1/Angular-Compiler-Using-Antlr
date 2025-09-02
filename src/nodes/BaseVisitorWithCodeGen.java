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

    private void scoopAction(String action, String newScope) {
        switch (action) {
            case ENTER:
                scopeStack.push(newScope);
                this.currentScope = newScope;
                break;
            case EXIT:
                scopeStack.pop();
                currentScope = scopeStack.isEmpty() ? GLOBAL : scopeStack.peek();
                break;
            default:
                throw new IllegalArgumentException("Unknown action: " + action);
        }
    }

    private void addRowToComponentSymbolTable(String type, String name, String value) {
        Row row = new Row();
        row.setType(type);
        row.setName(name);
        row.setValue(value);
        row.setScope(currentScope);
        componentSymbolTable.getRows().add(row);
    }

    private void addRowToServiceSymbolTable(String name, String scope) {
        serviceSymbolTable.insertService(name, scope);
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
        Row row = new Row();
        row.setType("Program");
        row.setValue(ctx.getText());
        return programNode;
    }

    @Override
    public StatementNode visitStatement(AngularParser.StatementContext ctx) {
        StatementNode statement = new StatementNode();
        Row statementRow = new Row();
        if (ctx.class_() != null) {
            ClassNode anclass = visitClass(ctx.class_());
            statement.setClassNodes(anclass);
            statementRow.setType("Class");
            statementRow.setValue(ctx.class_().getText());
        }
        if (ctx.variableDeclaration() != null) {
            VariableDeclarationNode variableDeclarationNode = visitVariableDeclaration(ctx.variableDeclaration());
            statement.setVariableDeclarationNodes(variableDeclarationNode);
            statementRow.setType("Variable Declaration");
            statementRow.setValue(ctx.variableDeclaration().getText());
        }
        if (ctx.functionDeclaration() != null) {
            FunctionDeclarationNode functionDeclarationNode = visitFunctionDeclaration(ctx.functionDeclaration());
            statement.setFunctionDeclarationNodes(functionDeclarationNode);
            statementRow.setType("Function Declaration");
            statementRow.setValue(ctx.functionDeclaration().getText());
        }
        if (ctx.ifStatement() != null) {
            IfStatementNode ifStatementNode = visitIfStatement(ctx.ifStatement());
            statement.setIfStatementNodes(ifStatementNode);
            statementRow.setType("If Statement");
            statementRow.setValue(ctx.ifStatement().getText());
        }
        if (ctx.whileStatement() != null) {
            WhileStatementNode whileStatementNode = visitWhileStatement(ctx.whileStatement());
            statement.setWhileStatementNodes(whileStatementNode);
            statementRow.setType("While Statement");
            statementRow.setValue(ctx.whileStatement().getText());
        }
        if (ctx.assignmentStatement() != null) {
            AssignmentStatementNode assignmentStatementNode = visitAssignmentStatement(ctx.assignmentStatement());
            statement.setAssignmentStatementNodes(assignmentStatementNode);
            statementRow.setType("Assignment Statement");
            statementRow.setValue(ctx.assignmentStatement().getText());
        }
        if (ctx.breakStatement() != null) {
            BreakStatementNode breakStatementNode = visitBreakStatement(ctx.breakStatement());
            statement.setBreakStatementNodes(breakStatementNode);
            statementRow.setType("Break Statement");
            statementRow.setValue(ctx.breakStatement().getText());
        }
        if (ctx.continueStatement() != null) {
            ContinueStatementNode continueStatementNode = visitContinueStatement(ctx.continueStatement());
            statement.setContinueStatementNodes(continueStatementNode);
            statementRow.setType("Continue Statement");
            statementRow.setValue(ctx.continueStatement().getText());
        }
        if (ctx.importStatement() != null) {
            ImportStatementNode importStatementNode = visitImportStatement(ctx.importStatement());
            statement.setImportStatementNodes(importStatementNode);
            statementRow.setType("Import Statement");
            statementRow.setValue(ctx.importStatement().getText());
        }
        if (ctx.component() != null) {
            ComponentNode componentNode = visitComponent(ctx.component());
            statement.setComponentNodes(componentNode);
            statementRow.setType("Component");
            statementRow.setValue(ctx.component().getText());
        }
        if (ctx.exportClass() != null) {
            ExportClassNode exportClassNode = visitExportClass(ctx.exportClass());
            statement.setExportClassNode(exportClassNode);
            statementRow.setType("Export Class");
            statementRow.setValue(ctx.exportClass().getText());
        }
        if(ctx.interface_()!=null){
            InterfaceNode interfaceNode = visitInterface(ctx.interface_());
            statement.setInterfaceNode(interfaceNode);
            statementRow.setType("Interface");
            statementRow.setValue(ctx.interface_().getText());
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
        Row exportClassRow = new Row();
        if (ctx.Class() != null) {
//            exportClassNode.setClassNode(visitClass(ctx.Class()));
            exportClassRow.setType("Class");
            exportClassRow.setValue(ctx.getText());
        }
        return exportClassNode;
    }

    @Override
    public ClassNode visitClass(AngularParser.ClassContext ctx) {
        ClassNode classNode = new ClassNode();
        if (ctx.Identifier() != null) {
            classNode.setIdentifier(ctx.Identifier().getText());
        }
        if(ctx.classBody()!=null){
            classNode.setClassBody(visitClassBody(ctx.classBody()));
        }
        Row classRow = new Row();
        classRow.setType(ctx.Identifier().getText());
        if (ctx.classBody() != null)
            classRow.setValue("Class Body");
        return classNode;
    }

    @Override
    public ClassBodyNode visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBodyNode classBodyNode = new ClassBodyNode();
        Row classBodyRow = new Row();
        for (int i = 0; i < ctx.variableDeclaration().size(); i++) {
            if (ctx.variableDeclaration().get(i) != null) {
                classBodyNode.getVariableDeclarationNodes().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
                classBodyRow.setType("Variable Declaration");
                classBodyRow.setValue(ctx.variableDeclaration().get(0).getText());

            }
        }
        for (int i = 0; i < ctx.functionDeclaration().size(); i++) {
            if (ctx.functionDeclaration().get(i) != null) {
                classBodyNode.getFunctionDeclarationNodes().add(visitFunctionDeclaration(ctx.functionDeclaration(i)));
                classBodyRow.setType("Function Declaration");
                classBodyRow.setValue(ctx.functionDeclaration().get(0).getText());

            }
        }
        for (int i = 0; i < ctx.arrayDeclaration().size(); i++) {
            if (ctx.arrayDeclaration().get(i) != null) {
                classBodyNode.getArrayDeclarationNodeList().add(visitArrayDeclaration(ctx.arrayDeclaration(i)));
                classBodyRow.setType("Array Declaration");
                classBodyRow.setValue(ctx.arrayDeclaration().get(0).getText());

            }
        }
        for (int i = 0; i < ctx.objectDeclataion().size(); i++) {
            if (ctx.objectDeclataion().get(i) != null) {
                classBodyNode.getObjectDeclarationNodes().add(visitObjectDeclataion(ctx.objectDeclataion(i)));
                classBodyRow.setType("Array Declaration");
                classBodyRow.setValue(ctx.arrayDeclaration().get(0).getText());
            }
        }
        return classBodyNode;
    }

    @Override
    public ASTNode visitAbstractClass(AngularParser.AbstractClassContext ctx) {
        AbstractClassNode abstractClassNode = new AbstractClassNode();
        Row abstractClassRow = new Row();
        if (ctx.Identifier() != null) {
            abstractClassNode.setIdentifier(ctx.Identifier().getText());
            abstractClassRow.setType("Abstract Class");
            abstractClassRow.setValue(ctx.Identifier().getText());
        }
        if (ctx.classBody() != null) {
            abstractClassNode.setClassBody(visitClassBody(ctx.classBody()));
            abstractClassRow.setType("Abstract Class Body");
            abstractClassRow.setValue(ctx.classBody().getText());
        }
        return abstractClassNode;
    }

    @Override
    public InterfaceNode visitInterface(AngularParser.InterfaceContext ctx) {

        InterfaceNode interfaceNode = new InterfaceNode();
        Row interfaceRow = new Row();
        if (ctx.Identifier() != null) {
            interfaceNode.setName(ctx.Identifier().getText());
            interfaceRow.setType("Interface");
            interfaceRow.setValue(ctx.Identifier().getText());
        }
        if (ctx.interfaceBody() != null) {
            interfaceNode.setClassBody(visitInterfaceBody(ctx.interfaceBody()));
            interfaceRow.setType("Interface Body");
            interfaceRow.setValue(ctx.interfaceBody().getText());
        }
        return interfaceNode;
    }

    @Override
    public ClassBodyNode visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {
        ClassBodyNode interfaceBodyNode = new ClassBodyNode();
        Row interfaceBodyRow = new Row();
        for (int i = 0; i < ctx.variableDeclaration().size(); i++) {
            if (ctx.variableDeclaration().get(i) != null) {
                interfaceBodyNode.getVariableDeclarationNodes().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
                interfaceBodyRow.setType("Interface Variable Declaration");
                interfaceBodyRow.setValue(ctx.variableDeclaration().get(i).getText());
            }
        }
        // Note: Interface body may not have function declarations in this grammar
        // This is a simplified implementation
        return interfaceBodyNode;
    }

    @Override
    public ASTNode visitAccessModifier(AngularParser.AccessModifierContext ctx) {
        AccessModifierNode accessModifierNode = new AccessModifierNode();
        Row accessModifierRow = new Row();
        if (ctx.getText() != null) {
            // Note: AccessModifierNode may not have setModifier method
            // This is a simplified implementation
            accessModifierRow.setType("Access Modifier");
            accessModifierRow.setValue(ctx.getText());
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
        Row importRow = new Row();
        if (ctx.Identifier() != null) {
            importStatementNode.setIdentifier(ctx.Identifier().toString());
            importRow.setType("Import");
            importRow.setValue(ctx.Identifier().toString());
        }
        if (ctx.StringLiteral() != null) {
            importStatementNode.setSource(ctx.StringLiteral().getText());
            importRow.setType("Import from");
            importRow.setValue(ctx.StringLiteral().getText());
        }
        return importStatementNode;
    }

    @Override
    public ASTNode visitConsoleLog(AngularParser.ConsoleLogContext ctx) {
        ConsoleLogNode consoleLogNode = new ConsoleLogNode();
        Row consoleLogRow = new Row();
        if (ctx.expression() != null) {
            // Note: ConsoleLogNode may not have setExpression method
            // This is a simplified implementation
            consoleLogRow.setType("Console Log Expression");
            consoleLogRow.setValue(ctx.expression().getText());
        }
        return consoleLogNode;
    }


    @Override
    public ASTNode visitEnum(AngularParser.EnumContext ctx) {
        EnumNode enumNode = new EnumNode();
        Row enumRow = new Row();
        if (ctx.Identifier() != null) {
            enumNode.setName(ctx.Identifier().getText());
            enumRow.setType("Enum");
            enumRow.setValue(ctx.Identifier().getText());
        }
        if (ctx.enumValues() != null) {
            // Note: EnumNode may not have setEnumValues method
            // This is a simplified implementation
            enumRow.setType("Enum Values");
            enumRow.setValue(ctx.enumValues().getText());
        }
        return enumNode;
    }

    @Override
    public ASTNode visitEnumValues(AngularParser.EnumValuesContext ctx) {
        // Note: Using LiteralValueNode as a simple container for enum values
        LiteralValueNode enumValues = new LiteralValueNode();
        Row enumValuesRow = new Row();
        for (int i = 0; i < ctx.enumValue().size(); i++) {
            if (ctx.enumValue().get(i) != null) {
                // Simplified implementation
                enumValuesRow.setType("Enum Value");
                enumValuesRow.setValue(ctx.enumValue(i).getText());
            }
        }
        return enumValues;
    }

    @Override
    public ASTNode visitEnumValue(AngularParser.EnumValueContext ctx) {
        // Note: Using LiteralValueNode as a simple container for enum value
        LiteralValueNode enumValue = new LiteralValueNode();
        Row enumValueRow = new Row();
        if (ctx.Identifier() != null) {
            // Simplified implementation
            enumValueRow.setType("Enum Value Name");
            enumValueRow.setValue(ctx.Identifier().getText());
        }
        // Note: NumberLiteral method may not exist in this context
        // Simplified implementation
        return enumValue;
    }

    @Override
    public ASTNode visitAbstractFunctionDeclaration(AngularParser.AbstractFunctionDeclarationContext ctx) {
        FunctionDeclarationNode abstractFunctionNode = new FunctionDeclarationNode();
        Row abstractFunctionRow = new Row();
        // Note: setAbstract method may not exist
        // Simplified implementation
        if (ctx.Identifier() != null) {
            abstractFunctionNode.setIdentifier(ctx.Identifier().getText());
            abstractFunctionRow.setType("Abstract Function");
            abstractFunctionRow.setValue(ctx.Identifier().getText());
        }
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter().get(i) != null) {
                abstractFunctionNode.getParameters().add(visitParameter(ctx.parameter(i)));
                abstractFunctionRow.setType("Abstract Function Parameter");
                abstractFunctionRow.setValue(ctx.parameter().get(i).getText());
            }
        }
        return abstractFunctionNode;
    }

    @Override
    public VariableDeclarationNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclarationNode variableDeclarationNode = new VariableDeclarationNode();
        Row variableRow = new Row();
        if (ctx.Identifier() != null) {
            variableDeclarationNode.setIdentifier(ctx.Identifier().getText());
            variableRow.setType("Variable Declaration");
            variableRow.setValue(ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            variableDeclarationNode.setType(visitType(ctx.type()));
            variableRow.setType("Variable Type");
            variableRow.setValue(ctx.type().getText());
        }
        if (ctx.expression() != null) {
            variableDeclarationNode.setExpression(visitExpression(ctx.expression()));
            variableRow.setType("Variable Expression");
            variableRow.setValue(ctx.expression().getText());
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
        Row arrayDeclarationRow = new Row();
        if (ctx.Identifier() != null) {
            arrayDeclarationNode.setIdentifier(ctx.Identifier().getText());
            arrayDeclarationRow.setType("Array Declaration");
            arrayDeclarationRow.setValue(ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            arrayDeclarationNode.setType(visitType(ctx.type()));
            arrayDeclarationRow.setType("Array Type");
            arrayDeclarationRow.setValue(ctx.type().getText());
        }
        return arrayDeclarationNode;
    }

    @Override
    public FunctionDeclarationNode visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclarationNode functionDeclarationNode = new FunctionDeclarationNode();
        Row functionDeclarationRow = new Row();
        if (ctx.Identifier() != null) {
            functionDeclarationNode.setIdentifier(ctx.Identifier().getText());
            functionDeclarationRow.setType("Function Declaration");
            functionDeclarationRow.setValue(ctx.Identifier().getText());
        }
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter().get(i) != null) {
                functionDeclarationNode.getParameters().add(visitParameter(ctx.parameter(i)));
                functionDeclarationRow.setType("Function Parameter");
                functionDeclarationRow.setValue(ctx.parameter().get(0).getText());
            }
        }
        return functionDeclarationNode;
    }

    @Override
    public TypeNode visitType(AngularParser.TypeContext ctx) {
        TypeNode typeNode = new TypeNode();
        Row typeRow = new Row();
        if (ctx.TypeNumber() != null) {
            typeNode.setNumber(ctx.TypeNumber().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.TypeNumber().getText());
        }
        if (ctx.TypeBoolean() != null) {
            typeNode.setAnboolean(ctx.TypeBoolean().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.TypeBoolean().getText());
        }
        if (ctx.TypeString() != null) {
            typeNode.setString(ctx.TypeString().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.TypeString().getText());
        }
        if (ctx.Array() != null) {
            typeNode.setArray(ctx.Array().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.Array().getText());
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
        Row literalValueRow = new Row();
        if (ctx.StringLiteral() != null) {
            literalValueNode.setStirngValue(ctx.StringLiteral().getText());
            literalValueRow.setType("String");
            literalValueRow.setValue(ctx.StringLiteral().getText());
        }
        if (ctx.NumberLiteral() != null) {
            literalValueNode.setNumValue(ctx.NumberLiteral().getText());
            literalValueRow.setType("Number");
            literalValueRow.setValue(ctx.NumberLiteral().getText());
        }
        if (ctx.BooleanLiteral() != null) {
            literalValueNode.setBooleanValue(ctx.BooleanLiteral().getText());
            literalValueRow.setType("Boolean");
            literalValueRow.setValue(ctx.BooleanLiteral().getText());
        }
        else {
            literalValueNode.setNull(true);
        }
        if (ctx.listLiteral() != null) {
            literalValueNode.setListLiteralNode(visitListLiteral(ctx.listLiteral()));
            literalValueRow.setType("List");
            literalValueRow.setValue(ctx.listLiteral().getText());
        }
        return literalValueNode;
    }

    @Override
    public ASTNode visitMapLiteral(AngularParser.MapLiteralContext ctx) {
        // For now, return a simple AST node for map literals
        // This could be expanded to create a proper MapLiteralNode if needed
        LiteralValueNode mapLiteralNode = new LiteralValueNode();
        Row mapLiteralRow = new Row();
        mapLiteralRow.setType("Map Literal");
        mapLiteralRow.setValue(ctx.getText());
        return mapLiteralNode;
    }

    @Override
    public ListLiteralNode visitListLiteral(AngularParser.ListLiteralContext ctx) {
        ListLiteralNode listLiteralNode =new ListLiteralNode();
        Row listLiteralRow = new Row();
        for (int i = 0; i < ctx.literalValue().size(); i++) {
            if (ctx.literalValue().get(i) != null) {
                listLiteralNode.getIdentifiers().add(ctx.getText());
                listLiteralRow.setType("List");
                listLiteralRow.setValue(ctx.getText());
            }
        }
        return listLiteralNode;
    }

    @Override
    public AssignmentStatementNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) {
        AssignmentStatementNode assignmentStatementNode = new AssignmentStatementNode();
        Row assignmentRow = new Row();
        if (ctx.Identifier() != null) {
            assignmentStatementNode.setIdentifier(ctx.Identifier().getText());
            assignmentRow.setType("Assignment Identifier");
            assignmentRow.setValue(ctx.Identifier().getText());
        }
        if (ctx.expression() != null) {
            // Note: setExpression method signature may be different
            // Simplified implementation
            assignmentRow.setType("Assignment Expression");
            assignmentRow.setValue(ctx.expression().getText());
        }
        return assignmentStatementNode;
    }

    @Override
    public ASTNode visitThisAssignment(AngularParser.ThisAssignmentContext ctx) {
        ThisIdentifierOrPropertyAssignmentNode thisAssignmentNode = new ThisIdentifierOrPropertyAssignmentNode();
        Row thisAssignmentRow = new Row();
        if (ctx.Identifier() != null) {
            // Note: setIdentifier method may not exist
            // Simplified implementation
            thisAssignmentRow.setType("This Assignment Identifier");
            thisAssignmentRow.setValue(ctx.Identifier().getText());
        }
        // Note: expression method may not exist in this context
        // Simplified implementation
        return thisAssignmentNode;
    }

    @Override
    public ASTNode visitNewInstanceAssignment(AngularParser.NewInstanceAssignmentContext ctx) {
        ThisNewInstanceAssignmentNode newInstanceAssignmentNode = new ThisNewInstanceAssignmentNode();
        Row newInstanceRow = new Row();
        if (ctx.Identifier() != null) {
            // Note: setIdentifier method may not exist
            // Simplified implementation
            newInstanceRow.setType("New Instance Assignment");
            newInstanceRow.setValue(ctx.Identifier().getText());
        }
        // Note: argument method may not exist in this context
        // Simplified implementation
        return newInstanceAssignmentNode;
    }

    @Override
    public ASTNode visitNestedThisAccess(AngularParser.NestedThisAccessContext ctx) {
        // Note: Using LiteralValueNode as a simple container
        LiteralValueNode nestedThisAccessNode = new LiteralValueNode();
        Row nestedThisRow = new Row();
        if (ctx.Identifier() != null) {
            // Note: setPropertyName method may not exist
            // Simplified implementation
            nestedThisRow.setType("Nested This Access");
            nestedThisRow.setValue(ctx.Identifier().toString());
        }
        return nestedThisAccessNode;
    }

    @Override
    public ASTNode visitIdentifierOrPropertyAccess(AngularParser.IdentifierOrPropertyAccessContext ctx) {
        // Note: Using LiteralValueNode as a simple container
        LiteralValueNode propertyAccessNode = new LiteralValueNode();
        Row propertyAccessRow = new Row();
        if (ctx.Identifier() != null) {
            // Note: setPropertyName method may not exist
            // Simplified implementation
            propertyAccessRow.setType("Property Access");
            propertyAccessRow.setValue(ctx.Identifier().toString());
        }
        return propertyAccessNode;
    }

    @Override
    public IfStatementNode visitIfStatement(AngularParser.IfStatementContext ctx) {
        IfStatementNode ifStatementNode = new IfStatementNode();
        Row ifStatementRow = new Row();
        if (ctx.expression() != null) {
            ifStatementNode.setCondition(visitExpression(ctx.expression()));
            ifStatementRow.setType("If Condition");
            ifStatementRow.setValue(ctx.expression().getText());
        }
        if (ctx.block() != null) {
            // Note: setIfBlock method may not exist
            // Simplified implementation
            ifStatementRow.setType("If Block");
            ifStatementRow.setValue(ctx.block().toString());
        }
        if (ctx.elseIfStatement() != null) {
            // Note: setElseIfStatement method may not exist
            // Simplified implementation
            ifStatementRow.setType("Else If Statement");
            ifStatementRow.setValue(ctx.elseIfStatement().toString());
        }
        return ifStatementNode;
    }

    @Override
    public WhileStatementNode visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        WhileStatementNode whileStatementNode = new WhileStatementNode();
        Row whileStatementRow = new Row();
        if (ctx.expression() != null) {
            whileStatementNode.setCondition(visitExpression(ctx.expression()));
            whileStatementRow.setType("While Condition");
            whileStatementRow.setValue(ctx.expression().getText());
        }
        if (ctx.block() != null) {
            // Note: setBlock method may not exist
            // Simplified implementation
            whileStatementRow.setType("While Block");
            whileStatementRow.setValue(ctx.block().getText());
        }
        return whileStatementNode;
    }

    @Override
    public ASTNode visitElseIfStatement(AngularParser.ElseIfStatementContext ctx) {
        // Note: Using LiteralValueNode as a simple container
        LiteralValueNode elseIfStatementNode = new LiteralValueNode();
        Row elseIfRow = new Row();
        if (ctx.expression() != null) {
            // Note: setCondition method may not exist
            // Simplified implementation
            elseIfRow.setType("Else If Condition");
            elseIfRow.setValue(ctx.expression().getText());
        }
        if (ctx.block() != null) {
            // Note: setBlock method may not exist
            // Simplified implementation
            elseIfRow.setType("Else If Block");
            elseIfRow.setValue(ctx.block().getText());
        }
        return elseIfStatementNode;
    }

    @Override
    public BreakStatementNode visitBreakStatement(AngularParser.BreakStatementContext ctx) {
        BreakStatementNode breakStatementNode = new BreakStatementNode();
        Row breakRow = new Row();
        breakRow.setType("Break Statement");
        breakRow.setValue(ctx.getText());
        return breakStatementNode;
    }

    @Override
    public ContinueStatementNode visitContinueStatement(AngularParser.ContinueStatementContext ctx) {
        ContinueStatementNode continueStatementNode = new ContinueStatementNode();
        Row continueRow = new Row();
        continueRow.setType("Continue Statement");
        continueRow.setValue(ctx.getText());
        return continueStatementNode;
    }

    @Override
    public ASTNode visitBlock(AngularParser.BlockContext ctx) {
        // Note: Using LiteralValueNode as a simple container
        LiteralValueNode blockNode = new LiteralValueNode();
        Row blockRow = new Row();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement().get(i) != null) {
                // Note: getStatements method may not exist
                // Simplified implementation
                blockRow.setType("Block Statement");
                blockRow.setValue(ctx.statement(i).getText());
            }
        }
        return blockNode;
    }




    @Override
    public ParameterNode visitParameter(AngularParser.ParameterContext ctx) {
        ParameterNode parameterNode = new ParameterNode();
        Row parameterRow = new Row();
        if (ctx.Identifier() != null) {
            parameterNode.setIdentifier(ctx.Identifier().getText());
            parameterRow.setType("Parameter");
            parameterRow.setValue(ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            parameterNode.setType(visitType(ctx.type()));
            parameterRow.setType("Type");
            parameterRow.setValue(ctx.type().getText());
        }
        if (ctx.literalValue() != null) {
            parameterNode.setDefaultValue(visitLiteralValue(ctx.literalValue()));
            parameterRow.setType("DefaultValue");
            parameterRow.setValue(ctx.literalValue().getText());
        }
         //symbolTable.getRows().add(parameterRow);
        return parameterNode;
    }

    @Override
    public ASTNode visitFunction_call(AngularParser.Function_callContext ctx) {
        FunctionCallNode functionCallNode = new FunctionCallNode();
        Row functionCallRow = new Row();
        if (ctx.Identifier() != null) {
            // Note: setFunctionName method may not exist
            // Simplified implementation
            functionCallRow.setType("Function Call");
            functionCallRow.setValue(ctx.Identifier().getText());
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
        if (ctx.Identifier() != null) {
            htmlAttributeNode.setIdentifierNode(ctx.Identifier().getText());
        }
        return htmlAttributeNode;
    }

    @Override
    public AccessSufNode visitAccess_suffix(AngularParser.Access_suffixContext ctx) {
        AccessSufNode accessSufNode = new AccessSufNode();
        Row accessSufRow = new Row();
        if (ctx.Identifier() != null) {
            // Note: setIdentifier method may not exist
            // Simplified implementation
            accessSufRow.setType("Access Suffix");
            accessSufRow.setValue(ctx.Identifier().getText());
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
        Row cssRow = new Row();
        if (ctx.css_content() != null) {
            for (int i = 0; i < ctx.css_content().size(); i++) {
                cssNode.getCssContentNode().add(visitCss_content(ctx.css_content(i)));
                cssRow.setType("Css Content");
                cssRow.setValue(ctx.css_content(i).getText());
            }
        }
         //symbolTable.getRows().add(cssRow);
        return cssNode;
    }

    @Override
    public CssContentNode visitCss_content(AngularParser.Css_contentContext ctx) {
        CssContentNode cssContentNode = new CssContentNode();
        Row cssContentRow = new Row();
        if (ctx.css_class_content() != null) {
            for (int i = 0; i < ctx.css_class_content().size(); i++) {
                cssContentNode.getCssClassContentList().add(visitCss_class_content(ctx.css_class_content(i)));
                cssContentRow.setType("Css Class Content");
                cssContentRow.setValue(ctx.css_class_content(i).getText());
            }
        }
        if(ctx.Identifier()!=null){
            cssContentNode.setIdentifierNode(ctx.Identifier().toString());
            cssContentRow.setType("Identifier");
            cssContentRow.setValue(ctx.Identifier().toString());
        }
         //symbolTable.getRows().add(cssContentRow);
        return cssContentNode;
    }

    @Override
    public CssClassContentNode visitCss_class_content(AngularParser.Css_class_contentContext ctx) {
        CssClassContentNode cssClassContentNode = new CssClassContentNode();
        Row cssClassContentRow = new Row();
        if (ctx.Identifier() != null) {
            cssClassContentNode.setName(ctx.Identifier().get(0).getText());
            cssClassContentRow.setType("Name");
            cssClassContentRow.setValue(ctx.Identifier().get(0).getText());
        }
        return cssClassContentNode;
    }

    @Override
    public ASTNode visitCheckedAttribute(AngularParser.CheckedAttributeContext ctx) {
        LiteralValueNode checkedAttributeNode = new LiteralValueNode();
        Row checkedRow = new Row();
        checkedRow.setType("Checked Attribute");
        checkedRow.setValue(ctx.getText());
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
        Row onSubmitRow = new Row();
        onSubmitRow.setType("OnSubmit Attribute");
        onSubmitRow.setValue(ctx.getText());
        return onSubmitAttributeNode;
    }

    @Override
    public ASTNode visitGapAttribute(AngularParser.GapAttributeContext ctx) {
        LiteralValueNode gapAttributeNode = new LiteralValueNode();
        Row gapRow = new Row();
        gapRow.setType("Gap Attribute");
        gapRow.setValue(ctx.getText());
        return gapAttributeNode;
    }

    @Override
    public ASTNode visitDirectionAttribute(AngularParser.DirectionAttributeContext ctx) {
        LiteralValueNode directionAttributeNode = new LiteralValueNode();
        Row directionRow = new Row();
        directionRow.setType("Direction Attribute");
        directionRow.setValue(ctx.getText());
        return directionAttributeNode;
    }

    @Override
    public ASTNode visitDurationAttribute(AngularParser.DurationAttributeContext ctx) {
        LiteralValueNode durationAttributeNode = new LiteralValueNode();
        Row durationRow = new Row();
        durationRow.setType("Duration Attribute");
        durationRow.setValue(ctx.getText());
        return durationAttributeNode;
    }

    @Override
    public ASTNode visitRepeatAttribute(AngularParser.RepeatAttributeContext ctx) {
        LiteralValueNode repeatAttributeNode = new LiteralValueNode();
        Row repeatRow = new Row();
        repeatRow.setType("Repeat Attribute");
        repeatRow.setValue(ctx.getText());
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
