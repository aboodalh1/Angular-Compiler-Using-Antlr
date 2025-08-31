package nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Optional;
import gen.AngularLexer;
import gen.AngularParser;
import gen.AngularParserVisitor;
import nodes.SymbolTables.ComponentSymbolTable;
import nodes.SymbolTables.ServiceSemanticValidator;
import nodes.SymbolTables.SymbolTable;
import nodes.SymbolTables.mainSymbolTable;
import nodes.SymbolTables.ImportSymbolTable;
import nodes.SymbolTables.VariableSymbolTable;
import nodes.SymbolTables.TypeSymbolTable;
import nodes.css_node.CssClassContentNode;
import nodes.css_node.CssContentNode;
import nodes.css_node.CssNode;
import nodes.html_node.*;
import nodes.html_node.html_content.NgForNode;
import nodes.html_node.html_content.NgIfNode;
import nodes.statement.*;
import nodes.statement.HtmlElementNode;
import nodes.statement.EnumNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import static helper.keyWords.*;
import static helper.methods.printAST;
import static helper.methods.printSemanticError;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {

    mainSymbolTable symbolTable = new mainSymbolTable();
    ComponentSymbolTable componentSymbolTable = new ComponentSymbolTable();
    ServiceSemanticValidator serviceSymbolTable = new ServiceSemanticValidator();
    public ImportSymbolTable importSymbolTable = new ImportSymbolTable();
    public VariableSymbolTable variableSymbolTable = new VariableSymbolTable();
    public TypeSymbolTable typeSymbolTable = new TypeSymbolTable();
    private String currentScope = GLOBAL;
    Stack<String> scopeStack = new Stack<>();
    private final List<String> componentScopeNames = new ArrayList<>();
    private boolean isInsideComponent = false;

    private List<String> semanticErrors = new ArrayList<>();
    
    // Simple logger implementation
    private static class Logger {
        public void info(String message) {
            System.out.println("INFO: " + message);
        }
        public void error(String message) {
            System.err.println("ERROR: " + message);
        }
    }
    private final Logger logger = new Logger();

  


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
    private void addRowToSymbolTable(String type, String name, String value) {
        Row row = new Row();
        row.setType(type);
        row.setName(name);
        row.setValue(value);
        row.setScope(currentScope);
        symbolTable.getRows().add(row);
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

    public void initialize() throws IOException {
        // 1. Parse the input and build the initial parse tree
        ParseTree tree = initializeProgram();

        // 2. Create a single SemanticAnalyzer with all necessary symbol tables
        SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable, serviceSymbolTable, componentSymbolTable, importSymbolTable, variableSymbolTable, typeSymbolTable);

        // 3. Walk the tree to perform semantic analysis
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(analyzer, tree);

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
        System.out.println("\n--- Import Symbol Table ---");
        importSymbolTable.print();
        System.out.println("\n--- Variable Symbol Table ---");
        variableSymbolTable.print();
        System.out.println("\n--- Type Symbol Table ---");
        typeSymbolTable.print();
        System.out.println("\n--- Service Symbol Table ---");
        serviceSymbolTable.print();
        System.out.println("\n--- Component Symbol Table ---");
        componentSymbolTable.print();
    }

    public ParseTree initializeProgram() throws IOException {
        CharStream charStream = fromFileName(DEFAULT_SOURCE_FILE);
        AngularLexer lexer = new AngularLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(tokens);

        ParseTree tree = parser.program();
        System.out.println("Parsing completed successfully.");

        ProgramNode programNode = (ProgramNode) this.visitProgram((AngularParser.ProgramContext) tree);
        printAST(programNode);

        return tree;
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

        Optional.ofNullable(ctx.classDeclaration()).ifPresent(c -> statement.setClassNodes(visitClassDeclaration(c)));
        Optional.ofNullable(ctx.arrayDeclaration()).ifPresent(c -> statement.setArrayDeclarationNodeList(visitArrayDeclaration(c)));
        Optional.ofNullable(ctx.variableDeclaration()).ifPresent(c -> statement.setVariableDeclarationNodes(visitVariableDeclaration(c)));
        Optional.ofNullable(ctx.functionDeclaration()).ifPresent(c -> statement.setFunctionDeclarationNodes(visitFunctionDeclaration(c)));
        Optional.ofNullable(ctx.ifStatement()).ifPresent(c -> statement.setIfStatementNodes(visitIfStatement(c)));
        Optional.ofNullable(ctx.whileStatement()).ifPresent(c -> statement.setWhileStatementNodes(visitWhileStatement(c)));
        Optional.ofNullable(ctx.assignmentStatement()).ifPresent(c -> statement.setAssignmentStatementNodes(visitAssignmentStatement(c)));
        Optional.ofNullable(ctx.breakStatement()).ifPresent(c -> statement.setBreakStatementNodes(visitBreakStatement(c)));
        Optional.ofNullable(ctx.continueStatement()).ifPresent(c -> statement.setContinueStatementNodes(visitContinueStatement(c)));
        Optional.ofNullable(ctx.importStatement()).ifPresent(c -> statement.setImportStatementNodes(visitImportStatement(c)));
        Optional.ofNullable(ctx.component()).ifPresent(c -> statement.setComponentNodes(visitComponent(c)));
        Optional.ofNullable(ctx.exportClass()).ifPresent(c -> statement.setExportClassNode(visitExportClass(c)));
        Optional.ofNullable(ctx.html()).ifPresent(c -> statement.setHtmlNodes(visitHtml(c)));

        return statement;
    }

    @Override
    public ComponentNode visitComponent(AngularParser.ComponentContext ctx) {
        isInsideComponent = true;
        try {
            ComponentNode componentNode = new ComponentNode();
            String componentName = "UnknownComponent"; // Default name

// Handle decorator content (argumentList only)
            if (ctx.argumentList() != null) {
                DecoratorNode decoratorNode = new DecoratorNode();
                decoratorNode.getArguments().add(visitArgumentList(ctx.argumentList()));
                componentNode.setDecorator(decoratorNode);
}

            if (ctx.exportClass() != null) {
                ExportClassNode exportClassNode = visitExportClass(ctx.exportClass());
                componentNode.setExportClass(exportClassNode);

                // Extract component name from the class declaration
                if (exportClassNode.getClassNode() != null && exportClassNode.getClassNode().getIdentifier() != null) {
                    componentName = exportClassNode.getClassNode().getIdentifier();
                }
            }
            
            // Track the scope name as a component scope
            componentScopeNames.add(componentName);


            // Add component to its own symbol table for internal lookup
            Row componentRow = new Row();
            componentRow.setType(COMPONENT);
            componentRow.setName(componentName);
            componentRow.setValue(ctx.argumentList() != null ? ctx.argumentList().getText() : "");
            componentRow.setScope(componentName);
            componentSymbolTable.getRows().add(componentRow);

            return componentNode;
        } finally {
            isInsideComponent = false;
        }
    }

    @Override
    public ExportClassNode visitExportClass(AngularParser.ExportClassContext ctx) {
        ExportClassNode exportClassNode = new ExportClassNode();
        if (ctx.classDeclaration() != null) {
            exportClassNode.setClassNode(visitClassDeclaration(ctx.classDeclaration()));
        }

        // Heuristic to identify a service: a class exported outside of a @Component decorator.
        if (!isInsideComponent && exportClassNode.getClassNode() != null) {
            String className = exportClassNode.getClassNode().getIdentifier();
            if (className != null) {
                addRowToServiceSymbolTable(className, GLOBAL);
                // Also add to the main symbol table for general lookup.
                // addRowToSymbolTable("Service", className, "Exported Service Class");
            }
        }
        return exportClassNode;
    }



    @Override
    public ClassNode visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassNode classNode = new ClassNode();

        String className = ctx.Identifier().getText();
        classNode.setIdentifier(className);

        // addRowToSymbolTable(CLASS, className, ctx.getText());

        scoopAction(ENTER, className);
        try {
            Optional.ofNullable(ctx.classBody())
                    .ifPresent(classBody -> classNode.setClassBody(visitClassBody(classBody)));
        } finally {
            scoopAction(EXIT, className);
        }

        return classNode;
    }

    @Override
    public ClassBodyNode visitClassBody(AngularParser.ClassBodyContext ctx) {

        ClassBodyNode classBodyNode = new ClassBodyNode();

        // Use streams to visit each child declaration and add it to the ClassBodyNode
        ctx.variableDeclaration()
           .forEach(vd -> classBodyNode.getVariableDeclarationNodes().add(visitVariableDeclaration(vd)));

        ctx.functionDeclaration()
           .forEach(fd -> classBodyNode.getFunctionDeclarationNodes().add(visitFunctionDeclaration(fd)));

        ctx.arrayDeclaration()
           .forEach(ad -> classBodyNode.getArrayDeclarationNodeList().add(visitArrayDeclaration(ad)));

        ctx.objectDeclataion()
           .forEach(od -> classBodyNode.getObjectDeclarationNodes().add(visitObjectDeclataion(od)));

        return classBodyNode;
    }

    @Override
    public DecoratorNode visitDecorator(AngularParser.DecoratorContext ctx) {
        DecoratorNode node = new DecoratorNode();
        Optional.ofNullable(ctx.argumentList())
                .ifPresent(argList -> node.getArguments().add(visitArgumentList(argList)));
        return node;
    }

    @Override
    public ArgumentListNode visitArgumentList(AngularParser.ArgumentListContext ctx) {
        ArgumentListNode node = new ArgumentListNode();
        ctx.argument().forEach(argCtx -> node.getArgumentNodeList().add(visitArgument(argCtx)));
        return node;
    }

    @Override
    public ArgumentNode visitArgument(AngularParser.ArgumentContext ctx) {
        ArgumentNode node = new ArgumentNode();
        node.setName(ctx.Identifier().getText());
        Optional.ofNullable(ctx.literalValue())
                .ifPresent(val -> node.setValue(visitLiteralValue(val)));
        return node;
    }

    @Override
    public ImportStatementNode visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatementNode importStatementNode = new ImportStatementNode();
