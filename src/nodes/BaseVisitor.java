package nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import gen.AngularLexer;
import gen.AngularParser;
import gen.AngularParserVisitor;
import nodes.css_node.CssClassContentNode;
import nodes.css_node.CssContentNode;
import nodes.css_node.CssNode;
import nodes.html_node.*;
import nodes.html_node.html_content.NgForNode;
import nodes.html_node.html_content.NgIfNode;
import nodes.statement.*;
import nodes.statement.HtmlElementNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import nodes.ServiceSymbolTable;

public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {

    SymbolTable symbolTable = new SymbolTable();
    SymbolTable multipleTemplatesSymbolTable = new SymbolTable();
    ServiceSymbolTable serviceSymbolTable = new ServiceSymbolTable();
    private String currentScope = "Global";
    Stack<String> scopeStack = new Stack<>();
    private List<String> semanticErrors = new ArrayList<>();

    private void enterScope(String newScope) {
        scopeStack.push(newScope);
        this.currentScope = newScope;
    }

    private void exitScope() {
        scopeStack.pop();
        currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
    }

    private void addRowToSymbolTable(String type, String name, String value) {
        Row row = new Row();
        row.setType(type);
        row.setName(name);
        row.setValue(value);
        row.setScope(currentScope);
        symbolTable.getRows().add(row);
        multipleTemplatesSymbolTable.getRows().add(row);
    }

    public void printAst() {
        String source = "C:\\Users\\karee\\Desktop\\Angular-Compiler-Using-Antlr-master\\src\\angular_compiler.txt";
        CharStream cs;
        try {
            cs = fromFileName(source);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);

        // Parse ONCE and get the tree
        ParseTree tree;
        try {
            tree = parser.program(); // entry rule
            System.out.println("Parsing completed successfully");
        } catch (Exception e) {
            System.err.println("Parsing failed: " + e.getMessage());
            return;
        }

        // AST Construction using Visitor pattern
        ProgramNode programNode = (ProgramNode) new BaseVisitor().visitProgram((AngularParser.ProgramContext) tree);
        System.out.println("=== AST ===");
        System.out.println(programNode);

        // Semantic Analysis using Listener pattern on the SAME tree
        ParseTreeWalker walker = new ParseTreeWalker();
        SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable); // Use consistent symbol table
        walker.walk(analyzer, tree);

        // Print semantic errors
        List<String> errors = analyzer.getSemanticErrors();
        if (!errors.isEmpty()) {
            System.out.println("\n=== Semantic Errors ===");
            for (String error : errors) {
                System.out.println(error);
            }
        } else {
            System.out.println("\n=== No Semantic Errors Found ===");
        }

        // Print symbol table
        System.out.println("=== Symbol Table ===");
        this.multipleTemplatesSymbolTable.print();
        // Print semantic errors from BaseVisitor

        if (!semanticErrors.isEmpty()) {
            System.out.println("\n=== Semantic Errors (from BaseVisitor) ===");
            for (String error : semanticErrors) {
                System.err.println(error);
            }
        }
        // Optional: Print symbol table
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

        if (ctx.class_() != null) {
            ClassNode anclass = visitClass(ctx.class_());
            statement.setClassNodes(anclass);
        }
        if (ctx.arrayDeclaration() != null) {
            ArrayDeclarationNode arrayDeclarationNode = visitArrayDeclaration(ctx.arrayDeclaration());
            statement.setArrayDeclarationNodeList(arrayDeclarationNode);


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
//            statementRow.setType("Assignment Statement");
//            statementRow.setValue(ctx.assignmentStatement().getText());
//            statementRow.setScope("Global");
        }
        if (ctx.breakStatement() != null) {
            BreakStatementNode breakStatementNode = visitBreakStatement(ctx.breakStatement());
            statement.setBreakStatementNodes(breakStatementNode);
//            statementRow.setType("Break Statement");
//            statementRow.setValue(ctx.breakStatement().getText());
        }
        if (ctx.continueStatement() != null) {
            ContinueStatementNode continueStatementNode = visitContinueStatement(ctx.continueStatement());
            statement.setContinueStatementNodes(continueStatementNode);
//            statementRow.setType("Continue Statement");
//            statementRow.setValue(ctx.continueStatement().getText());
        }
        if (ctx.html() != null) {
            HtmlElementNode htmlElementNode = visitHtml_element(ctx.html_element());
            statement.setHtmlElementNodes(htmlElementNode);
//            statementRow.setType("Html Element");
//            statementRow.setScope("Global");
//            statementRow.setName(ctx.getText());
//            statementRow.setValue(ctx.html_element().getText());
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
        if (ctx.html() != null) {
            HtmlNode htmlNode = visitHtml(ctx.html());
            statement.setHtmlNodes(htmlNode);
        }
        return statement;
    }

    @Override
    public ComponentNode visitComponent(AngularParser.ComponentContext ctx) {
        ComponentNode componentNode = new ComponentNode();
        Row componentRow = new Row();
        if (ctx.decorator() != null) {
            DecoratorNode decoratorNode = visitDecorator(ctx.decorator());
            componentNode.setDecorator(decoratorNode);
            componentRow.setType("Component");
            componentRow.setValue(ctx.decorator().getText());
            componentRow.setScope(currentScope);

            // --- Robust Provider Extraction and Semantic Check ---
            if (decoratorNode.getArguments() != null && !decoratorNode.getArguments().isEmpty()) {
                for (ArgumentListNode argList : decoratorNode.getArguments()) {
                    for (ArgumentNode arg : argList.getArgumentNodeList()) {
                        if ("providers".equals(arg.getName()) && arg.getValue() != null) {
                            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("[A-Za-z_][A-Za-z0-9_]*").matcher(arg.getValue().toString());
                            while (matcher.find()) {
                                String providerName = matcher.group();
                                if (!"useExisting".equals(providerName) && !"useClass".equals(providerName) && !"provide".equals(providerName)) {
                                    try {
                                        // Force a semantic error for demonstration:
                                        serviceSymbolTable.checkServiceDeclaredOrThrow("NotProvidedServiceX", currentScope, 0);
                                        // Uncomment below to check real provider (remove above line for real use)
                                        // serviceSymbolTable.checkServiceDeclaredOrThrow(providerName, currentScope, 0);
                                    } catch (SemanticException e) {
                                        // Print the error but do not stop execution
                                        System.err.println(e.getMessage());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (ctx.exportClass() != null) {
            componentNode.setExportClass(visitExportClass(ctx.exportClass()));
            componentRow.setValue(ctx.exportClass().getText());
            componentRow.setScope(currentScope);
        }
        symbolTable.getRows().add(componentRow);
        return componentNode;
    }

    @Override
    public ExportClassNode visitExportClass(AngularParser.ExportClassContext ctx) {
        ExportClassNode exportClassNode = new ExportClassNode();
        Row exportClassRow = new Row();
        if (ctx.class_() != null) {
            exportClassNode.setClassNode(visitClass(ctx.class_()));
            exportClassRow.setType("Class");
            exportClassRow.setValue(ctx.class_().getText());
            exportClassRow.setScope(currentScope);

            // --- Service Declaration Logic ---
            // If the parent context is a Service (not just Export), declare the service
            // This is a simple heuristic: if the previous statement was a Service, treat as service declaration
            // (You may want to refine this based on your actual parse tree structure)
            if (ctx.getParent() != null && ctx.getParent().getText().contains("@Injectable")) {
                String className = ctx.class_().Identifier().getText();
                serviceSymbolTable.insertService(className, "Global");
            }
        }
        symbolTable.getRows().add(exportClassRow);
        return exportClassNode;
    }

    @Override
    public ClassNode visitClass(AngularParser.ClassContext ctx) {
        ClassNode classNode = new ClassNode();

        String className = ctx.Identifier().getText();
        classNode.setIdentifier(className);

        addRowToSymbolTable("Class", className, ctx.getText());

        enterScope(className);

        if (ctx.classBody() != null) {
            classNode.setClassBody(visitClassBody(ctx.classBody()));
        }

        // Exit class scope
        exitScope();

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
                classBodyRow.setValue(ctx.variableDeclaration().get(i).getText());
                classBodyRow.setScope(currentScope);

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
                classBodyRow.setType("Array Declaration");
                classBodyRow.setValue(ctx.arrayDeclaration().get(i).getText());
                classBodyRow.setScope(currentScope);
            }
        }
        for (int i = 0; i < ctx.objectDeclataion().size(); i++) {
            if (ctx.objectDeclataion().get(i) != null) {
                classBodyNode.getObjectDeclarationNodes().add(visitObjectDeclataion(ctx.objectDeclataion(i)));

            }
        }
        symbolTable.getRows().add(classBodyRow);
        return classBodyNode;
    }

    @Override
    public DecoratorNode visitDecorator(AngularParser.DecoratorContext ctx) {
        DecoratorNode decoratorNode = new DecoratorNode();
        Row decoratorRow = new Row();
        if (ctx.argumentList() != null) {
            decoratorNode.getArguments().add(visitArgumentList(ctx.argumentList()));
            decoratorRow.setType("Decorator List");
            decoratorRow.setValue(ctx.argumentList().getText());
            symbolTable.getRows().add(decoratorRow);
        }
        return decoratorNode;
    }

    @Override
    public ArgumentListNode visitArgumentList(AngularParser.ArgumentListContext ctx) {
        ArgumentListNode argumentListNode = new ArgumentListNode();
        Row argumentListRow = new Row();
        for (int i = 0; i < ctx.argument().size(); i++) {
            if (ctx.argument().get(i) != null) {
                argumentListNode.getArgumentNodeList().add(visitArgument(ctx.argument(i)));
                argumentListRow.setType("Argument List");
                argumentListRow.setName(ctx.argument().get(i).Identifier().getText());
                argumentListRow.setValue(ctx.argument().get(i).getText());
                argumentListRow.setScope(currentScope);
            }
        }
        symbolTable.getRows().add(argumentListRow);
        return argumentListNode;
    }

    @Override
    public ArgumentNode visitArgument(AngularParser.ArgumentContext ctx) {
        ArgumentNode node = new ArgumentNode();
        String name = ctx.Identifier().getText();
        String value = null;
        if (ctx.literalValue() != null) {
            // Try to extract identifier if present (for providers)
            if (ctx.literalValue().Identifier() != null) {
                value = ctx.literalValue().Identifier().getText();
            } else {
                value = ctx.literalValue().getText();
            }
        }
        node.setValue(visitLiteralValue(ctx.literalValue()));
        node.setName(name);
       // node.setValue(value);
        addRowToSymbolTable("Argument", name, value);
        return node;
    }

    @Override
    public ImportStatementNode visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatementNode importStatementNode = new ImportStatementNode();
        Row importRow = new Row();
        if (ctx.Identifier() != null) {
            importStatementNode.setIdentifier(ctx.Identifier().getText());
            importRow.setType("Import Statement");
            importRow.setName(ctx.Identifier().getText());
            importRow.setScope(currentScope);
        }
        if (ctx.StringLiteral() != null) {
            importStatementNode.setSource(ctx.StringLiteral().getText());
            importRow.setValue(ctx.StringLiteral().getText());

        }
        symbolTable.getRows().add(importRow);
        return importStatementNode;
    }

    @Override
    public ASTNode visitThisVarible(AngularParser.ThisVaribleContext ctx) {
        ThisVariableNode thisVariableNode = new ThisVariableNode();
        thisVariableNode.setName(ctx.getText());
        thisVariableNode.setThisNewInstanceAssignmentNode(visitNewInstanceAssignment(ctx.newInstanceAssignment()));
        return thisVariableNode;
    }

    @Override
    public ThisNewInstanceAssignmentNode visitNewInstanceAssignment(AngularParser.NewInstanceAssignmentContext ctx) {
        ThisNewInstanceAssignmentNode thisNewInstanceAssignmentNode = new ThisNewInstanceAssignmentNode();
        thisNewInstanceAssignmentNode.setName(ctx.getText());
        for (int i = 0; i < ctx.expression().size(); i++) {
            thisNewInstanceAssignmentNode.getExpressionNode().add(visitExpression(ctx.expression(i)));
        }
        return thisNewInstanceAssignmentNode;
    }

    @Override
    public ASTNode visitNestedThisAssignment(AngularParser.NestedThisAssignmentContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitIdentifierOrPropertyAssignment(AngularParser.IdentifierOrPropertyAssignmentContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitEnum(AngularParser.EnumContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitEnumValues(AngularParser.EnumValuesContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitEnumValue(AngularParser.EnumValueContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitConsoleLog(AngularParser.ConsoleLogContext ctx) {
        ConsoleLogNode consoleLogNode = new ConsoleLogNode();
        consoleLogNode.setValue(ctx.Identifier().getText());
        return consoleLogNode;
    }

    @Override
    public ASTNode visitAbstractClass(AngularParser.AbstractClassContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitInterface(AngularParser.InterfaceContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAccessModifier(AngularParser.AccessModifierContext ctx) {
        AccessModifierNode accessModifierNode = new AccessModifierNode();
        accessModifierNode.setAccessModifier(ctx.getText());
        return accessModifierNode;
    }

    @Override
    public VariableDeclarationNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclarationNode variableDeclarationNode = new VariableDeclarationNode();
        Row variableRow = new Row();
        if (ctx.Identifier() != null) {
            String varName = ctx.Identifier().getText();
            if (!symbolTable.variableExistsInScope(varName, currentScope)) {
                variableRow.setType("Variable Declaration");
                variableRow.setName(varName);
                variableRow.setScope(currentScope);
                symbolTable.getRows().add(variableRow);
            } else {
                semanticErrors.add("Semantic Error: Duplicate variable declaration in the same scope: " + varName);
                System.err.println("Semantic Error: Duplicate variable declaration in the same scope: " + varName);
            }
            variableDeclarationNode.setIdentifier(varName);
        }
        if (ctx.type() != null) {
            variableDeclarationNode.setType(visitType(ctx.type()));
        }
        if (ctx.expression() != null) {
            variableDeclarationNode.setExpression(visitExpression(ctx.expression()));
            Row exprRow = new Row();
            exprRow.setType("Variable Expression");
            exprRow.setName(ctx.Identifier().getText());
            exprRow.setScope(currentScope);
            exprRow.setValue(ctx.expression().getText());
            symbolTable.getRows().add(exprRow);
        }
        return variableDeclarationNode;
    }

    private ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        Row expressionRow = new Row();
        if (expressionNode.operator != null) {
            expressionNode.setOperator(ctx.getText());
            expressionRow.setType("Operator");
            expressionRow.setName(ctx.getText());
            expressionRow.setValue(ctx.getText());
            expressionRow.setScope(currentScope);
        }
        if (expressionNode.left != null) {
            expressionNode.setLeft(expressionNode.left);
            expressionRow.setValue(expressionNode.left.toString());
            expressionRow.setScope(currentScope);
        }
        if (expressionNode.right != null) {
            expressionNode.setRight(expressionNode.right);
            expressionRow.setValue(expressionNode.right.toString());
            expressionRow.setScope(currentScope);
        }
        symbolTable.getRows().add(expressionRow);
        return expressionNode;
    }

    @Override
    public ArrayDeclarationNode visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) {
        ArrayDeclarationNode arrayDeclarationNode = new ArrayDeclarationNode();
        arrayDeclarationNode.setIdentifier(ctx.Identifier().getText());
        String arrayName = ctx.Identifier().getText();
        List<String> arrayValues = new ArrayList<>();
        arrayDeclarationNode.setType(visitType(ctx.type()));
        String arrayType = ctx.type().getText();
        if (!ctx.literalValue().isEmpty()) {
            for (int i = 0; i < ctx.literalValue().size(); i++) {
                arrayDeclarationNode.getValues().add(visitLiteralValue(ctx.literalValue().get(i)));
                arrayValues.add(visitLiteralValue(ctx.literalValue().get(i)).getArrayValue());
            }
        }
        addRowToSymbolTable("Array Declaration", arrayName, arrayValues.toString());
        return arrayDeclarationNode;
    }

    @Override
    public ASTNode visitAbstractFunctionDeclaration(AngularParser.AbstractFunctionDeclarationContext ctx) {
        return null;
    }

    @Override
    public FunctionDeclarationNode visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        FunctionDeclarationNode functionDeclarationNode = new FunctionDeclarationNode();
        String name = null;
        if (ctx.Constructor() != null) {
            name = ctx.Constructor().getText();
            functionDeclarationNode.setIdentifier(ctx.Constructor().getText());
        }
        if (ctx.Identifier() != null) {
            functionDeclarationNode.setIdentifier(ctx.Identifier().getText());
            name = ctx.Identifier().getText();
        }
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter().get(i) != null) {
                functionDeclarationNode.getParameters().add(visitParameter(ctx.parameter(i)));
            }
        }
        addRowToSymbolTable("Function Declaration", name, "params");
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
            typeRow.setScope(currentScope);
        }
        if (ctx.TypeBoolean() != null) {
            typeNode.setAnboolean(ctx.TypeBoolean().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.TypeBoolean().getText());
            typeRow.setScope(currentScope);
        }
        if (ctx.TypeString() != null) {
            typeNode.setString(ctx.TypeString().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.TypeString().getText());
            typeRow.setScope(currentScope);
        }
        if (ctx.Array() != null) {
            typeNode.setArray(ctx.Array().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.Array().getText());
            typeRow.setScope(currentScope);
        }
        symbolTable.getRows().add(typeRow);
        return typeNode;
    }

    @Override
    public ObjectDeclarationNode visitObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) {
        ObjectDeclarationNode objectDeclarationNode = new ObjectDeclarationNode();
        if (ctx.Identifier() != null) {
            objectDeclarationNode.setIdentifier(ctx.Identifier().toString());
            addRowToSymbolTable("Object", ctx.Identifier().get(0).getText(), ctx.Identifier().get(1).getText());
        }
        if(!symbolTable.isImported(ctx.Identifier().get(1).getText())){
            System.err.println("error: Semantic Error: Class '" + ctx.Identifier().get(1).getText() + "' used but not imported.");

        }
        return objectDeclarationNode;
    }

    @Override
    public LiteralValueNode visitLiteralValue(AngularParser.LiteralValueContext ctx) {
        LiteralValueNode literalValueNode = new LiteralValueNode();
        if (ctx.StringLiteral() != null) {
            literalValueNode.setStirngValue(ctx.StringLiteral().getText());
            addRowToSymbolTable("String", ctx.StringLiteral().getText(), ctx.StringLiteral().getText());
        }
        if (ctx.NumberLiteral() != null) {
            literalValueNode.setNumValue(ctx.NumberLiteral().getText());
            addRowToSymbolTable("Number", ctx.NumberLiteral().getText(), ctx.NumberLiteral().getText());
        }
        if (ctx.BooleanLiteral() != null) {
            literalValueNode.setBooleanValue(ctx.BooleanLiteral().getText());
            addRowToSymbolTable("Boolean", ctx.BooleanLiteral().getText(), ctx.BooleanLiteral().getText());
        }
        else {
            literalValueNode.setNull(true);
        }
        if (ctx.listLiteral() != null) {
            literalValueNode.setListLiteralNode(visitListLiteral(ctx.listLiteral()));
            addRowToSymbolTable("List", ctx.listLiteral().getText(), ctx.listLiteral().getText());
        }
        if (ctx.Identifier() != null) {
            literalValueNode.setIdentifierValue(ctx.Identifier().getText());
            addRowToSymbolTable("Identifier", ctx.Identifier().getText(), ctx.Identifier().getText());
        }
        if(ctx.html()!=null){
            literalValueNode.setHtmlNode(visitHtml(ctx.html()));
        }
        return literalValueNode;
    }

    @Override
    public ASTNode visitMapLiteral(AngularParser.MapLiteralContext ctx) {
        return null;
    }

    @Override
    public ListLiteralNode visitListLiteral(AngularParser.ListLiteralContext ctx) {
        ListLiteralNode listLiteralNode = new ListLiteralNode();
        Row listLiteralRow = new Row();
        for (int i = 0; i < ctx.Identifier().size(); i++) {
            if (ctx.Identifier().get(i) != null) {
                listLiteralNode.getIdentifiers().add(ctx.Identifier().get(i).getText());
                listLiteralRow.setType("List");
                listLiteralRow.setValue(ctx.Identifier().get(i).getText());
                listLiteralRow.setScope(currentScope);
            }
        }
        symbolTable.getRows().add(listLiteralRow);
        return listLiteralNode;
    }

    @Override
    public AssignmentStatementNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) {
        AssignmentStatementNode assignmentStatementNode = new AssignmentStatementNode();
        assignmentStatementNode.setIdentifier(ctx.Identifier().getText());
        List<String> values = new ArrayList<>();
        if (!ctx.literalValue().isEmpty()) {
            for (int i = 0; i < ctx.literalValue().size(); i++) {
                assignmentStatementNode.getValues().add(visitLiteralValue(ctx.literalValue().get(i)));
                values.add(visitLiteralValue(ctx.literalValue().get(i)).toString());
            }
        }
        if (!ctx.expression().isEmpty()) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                assignmentStatementNode.getExpression().add(visitExpression(ctx.expression().get(i)));
                values.add(visitExpression(ctx.expression().get(i)).toString());
            }
        }
        addRowToSymbolTable("Assignment", ctx.Identifier().getText(), values.toString());
        return assignmentStatementNode;
    }

    @Override
    public IfStatementNode visitIfStatement(AngularParser.IfStatementContext ctx) {
        return null;
    }

    @Override
    public WhileStatementNode visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitElseIfStatement(AngularParser.ElseIfStatementContext ctx) {
        return null;
    }

    @Override
    public BreakStatementNode visitBreakStatement(AngularParser.BreakStatementContext ctx) {
        return null;
    }

    @Override
    public ContinueStatementNode visitContinueStatement(AngularParser.ContinueStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitBlock(AngularParser.BlockContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDd(AngularParser.DdContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNotEqualsComparison(AngularParser.NotEqualsComparisonContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLogicalOrExpressionStatement(AngularParser.LogicalOrExpressionStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitMultiplication(AngularParser.MultiplicationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAddition(AngularParser.AdditionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitStrongEqualsComparison(AngularParser.StrongEqualsComparisonContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLiteralExpression(AngularParser.LiteralExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAngularExpreission(AngularParser.AngularExpreissionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitGreaterThanEqualsComparison(AngularParser.GreaterThanEqualsComparisonContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitGreaterThanComparison(AngularParser.GreaterThanComparisonContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitPropertyAccess(AngularParser.PropertyAccessContext ctx) {
        return null;
    }

    @Override
    public IdentifierNode visitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx) {
        IdentifierNode identifierNode = new IdentifierNode();
        Row identifierRow = new Row();
        if (ctx.Identifier() != null) {
            identifierNode.setName(ctx.Identifier().getText());
            identifierRow.setType("Identifier");
            identifierRow.setValue(ctx.Identifier().getText());
            identifierRow.setScope(currentScope);
        }
        symbolTable.getRows().add(identifierRow);
        return identifierNode;
    }

    @Override
    public ASTNode visitBracketExpression(AngularParser.BracketExpressionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitSubtraction(AngularParser.SubtractionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitModulus(AngularParser.ModulusContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitWeakEqualsComparison(AngularParser.WeakEqualsComparisonContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDivision(AngularParser.DivisionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLogicalAndExpressionStatement(AngularParser.LogicalAndExpressionStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLessThanEqualsComparison(AngularParser.LessThanEqualsComparisonContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLessThanComparison(AngularParser.LessThanComparisonContext ctx) {
        return null;
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
        symbolTable.getRows().add(parameterRow);
        return parameterNode;
    }

    @Override
    public ASTNode visitFunction_call(AngularParser.Function_callContext ctx) {
        return null;
    }

    @Override
    public HtmlNode visitHtml(AngularParser.HtmlContext ctx) {
        System.out.println("ddddd");
        HtmlNode htmlNode = new HtmlNode();
        Row htmlRow = new Row();
        if (ctx.html_content() != null) {
            htmlNode.setContent(visitHtml_content(ctx.html_content()));
            htmlRow.setType("Content");
            htmlRow.setValue(ctx.html_content().getText());
        }
        symbolTable.getRows().add(htmlRow);
        return htmlNode;
    }

    @Override
    public HtmlContentNode visitHtml_content(AngularParser.Html_contentContext ctx) {
        HtmlContentNode htmlContentNode = new HtmlContentNode();
        Row htmlContentRow = new Row();
        if (ctx.html_element() != null) {
            for (int i = 0; i < ctx.html_element().size(); i++) {
                htmlContentNode.getHtmlElementNode().add(visitHtml_element(ctx.html_element().get(i)));
                htmlContentRow.setType("Html Element");
                htmlContentRow.setValue(ctx.html_element().get(i).getText());
            }
        }
        if (ctx.expression() != null) {
            htmlContentNode.setIdentifierNode("ff");
            htmlContentRow.setType("Identifier");
            htmlContentRow.setValue("ff");
        }
        symbolTable.getRows().add(htmlContentRow);
        return htmlContentNode;
    }

    @Override
    public HtmlElementNode visitHtml_element(AngularParser.Html_elementContext ctx) {
        HtmlElementNode htmlElementNode = new HtmlElementNode();
        if (ctx.html_attributes() != null) {
            htmlElementNode.setHtmlAttributesNodes(visitHtml_attributes(ctx.html_attributes()));
        }
        if (ctx.html_content() != null) {
            htmlElementNode.setHtmlContentNode(visitHtml_content(ctx.html_content()));
        }
        return htmlElementNode;
    }

    @Override
    public HtmlTagNode visitHtml_tag_name(AngularParser.Html_tag_nameContext ctx) {
        HtmlTagNode htmlTagNode = new HtmlTagNode();
        Row htmlTagRow = new Row();
        if (ctx.Identifier() != null) {
            htmlTagNode.setIdentifierNode(ctx.Identifier().getText());
            htmlTagRow.setType("Identifier");
            htmlTagRow.setValue(ctx.Identifier().getText());
        }
        symbolTable.getRows().add(htmlTagRow);
        return htmlTagNode;
    }

    @Override
    public HtmlAttributesNode visitHtml_attributes(AngularParser.Html_attributesContext ctx) {
        HtmlAttributesNode htmlAttributesNode = new HtmlAttributesNode();
        Row htmlAttributesRow = new Row();
        if (ctx.html_attribute() != null) {
            for (int i = 0; i < ctx.html_attribute().size(); i++) {
                htmlAttributesNode.getHtmlAttributeNodes().add(visitHtml_attribute(ctx.html_attribute(i)));
                htmlAttributesRow.setType("Html Attribute");
                htmlAttributesRow.setValue(ctx.html_attribute(i).getText());
            }
        }
        symbolTable.getRows().add(htmlAttributesRow);
        return htmlAttributesNode;
    }

    @Override
    public HtmlAttributeNode visitHtml_attribute(AngularParser.Html_attributeContext ctx) {
        HtmlAttributeNode htmlAttributeNode = new HtmlAttributeNode();
        Row htmlAttributeRow = new Row();
        if (ctx.Identifier() != null) {
            htmlAttributeNode.setIdentifierNode(ctx.Identifier().getText());
            htmlAttributeRow.setType("Identifier");
            htmlAttributeRow.setValue(ctx.Identifier().getText());
        }
        if (ctx.html_attribute_value() != null) {
//            htmlAttributeNode.setHtmlAttributeValueNode(visitHtml_attribute_value(ctx.html_attribute_value()));
        }
        if (ctx.access_suffix() != null) {
            for (int i = 0; i < ctx.access_suffix().size(); i++) {
                htmlAttributeNode.getAccessSufNode().add(visitAccess_suffix(ctx.access_suffix().get(i)));
                htmlAttributeRow.setType("Access Suffix");
                htmlAttributeRow.setValue(ctx.access_suffix().get(i).getText());
            }
        }
        if (ctx.Identifier() != null) {
//            htmlAttributeNode.setClassNode(visitClass(ctx.Identifier().getText()));
        }
        symbolTable.getRows().add(htmlAttributeRow);
        return htmlAttributeNode;
    }

    @Override
    public AccessSufNode visitAccess_suffix(AngularParser.Access_suffixContext ctx) {
        return null;
    }


    @Override
    public HtmlAttributeNode visitHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx) {
        HtmlAttributeNode htmlAttributeNode = new HtmlAttributeNode();
        Row htmlAttributeRow = new Row();
        htmlAttributeNode.setClassNode("htmlclass");
        htmlAttributeNode.setIdentifierNode("html name");
        htmlAttributeRow.setType("Class");
        htmlAttributeRow.setValue("htmlclass");
        symbolTable.getRows().add(htmlAttributeRow);
        return htmlAttributeNode;
    }

    @Override
    public ASTNode visitCss(AngularParser.CssContext ctx) {
        CssNode cssNode = new CssNode();
        Row cssRow = new Row();
        if (ctx.css_content() != null) {
            for (int i = 0; i < ctx.css_content().size(); i++) {
                cssNode.getCssContentNode().add(visitCss_content(ctx.css_content(i)));
                cssRow.setType("Css Content");
                cssRow.setValue(ctx.css_content(i).getText());
            }
        }
        symbolTable.getRows().add(cssRow);
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
        if (ctx.Identifier() != null) {
//            cssContentNode.setIdentifierNode(ctx.Identifier().get());
            cssContentRow.setType("Identifier");
//            cssContentRow.setValue(ctx.Identifier().getText());
        }
        symbolTable.getRows().add(cssContentRow);
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
        symbolTable.getRows().add(cssClassContentRow);
        return cssClassContentNode;
    }


    @Override
    public ASTNode visitCheckedAttribute(AngularParser.CheckedAttributeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitOnChangeAttribute(AngularParser.OnChangeAttributeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitOnClickAttribute(AngularParser.OnClickAttributeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitOnSubmitAttribute(AngularParser.OnSubmitAttributeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitGapAttribute(AngularParser.GapAttributeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDirectionAttribute(AngularParser.DirectionAttributeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDurationAttribute(AngularParser.DurationAttributeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitRepeatAttribute(AngularParser.RepeatAttributeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNgForAttribute(AngularParser.NgForAttributeContext ctx) {
        NgForNode ngForNode = new NgForNode();
        ngForNode.setExpressionNode(visitExpression(ctx.expression()));
        addRowToSymbolTable("NgFor","*NgFor",ctx.expression().getText());
        return ngForNode;
    }

    @Override
    public ASTNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) {
        NgIfNode ngIfNode = new NgIfNode();
        ngIfNode.setExpressionNode(visitExpression(ctx.expression()));
        addRowToSymbolTable("NgIf","*NgIf",ctx.expression().getText());
        return ngIfNode;
    }
}
