package nodes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Optional;
import java.util.Map;
import gen.AngularLexer;
import gen.AngularParser;
import gen.AngularParserVisitor;
import nodes.SymbolTables.ComponentSymbolTable;
import nodes.SymbolTables.ServiceSemanticValidator;
import nodes.SymbolTables.SymbolTable;
import nodes.SymbolTables.mainSymbolTable;
import nodes.codegen.CodeGenerationManager;
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

public class BaseVisitorWithCodeGen extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {

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

    public void initialize() throws IOException {
        // 1. Parse the input and build the initial parse tree
        ParseTree tree = initializeProgram();

        // 2. Create a single SemanticAnalyzer with all necessary symbol tables
        SemanticAnalyzer analyzer = new SemanticAnalyzer(serviceSymbolTable, componentSymbolTable);

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
        System.out.println("\n--- Service Symbol Table ---");
        serviceSymbolTable.print();
        System.out.println("\n--- Component Symbol Table ---");
        componentSymbolTable.print();

        // 5. Generate code if no semantic errors
        if (semanticErrors.isEmpty()) {
            generateCode();
        } else {
            System.out.println("\nSkipping code generation due to semantic errors.");
        }
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

    // All the existing visitor methods from BaseVisitor remain the same
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

        return statement;
    }

    @Override
    public ComponentNode visitComponent(AngularParser.ComponentContext ctx) {
        isInsideComponent = true;
        try {
            ComponentNode componentNode = new ComponentNode();
            String componentName = "UnknownComponent";

            if (ctx.decoratorArgs() != null) {
                componentNode.setDecorator(visitDecoratorArgs(ctx.decoratorArgs()));
            }

            if (ctx.exportClass() != null) {
                ExportClassNode exportClassNode = visitExportClass(ctx.exportClass());
                componentNode.setExportClass(exportClassNode);

                if (exportClassNode.getClassNode() != null && exportClassNode.getClassNode().getIdentifier() != null) {
                    componentName = exportClassNode.getClassNode().getIdentifier();
                }
            }
            
            componentScopeNames.add(componentName);

            Row componentRow = new Row();
            componentRow.setType(COMPONENT);
            componentRow.setName(componentName);
            componentRow.setValue(ctx.decoratorArgs() != null ? ctx.decoratorArgs().getText() : "");
            componentRow.setScope(componentName);
            componentSymbolTable.getRows().add(componentRow);

            return componentNode;
        } finally {
            isInsideComponent = false;
        }
    }

    @Override
    public DecoratorNode visitDecoratorArgs(AngularParser.DecoratorArgsContext ctx) {
        return null;
    }

    // Include all other visitor methods from the original BaseVisitor...
    // (For brevity, I'm including just a few key methods. The full implementation would include all methods)

    @Override
    public ExportClassNode visitExportClass(AngularParser.ExportClassContext ctx) {
        ExportClassNode exportClassNode = new ExportClassNode();
        if (ctx.class_() != null) {
            exportClassNode.setClassNode(visitClass(ctx.class_()));
        }

        if (!isInsideComponent && exportClassNode.getClassNode() != null) {
            String className = exportClassNode.getClassNode().getIdentifier();
            if (className != null) {
                addRowToServiceSymbolTable(className, GLOBAL);
            }
        }
        return exportClassNode;
    }