// Handle identifiers from the import statement
        if (ctx.Identifier() != null) {
            importStatementNode.setIdentifier(ctx.Identifier().get(0).getText());
}
        
        // Handle the source string literal
        if (ctx.StringLiteral() != null) {
            importStatementNode.setSource(ctx.StringLiteral().getText());
            // addRowToSymbolTable(IMPORT_STATEMENT,null,ctx.StringLiteral().getText());
        }
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
            thisNewInstanceAssignmentNode.getExpressionNode().add((ExpressionNode) visitExpression(ctx.expression(i)));
        }
        return thisNewInstanceAssignmentNode;
    }
    @Override
    public ASTNode visitConsoleLog(AngularParser.ConsoleLogContext ctx) {
        ConsoleLogNode consoleLogNode = new ConsoleLogNode();
        consoleLogNode.setValue(ctx.Identifier().getText());
        return consoleLogNode;
    }

    @Override
    public ASTNode visitAccessModifier(AngularParser.AccessModifierContext ctx) {
        AccessModifierNode accessModifierNode = new AccessModifierNode();
        accessModifierNode.setAccessModifier(ctx.getText());
        return accessModifierNode;
    }

    @Override
    public VariableDeclarationNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclarationNode node = new VariableDeclarationNode();

if (ctx.Identifier() != null) {
            String varName = ctx.Identifier().getText();
            node.setIdentifier(varName);
            Optional.ofNullable(ctx.type()).ifPresent(t -> node.setType(visitType(t)));
            Optional.ofNullable(ctx.expression()).ifPresent(e -> node.setExpression((ExpressionNode) visitExpression(e)));

            String value = (ctx.expression() != null) ? ctx.expression().getText() : null;
            // addRowToSymbolTable(VARIABLE_DECLARATION, varName, value);

            // If inside a component's scope, add to the component's symbol table as well.
            if (componentScopeNames.contains(currentScope)) {
                addRowToComponentSymbolTable(VARIABLE_DECLARATION, varName, value);
            }
}

        return node;
    }

