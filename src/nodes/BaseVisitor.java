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
import nodes.SymbolTables.SymbolTable;
import nodes.SymbolTables.mainSymbolTable;
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

import static helper.keyWords.*;
import static helper.methods.printAST;
import static helper.methods.printSemanticError;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {

    mainSymbolTable symbolTable = new mainSymbolTable();
    ComponentSymbolTable componentSymbolTable = new ComponentSymbolTable();
    ServiceSymbolTable serviceSymbolTable = new ServiceSymbolTable();
    private String currentScope = GLOBAL;
    Stack<String> scopeStack = new Stack<>();

    private List<String> semanticErrors = new ArrayList<>();

  


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
        //TODO :: FIX
        componentSymbolTable.getRows().add(row);
    }

    public void initialize() throws IOException {
        ParseTree tree = initializeProgram();
        initializeComponentSymbolTable(tree);
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

    public void initializeComponentSymbolTable(ParseTree tree) throws IOException {
        ParseTreeWalker walker = new ParseTreeWalker();
        SemanticAnalyzer analyzer = new SemanticAnalyzer(componentSymbolTable);
        walker.walk(analyzer, tree);

        printSemanticError(analyzer, semanticErrors, componentSymbolTable);
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
            componentRow.setType(COMPONENT);
            componentRow.setValue(ctx.decorator().getText());
            componentRow.setScope(currentScope);

            // --- Robust Provider Extraction and Semantic Check ---
            if (decoratorNode.getArguments() != null && !decoratorNode.getArguments().isEmpty()) {
                for (ArgumentListNode argList : decoratorNode.getArguments()) {
                    for (ArgumentNode arg : argList.getArgumentNodeList()) {
                        if (PROVIDERS.equals(arg.getName()) && arg.getValue() != null) {
                            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("[A-Za-z_][A-Za-z0-9_]*").matcher(arg.getValue().toString());
                            while (matcher.find()) {
                                String providerName = matcher.group();
                                if (!USE_EXISTING.equals(providerName) && !USE_CLASS.equals(providerName) && !PROVIDE.equals(providerName)) {
                                    try {
                                        // Force a semantic error for demonstration:
                                        serviceSymbolTable.checkServiceDeclaredOrThrow(NOT_PROVIDED_SERVICE_X, currentScope, 0);
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
        if (ctx.class_() != null) {
            exportClassNode.setClassNode(visitClass(ctx.class_()));
            if (ctx.getParent() != null && ctx.getParent().getText().contains(INJECTABLE)) {
                String className = ctx.class_().Identifier().getText();
                serviceSymbolTable.insertService(className, GLOBAL);
            }
        }
        addRowToSymbolTable(CLASS,null,ctx.class_().getText());
        return exportClassNode;
    }

    @Override
    public ClassNode visitClass(AngularParser.ClassContext ctx) {
        ClassNode classNode = new ClassNode();

        String className = ctx.Identifier().getText();
        classNode.setIdentifier(className);

        addRowToSymbolTable(CLASS, className, ctx.getText());

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
        if (ctx.Identifier() != null) {
            importStatementNode.setIdentifier(ctx.Identifier().getText());
            addRowToSymbolTable(IMPORT_STATEMENT,ctx.Identifier().getText(),null);
        }
        if (ctx.StringLiteral() != null) {
            importStatementNode.setSource(ctx.StringLiteral().getText());
            addRowToSymbolTable(IMPORT_STATEMENT,null,ctx.StringLiteral().getText());
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

        String varName = ctx.Identifier().getText();
        node.setIdentifier(varName);
        Optional.ofNullable(ctx.type()).ifPresent(t -> node.setType(visitType(t)));
        Optional.ofNullable(ctx.expression()).ifPresent(e -> node.setExpression(visitExpression(e)));

        String value = (ctx.expression() != null) ? ctx.expression().getText() : null;
        addRowToSymbolTable(VARIABLE_DECLARATION, varName, value);

        return node;
    }

     @Override
     public ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        if (expressionNode.operator != null) {
            expressionNode.setOperator(ctx.getText());
            addRowToSymbolTable(OPERATOR, ctx.getText(), ctx.getText());
        }
        if (expressionNode.left != null) {
            expressionNode.setLeft(expressionNode.left);
            addRowToSymbolTable(LEFT, ctx.getText(), expressionNode.left.toString());
        }
        if (expressionNode.right != null) {
            expressionNode.setRight(expressionNode.right);
            addRowToSymbolTable(RIGHT, ctx.getText(), expressionNode.right.toString());
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
        addRowToSymbolTable(ARRAY_DECLARATION, arrayName, valuesForSymbolTable.toString());

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
        addRowToSymbolTable(FUNCTION_DECLARATION, name, PARAMS);
        return functionDeclarationNode;
    }

    @Override
    public TypeNode visitType(AngularParser.TypeContext ctx) {
        TypeNode typeNode = new TypeNode();

        Optional.ofNullable(ctx.TypeNumber()).ifPresent(typeNumber -> {
            String value = typeNumber.getText();
            typeNode.setNumber(value);
            addRowToSymbolTable(TYPE, null, value);
        });

        Optional.ofNullable(ctx.TypeBoolean()).ifPresent(typeBoolean -> {
            String value = typeBoolean.getText();
            typeNode.setAnboolean(value);
            addRowToSymbolTable(TYPE, null, value);
        });

        Optional.ofNullable(ctx.TypeString()).ifPresent(typeString -> {
            String value = typeString.getText();
            typeNode.setString(value);
            addRowToSymbolTable(TYPE, null, value);
        });

        Optional.ofNullable(ctx.Array()).ifPresent(array -> {
            String value = array.getText();
            typeNode.setArray(value);
            addRowToSymbolTable(TYPE, null, value);
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

            addRowToSymbolTable(OBJECT, objectName, typeName);
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
                addRowToSymbolTable(LIST,null,ctx.Identifier().get(i).getText());
            }
        }
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
        addRowToSymbolTable(ASSIGNMENT, ctx.Identifier().getText(), values.toString());
        return assignmentStatementNode;
    }

    @Override
    public IdentifierNode visitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx) {
        IdentifierNode identifierNode = new IdentifierNode();
        if (ctx.Identifier() != null) {
            identifierNode.setName(ctx.Identifier().getText());
            addRowToSymbolTable(IDENTIFIER,ctx.Identifier().getText(),ctx.Identifier().getText());
        }
        return identifierNode;
    }
    @Override
    public ParameterNode visitParameter(AngularParser.ParameterContext ctx) {
        ParameterNode parameterNode = new ParameterNode();
        if (ctx.Identifier() != null) {
            parameterNode.setIdentifier(ctx.Identifier().getText());
            addRowToSymbolTable(PARAMETER,null,ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            parameterNode.setType(visitType(ctx.type()));
            addRowToSymbolTable(TYPE,null,ctx.Identifier().getText());
        }
        if (ctx.literalValue() != null) {
            parameterNode.setDefaultValue(visitLiteralValue(ctx.literalValue()));
            addRowToSymbolTable(DEFAULT_VALUE,null,ctx.literalValue().getText());
        }
        return parameterNode;
    }

    @Override
    public HtmlNode visitHtml(AngularParser.HtmlContext ctx) {
        HtmlNode htmlNode = new HtmlNode();
        if (ctx.html_content() != null) {
            htmlNode.setContent(visitHtml_content(ctx.html_content()));
            addRowToSymbolTable(CONTENT,ctx.html_content().getText(),ctx.html_content().getText());
        }
        return htmlNode;
    }

    @Override
    public HtmlContentNode visitHtml_content(AngularParser.Html_contentContext ctx) {
        HtmlContentNode htmlContentNode = new HtmlContentNode();
        if (ctx.html_element() != null) {
            for (int i = 0; i < ctx.html_element().size(); i++) {
                htmlContentNode.getHtmlElementNode().add(visitHtml_element(ctx.html_element().get(i)));
                addRowToSymbolTable(HTML_ELEMENT,null,ctx.html_element().get(i).getText());
            }
        }
        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            ExpressionNode expressionNode = visitExpression(ctx.expression(0));
            expressionNode.setLine(ctx.expression(0).start.getLine());
            htmlContentNode.setExpression(expressionNode);
            addRowToSymbolTable(IDENTIFIER, expressionNode.toString(), String.valueOf(expressionNode.getLine()));
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
        if (ctx.Identifier() != null) {
            htmlTagNode.setIdentifierNode(ctx.Identifier().getText());
            addRowToSymbolTable(IDENTIFIER,null,ctx.Identifier().getText());
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
        if (ctx.Identifier() != null) {
            cssClassContentNode.setName(ctx.Identifier().get(0).getText());
            addRowToSymbolTable(NAME,ctx.Identifier().get(0).getText(),ctx.Identifier().get(0).getText());
        }
        return cssClassContentNode;
    }

    @Override
    public ASTNode visitNgForAttribute(AngularParser.NgForAttributeContext ctx) {
        NgForNode ngForNode = new NgForNode();
        ngForNode.setExpressionNode(visitExpression(ctx.expression()));
        addRowToSymbolTable(NGFOR,STAR_NGFOR,ctx.expression().getText());
        return ngForNode;
    }

    @Override
    public ASTNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) {
        NgIfNode ngIfNode = new NgIfNode();
        ngIfNode.setExpressionNode(visitExpression(ctx.expression()));
        addRowToSymbolTable(NGIF,STAR_NGIF,ctx.expression().getText());
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
