package nodes;

import java.io.IOException;
import java.io.File;
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
import nodes.html_node.html_content.NgModelNode;
import nodes.html_node.html_content.NgSubmitNode;
import nodes.html_node.html_content.NgClickNode;
import nodes.statement.*;
import nodes.statement.HtmlElementNode;
import nodes.state.StateNode;
import nodes.state.ActionNode;
import nodes.product.ProductNode;
import nodes.product.ProductManagerNode;
import nodes.SymbolTables.ComponentSymbolTable;
import generators.CodeGenerator;
import nodes.SymbolTables.ServiceSemanticValidator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import utils.Logger;
import java.util.Set;
import java.util.HashSet;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {

    SymbolTable symbolTable = new SymbolTable();
    private ComponentSymbolTable componentSymbolTable = new ComponentSymbolTable();
    private ServiceSemanticValidator serviceSymbolTable = new ServiceSemanticValidator();
    private String currentScope = "Global";
    Stack<String> scopeStack = new Stack<>();
    private List<String> semanticErrors = new ArrayList<>();
    private Logger logger = Logger.getInstance();
    
    
    private final Set<String> componentScopeNames = new HashSet<>();
    private boolean isInsideComponent = false;
    
    /**
     * Get the current working directory and try to find project root
     * @return String array of possible project paths
     */
    private String[] getProjectPaths() {
        String currentDir = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        
        // Check if we're in the Angular-Compiler-Using-Antlr project directory
        if (currentDir.endsWith("Angular-Compiler-Using-Antlr")) {
            return new String[]{
                currentDir,
                currentDir + fileSeparator + "src",
                currentDir + fileSeparator + "test"
            };
        }
        
        // Check if we're in a parent directory that contains Angular-Compiler-Using-Antlr
        if (currentDir.contains("Angular-Compiler-Using-Antlr")) {
            String projectRoot = currentDir.substring(0, currentDir.indexOf("Angular-Compiler-Using-Antlr") + "Angular-Compiler-Using-Antlr".length());
            return new String[]{
                projectRoot,
                projectRoot + fileSeparator + "src",
                projectRoot + fileSeparator + "test",
                currentDir,
                currentDir + fileSeparator + "src",
                currentDir + fileSeparator + "test"
            };
        }
        
        // Check if we're in a directory that might contain Angular-Compiler-Using-Antlr as a subdirectory
        // This handles the case where we're in "compiler 2" directory
        File currentDirFile = new File(currentDir);
        File[] subdirs = currentDirFile.listFiles();
        if (subdirs != null) {
            for (File subdir : subdirs) {
                if (subdir.isDirectory() && subdir.getName().equals("Angular-Compiler-Using-Antlr")) {
                    String projectRoot = subdir.getAbsolutePath();
                    return new String[]{
                        projectRoot,
                        projectRoot + fileSeparator + "src",
                        projectRoot + fileSeparator + "test",
                        currentDir,
                        currentDir + fileSeparator + "src",
                        currentDir + fileSeparator + "test"
                    };
                }
            }
        }
        
        // Default paths for other project structures
        String[] paths = {
            currentDir,
            currentDir + fileSeparator + "src",
            currentDir + fileSeparator + "test",
            currentDir + fileSeparator + ".." + fileSeparator + "src",
            currentDir + fileSeparator + ".." + fileSeparator + ".." + fileSeparator + "src"
        };
        
        // Add common project structure paths
        if (currentDir.contains("src")) {
            String projectRoot = currentDir.substring(0, currentDir.indexOf("src"));
            paths = new String[]{
                projectRoot + "src",
                projectRoot + "test",
                currentDir,
                currentDir + fileSeparator + "..",
                currentDir + fileSeparator + ".." + fileSeparator + ".."
            };
        }
        
        return paths;
    }

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
    }
    
    
    public ComponentSymbolTable getComponentSymbolTable() {
        return componentSymbolTable;
    }
    
    public ServiceSemanticValidator getServiceSymbolTable() {
        return serviceSymbolTable;
    }
    
    public Set<String> getComponentScopeNames() {
        return componentScopeNames;
    }
    
    public boolean isInsideComponent() {
        return isInsideComponent;
    }

    public void printAst() {
        // Reset symbol table and semantic errors for new file
        this.symbolTable = new SymbolTable();
        this.componentSymbolTable = new ComponentSymbolTable();
        this.serviceSymbolTable = new ServiceSemanticValidator();
        this.componentScopeNames.clear();
        this.isInsideComponent = false;
        this.semanticErrors.clear();
        
        // Get file separator for cross-platform compatibility
        String fileSeparator = System.getProperty("file.separator");
        
        // Try multiple possible file paths using dynamic project detection
        String[] projectPaths = getProjectPaths();
        String[] possiblePaths = new String[projectPaths.length + 2];
        
        // Add direct file paths
        possiblePaths[0] = "angular_compiler.txt";
        possiblePaths[1] = "src" + fileSeparator + "angular_compiler.txt";
        
        // Add project-based paths
        for (int i = 0; i < projectPaths.length; i++) {
            possiblePaths[i + 2] = projectPaths[i] + fileSeparator + "angular_compiler.txt";
        }

        CharStream cs = null;
        String usedPath = null;

        for (String source : possiblePaths) {
            try {
                cs = fromFileName(source);
                usedPath = source;
                break;
            } catch (IOException e) {
                // Try next path
            }
        }

        if (cs == null) {
            logger.error("Could not find angular_compiler.txt in any of the expected locations:");
            logger.error("Current working directory: " + System.getProperty("user.dir"));
            logger.error("Searched in the following paths:");
            for (String path : possiblePaths) {
                logger.error("  - " + path);
            }
            return;
        }

        logger.info("Using file: " + usedPath);

        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);

        // AST Construction and Semantic Analysis using the same parse tree
        AngularParser.ProgramContext tree = parser.program();
        
        // Check for syntax errors before proceeding
        if (parser.getNumberOfSyntaxErrors() > 0) {
            logger.error("Syntax errors detected! Fix them before semantic analysis.");
            logger.error("Number of syntax errors: " + parser.getNumberOfSyntaxErrors());
            return;
        }
        
        ProgramNode programNode = (ProgramNode) this.visitProgram(tree);
        logger.info("=== AST ===");
        logger.info(programNode.toString());

        // Semantic Analysis on the same tree
        ParseTreeWalker walker = new ParseTreeWalker();
        SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable, componentSymbolTable, serviceSymbolTable);
        analyzer.reset(); // Reset local system
        walker.walk(analyzer, tree);
        if (!analyzer.getSemanticErrors().isEmpty()) {
            logger.error("\n=== Semantic Errors ===");
            for (String error : analyzer.getSemanticErrors()) {
                logger.error(error);
            }
        } else {
            logger.info("\nNo semantic errors detected.");
        }
        // Print semantic errors from BaseVisitor
        if (!semanticErrors.isEmpty()) {
            logger.error("\n=== Semantic Errors (from BaseVisitor) ===");
            for (String error : semanticErrors) {
                logger.error(error);
            }
        }
        // Optional: Print symbol table
        logger.info("=== Main Symbol Table ===");
        this.symbolTable.print();
        
        logger.info("=== Component Symbol Table ===");
        this.componentSymbolTable.print();
        
        logger.info("=== Service Symbol Table ===");
        this.serviceSymbolTable.print();
    }

    public void testFile(String fileName) {
        // Reset symbol table and semantic errors for new file
        this.symbolTable = new SymbolTable();
        this.componentSymbolTable = new ComponentSymbolTable();
        this.serviceSymbolTable = new ServiceSemanticValidator();
        this.componentScopeNames.clear();
        this.isInsideComponent = false;
        this.semanticErrors.clear();
        
        // Get file separator for cross-platform compatibility
        String fileSeparator = System.getProperty("file.separator");
        
        // Try multiple possible file paths using dynamic project detection
        String[] projectPaths = getProjectPaths();
        String[] possiblePaths = new String[projectPaths.length + 3];
        
        // Add primary paths
        possiblePaths[0] = "src" + fileSeparator + fileName; // From src directory (primary)
        possiblePaths[1] = fileName; // Direct path (fallback)
        possiblePaths[2] = "test" + fileSeparator + fileName; // From test directory if it exists
        
        // Add project-based paths
        for (int i = 0; i < projectPaths.length; i++) {
            possiblePaths[i + 3] = projectPaths[i] + fileSeparator + fileName;
        }


        CharStream cs = null;
        String usedPath = null;

        for (String source : possiblePaths) {
            try {
                cs = fromFileName(source);
                usedPath = source;
                break;
            } catch (IOException e) {
                // Try next path
            }
        }

        if (cs == null) {
            logger.error("Could not find " + fileName + " in any of the expected locations:");
            logger.error("Current working directory: " + System.getProperty("user.dir"));
            logger.error("Searched in the following paths:");
            for (String path : possiblePaths) {
                logger.error("  - " + path);
            }
            return;
        }

        logger.info("Using file: " + usedPath);

        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);

        try {
            // AST Construction and Semantic Analysis using the same parse tree
            AngularParser.ProgramContext tree = parser.program();
            
            // Check for syntax errors before proceeding
            if (parser.getNumberOfSyntaxErrors() > 0) {
                logger.error("Syntax errors detected! Fix them before semantic analysis.");
                logger.error("Number of syntax errors: " + parser.getNumberOfSyntaxErrors());
                return;
            }
            
            ProgramNode programNode = (ProgramNode) this.visitProgram(tree);
            logger.info("=== AST ===");
            logger.info(programNode.toString());

            // Semantic Analysis on the same tree
            ParseTreeWalker walker = new ParseTreeWalker();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable, componentSymbolTable, serviceSymbolTable);
            analyzer.reset(); // Reset local system
            walker.walk(analyzer, tree);
            if (!analyzer.getSemanticErrors().isEmpty()) {
                logger.error("\n=== Semantic Errors ===");
                for (String error : analyzer.getSemanticErrors()) {
                    logger.error(error);
                }
            } else {
                logger.info("\nNo semantic errors detected.");
            }

            // Print semantic errors from BaseVisitor
            if (!semanticErrors.isEmpty()) {
                logger.error("\n=== Semantic Errors (from BaseVisitor) ===");
                for (String error : semanticErrors) {
                    logger.error(error);
                }
            }

            logger.info("=== Main Symbol Table ===");
            this.symbolTable.print();
            
            logger.info("=== Component Symbol Table ===");
            this.componentSymbolTable.print();
            
            logger.info("=== Service Symbol Table ===");
            this.serviceSymbolTable.print();

        } catch (Exception e) {
            logger.error("Error during parsing: " + e.getMessage(), e);
        }
    }

    @Override
    public ASTNode visitProgram(AngularParser.ProgramContext ctx) {
        ProgramNode programNode = new ProgramNode();
        ProductManagerNode productManager = null;
        
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement() != null) {
                StatementNode statementNode = visitStatement(ctx.statement(i));
                programNode.getStatements().add(statementNode);
                
                // Check if this statement contains a ProductManager
                if (statementNode.getProductManagerNode() != null) {
                    productManager = statementNode.getProductManagerNode();
                }
            }
        }

        // Removed duplicate printing - will be printed after semantic analysis
        
        // Phase 3: Link Product Management with CodeGenerator
        if (productManager != null) {
            try {
                logger.info("Found ProductManager: " + productManager.getManagerName());
                logger.info("Number of products: " + productManager.getProducts().size());
                logger.info("Number of operations: " + productManager.getCrudOperations().size());
                
                // Create CodeGenerator and generate application
                generators.CodeGenerator codeGenerator = new generators.CodeGenerator();
                codeGenerator.generateApplication(productManager);
                
                logger.info("Application generated successfully!");
                
            } catch (Exception e) {
                logger.error("Error generating application: " + e.getMessage());
                e.printStackTrace();
            }
        }

        return programNode;
    }

    @Override
    public StatementNode visitStatement(AngularParser.StatementContext ctx) {
        StatementNode statement = new StatementNode();
        
        if (ctx.classDeclaration() != null) {
            statement.setClassNodes(visitClassDeclaration(ctx.classDeclaration()));
        }
        if (ctx.arrayDeclaration() != null) {
            statement.setArrayDeclarationNodeList(visitArrayDeclaration(ctx.arrayDeclaration()));
        }
        if (ctx.variableDeclaration() != null) {
            statement.setVariableDeclarationNodes(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        if (ctx.functionDeclaration() != null) {
            statement.setFunctionDeclarationNodes(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        if (ctx.ifStatement() != null) {
            statement.setIfStatementNodes(visitIfStatement(ctx.ifStatement()));
        }
        if (ctx.whileStatement() != null) {
            statement.setWhileStatementNodes(visitWhileStatement(ctx.whileStatement()));
        }
        if (ctx.assignmentStatement() != null) {
            statement.setAssignmentStatementNodes(visitAssignmentStatement(ctx.assignmentStatement()));
        }
        if (ctx.breakStatement() != null) {
            statement.setBreakStatementNodes(visitBreakStatement(ctx.breakStatement()));
        }
        if (ctx.continueStatement() != null) {
            statement.setContinueStatementNodes(visitContinueStatement(ctx.continueStatement()));
        }
        if (ctx.importStatement() != null) {
            statement.setImportStatementNodes(visitImportStatement(ctx.importStatement()));
        }
        if (ctx.component() != null) {
            statement.setComponentNodes(visitComponent(ctx.component()));
        }
        if (ctx.exportClass() != null) {
            statement.setExportClassNode(visitExportClass(ctx.exportClass()));
        }
        if (ctx.html() != null) {
            statement.setHtmlNodes(visitHtml(ctx.html()));
        }
        if (ctx.stateManagement() != null) {
            ASTNode n = visitStateManagement(ctx.stateManagement());
            statement.setStateManagementNode(n);
        }
        if (ctx.navigation() != null) {
            ASTNode n = visitNavigation(ctx.navigation());
            statement.setNavigationNode(n);
        }
        if (ctx.angularTemplate() != null) {
            ASTNode n = visitAngularTemplate(ctx.angularTemplate());
            statement.setAngularTemplateNode(n);
        }
        if (ctx.product() != null) {
            ASTNode n = visitProduct(ctx.product());
            statement.setProductNode((ProductNode) n);
        }
        if (ctx.productManager() != null) {
            ASTNode n = visitProductManager(ctx.productManager());
            statement.setProductManagerNode((ProductManagerNode) n);
        }
        
        return statement;
    }

    @Override
    public ComponentNode visitComponent(AngularParser.ComponentContext ctx) {
        isInsideComponent = true;
        try {
            ComponentNode componentNode = new ComponentNode();
            String componentName = "UnknownComponent";

            // Handle argumentList (current grammar)
            if (ctx.argumentList() != null) {
                ArgumentListNode argumentListNode = visitArgumentList(ctx.argumentList());
                componentNode.setDecorator(new DecoratorNode()); // Create empty decorator for now
            }

            if (ctx.exportClass() != null) {
                ExportClassNode ex = visitExportClass(ctx.exportClass());
                componentNode.setExportClass(ex);
                if (ex.getClassNode() != null) {
                    ASTNode classNode = ex.getClassNode();
                    if (classNode instanceof ClassNode) {
                        ClassNode actualClassNode = (ClassNode) classNode;
                        if (actualClassNode.getIdentifier() != null) {
                            componentName = actualClassNode.getIdentifier();
                            // Add component name here only (no need to add it in visitClassDeclaration)
                            componentScopeNames.add(componentName);
                        }
                    }
                }
            }

            // Register in ComponentSymbolTable instead of the general symbolTable
            Row r = new Row();
            r.setType("Component");
            r.setName(componentName);         // ← component name
            r.setScope(componentName);        // ← same name as scope
            r.setValue(ctx.argumentList() != null ? ctx.argumentList().getText() : "");
            componentSymbolTable.getRows().add(r);

            return componentNode;
        } finally {
            isInsideComponent = false;
        }
    }

    @Override
    public ExportClassNode visitExportClass(AngularParser.ExportClassContext ctx) {
        ExportClassNode exportClassNode = new ExportClassNode();
        
        if (ctx.classDeclaration() != null) {                 // current grammar
            exportClassNode.setClassNode(visitClassDeclaration(ctx.classDeclaration()));
        } 
        // If future changes occur:
        // else if (ctx.class_() != null) {
        //     exportClassNode.setClassNode(visitClass(ctx.class_()));
        // }

        if (!isInsideComponent && exportClassNode.getClassNode() != null) {
            ASTNode classNode = exportClassNode.getClassNode();
            if (classNode instanceof ClassNode) {
                ClassNode actualClassNode = (ClassNode) classNode;
                String className = actualClassNode.getIdentifier();
                if (className != null) {
                    serviceSymbolTable.insertService(className, "Global");
                }
            }
        }
        
        return exportClassNode;
    }

    @Override
    public ClassNode visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassNode classNode = new ClassNode();

        // Check if Identifier exists before accessing it
        if (ctx.Identifier() != null) {
            String className = ctx.Identifier().getText();
            classNode.setIdentifier(className);
            enterScope(className);
        } else {
            // Handle case where class name is missing
            String className = "AnonymousClass";
            classNode.setIdentifier(className);
            enterScope(className);
        }

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
    public DecoratorNode visitDecorator(AngularParser.DecoratorContext ctx) {
        DecoratorNode decoratorNode = new DecoratorNode();
        
        if (ctx.argumentList() != null) {
            decoratorNode.getArguments().add(visitArgumentList(ctx.argumentList()));
        }
        
        return decoratorNode;
    }

    @Override
    public ArgumentListNode visitArgumentList(AngularParser.ArgumentListContext ctx) {
        ArgumentListNode argumentListNode = new ArgumentListNode();
        
        
        for (int i = 0; i < ctx.argument().size(); i++) {
            if (ctx.argument().get(i) != null) {
                argumentListNode.getArgumentNodeList().add(visitArgument(ctx.argument(i)));
            }
        }
        
        return argumentListNode;
    }

    @Override
    public ArgumentNode visitArgument(AngularParser.ArgumentContext ctx) {
        ArgumentNode node = new ArgumentNode();
        
        // Check if Identifier exists before accessing it
        if (ctx.Identifier() != null) {
            String name = ctx.Identifier().getText();
            node.setName(name);
            if (ctx.literalValue() != null) {
                node.setValue(visitLiteralValue(ctx.literalValue()));
            }
        } else {
            // Handle case where argument name is missing
            String name = "anonymousArg";
            node.setName(name);
            if (ctx.literalValue() != null) {
                node.setValue(visitLiteralValue(ctx.literalValue()));
            }
        }
        
        return node;
    }

    @Override
    public ImportStatementNode visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatementNode importStatementNode = new ImportStatementNode();
        
        
        if (ctx.Identifier() != null) {
            String importedClass = ctx.Identifier().getText();
            importStatementNode.setIdentifier(importedClass);
            
            // Register import in the general table correctly
            Row r = new Row();
            r.setType("Import Statement");
            r.setName(importedClass);         // Component
            r.setScope("Global");
            r.setValue(ctx.StringLiteral() != null ? ctx.StringLiteral().getText() : "");  // '@angular/core'
            symbolTable.getRows().add(r);
        }
        if (ctx.StringLiteral() != null) {
            importStatementNode.setSource(ctx.StringLiteral().getText());
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
    public ASTNode visitConsoleLog(AngularParser.ConsoleLogContext ctx) {
        ConsoleLogNode consoleLogNode = new ConsoleLogNode();
        
        // Check if Identifier exists before accessing it
        if (ctx.Identifier() != null) {
            consoleLogNode.setValue(ctx.Identifier().getText());
        } else {
            consoleLogNode.setValue("anonymousLog");
        }
        
        return consoleLogNode;
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
    public ASTNode visitAccessModifier(AngularParser.AccessModifierContext ctx) {
        AccessModifierNode accessModifierNode = new AccessModifierNode();
        accessModifierNode.setAccessModifier(ctx.getText());
        return accessModifierNode;
    }

    @Override
    public VariableDeclarationNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclarationNode variableDeclarationNode = new VariableDeclarationNode();
        
        
        if (ctx.Identifier() != null) {
            String varName = ctx.Identifier().getText();
            variableDeclarationNode.setIdentifier(varName);
        } else {
            // Handle case where identifier is missing
            String varName = "anonymousVariable";
            variableDeclarationNode.setIdentifier(varName);
        }
        
        if (ctx.type() != null) {
            variableDeclarationNode.setType(visitType(ctx.type()));
        }
        
        if (ctx.expression() != null) {
            variableDeclarationNode.setExpression(visitExpression(ctx.expression()));
        }
        
        // Handle template strings specifically
        if (ctx.templateString() != null) {
            visitTemplateString(ctx.templateString());
        }
        
        // Direct addition removed - will be added from SemanticAnalyzer
        
        return variableDeclarationNode;
    }

    public ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        
        // Check if this is a binary operation context that has expression() method
        if (ctx instanceof AngularParser.AdditionContext ||
            ctx instanceof AngularParser.SubtractionContext ||
            ctx instanceof AngularParser.MultiplicationContext ||
            ctx instanceof AngularParser.DivisionContext ||
            ctx instanceof AngularParser.ModulusContext ||
            ctx instanceof AngularParser.LessThanComparisonContext ||
            ctx instanceof AngularParser.GreaterThanComparisonContext ||
            ctx instanceof AngularParser.LessThanEqualsComparisonContext ||
            ctx instanceof AngularParser.GreaterThanEqualsComparisonContext ||
            ctx instanceof AngularParser.WeakEqualsComparisonContext ||
            ctx instanceof AngularParser.StrongEqualsComparisonContext ||
            ctx instanceof AngularParser.NotEqualsComparisonContext ||
            ctx instanceof AngularParser.LogicalAndExpressionStatementContext ||
            ctx instanceof AngularParser.LogicalOrExpressionStatementContext) {
            
            // Cast to specific context type to access expression() method
            try {
                if (ctx instanceof AngularParser.AdditionContext) {
                    AngularParser.AdditionContext addCtx = (AngularParser.AdditionContext) ctx;
                    if (addCtx.expression() != null && addCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(addCtx.expression(0)));
                        expressionNode.setRight(visitExpression(addCtx.expression(1)));
                        expressionNode.setOperator("+");
                    }
                } else if (ctx instanceof AngularParser.SubtractionContext) {
                    AngularParser.SubtractionContext subCtx = (AngularParser.SubtractionContext) ctx;
                    if (subCtx.expression() != null && subCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(subCtx.expression(0)));
                        expressionNode.setRight(visitExpression(subCtx.expression(1)));
                        expressionNode.setOperator("-");
                    }
                } else if (ctx instanceof AngularParser.MultiplicationContext) {
                    AngularParser.MultiplicationContext mulCtx = (AngularParser.MultiplicationContext) ctx;
                    if (mulCtx.expression() != null && mulCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(mulCtx.expression(0)));
                        expressionNode.setRight(visitExpression(mulCtx.expression(1)));
                        expressionNode.setOperator("*");
                    }
                } else if (ctx instanceof AngularParser.DivisionContext) {
                    AngularParser.DivisionContext divCtx = (AngularParser.DivisionContext) ctx;
                    if (divCtx.expression() != null && divCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(divCtx.expression(0)));
                        expressionNode.setRight(visitExpression(divCtx.expression(1)));
                        expressionNode.setOperator("/");
                    }
                } else if (ctx instanceof AngularParser.ModulusContext) {
                    AngularParser.ModulusContext modCtx = (AngularParser.ModulusContext) ctx;
                    if (modCtx.expression() != null && modCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(modCtx.expression(0)));
                        expressionNode.setRight(visitExpression(modCtx.expression(1)));
                        expressionNode.setOperator("%");
                    }
                } else if (ctx instanceof AngularParser.LessThanComparisonContext) {
                    AngularParser.LessThanComparisonContext ltCtx = (AngularParser.LessThanComparisonContext) ctx;
                    if (ltCtx.expression() != null && ltCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(ltCtx.expression(0)));
                        expressionNode.setRight(visitExpression(ltCtx.expression(1)));
                        expressionNode.setOperator("<");
                    }
                } else if (ctx instanceof AngularParser.GreaterThanComparisonContext) {
                    AngularParser.GreaterThanComparisonContext gtCtx = (AngularParser.GreaterThanComparisonContext) ctx;
                    if (gtCtx.expression() != null && gtCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(gtCtx.expression(0)));
                        expressionNode.setRight(visitExpression(gtCtx.expression(1)));
                        expressionNode.setOperator(">");
                    }
                } else if (ctx instanceof AngularParser.LessThanEqualsComparisonContext) {
                    AngularParser.LessThanEqualsComparisonContext leCtx = (AngularParser.LessThanEqualsComparisonContext) ctx;
                    if (leCtx.expression() != null && leCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(leCtx.expression(0)));
                        expressionNode.setRight(visitExpression(leCtx.expression(1)));
                        expressionNode.setOperator("<=");
                    }
                } else if (ctx instanceof AngularParser.GreaterThanEqualsComparisonContext) {
                    AngularParser.GreaterThanEqualsComparisonContext geCtx = (AngularParser.GreaterThanEqualsComparisonContext) ctx;
                    if (geCtx.expression() != null && geCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(geCtx.expression(0)));
                        expressionNode.setRight(visitExpression(geCtx.expression(1)));
                        expressionNode.setOperator(">=");
                    }
                } else if (ctx instanceof AngularParser.NotEqualsComparisonContext) {
                    AngularParser.NotEqualsComparisonContext neCtx = (AngularParser.NotEqualsComparisonContext) ctx;
                    if (neCtx.expression() != null && neCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(neCtx.expression(0)));
                        expressionNode.setRight(visitExpression(neCtx.expression(1)));
                        expressionNode.setOperator("!=");
                    }
                } else if (ctx instanceof AngularParser.WeakEqualsComparisonContext) {
                    AngularParser.WeakEqualsComparisonContext eqCtx = (AngularParser.WeakEqualsComparisonContext) ctx;
                    if (eqCtx.expression() != null && eqCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(eqCtx.expression(0)));
                        expressionNode.setRight(visitExpression(eqCtx.expression(1)));
                        expressionNode.setOperator("==");
                    }
                } else if (ctx instanceof AngularParser.StrongEqualsComparisonContext) {
                    AngularParser.StrongEqualsComparisonContext seqCtx = (AngularParser.StrongEqualsComparisonContext) ctx;
                    if (seqCtx.expression() != null && seqCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(seqCtx.expression(0)));
                        expressionNode.setRight(visitExpression(seqCtx.expression(1)));
                        expressionNode.setOperator("===");
                    }
                } else if (ctx instanceof AngularParser.LogicalAndExpressionStatementContext) {
                    AngularParser.LogicalAndExpressionStatementContext andCtx = (AngularParser.LogicalAndExpressionStatementContext) ctx;
                    if (andCtx.expression() != null && andCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(andCtx.expression(0)));
                        expressionNode.setRight(visitExpression(andCtx.expression(1)));
                        expressionNode.setOperator("&&");
                    }
                } else if (ctx instanceof AngularParser.LogicalOrExpressionStatementContext) {
                    AngularParser.LogicalOrExpressionStatementContext orCtx = (AngularParser.LogicalOrExpressionStatementContext) ctx;
                    if (orCtx.expression() != null && orCtx.expression().size() >= 2) {
                        expressionNode.setLeft(visitExpression(orCtx.expression(0)));
                        expressionNode.setRight(visitExpression(orCtx.expression(1)));
                        expressionNode.setOperator("||");
                    }
                }
            } catch (Exception e) {
                logger.error("Error processing expression context: " + e.getMessage());
                expressionNode.setOperator(ctx.getText());
            }
        } else {
            expressionNode.setOperator(ctx.getText());
        }
        
        return expressionNode;
    }

    @Override
    public ArrayDeclarationNode visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) {
        ArrayDeclarationNode arrayDeclarationNode = new ArrayDeclarationNode();
        
        // Check if Identifier exists before accessing it
        if (ctx.Identifier() != null) {
            arrayDeclarationNode.setIdentifier(ctx.Identifier().getText());
        } else {
            arrayDeclarationNode.setIdentifier("anonymousArray");
        }
        
        if (ctx.type() != null) {
            arrayDeclarationNode.setType(visitType(ctx.type()));
        }
        
        if (!ctx.literalValue().isEmpty()) {
            for (int i = 0; i < ctx.literalValue().size(); i++) {
                arrayDeclarationNode.getValues().add(visitLiteralValue(ctx.literalValue().get(i)));
            }
        }
        
        // Direct addition removed - will be added from SemanticAnalyzer
        
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
        
        // Direct addition removed - will be added from SemanticAnalyzer
        
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
        
        if (ctx.Identifier() != null && ctx.Identifier().size() >= 2) {
            objectDeclarationNode.setIdentifier(ctx.Identifier().get(0).getText());
            
            // Check if the second identifier exists before checking import
            if (ctx.Identifier().get(1) != null) {
                if (!symbolTable.isImported(ctx.Identifier().get(1).getText())) {
                    logger.error("Semantic Error: Class '" + ctx.Identifier().get(1).getText() + "' used but not imported.");
                }
            }
        } else {
            // Handle case where identifiers are missing
            objectDeclarationNode.setIdentifier("anonymousObject");
        }
        
        // Direct addition removed - will be added from SemanticAnalyzer
        
        return objectDeclarationNode;
    }

    @Override
    public LiteralValueNode visitLiteralValue(AngularParser.LiteralValueContext ctx) {
        LiteralValueNode node = new LiteralValueNode();
        boolean any = false;

        if (ctx.StringLiteral() != null) {
            String s = ctx.StringLiteral().getText();
            node.setStirngValue(s);
            if (s.contains("<") && s.contains(">")) analyzeStringForSemanticErrors(s);
            any = true;
        }
        if (ctx.templateString() != null) {
            String t = ctx.templateString().getText();
            node.setStirngValue(t);
            analyzeTemplateStringForSemanticErrors(t);
            any = true;
        }
        if (ctx.NumberLiteral() != null) { node.setNumValue(ctx.NumberLiteral().getText()); any = true; }
        if (ctx.BooleanLiteral() != null) { node.setBooleanValue(ctx.BooleanLiteral().getText()); any = true; }
        if (ctx.listLiteral() != null) { node.setListLiteralNode(visitListLiteral(ctx.listLiteral())); any = true; }
        if (ctx.html() != null) { node.setHtmlNode(visitHtml(ctx.html())); any = true; }

        node.setNull(!any);
        return node;
    }

    @Override
    public ASTNode visitMapLiteral(AngularParser.MapLiteralContext ctx) {
        return null;
    }

    @Override
    public ListLiteralNode visitListLiteral(AngularParser.ListLiteralContext ctx) {
        ListLiteralNode listLiteralNode = new ListLiteralNode();
        
        
        for (int i = 0; i < ctx.Identifier().size(); i++) {
            if (ctx.Identifier().get(i) != null) {
                listLiteralNode.getIdentifiers().add(ctx.Identifier().get(i).getText());
            }
        }
        
        return listLiteralNode;
    }

    @Override
    public AssignmentStatementNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) {
        AssignmentStatementNode assignmentStatementNode = new AssignmentStatementNode();
        
        // Check if Identifier exists before accessing it
        if (ctx.Identifier() != null) {
            assignmentStatementNode.setIdentifier(ctx.Identifier().getText());
        } else {
            assignmentStatementNode.setIdentifier("anonymousAssignment");
        }
        
        
        if (!ctx.literalValue().isEmpty()) {
            for (int i = 0; i < ctx.literalValue().size(); i++) {
                assignmentStatementNode.getValues().add(visitLiteralValue(ctx.literalValue().get(i)));
            }
        }
        if (!ctx.expression().isEmpty()) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                assignmentStatementNode.getExpression().add(visitExpression(ctx.expression().get(i)));
            }
        }
        
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
        if (ctx.html() != null) {
            return visitHtml(ctx.html());
        }
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
        
        
        if (ctx.Identifier() != null) {
            identifierNode.setName(ctx.Identifier().getText());
        }
        
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
        
        
        if (ctx.Identifier() != null) {
            parameterNode.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            parameterNode.setType(visitType(ctx.type()));
        }
        if (ctx.literalValue() != null) {
            parameterNode.setDefaultValue(visitLiteralValue(ctx.literalValue()));
        }
        
        return parameterNode;
    }

    @Override
    public FunctionCallNode visitFunction_call(AngularParser.Function_callContext ctx) {
        FunctionCallNode functionCallNode = new FunctionCallNode();
        
        
        if (ctx.Identifier() != null) {
            functionCallNode.setIdentifier(ctx.Identifier().getText());
        }
        
        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            // For now, just use the first expression as a placeholder
            // In a more complete implementation, you might want to handle multiple parameters
            functionCallNode.setExpression(visitExpression(ctx.expression(0)));
        }
        
        return functionCallNode;
    }

    @Override
    public HtmlNode visitHtml(AngularParser.HtmlContext ctx) {
        logger.debug("ddddd");
        HtmlNode htmlNode = new HtmlNode();
        
        
        if (ctx.html_content() != null) {
            htmlNode.setContent(visitHtml_content(ctx.html_content()));
            
            // Run semantic analysis on HTML content
            try {
                ParseTreeWalker walker = new ParseTreeWalker();
                SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable, this.componentSymbolTable, this.serviceSymbolTable);
                walker.walk(analyzer, ctx);
                
                // Add any semantic errors found
                semanticErrors.addAll(analyzer.getSemanticErrors());
            } catch (Exception e) {
                logger.error("Error during HTML semantic analysis: " + e.getMessage());
            }
        }
        
        return htmlNode;
    }

    @Override
    public HtmlContentNode visitHtml_content(AngularParser.Html_contentContext ctx) {
        HtmlContentNode node = new HtmlContentNode();
        if (ctx.html_element() != null) {
            for (int i = 0; i < ctx.html_element().size(); i++) {
                node.getHtmlElementNode().add(visitHtml_element(ctx.html_element(i)));
            }
        }
        return node;
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
        HtmlTagNode n = new HtmlTagNode();
        if (ctx.Identifier() != null) {
            n.setIdentifierNode(ctx.Identifier().getText());
        } else {
            // Supports special tokens like RouterOutlet
            n.setIdentifierNode(ctx.getText());
        }
        return n;
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
            accessSufNode.setIdentifierNode(ctx.Identifier().getText());
        } else if (ctx.expression() != null) {
            accessSufNode.setExpressionNode(visitExpression(ctx.expression()));
        } else if (ctx.function_call() != null) {
            accessSufNode.setFunctionCallNode(visitFunction_call(ctx.function_call()));
        }
        
        return accessSufNode;
    }

    @Override
    public HtmlAttributeValueNode visitHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx) {
        HtmlAttributeValueNode htmlAttributeValueNode = new HtmlAttributeValueNode();
        
        
        if (ctx.literalValue() != null) {
            htmlAttributeValueNode.setValue(visitLiteralValue(ctx.literalValue()));
        } else if (ctx.expression() != null) {
            htmlAttributeValueNode.setExpression(visitExpression(ctx.expression()));
        }
        
        return htmlAttributeValueNode;
    }

    @Override
    public ASTNode visitCss(AngularParser.CssContext ctx) {
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
        if (ctx.Identifier() != null) {
            // cssContentNode.setIdentifierNode(ctx.Identifier().get());
        }
        
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
        
        return ngForNode;
    }

    @Override
    public ASTNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) {
        NgIfNode ngIfNode = new NgIfNode();
        
        
        ngIfNode.setExpressionNode(visitExpression(ctx.expression()));
        
        return ngIfNode;
    }

    // New State Management Methods
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
    public ASTNode visitEnumDeclaration(AngularParser.EnumDeclarationContext ctx) {
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
            SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable, this.componentSymbolTable, this.serviceSymbolTable);
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
                SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable, this.componentSymbolTable, this.serviceSymbolTable);
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
                SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable, this.componentSymbolTable, this.serviceSymbolTable);
                walker.walk(analyzer, htmlCtx);
                
                // Add any semantic errors found
                semanticErrors.addAll(analyzer.getSemanticErrors());
                
                logger.info("Analyzed template string for semantic errors: " + htmlContent.substring(0, Math.min(50, htmlContent.length())) + "...");
            
        } catch (Exception e) {
            logger.error("Error analyzing template string for semantic errors: " + e.getMessage());
        }
    }

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
}