// Helper method - not an override since ANTLR generates separate methods for labeled alternatives
public ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        if (expressionNode.operator != null) {
            expressionNode.setOperator(ctx.getText());
            // addRowToSymbolTable(OPERATOR, ctx.getText(), ctx.getText());
        }
        if (expressionNode.left != null) {
            expressionNode.setLeft(expressionNode.left);
            // addRowToSymbolTable(LEFT, ctx.getText(), expressionNode.left.toString());
        }
        if (expressionNode.right != null) {
            expressionNode.setRight(expressionNode.right);
            // addRowToSymbolTable(RIGHT, ctx.getText(), expressionNode.right.toString());
        }
        return expressionNode;
    }

    @Override
    public ArrayDeclarationNode visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) {
       // Create the node and get the array name.
        ArrayDeclarationNode node = new ArrayDeclarationNode();
        String arrayName = ctx.Identifier().getText();
        node.setIdentifier(arrayName);

        // Set the type for the array node.
        node.setType(visitType(ctx.type()));

        // Process the array's literal values efficiently.
        List<String> valuesForSymbolTable = new ArrayList<>();
        ctx.literalValue().forEach(literalContext -> {

            // Visit each literal value only ONCE to avoid duplicate work and side effects.
            LiteralValueNode valueNode = visitLiteralValue(literalContext);
            
            // Add the created AST node to our ArrayDeclarationNode.
            node.getValues().add(valueNode);
            
            // Get the string representation for the symbol table entry.
            if (valueNode.getArrayValue() != null) {
                valuesForSymbolTable.add(valueNode.getArrayValue());
            }
        });

        // Add a single, consolidated entry for the array to the symbol table.
        // addRowToSymbolTable(ARRAY_DECLARATION, arrayName, valuesForSymbolTable.toString());

        return node;
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
        // addRowToSymbolTable(FUNCTION_DECLARATION, name, PARAMS);

        // If inside a component's scope, add to the component's symbol table as well.
        if (componentScopeNames.contains(currentScope)) {
            addRowToComponentSymbolTable(FUNCTION_DECLARATION, name, PARAMS);
        }

        return functionDeclarationNode;
    }

    @Override
    public TypeNode visitType(AngularParser.TypeContext ctx) {
        TypeNode typeNode = new TypeNode();

        Optional.ofNullable(ctx.TypeNumber()).ifPresent(typeNumber -> {
            String value = typeNumber.getText();
            typeNode.setNumber(value);
            // addRowToSymbolTable(TYPE, null, value);
        });

        Optional.ofNullable(ctx.TypeBoolean()).ifPresent(typeBoolean -> {
            String value = typeBoolean.getText();
            typeNode.setAnboolean(value);
            // addRowToSymbolTable(TYPE, null, value);
        });

        Optional.ofNullable(ctx.TypeString()).ifPresent(typeString -> {
            String value = typeString.getText();
            typeNode.setString(value);
            // addRowToSymbolTable(TYPE, null, value);
        });

        Optional.ofNullable(ctx.Array()).ifPresent(array -> {
            String value = array.getText();
            typeNode.setArray(value);
            // addRowToSymbolTable(TYPE, null, value);
        });

        return typeNode;
    }

    @Override
    public ObjectDeclarationNode visitObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) {
        ObjectDeclarationNode node = new ObjectDeclarationNode();

        if (ctx.Identifier() != null && ctx.Identifier().size() == 2) {
            String objectName = ctx.Identifier().get(0).getText();
            String typeName = ctx.Identifier().get(1).getText();

            node.setIdentifier(objectName);
            node.setClassName(typeName);

            // addRowToSymbolTable(OBJECT, objectName, typeName);
        }
        return node;
    }

    @Override
    public LiteralValueNode visitLiteralValue(AngularParser.LiteralValueContext ctx) {
        LiteralValueNode node = new LiteralValueNode();

        // This method's sole responsibility is to build the AST node for a literal.

        if (ctx.StringLiteral() != null) {
            node.setStirngValue(ctx.StringLiteral().getText());
        } else if (ctx.NumberLiteral() != null) {
            node.setNumValue(ctx.NumberLiteral().getText());
        } else if (ctx.BooleanLiteral() != null) {
            node.setBooleanValue(ctx.BooleanLiteral().getText());
        } else if (ctx.listLiteral() != null) {
            node.setListLiteralNode(visitListLiteral(ctx.listLiteral()));
} else if (ctx.html() != null) {
            node.setHtmlNode(visitHtml(ctx.html()));
        }

        return node;
    }

    @Override
    public ListLiteralNode visitListLiteral(AngularParser.ListLiteralContext ctx) {
        ListLiteralNode listLiteralNode = new ListLiteralNode();
        Row listLiteralRow = new Row();
if (ctx.literalValue() != null) {
            for (int i = 0; i < ctx.literalValue().size(); i++) {
                LiteralValueNode valueNode = visitLiteralValue(ctx.literalValue().get(i));
                listLiteralNode.getIdentifiers().add(valueNode.toString());
}
        }
        return listLiteralNode;
    }

    @Override
    public AssignmentStatementNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) {
        AssignmentStatementNode assignmentStatementNode = new AssignmentStatementNode();
        assignmentStatementNode.setIdentifier(ctx.Identifier().getText());
        List<String> values = new ArrayList<>();
// Handle expression assignment
        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            assignmentStatementNode.getExpression().add((ExpressionNode) visitExpression(ctx.expression(0)));
            values.add(visitExpression(ctx.expression(0)).toString());
        }
        