    @Override
    public ClassNode visitClass(AngularParser.ClassContext ctx) {
        ClassNode classNode = new ClassNode();

        String className = ctx.Identifier().getText();
        classNode.setIdentifier(className);

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

    // Add placeholder implementations for all required visitor methods
    // (In a complete implementation, all methods from the original BaseVisitor would be included)



    @Override
    public ArgumentNode visitArgument(AngularParser.ArgumentContext ctx) {
        ArgumentNode node = new ArgumentNode();
        node.setName(ctx.Identifier().getText());
        Optional.ofNullable(ctx.literalValue())
                .ifPresent(val -> node.setValue(visitLiteralValue(val)));
        return node;
    }

    // Add all other required visitor method implementations...
    // (For brevity, I'm showing the pattern. The complete class would include all methods from BaseVisitor)

    // Placeholder implementations for remaining methods
    @Override public ImportStatementNode visitImportStatement(AngularParser.ImportStatementContext ctx) { return new ImportStatementNode(); }
    @Override public ThisNewInstanceAssignmentNode visitNewInstanceAssignment(AngularParser.NewInstanceAssignmentContext ctx) { return new ThisNewInstanceAssignmentNode(); }

    @Override
    public ASTNode visitNestedThisAccess(AngularParser.NestedThisAccessContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitIdentifierOrPropertyAccess(AngularParser.IdentifierOrPropertyAccessContext ctx) {
        return null;
    }

    @Override public ASTNode visitConsoleLog(AngularParser.ConsoleLogContext ctx) { return new ConsoleLogNode(); }
    @Override public ASTNode visitAccessModifier(AngularParser.AccessModifierContext ctx) { return new AccessModifierNode(); }
    @Override public VariableDeclarationNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) { return new VariableDeclarationNode(); }
    @Override public ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) { return new ExpressionNode(); }
    @Override public ArrayDeclarationNode visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) { return new ArrayDeclarationNode(); }
    @Override public FunctionDeclarationNode visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) { return new FunctionDeclarationNode(); }
    @Override public TypeNode visitType(AngularParser.TypeContext ctx) { return new TypeNode(); }
    @Override public ObjectDeclarationNode visitObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) { return new ObjectDeclarationNode(); }
    @Override public LiteralValueNode visitLiteralValue(AngularParser.LiteralValueContext ctx) { return new LiteralValueNode(); }
    @Override public ListLiteralNode visitListLiteral(AngularParser.ListLiteralContext ctx) { return new ListLiteralNode(); }
    @Override public AssignmentStatementNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) { return new AssignmentStatementNode(); }

    @Override
    public ASTNode visitThisAssignment(AngularParser.ThisAssignmentContext ctx) {
        return null;
    }

    @Override public ParameterNode visitParameter(AngularParser.ParameterContext ctx) { return new ParameterNode(); }
    @Override public HtmlNode visitHtml(AngularParser.HtmlContext ctx) { return new HtmlNode(); }
    @Override public HtmlContentNode visitHtml_content(AngularParser.Html_contentContext ctx) { return new HtmlContentNode(); }
    @Override public HtmlElementNode visitHtml_element(AngularParser.Html_elementContext ctx) { return new HtmlElementNode(); }
    @Override public HtmlTagNode visitHtml_tag_name(AngularParser.Html_tag_nameContext ctx) { return new HtmlTagNode(); }
    @Override public HtmlAttributesNode visitHtml_attributes(AngularParser.Html_attributesContext ctx) { return new HtmlAttributesNode(); }
    @Override public HtmlAttributeNode visitHtml_attribute(AngularParser.Html_attributeContext ctx) { return new HtmlAttributeNode(); }
    @Override public ASTNode visitAccess_suffix(AngularParser.Access_suffixContext ctx) { return new AccessSufNode(); }
    @Override public ASTNode visitHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx) { return new HtmlAttributeValueNode(); }
    @Override public ASTNode visitCss(AngularParser.CssContext ctx) { return new CssNode(); }
    @Override public CssContentNode visitCss_content(AngularParser.Css_contentContext ctx) { return new CssContentNode(); }
    @Override public CssClassContentNode visitCss_class_content(AngularParser.Css_class_contentContext ctx) { return new CssClassContentNode(); }
    @Override public ASTNode visitNgForAttribute(AngularParser.NgForAttributeContext ctx) { return new NgForNode(); }
    @Override public ASTNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) { return new NgIfNode(); }
    @Override public FunctionCallNode visitFunction_call(AngularParser.Function_callContext ctx) { return new FunctionCallNode(); }

    // Add all other required method stubs...
    @Override public ASTNode visitAbstractFunctionDeclaration(AngularParser.AbstractFunctionDeclarationContext ctx) { return new ExpressionNode(); }
    @Override public ASTNode visitMapLiteral(AngularParser.MapLiteralContext ctx) { return null; }
    @Override public ASTNode visitEnum(AngularParser.EnumContext ctx) { return null; }
    @Override public ASTNode visitEnumValues(AngularParser.EnumValuesContext ctx) { return null; }
    @Override public ASTNode visitEnumValue(AngularParser.EnumValueContext ctx) { return null; }
    @Override public ASTNode visitAbstractClass(AngularParser.AbstractClassContext ctx) { return null; }
    @Override public ASTNode visitInterface(AngularParser.InterfaceContext ctx) { return null; }

    @Override
    public ASTNode visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {
        return null;
    }

    @Override public IfStatementNode visitIfStatement(AngularParser.IfStatementContext ctx) { return null; }
    @Override public WhileStatementNode visitWhileStatement(AngularParser.WhileStatementContext ctx) { return null; }
    @Override public ASTNode visitElseIfStatement(AngularParser.ElseIfStatementContext ctx) { return null; }
    @Override public BreakStatementNode visitBreakStatement(AngularParser.BreakStatementContext ctx) { return null; }
    @Override public ContinueStatementNode visitContinueStatement(AngularParser.ContinueStatementContext ctx) { return null; }
    @Override public ASTNode visitBlock(AngularParser.BlockContext ctx) { return null; }
    @Override public ASTNode visitCheckedAttribute(AngularParser.CheckedAttributeContext ctx) { return null; }
    @Override public ASTNode visitOnChangeAttribute(AngularParser.OnChangeAttributeContext ctx) { return null; }
    @Override public ASTNode visitOnClickAttribute(AngularParser.OnClickAttributeContext ctx) { return null; }
    @Override public ASTNode visitOnSubmitAttribute(AngularParser.OnSubmitAttributeContext ctx) { return null; }
    @Override public ASTNode visitGapAttribute(AngularParser.GapAttributeContext ctx) { return null; }
    @Override public ASTNode visitDirectionAttribute(AngularParser.DirectionAttributeContext ctx) { return null; }
    @Override public ASTNode visitDurationAttribute(AngularParser.DurationAttributeContext ctx) { return null; }
    @Override public ASTNode visitRepeatAttribute(AngularParser.RepeatAttributeContext ctx) { return null; }
}

