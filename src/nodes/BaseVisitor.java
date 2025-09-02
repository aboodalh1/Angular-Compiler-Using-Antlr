//package nodes;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//import java.util.Optional;
//import gen.AngularLexer;
//import gen.AngularParser;
//import gen.AngularParserVisitor;
//import nodes.SymbolTables.ComponentSymbolTable;
//import nodes.SymbolTables.ServiceSemanticValidator;
//import nodes.SymbolTables.mainSymbolTable;
//import nodes.css_node.CssClassContentNode;
//import nodes.css_node.CssContentNode;
//import nodes.css_node.CssNode;
//import nodes.html_node.*;
//import nodes.html_node.html_content.NgForNode;
//import nodes.html_node.html_content.NgIfNode;
//import nodes.statement.*;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//
//import static helper.keyWords.*;
//import static helper.methods.printAST;
//import static org.antlr.v4.runtime.CharStreams.fromFileName;
//
//public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {
//
//    mainSymbolTable symbolTable = new mainSymbolTable();
//    ComponentSymbolTable componentSymbolTable = new ComponentSymbolTable();
//    ServiceSemanticValidator serviceSymbolTable = new ServiceSemanticValidator();
//    private String currentScope = GLOBAL;
//    Stack<String> scopeStack = new Stack<>();
//    private final List<String> componentScopeNames = new ArrayList<>();
//    private boolean isInsideComponent = false;
//
//    private List<String> semanticErrors = new ArrayList<>();
//
//
//
//
//    private void scoopAction(String action, String newScope) {
//        switch (action) {
//            case ENTER:
//                scopeStack.push(newScope);
//                this.currentScope = newScope;
//                break;
//            case EXIT:
//                scopeStack.pop();
//                currentScope = scopeStack.isEmpty() ? GLOBAL : scopeStack.peek();
//                break;
//            default:
//                throw new IllegalArgumentException("Unknown action: " + action);
//        }
//    }
//    private void addRowToSymbolTable(String type, String name, String value) {
//        Row row = new Row();
//        row.setType(type);
//        row.setName(name);
//        row.setValue(value);
//        row.setScope(currentScope);
//        symbolTable.getRows().add(row);
//    }
//
//    private void addRowToComponentSymbolTable(String type, String name, String value) {
//        Row row = new Row();
//        row.setType(type);
//        row.setName(name);
//        row.setValue(value);
//        row.setScope(currentScope);
//        componentSymbolTable.getRows().add(row);
//    }
//
//    private void addRowToServiceSymbolTable(String name, String scope) {
//        serviceSymbolTable.insertService(name, scope);
//    }
//
//    public ASTNode initialize() throws IOException {
//        // 1. Parse the input and build the initial parse tree
//        ParseTree tree = initializeProgram();
//
//        // 2. Create a single SemanticAnalyzer with all necessary symbol tables
//        SemanticAnalyzer analyzer = new SemanticAnalyzer(serviceSymbolTable, componentSymbolTable);
//
//        // 3. Walk the tree to perform semantic analysis
//        ParseTreeWalker walker = new ParseTreeWalker();
////        walker.walk(analyzer, tree);
//
//        // 4. Print the collected semantic errors and symbol tables
//        System.out.println("\n--- Semantic Analysis Results ---");
//        List<String> semanticErrors = analyzer.getSemanticErrors();
//        if (semanticErrors.isEmpty()) {
//            System.out.println("No semantic errors found.");
//        } else {
//            System.err.println("Found " + semanticErrors.size() + " error(s):");
//            semanticErrors.forEach(System.err::println);
//        }
//
//        System.out.println("\n--- Symbol Tables ---");
//        System.out.println("--- Main Symbol Table ---");
//        symbolTable.print();
//        System.out.println("\n--- Service Symbol Table ---");
//        serviceSymbolTable.print();
//        System.out.println("\n--- Component Symbol Table ---");
//        componentSymbolTable.print();
//
//        // 5. Return the AST root node for code generation
//        return visitProgram((AngularParser.ProgramContext) tree);
//    }
//
//    public ParseTree initializeProgram() throws IOException {
//        CharStream charStream = fromFileName(DEFAULT_SOURCE_FILE);
//        AngularLexer lexer = new AngularLexer(charStream);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        AngularParser parser = new AngularParser(tokens);
//
//        ParseTree tree = parser.program();
//        System.out.println("Parsing completed successfully.");
//
//        ProgramNode programNode = (ProgramNode) this.visitProgram((AngularParser.ProgramContext) tree);
//        printAST(programNode);
//
//        return tree;
//    }
//
//    @Override
//    public ASTNode visitProgram(AngularParser.ProgramContext ctx) {
//        ProgramNode programNode = new ProgramNode();
//        for (int i = 0; i < ctx.statement().size(); i++) {
//            if (ctx.statement() != null) {
//                StatementNode statementNode = visitStatement(ctx.statement(i));
//                programNode.getStatements().add(statementNode);
//            }
//        }
//
//        return programNode;
//    }
//
//    @Override
//    public StatementNode visitStatement(AngularParser.StatementContext ctx) {
//        StatementNode statement = new StatementNode();
//
//        Optional.ofNullable(ctx.class_()).ifPresent(c -> statement.setClassNodes(visitClass(c)));
//        Optional.ofNullable(ctx.variableDeclaration()).ifPresent(c -> statement.setVariableDeclarationNodes(visitVariableDeclaration(c)));
//        Optional.ofNullable(ctx.functionDeclaration()).ifPresent(c -> statement.setFunctionDeclarationNodes(visitFunctionDeclaration(c)));
//        Optional.ofNullable(ctx.ifStatement()).ifPresent(c -> statement.setIfStatementNodes(visitIfStatement(c)));
//        Optional.ofNullable(ctx.whileStatement()).ifPresent(c -> statement.setWhileStatementNodes(visitWhileStatement(c)));
//        Optional.ofNullable(ctx.assignmentStatement()).ifPresent(c -> statement.setAssignmentStatementNodes(visitAssignmentStatement(c)));
//        Optional.ofNullable(ctx.breakStatement()).ifPresent(c -> statement.setBreakStatementNodes(visitBreakStatement(c)));
//        Optional.ofNullable(ctx.continueStatement()).ifPresent(c -> statement.setContinueStatementNodes(visitContinueStatement(c)));
//        Optional.ofNullable(ctx.importStatement()).ifPresent(c -> statement.setImportStatementNodes(visitImportStatement(c)));
//        Optional.ofNullable(ctx.component()).ifPresent(c -> statement.setComponentNodes(visitComponent(c)));
//        Optional.ofNullable(ctx.exportClass()).ifPresent(c -> statement.setExportClassNode(visitExportClass(c)));
//
//        return statement;
//    }
//
//    @Override
//    public ComponentNode visitComponent(AngularParser.ComponentContext ctx) {
//        isInsideComponent = true;
//        try {
//            ComponentNode componentNode = new ComponentNode();
//            String componentName = "UnknownComponent"; // Default name
//            if (ctx.decoratorArgs() != null) {
//                componentNode.setDecorator(visitDecoratorArgs(ctx.decoratorArgs()));
//            }
//
//            if (ctx.exportClass() != null) {
//                ExportClassNode exportClassNode = visitExportClass(ctx.exportClass());
//                componentNode.setExportClass(exportClassNode);
//
//                // Extract component name from the class declaration
//                if (exportClassNode.getClassNode() != null && exportClassNode.getClassNode().getIdentifier() != null) {
//                    componentName = exportClassNode.getClassNode().getIdentifier();
//                }
//            }
//
//            // Track the scope name as a component scope
//            componentScopeNames.add(componentName);
//
//            // Add component to the main symbol table for global visibility
//            addRowToSymbolTable(COMPONENT, componentName, ctx.decoratorArgs() != null ? ctx.decoratorArgs().getText() : "");
//
//            // Add component to its own symbol table for internal lookup
//            Row componentRow = new Row();
//            componentRow.setType(COMPONENT);
//            componentRow.setName(componentName);
//            componentRow.setValue(ctx.decoratorArgs() != null ? ctx.decoratorArgs().getText() : "");
//            componentRow.setScope(componentName);
//            componentSymbolTable.getRows().add(componentRow);
//
//            return componentNode;
//        } finally {
//            isInsideComponent = false;
//        }
//    }
//
//    @Override
//    public DecoratorNode visitDecoratorArgs(AngularParser.DecoratorArgsContext ctx) {
//        return null;
//    }
//
//    @Override
//    public ExportClassNode visitExportClass(AngularParser.ExportClassContext ctx) {
//        ExportClassNode exportClassNode = new ExportClassNode();
////        if (ctx.class_() != null) {
////            exportClassNode.setClassNode(visitClass(ctx.class_()));
////        }
//
//        // Heuristic to identify a service: a class exported outside of a @Component decorator.
//        if (!isInsideComponent && exportClassNode.getClassNode() != null) {
//            String className = exportClassNode.getClassNode().getIdentifier();
//            if (className != null) {
//                addRowToServiceSymbolTable(className, GLOBAL);
//                // Also add to the main symbol table for general lookup.
//                addRowToSymbolTable("Service", className, "Exported Service Class");
//            }
//        }
//        return exportClassNode;
//    }
//
//    @Override
//    public ClassNode visitClass(AngularParser.ClassContext ctx) {
//        ClassNode classNode = new ClassNode();
//
//        String className = ctx.Identifier().getText();
//        classNode.setIdentifier(className);
//
//        addRowToSymbolTable(CLASS, className, ctx.getText());
//
//        scoopAction(ENTER, className);
//        try {
//            Optional.ofNullable(ctx.classBody())
//                    .ifPresent(classBody -> classNode.setClassBody(visitClassBody(classBody)));
//        } finally {
//            scoopAction(EXIT, className);
//        }
//
//        return classNode;
//    }
//
//    @Override
//    public ClassBodyNode visitClassBody(AngularParser.ClassBodyContext ctx) {
//
//        ClassBodyNode classBodyNode = new ClassBodyNode();
//
//        // Use streams to visit each child declaration and add it to the ClassBodyNode
//        ctx.variableDeclaration()
//                .forEach(vd -> classBodyNode.getVariableDeclarationNodes().add(visitVariableDeclaration(vd)));
//
//        ctx.functionDeclaration()
//                .forEach(fd -> classBodyNode.getFunctionDeclarationNodes().add(visitFunctionDeclaration(fd)));
//
//        ctx.arrayDeclaration()
//                .forEach(ad -> classBodyNode.getArrayDeclarationNodeList().add(visitArrayDeclaration(ad)));
//
//        ctx.objectDeclataion()
//                .forEach(od -> classBodyNode.getObjectDeclarationNodes().add(visitObjectDeclataion(od)));
//
//        return classBodyNode;
//    }
//
//
//
//
//    @Override
//    public ArgumentNode visitArgument(AngularParser.ArgumentContext ctx) {
//        ArgumentNode node = new ArgumentNode();
//        if(ctx.html()!=null){
//        node.setHtmlNode(visitHtml(ctx.html()));
//        }
//        if(ctx.literalValue()!=null){
//            node.setLiteralNode(visitLiteralValue(ctx.literalValue()));
//        }
//        if(ctx.css()!=null){
//            node.setCssNode(visitCss(ctx.css()));
//        }
//        node.setName(ctx.Identifier().getText());
//        return node;
//    }
//
//    @Override
//    public ImportStatementNode visitImportStatement(AngularParser.ImportStatementContext ctx) {
//        ImportStatementNode importStatementNode = new ImportStatementNode();
//        if (ctx.Identifier() != null) {
//            importStatementNode.setIdentifier(ctx.getText());
//            addRowToSymbolTable(IMPORT_STATEMENT,ctx.getText(),null);
//        }
//        if (ctx.StringLiteral() != null) {
//            importStatementNode.setSource(ctx.StringLiteral().getText());
//            addRowToSymbolTable(IMPORT_STATEMENT,null,ctx.StringLiteral().getText());
//        }
//        return importStatementNode;
//    }
//
//
//    @Override
//    public ThisNewInstanceAssignmentNode visitNewInstanceAssignment(AngularParser.NewInstanceAssignmentContext ctx) {
//        ThisNewInstanceAssignmentNode thisNewInstanceAssignmentNode = new ThisNewInstanceAssignmentNode();
//        thisNewInstanceAssignmentNode.setName(ctx.getText());
//        for (int i = 0; i < ctx.expression().size(); i++) {
//            thisNewInstanceAssignmentNode.getExpressionNode().add(visitExpression(ctx.expression(i)));
//        }
//        return thisNewInstanceAssignmentNode;
//    }
//
//    @Override
//    public ASTNode visitNestedThisAccess(AngularParser.NestedThisAccessContext ctx) {
//        return null;
//    }
//
//    @Override
//    public ASTNode visitIdentifierOrPropertyAccess(AngularParser.IdentifierOrPropertyAccessContext ctx) {
//        return null;
//    }
//
//    @Override
//    public ASTNode visitConsoleLog(AngularParser.ConsoleLogContext ctx) {
//        ConsoleLogNode consoleLogNode = new ConsoleLogNode();
//        consoleLogNode.setValue(ctx.getText());
//        return consoleLogNode;
//    }
//
//    @Override
//    public ASTNode visitAccessModifier(AngularParser.AccessModifierContext ctx) {
//        AccessModifierNode accessModifierNode = new AccessModifierNode();
//        accessModifierNode.setAccessModifier(ctx.getText());
//        return accessModifierNode;
//    }
//
//    @Override
//    public VariableDeclarationNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
//        VariableDeclarationNode node = new VariableDeclarationNode();
//
//        String varName = ctx.Identifier().getText();
//        node.setIdentifier(varName);
//        Optional.ofNullable(ctx.type()).ifPresent(t -> node.setType(visitType(t)));
//        Optional.ofNullable(ctx.expression()).ifPresent(e -> node.setExpression(visitExpression(e)));
//
//        String value = (ctx.expression() != null) ? ctx.expression().getText() : null;
//        addRowToSymbolTable(VARIABLE_DECLARATION, varName, value);
//
//        // If inside a component's scope, add to the component's symbol table as well.
//        if (componentScopeNames.contains(currentScope)) {
//            addRowToComponentSymbolTable(VARIABLE_DECLARATION, varName, value);
//        }
//
//        return node;
//    }
//
//    @Override
//    public ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
//        ExpressionNode expressionNode = new ExpressionNode();
//        if (expressionNode.operator != null) {
//            expressionNode.setOperator(ctx.getText());
//            addRowToSymbolTable(OPERATOR, ctx.getText(), ctx.getText());
//        }
//        if (expressionNode.left != null) {
//            expressionNode.setLeft(expressionNode.left);
//            addRowToSymbolTable(LEFT, ctx.getText(), expressionNode.left.toString());
//        }
//        if (expressionNode.right != null) {
//            expressionNode.setRight(expressionNode.right);
//            addRowToSymbolTable(RIGHT, ctx.getText(), expressionNode.right.toString());
//        }
//        return expressionNode;
//    }
//
//    @Override
//    public ArrayDeclarationNode visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) {
//        // Create the node and get the array name.
//        ArrayDeclarationNode node = new ArrayDeclarationNode();
//        String arrayName = ctx.Identifier().getText();
//        node.setIdentifier(arrayName);
//
//        // Set the type for the array node.
//        node.setType(visitType(ctx.type()));
//
//        // Process the array's literal values efficiently.
//        List<String> valuesForSymbolTable = new ArrayList<>();
//        ctx.literalValue().forEach(literalContext -> {
//
//            // Visit each literal value only ONCE to avoid duplicate work and side effects.
//            LiteralValueNode valueNode = visitLiteralValue(literalContext);
//
//            // Add the created AST node to our ArrayDeclarationNode.
//            node.getValues().add(valueNode);
//
//            // Get the string representation for the symbol table entry.
//            if (valueNode.getArrayValue() != null) {
//                valuesForSymbolTable.add(valueNode.getArrayValue());
//            }
//        });
//
//        // Add a single, consolidated entry for the array to the symbol table.
//        addRowToSymbolTable(ARRAY_DECLARATION, arrayName, valuesForSymbolTable.toString());
//
//        return node;
//    }
//
//    @Override
//    public FunctionDeclarationNode visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
//        FunctionDeclarationNode functionDeclarationNode = new FunctionDeclarationNode();
//        String name = null;
//        if (ctx.Constructor() != null) {
//            name = ctx.Constructor().getText();
//            functionDeclarationNode.setIdentifier(ctx.Constructor().getText());
//        }
//        if (ctx.Identifier() != null) {
//            functionDeclarationNode.setIdentifier(ctx.Identifier().getText());
//            name = ctx.Identifier().getText();
//        }
//        for (int i = 0; i < ctx.parameter().size(); i++) {
//            if (ctx.parameter().get(i) != null) {
//                functionDeclarationNode.getParameters().add(visitParameter(ctx.parameter(i)));
//            }
//        }
//        addRowToSymbolTable(FUNCTION_DECLARATION, name, PARAMS);
//
//        // If inside a component's scope, add to the component's symbol table as well.
//        if (componentScopeNames.contains(currentScope)) {
//            addRowToComponentSymbolTable(FUNCTION_DECLARATION, name, PARAMS);
//        }
//
//        return functionDeclarationNode;
//    }
//
//    @Override
//    public TypeNode visitType(AngularParser.TypeContext ctx) {
//        TypeNode typeNode = new TypeNode();
//
//        Optional.ofNullable(ctx.TypeNumber()).ifPresent(typeNumber -> {
//            String value = typeNumber.getText();
//            typeNode.setNumber(value);
//            addRowToSymbolTable(TYPE, null, value);
//        });
//
//        Optional.ofNullable(ctx.TypeBoolean()).ifPresent(typeBoolean -> {
//            String value = typeBoolean.getText();
//            typeNode.setAnboolean(value);
//            addRowToSymbolTable(TYPE, null, value);
//        });
//
//        Optional.ofNullable(ctx.TypeString()).ifPresent(typeString -> {
//            String value = typeString.getText();
//            typeNode.setString(value);
//            addRowToSymbolTable(TYPE, null, value);
//        });
//
//        Optional.ofNullable(ctx.Array()).ifPresent(array -> {
//            String value = array.getText();
//            typeNode.setArray(value);
//            addRowToSymbolTable(TYPE, null, value);
//        });
//
//        return typeNode;
//    }
//
//    @Override
//    public ObjectDeclarationNode visitObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) {
//        ObjectDeclarationNode node = new ObjectDeclarationNode();
//
//        if (ctx.Identifier() != null && ctx.Identifier().size() == 2) {
//            String objectName = ctx.Identifier().get(0).getText();
//            String typeName = ctx.Identifier().get(1).getText();
//
//            node.setIdentifier(objectName);
//            node.setClassName(typeName);
//
//            addRowToSymbolTable(OBJECT, objectName, typeName);
//        }
//        return node;
//    }
//
//    @Override
//    public LiteralValueNode visitLiteralValue(AngularParser.LiteralValueContext ctx) {
//        LiteralValueNode node = new LiteralValueNode();
//
//        // This method's sole responsibility is to build the AST node for a literal.
//
//        if (ctx.StringLiteral() != null) {
//            node.setStirngValue(ctx.StringLiteral().getText());
//        } else if (ctx.NumberLiteral() != null) {
//            node.setNumValue(ctx.NumberLiteral().getText());
//        } else if (ctx.BooleanLiteral() != null) {
//            node.setBooleanValue(ctx.BooleanLiteral().getText());
//        } else if (ctx.listLiteral() != null) {
//            node.setListLiteralNode(visitListLiteral(ctx.listLiteral()));
//        }
//
//        return node;
//    }
//
//    @Override
//    public ListLiteralNode visitListLiteral(AngularParser.ListLiteralContext ctx) {
//        ListLiteralNode listLiteralNode = new ListLiteralNode();
//        Row listLiteralRow = new Row();
//        for (int i = 0; i < ctx.literalValue().size(); i++) {
//            if (ctx.literalValue().get(i) != null) {
//                listLiteralNode.getIdentifiers().add(ctx.literalValue().get(i).getText());
//                addRowToSymbolTable(LIST,null,ctx.literalValue().get(i).getText());
//            }
//        }
//        return listLiteralNode;
//    }
//
//    @Override
//    public AssignmentStatementNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) {
//        AssignmentStatementNode assignmentStatementNode = new AssignmentStatementNode();
//        assignmentStatementNode.setIdentifier(ctx.Identifier().getText());
//        List<String> values = new ArrayList<>();
//        return assignmentStatementNode;
//    }
//
//    @Override
//    public ASTNode visitThisAssignment(AngularParser.ThisAssignmentContext ctx) {
//        return null;
//    }
//
//
//    @Override
//    public ParameterNode visitParameter(AngularParser.ParameterContext ctx) {
//        ParameterNode parameterNode = new ParameterNode();
//        if (ctx.Identifier() != null) {
//            parameterNode.setIdentifier(ctx.Identifier().getText());
//            addRowToSymbolTable(PARAMETER,null,ctx.Identifier().getText());
//        }
//        if (ctx.type() != null) {
//            parameterNode.setType(visitType(ctx.type()));
//            addRowToSymbolTable(TYPE,null,ctx.Identifier().getText());
//        }
//        if (ctx.literalValue() != null) {
//            parameterNode.setDefaultValue(visitLiteralValue(ctx.literalValue()));
//            addRowToSymbolTable(DEFAULT_VALUE,null,ctx.literalValue().getText());
//        }
//        return parameterNode;
//    }
//
//    @Override
//    public HtmlNode visitHtml(AngularParser.HtmlContext ctx) {
//        HtmlNode htmlNode = new HtmlNode();
//        if (ctx.html_content() != null) {
//            htmlNode.setContent(visitHtml_content(ctx.html_content()));
//            addRowToSymbolTable(CONTENT,ctx.html_content().getText(),ctx.html_content().getText());
//        }
//        return htmlNode;
//    }
//
//    @Override
//    public HtmlContentNode visitHtml_content(AngularParser.Html_contentContext ctx) {
//        HtmlContentNode htmlContentNode = new HtmlContentNode();
//        if (ctx.html_element() != null) {
//            for (int i = 0; i < ctx.html_element().size(); i++) {
////                htmlContentNode.getHtmlElementNode().add(visitHtml_element(ctx.html_element().get(i)));
//                addRowToSymbolTable(HTML_ELEMENT,null,ctx.html_element().get(i).getText());
//            }
//        }
//        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
//            ExpressionNode expressionNode = visitExpression(ctx.expression(0));
//            expressionNode.setLine(ctx.expression(0).start.getLine());
//            htmlContentNode.setExpression(expressionNode);
//            addRowToSymbolTable(IDENTIFIER, expressionNode.toString(), String.valueOf(expressionNode.getLine()));
//        }
//        return htmlContentNode;
//    }
//
//    @Override
//    public HtmlElementNode visitHtml_element(AngularParser.Html_elementContext ctx) {
//        HtmlElementNode htmlElementNode = new HtmlElementNode();
//        if (ctx.html_attributes() != null) {
//            htmlElementNode.setHtmlAttributesNodes(visitHtml_attributes(ctx.html_attributes()));
//        }
//        if (ctx.html_content() != null) {
//            htmlElementNode.setHtmlContentNode(visitHtml_content(ctx.html_content()));
//        }
//        return htmlElementNode;
//    }
//
//    @Override
//    public HtmlTagNode visitHtml_tag_name(AngularParser.Html_tag_nameContext ctx) {
//        HtmlTagNode htmlTagNode = new HtmlTagNode();
//        if (ctx.Identifier() != null) {
//            htmlTagNode.setIdentifierNode(ctx.Identifier().getText());
//            addRowToSymbolTable(IDENTIFIER,null,ctx.Identifier().getText());
//        }
//        return htmlTagNode;
//    }
//
//    @Override
//    public HtmlAttributesNode visitHtml_attributes(AngularParser.Html_attributesContext ctx) {
//        // The job of this visitor is to build the AST.
//        HtmlAttributesNode node = new HtmlAttributesNode();
//        ctx.html_attribute().forEach(attr -> node.getHtmlAttributeNodes().add(visitHtml_attribute(attr)));
//        return node;
//    }
//
//    @Override
//    public HtmlAttributeNode visitHtml_attribute(AngularParser.Html_attributeContext ctx) {
//        HtmlAttributeNode node = new HtmlAttributeNode();
//
//        if (ctx.Identifier() != null) {
//            node.setIdentifierNode(ctx.Identifier().getText());
//        }
//
//        Optional.ofNullable(ctx.html_attribute_value())
//                .ifPresent(val -> node.setHtmlAttributeValueNode((HtmlAttributeValueNode) visitHtml_attribute_value(val)));
//
//        ctx.access_suffix().forEach(suffix -> node.getAccessSufNode().add((AccessSufNode) visitAccess_suffix(suffix)));
//
//        // Special handling for other attribute types can be added here if needed,
//        // for example, by checking ctx.ngIfAttribute(), ctx.ngForAttribute(), etc.
//
//        return node;
//    }
//
//    @Override
//    public ASTNode visitAccess_suffix(AngularParser.Access_suffixContext ctx) {
//        AccessSufNode node = new AccessSufNode();
//
//        if (ctx.expression() != null) {
//            node.setExpressionNode(visitExpression(ctx.expression()));
//        } else if (ctx.function_call() != null) {
//            node.setFunctionCallNode((FunctionCallNode) visitFunction_call(ctx.function_call()));
//        } else if (ctx.Identifier() != null) {
//            node.setIdentifierNode(ctx.Identifier().getText());
//        }
//
//        return node;
//    }
//
//
//    @Override
//    public ASTNode visitHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx) {
//        // This method now correctly constructs and returns a specific HtmlAttributeValueNode
//        // wrapped as an ASTNode, which can then be safely cast by the caller.
//        HtmlAttributeValueNode attributeValueNode = new HtmlAttributeValueNode();
//        if (ctx.literalValue() != null) {
//            attributeValueNode.setValue(visitLiteralValue(ctx.literalValue()));
//        }
//        if (ctx.expression() != null) {
//            attributeValueNode.setExpression(visitExpression(ctx.expression()));
//        }
//        return attributeValueNode;
//    }
//
//    @Override
//    public CssNode visitCss(AngularParser.CssContext ctx) {
//        CssNode node = new CssNode();
//        // CSS content is not a program symbol; symbol table logic was incorrect and removed.
//        ctx.css_content().forEach(content -> node.getCssContentNode().add(visitCss_content(content)));
//        return node;
//    }
//
//    @Override
//    public CssContentNode visitCss_content(AngularParser.Css_contentContext ctx) {
//        CssContentNode node = new CssContentNode();
//        // CSS classes are not program symbols; symbol table logic was incorrect and removed.
//        ctx.css_class_content().forEach(cc -> node.getCssClassContentList().add(visitCss_class_content(cc)));
//
//        if (ctx.Identifier() != null) {
//            // Your grammar allows an Identifier here. You can decide how to handle it.
//            // For now, we are just building the AST correctly.
//            // node.setIdentifierNode(...);
//        }
//        return node;
//    }
//
//    @Override
//    public CssClassContentNode visitCss_class_content(AngularParser.Css_class_contentContext ctx) {
//        CssClassContentNode cssClassContentNode = new CssClassContentNode();
//        if (ctx.Identifier() != null) {
//            cssClassContentNode.setName(ctx.Identifier().get(0).getText());
//            addRowToSymbolTable(NAME,ctx.Identifier().get(0).getText(),ctx.Identifier().get(0).getText());
//        }
//        return cssClassContentNode;
//    }
//
//    @Override
//    public ASTNode visitNgForAttribute(AngularParser.NgForAttributeContext ctx) {
//        NgForNode ngForNode = new NgForNode();
//        ngForNode.setExpressionNode(visitExpression(ctx.expression()));
//        addRowToSymbolTable(NGFOR,STAR_NGFOR,ctx.expression().getText());
//        return ngForNode;
//    }
//
//    @Override
//    public ASTNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) {
//        NgIfNode ngIfNode = new NgIfNode();
//        ngIfNode.setExpressionNode(visitExpression(ctx.expression()));
//        addRowToSymbolTable(NGIF,STAR_NGIF,ctx.expression().getText());
//        return ngIfNode;
//    }
//
//
//
//    @Override
//    public FunctionCallNode visitFunction_call(AngularParser.Function_callContext ctx) {
//        FunctionCallNode node = new FunctionCallNode();
//
//        if (ctx.Identifier() != null) {
//            node.setIdentifier(ctx.Identifier().getText());
//        }
//
//        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
//            for (AngularParser.ExpressionContext exprCtx : ctx.expression()) {
//                node.getArguments().add(visitExpression(exprCtx));
//            }
//        }
//
//        return node;
//    }
//
//    @Override
//    public ASTNode visitAbstractFunctionDeclaration(AngularParser.AbstractFunctionDeclarationContext ctx) {
//        return new ExpressionNode();
//    }
//
//    @Override
//    public ASTNode visitMapLiteral(AngularParser.MapLiteralContext ctx) {
//        LiteralValueNode node = new LiteralValueNode();
//
//        // For now, we'll store the map literal as a string representation
//        // A more complete implementation would create a specific MapLiteralNode
//        if (ctx.getText() != null) {
//            node.setStirngValue(ctx.getText());
//        }
//
//        addRowToSymbolTable("MapLiteral", "{", ctx.getText());
//        return node;
//    }
//
//
//
//    @Override
//    public ASTNode visitEnum(AngularParser.EnumContext ctx) {
//        EnumNode node = new EnumNode();
//
//        if (ctx.Identifier() != null) {
//            node.setName(ctx.Identifier().getText());
//        }
//
//        if (ctx.enumValues() != null) {
//            // Process enum values - this would need to be implemented
//            // based on the actual EnumNode structure
//        }
//
//        addRowToSymbolTable("Enum", node.getName(), ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitEnumValues(AngularParser.EnumValuesContext ctx) {
//        // This would typically return a list of enum values
//        // For now, we'll return a placeholder node
//        ExpressionNode node = new ExpressionNode();
//        addRowToSymbolTable("EnumValues", "values", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitEnumValue(AngularParser.EnumValueContext ctx) {
//        // Create an enum value node
//        LiteralValueNode node = new LiteralValueNode();
//
//        if (ctx.Identifier() != null) {
//            node.setIdentifierValue(ctx.Identifier().getText());
//        }
//
//        if (ctx.literalValue() != null) {
//            // If there's an assigned value, process it
//            LiteralValueNode assignedValue = visitLiteralValue(ctx.literalValue());
//            // Store the assigned value somehow - this depends on EnumValue node structure
//        }
//
//        addRowToSymbolTable("EnumValue", node.getIdentifierValue(), ctx.getText());
//        return node;
//    }
//    @Override
//    public ASTNode visitAbstractClass(AngularParser.AbstractClassContext ctx) {
//        ClassNode node = new ClassNode();
//
//        if (ctx.Identifier() != null) {
//            node.setIdentifier(ctx.Identifier().getText());
//        }
//
//        if (ctx.classBody() != null) {
//            node.setClassBody(visitClassBody(ctx.classBody()));
//        }
//
//        addRowToSymbolTable("AbstractClass", node.getIdentifier(), ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitInterface(AngularParser.InterfaceContext ctx) {
//        // Create a class node to represent the interface structure
//        ClassNode node = new ClassNode();
//
//        if (ctx.Identifier() != null) {
//            node.setIdentifier(ctx.Identifier().getText());
//        }
//
//        if (ctx.interfaceBody() != null) {
//            // Process interface body - this would need to be handled
//            // based on the actual interface body structure
//            // For now, we'll create an empty class body
//            ClassBodyNode bodyNode = new ClassBodyNode();
//            node.setClassBody(bodyNode);
//        }
//
//        addRowToSymbolTable("Interface", node.getIdentifier(), ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {
//        return null;
//    }
//
//    @Override
//    public IfStatementNode visitIfStatement(AngularParser.IfStatementContext ctx) {
//        IfStatementNode node = new IfStatementNode();
//
//        // Set condition
//        if (ctx.expression() != null) {
//            node.setCondition(visitExpression(ctx.expression()));
//        }
//
//        // Set main block
//        if (ctx.block().size() > 0) {
//            node.setBlock((BlockNode) visitBlock(ctx.block(0)));
//        }
//
//        // Handle else if statements
//        if (ctx.elseIfStatement() != null && !ctx.elseIfStatement().isEmpty()) {
//            List<ElseIfStatementNode> elseIfNodes = new ArrayList<>();
//            for (AngularParser.ElseIfStatementContext elseIfCtx : ctx.elseIfStatement()) {
//                elseIfNodes.add((ElseIfStatementNode) visitElseIfStatement(elseIfCtx));
//            }
//            node.setElseIfStatements(elseIfNodes);
//        }
//
//        // Handle else block
//        if (ctx.block().size() > 1) {
//            node.setElseBlock((BlockNode) visitBlock(ctx.block(1)));
//        }
//
//        addRowToSymbolTable("IfStatement", "if", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public WhileStatementNode visitWhileStatement(AngularParser.WhileStatementContext ctx) {
//        WhileStatementNode node = new WhileStatementNode();
//
//        // Set condition
//        if (ctx.expression() != null) {
//            node.setCondition(visitExpression(ctx.expression()));
//        }
//
//        // Set block
//        if (ctx.block() != null) {
//            node.setBlock((BlockNode) visitBlock(ctx.block()));
//        }
//
//        addRowToSymbolTable("WhileStatement", "while", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitElseIfStatement(AngularParser.ElseIfStatementContext ctx) {
//        ASTNode condition = null;
//        BlockNode block = null;
//
//        // Set condition
//        if (ctx.expression() != null) {
//            condition = visitExpression(ctx.expression());
//        }
//
//        // Set block
//        if (ctx.block() != null) {
//            block = (BlockNode) visitBlock(ctx.block());
//        }
//
//        ElseIfStatementNode node = new ElseIfStatementNode(condition, block);
//        addRowToSymbolTable("ElseIfStatement", "else if", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public BreakStatementNode visitBreakStatement(AngularParser.BreakStatementContext ctx) {
//        BreakStatementNode node = new BreakStatementNode();
//        addRowToSymbolTable("BreakStatement", "break", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ContinueStatementNode visitContinueStatement(AngularParser.ContinueStatementContext ctx) {
//        ContinueStatementNode node = new ContinueStatementNode();
//        addRowToSymbolTable("ContinueStatement", "continue", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitBlock(AngularParser.BlockContext ctx) {
//        // Process all statements in the block
//        List<ASTNode> statements = new ArrayList<>();
//        if (ctx.statement() != null && !ctx.statement().isEmpty()) {
//            for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
//                statements.add(visitStatement(stmtCtx));
//            }
//        }
//
//        BlockNode node = new BlockNode(statements);
//        addRowToSymbolTable("Block", "{", ctx.getText());
//        return node;
//    }
//
//
//
//    @Override
//    public ASTNode visitCheckedAttribute(AngularParser.CheckedAttributeContext ctx) {
//        HtmlAttributeNode node = new HtmlAttributeNode();
//        node.setIdentifierNode("checked");
//
//        if (ctx.expression() != null) {
//            HtmlAttributeValueNode valueNode = new HtmlAttributeValueNode();
//            valueNode.setExpression(visitExpression(ctx.expression()));
//            node.setHtmlAttributeValueNode(valueNode);
//        }
//
//        addRowToSymbolTable("HtmlAttribute", "checked", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitOnChangeAttribute(AngularParser.OnChangeAttributeContext ctx) {
//        HtmlAttributeNode node = new HtmlAttributeNode();
//        node.setIdentifierNode("onChange");
//
//        if (ctx.StringLiteral() != null) {
//            HtmlAttributeValueNode valueNode = new HtmlAttributeValueNode();
//            LiteralValueNode literalNode = new LiteralValueNode();
//            literalNode.setStirngValue(ctx.StringLiteral().getText());
//            valueNode.setValue(literalNode);
//            node.setHtmlAttributeValueNode(valueNode);
//        }
//
//        addRowToSymbolTable("HtmlAttribute", "onChange", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitOnClickAttribute(AngularParser.OnClickAttributeContext ctx) {
//        HtmlAttributeNode node = new HtmlAttributeNode();
//        node.setIdentifierNode("onClick");
//
//        if (ctx.StringLiteral() != null) {
//            HtmlAttributeValueNode valueNode = new HtmlAttributeValueNode();
//            LiteralValueNode literalNode = new LiteralValueNode();
//            literalNode.setStirngValue(ctx.StringLiteral().getText());
//            valueNode.setValue(literalNode);
//            node.setHtmlAttributeValueNode(valueNode);
//        }
//
//        addRowToSymbolTable("HtmlAttribute", "onClick", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitOnSubmitAttribute(AngularParser.OnSubmitAttributeContext ctx) {
//        HtmlAttributeNode node = new HtmlAttributeNode();
//        node.setIdentifierNode("onSubmit");
//
//        if (ctx.StringLiteral() != null) {
//            HtmlAttributeValueNode valueNode = new HtmlAttributeValueNode();
//            LiteralValueNode literalNode = new LiteralValueNode();
//            literalNode.setStirngValue(ctx.StringLiteral().getText());
//            valueNode.setValue(literalNode);
//            node.setHtmlAttributeValueNode(valueNode);
//        }
//
//        addRowToSymbolTable("HtmlAttribute", "onSubmit", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitGapAttribute(AngularParser.GapAttributeContext ctx) {
//        HtmlAttributeNode node = new HtmlAttributeNode();
//        node.setIdentifierNode("gap");
//
//        if (ctx.expression() != null) {
//            HtmlAttributeValueNode valueNode = new HtmlAttributeValueNode();
//            valueNode.setExpression(visitExpression(ctx.expression()));
//            node.setHtmlAttributeValueNode(valueNode);
//        }
//
//        addRowToSymbolTable("HtmlAttribute", "gap", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitDirectionAttribute(AngularParser.DirectionAttributeContext ctx) {
//        HtmlAttributeNode node = new HtmlAttributeNode();
//        node.setIdentifierNode("direction");
//
//        if (ctx.StringLiteral() != null) {
//            HtmlAttributeValueNode valueNode = new HtmlAttributeValueNode();
//            LiteralValueNode literalNode = new LiteralValueNode();
//            literalNode.setStirngValue(ctx.StringLiteral().getText());
//            valueNode.setValue(literalNode);
//            node.setHtmlAttributeValueNode(valueNode);
//        }
//
//        addRowToSymbolTable("HtmlAttribute", "direction", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitDurationAttribute(AngularParser.DurationAttributeContext ctx) {
//        HtmlAttributeNode node = new HtmlAttributeNode();
//        node.setIdentifierNode("duration");
//
//        if (ctx.StringLiteral() != null) {
//            HtmlAttributeValueNode valueNode = new HtmlAttributeValueNode();
//            LiteralValueNode literalNode = new LiteralValueNode();
//            literalNode.setStirngValue(ctx.StringLiteral().getText());
//            valueNode.setValue(literalNode);
//            node.setHtmlAttributeValueNode(valueNode);
//        }
//
//        addRowToSymbolTable("HtmlAttribute", "duration", ctx.getText());
//        return node;
//    }
//
//    @Override
//    public ASTNode visitRepeatAttribute(AngularParser.RepeatAttributeContext ctx) {
//        HtmlAttributeNode node = new HtmlAttributeNode();
//        node.setIdentifierNode("repeat");
//
//        HtmlAttributeValueNode valueNode = new HtmlAttributeValueNode();
//        LiteralValueNode literalNode = new LiteralValueNode();
//
//        if (ctx.NumberLiteral() != null) {
//            literalNode.setNumValue(ctx.NumberLiteral().getText());
//        } else if (ctx.StringLiteral() != null) {
//            literalNode.setStirngValue(ctx.StringLiteral().getText());
//        }
//
//        valueNode.setValue(literalNode);
//        node.setHtmlAttributeValueNode(valueNode);
//
//        addRowToSymbolTable("HtmlAttribute", "repeat", ctx.getText());
//        return node;
//    }
//
//}