// addRowToSymbolTable(ASSIGNMENT, ctx.Identifier().getText(), values.toString());
        return assignmentStatementNode;
    }

    @Override
    public IdentifierNode visitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx) {
        IdentifierNode identifierNode = new IdentifierNode();
        if (ctx.Identifier() != null) {
            identifierNode.setName(ctx.Identifier().getText());
            // addRowToSymbolTable(IDENTIFIER,ctx.Identifier().getText(),ctx.Identifier().getText());
        }
        return identifierNode;
    }
    @Override
    public ParameterNode visitParameter(AngularParser.ParameterContext ctx) {
        ParameterNode parameterNode = new ParameterNode();
        if (ctx.Identifier() != null) {
            parameterNode.setIdentifier(ctx.Identifier().getText());
            // addRowToSymbolTable(PARAMETER,null,ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            parameterNode.setType(visitType(ctx.type()));
            // addRowToSymbolTable(TYPE,null,ctx.Identifier().getText());
        }
        if (ctx.literalValue() != null) {
            parameterNode.setDefaultValue(visitLiteralValue(ctx.literalValue()));
            // addRowToSymbolTable(DEFAULT_VALUE,null,ctx.literalValue().getText());
        }
        return parameterNode;
    }

    @Override
    public HtmlNode visitHtml(AngularParser.HtmlContext ctx) {
        HtmlNode htmlNode = new HtmlNode();
        if (ctx.html_content() != null) {
            htmlNode.setContent(visitHtml_content(ctx.html_content()));
            // addRowToSymbolTable(CONTENT,ctx.html_content().getText(),ctx.html_content().getText());
        }
        return htmlNode;
    }

    @Override
    public HtmlContentNode visitHtml_content(AngularParser.Html_contentContext ctx) {
        HtmlContentNode htmlContentNode = new HtmlContentNode();
        if (ctx.html_element() != null) {
            for (int i = 0; i < ctx.html_element().size(); i++) {
                htmlContentNode.getHtmlElementNode().add(visitHtml_element(ctx.html_element().get(i)));
                // addRowToSymbolTable(HTML_ELEMENT,null,ctx.html_element().get(i).getText());
            }
        }
        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
ExpressionNode expressionNode = (ExpressionNode) visitExpression(ctx.expression(0));
expressionNode.setLine(ctx.expression(0).start.getLine());
            htmlContentNode.setExpression(expressionNode);
            // addRowToSymbolTable(IDENTIFIER, expressionNode.toString(), String.valueOf(expressionNode.getLine()));
        }
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
if (ctx.getText() != null && !ctx.getText().isEmpty()) {
            htmlTagNode.setIdentifierNode(ctx.getText());
            // addRowToSymbolTable(IDENTIFIER,null,ctx.getText());
}
        return htmlTagNode;
    }

    @Override
    public HtmlAttributesNode visitHtml_attributes(AngularParser.Html_attributesContext ctx) {
        // The job of this visitor is to build the AST.
        HtmlAttributesNode node = new HtmlAttributesNode();
        ctx.html_attribute().forEach(attr -> node.getHtmlAttributeNodes().add(visitHtml_attribute(attr)));
        return node;
    }

    @Override
    public HtmlAttributeNode visitHtml_attribute(AngularParser.Html_attributeContext ctx) {
        HtmlAttributeNode node = new HtmlAttributeNode();

        if (ctx.Identifier() != null) {
            node.setIdentifierNode(ctx.Identifier().getText());
        }

        Optional.ofNullable(ctx.html_attribute_value())
                .ifPresent(val -> node.setHtmlAttributeValueNode((HtmlAttributeValueNode) visitHtml_attribute_value(val)));

        ctx.access_suffix().forEach(suffix -> node.getAccessSufNode().add((AccessSufNode) visitAccess_suffix(suffix)));

        // Special handling for other attribute types can be added here if needed,
        // for example, by checking ctx.ngIfAttribute(), ctx.ngForAttribute(), etc.

        return node;
    }

    @Override
    public ASTNode visitAccess_suffix(AngularParser.Access_suffixContext ctx) {
        AccessSufNode node = new AccessSufNode();

        if (ctx.expression() != null) {
node.setExpressionNode((ExpressionNode) visitExpression(ctx.expression()));
} else if (ctx.function_call() != null) {
            node.setFunctionCallNode((FunctionCallNode) visitFunction_call(ctx.function_call()));
        } else if (ctx.Identifier() != null) {
            node.setIdentifierNode(ctx.Identifier().getText());
        }

        return node;
    }


    @Override
    public ASTNode visitHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx) {
        // This method now correctly constructs and returns a specific HtmlAttributeValueNode
        // wrapped as an ASTNode, which can then be safely cast by the caller.
        HtmlAttributeValueNode attributeValueNode = new HtmlAttributeValueNode();
        if (ctx.literalValue() != null) {
            attributeValueNode.setValue(visitLiteralValue(ctx.literalValue()));
        }
        if (ctx.expression() != null) {
attributeValueNode.setExpression((ExpressionNode) visitExpression(ctx.expression()));
}
        return attributeValueNode;
    }

    @Override
    public ASTNode visitCss(AngularParser.CssContext ctx) {
        CssNode node = new CssNode();
        // CSS content is not a program symbol; symbol table logic was incorrect and removed.
        ctx.css_content().forEach(content -> node.getCssContentNode().add(visitCss_content(content)));
        return node;
    }

    @Override
    public CssContentNode visitCss_content(AngularParser.Css_contentContext ctx) {
        CssContentNode node = new CssContentNode();
        // CSS classes are not program symbols; symbol table logic was incorrect and removed.
        ctx.css_class_content().forEach(cc -> node.getCssClassContentList().add(visitCss_class_content(cc)));

        if (ctx.Identifier() != null) {
            // Your grammar allows an Identifier here. You can decide how to handle it.
            // For now, we are just building the AST correctly.
            // node.setIdentifierNode(...);
        }
        return node;
    }

    @Override
    public CssClassContentNode visitCss_class_content(AngularParser.Css_class_contentContext ctx) {
        CssClassContentNode cssClassContentNode = new CssClassContentNode();
        if (ctx.Identifier() != null) {
            cssClassContentNode.setName(ctx.Identifier().get(0).getText());
            // addRowToSymbolTable(NAME,ctx.Identifier().get(0).getText(),ctx.Identifier().get(0).getText());
        }
        return cssClassContentNode;
    }

    @Override
    public ASTNode visitNgForAttribute(AngularParser.NgForAttributeContext ctx) {
        NgForNode ngForNode = new NgForNode();
ngForNode.setExpressionNode((ExpressionNode) visitExpression(ctx.expression()));
// addRowToSymbolTable(NGFOR,STAR_NGFOR,ctx.expression().getText());
        return ngForNode;
    }

    @Override
    public ASTNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) {
        NgIfNode ngIfNode = new NgIfNode();
ngIfNode.setExpressionNode((ExpressionNode) visitExpression(ctx.expression()));
// addRowToSymbolTable(NGIF,STAR_NGIF,ctx.expression().getText());
        return ngIfNode;
    }

    @Override
    public ASTNode visitLiteralExpression(AngularParser.LiteralExpressionContext ctx) {
        // A literal expression is a leaf in the expression tree.
        // We wrap the literal's ASTNode inside an ExpressionNode for consistency.
        ExpressionNode node = new ExpressionNode();
        node.setLeft(visitLiteralValue(ctx.literalValue()));
        return node;
    }

    @Override
    public ASTNode visitAngularExpreission(AngularParser.AngularExpreissionContext ctx) {
        // An Angular expression {{...}} is a wrapper around a standard expression.
        // The correct implementation is to simply visit the inner expression.
        if (ctx.expression() != null) {
            return visitExpression(ctx.expression());
        }
        // Return an empty node if the expression is empty to avoid null pointers.
        return new ExpressionNode();
    }

    @Override
    public ExpressionNode visitGreaterThanEqualsComparison(AngularParser.GreaterThanEqualsComparisonContext ctx) {
        return null;
    }

    @Override
    public ExpressionNode visitAddition(AngularParser.AdditionContext ctx) {
        // This is the correct pattern for all binary expression visitors.
        ExpressionNode node = new ExpressionNode();

        // 1. Recursively call visitExpression for the left child.
        node.setLeft(visitExpression(ctx.expression(0)));

        // 2. Recursively call visitExpression for the right child.
        node.setRight(visitExpression(ctx.expression(1)));

        // 3. Get the operator text from the specific token method.
        node.setOperator(ctx.Plus().getText());

        return node;
    }

    @Override
    public FunctionCallNode visitFunction_call(AngularParser.Function_callContext ctx) {
        FunctionCallNode node = new FunctionCallNode();

        if (ctx.Identifier() != null) {
            node.setIdentifier(ctx.Identifier().getText());
        }

        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
                node.getArguments().add(visitExpression(exprCtx));
            }
        }

        return node;
    }

    @Override
    public ASTNode visitAbstractFunctionDeclaration(AngularParser.AbstractFunctionDeclarationContext ctx) {
        return new ExpressionNode();
    }

    @Override
    public ASTNode visitEnumDecl(AngularParser.EnumDeclContext ctx) {
        EnumNode en = new EnumNode();
        // Fill name and values as needed later
        return en;
    }

    // New State Management Methods - Commented out as these grammar rules don't exist
    /*
    @Override
    public ASTNode visitStateDeclaration(AngularParser.StateDeclarationContext ctx) {
        StateNode st = new StateNode();
        if (ctx.StringLiteral() != null) {
            String s = ctx.StringLiteral().getText();
            st.setStateName(s.substring(1, s.length()-1));
        } else {
            st.setStateName("state");
        }
        if (ctx.variableDeclaration() != null) {
            st.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        addRowToSymbolTable("State", st.getStateName(), "");
        return st;
    }

    @Override
    public ASTNode visitActionDeclaration(AngularParser.ActionDeclarationContext ctx) {
        ActionNode ac = new ActionNode();
        if (ctx.StringLiteral() != null) {
            String s = ctx.StringLiteral().getText();
            ac.setActionName(s.substring(1, s.length()-1));
        } else if (ctx.functionDeclaration()!=null && ctx.functionDeclaration().Identifier()!=null){
            ac.setActionName(ctx.functionDeclaration().Identifier().getText());
        } else { ac.setActionName("action"); }
        if (ctx.functionDeclaration()!=null) {
            ac.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        addRowToSymbolTable("Action", ac.getActionName(), "");
        return ac;
    }
    */

    /*
    // Commented out visitor methods that don't exist in current grammar
    @Override
    public ASTNode visitActionCall(AngularParser.ActionCallContext ctx) {
        FunctionCallNode call = new FunctionCallNode();
        if (ctx.Identifier()!=null) call.setIdentifier(ctx.Identifier().getText());
        if (ctx.expression()!=null && !ctx.expression().isEmpty()) {
            call.setExpression(visitExpression(ctx.expression(0))); // Can be expanded later
        }
        return call;
    }

    @Override
    public ASTNode visitStoreDispatch(AngularParser.StoreDispatchContext ctx) {
        FunctionCallNode call = (FunctionCallNode) visitActionCall(ctx.actionCall());
        addRowToSymbolTable("StoreDispatch", "dispatch", ctx.actionCall().getText());
        return call;
    }

    @Override
    public ASTNode visitStoreSelect(AngularParser.StoreSelectContext ctx) {
        IdentifierNode sel = new IdentifierNode();
        if (ctx.StringLiteral()!=null){
            String s = ctx.StringLiteral().getText();
            sel.setName(s.substring(1, s.length()-1));
        } else { sel.setName("selector"); }
        addRowToSymbolTable("StoreSelect", sel.getName(), "");
        return sel;
    }

    // New Navigation Methods
    @Override
    public ASTNode visitNavigation(AngularParser.NavigationContext ctx) {
        if (ctx.routerLink()!=null) return visitRouterLink(ctx.routerLink());
        if (ctx.routerOutlet()!=null) return visitRouterOutlet(ctx.routerOutlet());
        if (ctx.routerNavigate()!=null) return visitRouterNavigate(ctx.routerNavigate());
        return null;
    }

    @Override
    public ASTNode visitNavigationArray(AngularParser.NavigationArrayContext ctx) {
        // Return the node you prefer (e.g., List<String>)
        ListLiteralNode list = new ListLiteralNode();
        if (ctx.StringLiteral()!=null) {
            for (var t: ctx.StringLiteral()) list.getIdentifiers().add(t.getText().substring(1, t.getText().length()-1));
        }
        return list;
    }

    @Override
    public ASTNode visitRouterNavigate(AngularParser.RouterNavigateContext ctx) {
        ASTNode arr = visitNavigationArray(ctx.navigationArray());
        addRowToSymbolTable("Navigate", arr.toString(), "");
        return arr;
    }

    @Override
    public ASTNode visitRouterLink(AngularParser.RouterLinkContext ctx) {
        // If you have RouterLinkNode use it, otherwise return IdentifierNode with the value
        IdentifierNode n = new IdentifierNode();
        String s = ctx.StringLiteral().getText();
        n.setName(s.substring(1, s.length()-1));
        return n;
    }

    @Override
    public ASTNode visitRouterOutlet(AngularParser.RouterOutletContext ctx) {
        IdentifierNode n = new IdentifierNode();
        n.setName("router-outlet");
        return n;
    }

    // New Angular Template Methods
    @Override
    public ASTNode visitNgModel(AngularParser.NgModelContext ctx) {
        // grammar: ngModel: OpenBracket NgModel CloseBracket Assign Identifier;
        NgModelNode n = new NgModelNode();
        n.setBoundIdentifier(ctx.Identifier().getText());
        addRowToSymbolTable("NgModel", n.getBoundIdentifier(), "");
        return n;
    }

    @Override
    public ASTNode visitNgSubmit(AngularParser.NgSubmitContext ctx) {
        // grammar: NgSubmit Assign StringLiteral;
        NgSubmitNode n = new NgSubmitNode();
        String s = ctx.StringLiteral().getText();
        n.setHandlerName(s.substring(1, s.length()-1));
        addRowToSymbolTable("NgSubmit", n.getHandlerName(), "");
        return n;
    }

    @Override
    public ASTNode visitNgClick(AngularParser.NgClickContext ctx) {
        // grammar: NgClick Assign StringLiteral;
        NgClickNode n = new NgClickNode();
        String s = ctx.StringLiteral().getText();
        n.setHandlerName(s.substring(1, s.length()-1));
        addRowToSymbolTable("NgClick", n.getHandlerName(), "");
        return n;
    }

    // Additional Required Methods
    @Override
    public ASTNode visitStoreOperation(AngularParser.StoreOperationContext ctx) {
        if (ctx.storeDispatch() != null) return visitStoreDispatch(ctx.storeDispatch());
        if (ctx.storeSelect() != null) return visitStoreSelect(ctx.storeSelect());
        return null;
    }

    @Override
    public ASTNode visitEnumDecl(AngularParser.EnumDeclContext ctx) {
        EnumNode en = new EnumNode();
        // Fill name and values as needed later
        return en;
    }

    @Override
    public ASTNode visitAngularTemplate(AngularParser.AngularTemplateContext ctx) {
        // Return the first one found (ngModel | ngSubmit | ngClick)
        if (ctx.ngModel() != null) return visitNgModel(ctx.ngModel());
        if (ctx.ngSubmit() != null) return visitNgSubmit(ctx.ngSubmit());
        if (ctx.ngClick() != null) return visitNgClick(ctx.ngClick());
        return null;
    }

    @Override
    public ASTNode visitStateManagement(AngularParser.StateManagementContext ctx) {
        if (ctx.stateDeclaration() != null) return visitStateDeclaration(ctx.stateDeclaration());
        if (ctx.actionDeclaration() != null) return visitActionDeclaration(ctx.actionDeclaration());
        if (ctx.storeOperation() != null) return visitStoreOperation(ctx.storeOperation());
        return null;
    }

    // New Method Call Methods
    @Override
    public ASTNode visitMethodCallStatement(AngularParser.MethodCallStatementContext ctx) {
        // Convert to simple FunctionCallNode
        return null; // If not used now, leave it like this, or build a simple node
    }

    @Override
    public ASTNode visitMethodCall(AngularParser.MethodCallContext ctx) {
        // TODO: Implement method call logic
        return null;
    }

    @Override
    public ASTNode visitArrowFunction(AngularParser.ArrowFunctionContext ctx) {
        // TODO: Implement arrow function logic
        return null;
    }

    // New Expression Methods
    @Override
    public ASTNode visitThisPropertyAssignment(AngularParser.ThisPropertyAssignmentContext ctx) {
        // TODO: Implement this.property = value logic
        return null;
    }

    @Override
    public ASTNode visitThisMethodCall(AngularParser.ThisMethodCallContext ctx) {
        // TODO: Implement this.method.call() logic
        return null;
    }

    @Override
    public ASTNode visitArrayMethodWithArrowFunction(AngularParser.ArrayMethodWithArrowFunctionContext ctx) {
        // TODO: Implement array.method(arrow => function) logic
        return null;
    }

    @Override
    public ASTNode visitThisPropertyAccess(AngularParser.ThisPropertyAccessContext ctx) {
        // TODO: Implement this.property access logic
        return null;
    }

    // New Arrow Function Method
    @Override
    public ASTNode visitSimpleArrowFunction(AngularParser.SimpleArrowFunctionContext ctx) {
        // TODO: Implement simple arrow function logic
        return null;
    }

    // Template String Support Methods
    @Override
    public ASTNode visitTemplateString(AngularParser.TemplateStringContext ctx) {
        // Parse template string content as HTML for semantic analysis
        if (ctx.templateContent() != null) {
            visitTemplateContent(ctx.templateContent());
        }
        return null;
    }
    */

    // Helper method to parse template string content separately
    private void parseTemplateStringForSemanticAnalysis(String templateContent) {
        try {
            // Remove backticks and create input stream for template content
            String htmlContent = templateContent.substring(1, templateContent.length() - 1);
            CharStream cs = CharStreams.fromString("html: " + "`" + htmlContent + "`");

            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(tokens);

            // Parse as HTML content
            AngularParser.HtmlContext htmlCtx = parser.html();

            // Run semantic analysis on the parsed HTML
            ParseTreeWalker walker = new ParseTreeWalker();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable, this.serviceSymbolTable, this.componentSymbolTable, this.importSymbolTable, this.variableSymbolTable, this.typeSymbolTable);
            walker.walk(analyzer, htmlCtx);

            // Add any semantic errors found
            semanticErrors.addAll(analyzer.getSemanticErrors());

        } catch (Exception e) {
            logger.error("Error parsing template string: " + e.getMessage());
        }
    }

    // Helper method to analyze string content for semantic errors
    private void analyzeStringForSemanticErrors(String stringContent) {
        try {
            // Check if the string contains HTML-like content
            if (stringContent.contains("<") && stringContent.contains(">")) {
                // Create a simple HTML context for analysis
                String htmlContent = "html: " + stringContent;
                CharStream cs = CharStreams.fromString(htmlContent);

                AngularLexer lexer = new AngularLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                AngularParser parser = new AngularParser(tokens);

                // Parse as HTML content
                AngularParser.HtmlContext htmlCtx = parser.html();

                // Run semantic analysis on the parsed HTML
                ParseTreeWalker walker = new ParseTreeWalker();
                SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable, this.serviceSymbolTable, this.componentSymbolTable, this.importSymbolTable, this.variableSymbolTable, this.typeSymbolTable);
                walker.walk(analyzer, htmlCtx);

                // Add any semantic errors found
                semanticErrors.addAll(analyzer.getSemanticErrors());

                logger.info("Analyzed string content for semantic errors: " + stringContent.substring(0, Math.min(50, stringContent.length())) + "...");
            }
        } catch (Exception e) {
            logger.error("Error analyzing string for semantic errors: " + e.getMessage());
        }
    }

    // Helper method to analyze template string content for semantic errors
    private void analyzeTemplateStringForSemanticErrors(String templateContent) {
        try {
            // Remove backticks and create input stream for template content
            String htmlContent = templateContent.substring(1, templateContent.length() - 1);

            // Create a simple HTML context for analysis
            String htmlInput = "html: `" + htmlContent + "`";
            CharStream cs = CharStreams.fromString(htmlInput);

            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(tokens);

            // Parse as HTML content
            AngularParser.HtmlContext htmlCtx = parser.html();

            // Run semantic analysis on the parsed HTML
            ParseTreeWalker walker = new ParseTreeWalker();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable, this.serviceSymbolTable, this.componentSymbolTable, this.importSymbolTable, this.variableSymbolTable, this.typeSymbolTable);
            walker.walk(analyzer, htmlCtx);

            // Add any semantic errors found
            semanticErrors.addAll(analyzer.getSemanticErrors());

            logger.info("Analyzed template string for semantic errors: " + htmlContent.substring(0, Math.min(50, htmlContent.length())) + "...");

        } catch (Exception e) {
            logger.error("Error analyzing template string for semantic errors: " + e.getMessage());
        }
    }

    /*
    @Override
    public ASTNode visitTemplateContent(AngularParser.TemplateContentContext ctx) {
        // Process HTML elements directly
        if (ctx.html_element() != null) {
            for (var he : ctx.html_element()) {
                visitHtml_element(he);
            }
        }

        // Process expressions directly
        if (ctx.expression() != null) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                visitExpression(ctx.expression(i));
            }
        }

        return null;
    }

    // New Product Management Methods
    @Override
    public ASTNode visitProduct(AngularParser.ProductContext ctx) {
        ProductNode product = new ProductNode();

        // Handle product properties
        if (ctx.productProperties() != null) {
            visitProductProperties(ctx.productProperties(), product);
        }

        // Handle product body if exists
        if (ctx.productBody() != null) {
            visitProductBody(ctx.productBody(), product);
        }

        addRowToSymbolTable("Product", product.getProductId(), "");
        return product;
    }

    @Override
    public ASTNode visitProductManager(AngularParser.ProductManagerContext ctx) {
        ProductManagerNode manager = new ProductManagerNode();

        // Set manager name if provided
        if (ctx.StringLiteral() != null) {
            String name = ctx.StringLiteral().getText();
            manager.setManagerName(name.substring(1, name.length()-1));
        }

        // Handle product manager body
        if (ctx.productManagerBody() != null) {
            visitProductManagerBody(ctx.productManagerBody(), manager);
        }

        addRowToSymbolTable("ProductManager", manager.getManagerName(), "");
        return manager;
    }

    @Override
    public ASTNode visitProductId(AngularParser.ProductIdContext ctx) {
        // This method is called by the parser, but we handle the logic in visitProduct
        // Return null as this is not a statement-level node
        return null;
    }

    @Override
    public ASTNode visitProductProperties(AngularParser.ProductPropertiesContext ctx) {
        // This method is called by the parser, but we handle the logic in visitProduct
        // Return null as this is not a statement-level node
        return null;
    }

    private void visitProductProperties(AngularParser.ProductPropertiesContext ctx, ProductNode product) {
        // Handle product ID
        if (ctx.productId() != null) {
            String id = ctx.productId().StringLiteral().getText();
            product.setProductId(id.substring(1, id.length()-1));
        }

        // Handle other properties
        if (ctx.productProperty() != null) {
            for (var prop : ctx.productProperty()) {
                visitProductProperty(prop, product);
            }
        }
    }

    @Override
    public ASTNode visitProductProperty(AngularParser.ProductPropertyContext ctx) {
        // This method is called by the parser, but we handle the logic in visitProduct
        // Return null as this is not a statement-level node
        return null;
    }

    private void visitProductProperty(AngularParser.ProductPropertyContext ctx, ProductNode product) {
        if (ctx.ProductName() != null && ctx.literalValue() != null) {
            String value = ctx.literalValue().getText();
            if (value.startsWith("\"") || value.startsWith("'")) {
                value = value.substring(1, value.length()-1);
            }
            product.setProductName(value);
        } else if (ctx.Price() != null && ctx.literalValue() != null) {
            String value = ctx.literalValue().getText();
            if (value.startsWith("\"") || value.startsWith("'")) {
                value = value.substring(1, value.length()-1);
            }
            product.setPrice(value);
        } else if (ctx.Image() != null && ctx.literalValue() != null) {
            String value = ctx.literalValue().getText();
            if (value.startsWith("\"") || value.startsWith("'")) {
                value = value.substring(1, value.length()-1);
            }
            product.setImageUrl(value);
        } else if (ctx.Description() != null && ctx.literalValue() != null) {
            String value = ctx.literalValue().getText();
            if (value.startsWith("\"") || value.startsWith("'")) {
                value = value.substring(1, value.length()-1);
            }
            product.setDescription(value);
        }
    }

    @Override
    public ASTNode visitProductBody(AngularParser.ProductBodyContext ctx) {
        // This method is called by the parser, but we handle the logic in visitProduct
        // Return null as this is not a statement-level node
        return null;
    }

    private void visitProductBody(AngularParser.ProductBodyContext ctx, ProductNode product) {
        // Handle variable declarations
        if (ctx.variableDeclaration() != null) {
            for (var varDecl : ctx.variableDeclaration()) {
                VariableDeclarationNode varNode = visitVariableDeclaration(varDecl);
                product.addProperty(varNode);
            }
        }

        // Handle function declarations
        if (ctx.functionDeclaration() != null) {
            for (var funcDecl : ctx.functionDeclaration()) {
                // For now, just visit the function (could be extended later)
                visitFunctionDeclaration(funcDecl);
            }
        }

        // Handle nested products
        if (ctx.product() != null) {
            for (var nestedProduct : ctx.product()) {
                // For now, just visit the nested product (could be extended later)
                visitProduct(nestedProduct);
            }
        }
    }

    @Override
    public ASTNode visitProductManagerBody(AngularParser.ProductManagerBodyContext ctx) {
        // This method is called by the parser, but we handle the logic in visitProductManager
        // Return null as this is not a statement-level node
        return null;
    }

    private void visitProductManagerBody(AngularParser.ProductManagerBodyContext ctx, ProductManagerNode manager) {
        // Handle products
        if (ctx.product() != null) {
            for (var product : ctx.product()) {
                ProductNode productNode = (ProductNode) visitProduct(product);
                manager.addProduct(productNode);
            }
        }

        // Handle function declarations
        if (ctx.functionDeclaration() != null) {
            for (var funcDecl : ctx.functionDeclaration()) {
                FunctionDeclarationNode funcNode = visitFunctionDeclaration(funcDecl);
                manager.addCrudOperation(funcNode);
            }
        }

        // Handle variable declarations
        if (ctx.variableDeclaration() != null) {
            for (var varDecl : ctx.variableDeclaration()) {
                // For now, just visit the variable (could be extended later)
                visitVariableDeclaration(varDecl);
            }
        }
    }
    */

