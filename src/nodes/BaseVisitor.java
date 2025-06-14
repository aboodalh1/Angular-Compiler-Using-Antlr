package nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Optional;
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

public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {

    SymbolTable symbolTable = new SymbolTable();
    SymbolTable multipleTemplatesSymbolTable = new SymbolTable();
    ServiceSymbolTable serviceSymbolTable = new ServiceSymbolTable();
    private String currentScope = "Global";
    Stack<String> scopeStack = new Stack<>();

    private List<String> semanticErrors = new ArrayList<>();
    private static final String DEFAULT_SOURCE_FILE = "C:\\Users\\karee\\Desktop\\Angular-Compiler-Using-Antlr-master\\src\\angular_compiler.txt";

    private static final String ENTER = "enter";

    private static final String EXIT = "exit";


    private void scoopAction(String action, String newScope) {
        switch (action) {
            case ENTER:
                scopeStack.push(newScope);
                this.currentScope = newScope;
                break;
            case EXIT:
                scopeStack.pop();
                currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
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
        multipleTemplatesSymbolTable.getRows().add(row);
    }

    public void initialize() {
        printAST(DEFAULT_SOURCE_FILE);
    }

    public void printAST(String source) {
        try {
            CharStream cs = fromFileName(source);
            AngularLexer lexer = new AngularLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(token);

            // Parse ONCE and get the tree
            ParseTree tree = parser.program();
            System.out.println("Parsing completed successfully.");

            // AST Construction using THIS visitor instance to correctly populate the symbol table
            ProgramNode programNode = (ProgramNode) this.visitProgram((AngularParser.ProgramContext) tree);
            System.out.println("\n=== AST ===");
            System.out.println(programNode);

            // Perform semantic analysis using the now-populated symbol table
            System.out.println("\n=== Semantic Errors ===");
            printSemanticError(tree);

        } catch (IOException e) {
            System.err.println("Error reading source file '" + source + "': " + e.getMessage());
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.err.println("An error occurred during processing: " + e.getMessage());
        }
    }

    public void printSemanticError(ParseTree tree) {
        // Semantic Analysis using Listener pattern
        ParseTreeWalker walker = new ParseTreeWalker();
        SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable);
        walker.walk(analyzer, tree);

        System.out.println("\n--- Semantic Analysis Results ---");

        // Print semantic errors from the analyzer
        printErrors("Semantic Errors (from Analyzer)", analyzer.getSemanticErrors());

        // Print semantic errors from this visitor
        printErrors("Semantic Errors (from Visitor)", this.semanticErrors);

        // Print symbol table
        System.out.println("\n=== Symbol Table ===");
        this.multipleTemplatesSymbolTable.print();
    }

    private void printErrors(String title, List<String> errors) {
        System.out.println("\n=== " + title + " ===");
        if (errors == null || errors.isEmpty()) {
            System.out.println("No errors found.");
        } else {
            System.err.println("Found " + errors.size() + " error(s):");
            errors.forEach(System.err::println);
        }
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

        Optional.ofNullable(ctx.class_()).ifPresent(c -> statement.setClassNodes(visitClass(c)));
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

        // 1. Build the AST node.
        String varName = ctx.Identifier().getText();
        node.setIdentifier(varName);
        Optional.ofNullable(ctx.type()).ifPresent(t -> node.setType(visitType(t)));
        Optional.ofNullable(ctx.expression()).ifPresent(e -> node.setExpression(visitExpression(e)));

        String value = (ctx.expression() != null) ? ctx.expression().getText() : null;
        addRowToSymbolTable("Variable Declaration", varName, value);

        return node;
    }

     @Override
     public ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        if (expressionNode.operator != null) {
            expressionNode.setOperator(ctx.getText());
            addRowToSymbolTable("Operator", ctx.getText(), ctx.getText());
        }
        if (expressionNode.left != null) {
            expressionNode.setLeft(expressionNode.left);
            addRowToSymbolTable("Left", ctx.getText(), expressionNode.left.toString());
        }
        if (expressionNode.right != null) {
            expressionNode.setRight(expressionNode.right);
            addRowToSymbolTable("right", ctx.getText(), expressionNode.right.toString());
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
        addRowToSymbolTable("Array Declaration", arrayName, valuesForSymbolTable.toString());

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
        addRowToSymbolTable("Function Declaration", name, "params");
        return functionDeclarationNode;
    }

    @Override
    public TypeNode visitType(AngularParser.TypeContext ctx) {
        TypeNode typeNode = new TypeNode();

        Optional.ofNullable(ctx.TypeNumber()).ifPresent(typeNumber -> {
            String value = typeNumber.getText();
            typeNode.setNumber(value);
            addRowToSymbolTable("Type", null, value);
        });

        Optional.ofNullable(ctx.TypeBoolean()).ifPresent(typeBoolean -> {
            String value = typeBoolean.getText();
            typeNode.setAnboolean(value);
            addRowToSymbolTable("Type", null, value);
        });

        Optional.ofNullable(ctx.TypeString()).ifPresent(typeString -> {
            String value = typeString.getText();
            typeNode.setString(value);
            addRowToSymbolTable("Type", null, value);
        });

        Optional.ofNullable(ctx.Array()).ifPresent(array -> {
            String value = array.getText();
            typeNode.setArray(value);
            addRowToSymbolTable("Type", null, value);
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

            addRowToSymbolTable("Object", objectName, typeName);

        } else {
            semanticErrors.add("Syntax Error: Invalid object declaration structure found: " + ctx.getText());
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
        } else if (ctx.Identifier() != null) {
            node.setIdentifierValue(ctx.Identifier().getText());
        } else if (ctx.html() != null) {
            node.setHtmlNode(visitHtml(ctx.html()));
        }

        return node;
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
            node.setExpressionNode(visitExpression(ctx.expression()));
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
            attributeValueNode.setExpression(visitExpression(ctx.expression()));
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
    public ASTNode visitGreaterThanEqualsComparison(AngularParser.GreaterThanEqualsComparisonContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAddition(AngularParser.AdditionContext ctx) {
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
    public ASTNode visitFunction_call(AngularParser.Function_callContext ctx) {
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
        return null;
    }

    @Override
    public ASTNode visitMapLiteral(AngularParser.MapLiteralContext ctx) {
        return null;
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
    public ASTNode visitAbstractClass(AngularParser.AbstractClassContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitInterface(AngularParser.InterfaceContext ctx) {
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