// Add missing required visitor methods
    @Override
    public ASTNode visitActionDeclaration(AngularParser.ActionDeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitActionCall(AngularParser.ActionCallContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitRouterNavigate(AngularParser.RouterNavigateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNgSubmit(AngularParser.NgSubmitContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitRouterLink(AngularParser.RouterLinkContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNavigation(AngularParser.NavigationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNgClick(AngularParser.NgClickContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArrowFunction(AngularParser.ArrowFunctionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitTemplateString(AngularParser.TemplateStringContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitThisMethodCall(AngularParser.ThisMethodCallContext ctx) {
        return null;
    }



    @Override
    public ASTNode visitStoreOperation(AngularParser.StoreOperationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitArrayMethodWithArrowFunction(AngularParser.ArrayMethodWithArrowFunctionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitStoreDispatch(AngularParser.StoreDispatchContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitSimpleArrowFunction(AngularParser.SimpleArrowFunctionContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAngularTemplate(AngularParser.AngularTemplateContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitThisPropertyAccess(AngularParser.ThisPropertyAccessContext ctx) {
        return null;
    }



    @Override
    public ASTNode visitNgModel(AngularParser.NgModelContext ctx) {
        return null;
    }



    @Override
    public ASTNode visitStateManagement(AngularParser.StateManagementContext ctx) {
        return null;
    }



    @Override
    public ASTNode visitStateDeclaration(AngularParser.StateDeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitMethodCall(AngularParser.MethodCallContext ctx) {
        return null;
    }







    @Override
    public ASTNode visitThisPropertyAssignment(AngularParser.ThisPropertyAssignmentContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitNavigationArray(AngularParser.NavigationArrayContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitStoreSelect(AngularParser.StoreSelectContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitRouterOutlet(AngularParser.RouterOutletContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitTemplateContent(AngularParser.TemplateContentContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitMethodCallStatement(AngularParser.MethodCallStatementContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitMapLiteral(AngularParser.MapLiteralContext ctx) {
        // Create a simple node to represent the map literal
        // For now, return a basic node that can hold the text content
        ExpressionNode node = new ExpressionNode();
        if (ctx != null) {
            node.setLeft(new LiteralValueNode()); // Placeholder for the map content
        }
        return node;
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
    public ASTNode visitEnumValues(AngularParser.EnumValuesContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitEnumValue(AngularParser.EnumValueContext ctx) {
        return null;
    }
@Override
    public ASTNode visitAbstractClass(AngularParser.AbstractClassContext ctx) {
        return null;
    }

    @Override
public ASTNode visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx) {
        return null;
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
    public ASTNode visitStrongEqualsComparison(AngularParser.StrongEqualsComparisonContext ctx) {
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

}

