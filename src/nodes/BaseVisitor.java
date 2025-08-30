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
import nodes.SymbolTables.ComponentSymbolTable;
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
    
    // تتبع نطاق المكوّنات مثل merge-branch
    private final Set<String> componentScopeNames = new HashSet<>();
    private boolean isInsideComponent = false;

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
    
    // Getters للجداول المتخصصة مثل merge-branch
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
        
        // Try multiple possible file paths
        String[] possiblePaths = {
            "angular_compiler.txt",
            "C:\\Users\\KEMO\\OneDrive\\Desktop\\compiler 2\\Angular-Compiler-Using-Antlr\\angular_compiler.txt",
            "src\\angular_compiler.txt"
        };

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
        ProgramNode programNode = (ProgramNode) this.visitProgram(tree);
        logger.info("=== AST ===");
        logger.info(programNode.toString());

                    // Semantic Analysis on the same tree
            ParseTreeWalker walker = new ParseTreeWalker();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable, componentSymbolTable, serviceSymbolTable);
            analyzer.reset(); // إعادة تعيين النظام المحلي
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
        
        // Try multiple possible file paths for the given filename
        String[] possiblePaths = {
                fileName, // Direct path
                "src/" + fileName, // From project directory
                "C:\\Users\\KEMO\\OneDrive\\Desktop\\compiler 2\\Angular-Compiler-Using-Antlr\\" + fileName, // Absolute path
                "C:\\Users\\KEMO\\OneDrive\\Desktop\\compiler 2\\Angular-Compiler-Using-Antlr\\src\\" + fileName // Absolute path with src
        };

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
            ProgramNode programNode = (ProgramNode) this.visitProgram(tree);
            logger.info("=== AST ===");
            logger.info(programNode.toString());

            // Semantic Analysis on the same tree
            ParseTreeWalker walker = new ParseTreeWalker();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable, componentSymbolTable, serviceSymbolTable);
            analyzer.reset(); // إعادة تعيين النظام المحلي
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
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement() != null) {
                StatementNode statementNode = visitStatement(ctx.statement(i));
                programNode.getStatements().add(statementNode);
            }
        }

        // تم إزالة الطباعة المكررة - ستتم الطباعة بعد التحليل الدلالي
        return programNode;
    }

    @Override
    public StatementNode visitStatement(AngularParser.StatementContext ctx) {
        StatementNode statement = new StatementNode();

        if (ctx.classDeclaration() != null) {
            ClassNode anclass = visitClassDeclaration(ctx.classDeclaration());
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
            // statementRow.setType("Assignment Statement");
            // statementRow.setValue(ctx.assignmentStatement().getText());
            // statementRow.setScope("Global");
        }
        if (ctx.breakStatement() != null) {
            BreakStatementNode breakStatementNode = visitBreakStatement(ctx.breakStatement());
            statement.setBreakStatementNodes(breakStatementNode);
            // statementRow.setType("Break Statement");
            // statementRow.setValue(ctx.breakStatement().getText());
        }
        if (ctx.continueStatement() != null) {
            ContinueStatementNode continueStatementNode = visitContinueStatement(ctx.continueStatement());
            statement.setContinueStatementNodes(continueStatementNode);
            // statementRow.setType("Continue Statement");
            // statementRow.setValue(ctx.continueStatement().getText());
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
        // New State Management Support
        if (ctx.stateManagement() != null) {
            // TODO: Handle state management
        }
        // New Navigation Support
        if (ctx.navigation() != null) {
            // TODO: Handle navigation
        }
        // New Angular Template Support
        if (ctx.angularTemplate() != null) {
            // TODO: Handle angular template
        }
        return statement;
    }

    @Override
    public ComponentNode visitComponent(AngularParser.ComponentContext ctx) {
        isInsideComponent = true;
        try {
            ComponentNode componentNode = new ComponentNode();
            String componentName = "UnknownComponent";

            // Handle argumentList (grammar الحالية)
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
                            // أضف اسم المكوّن هنا فقط (لا حاجة لإضافته في visitClassDeclaration)
                            componentScopeNames.add(componentName);
                        }
                    }
                }
            }

            // سجّل في ComponentSymbolTable بدل الـsymbolTable العام
            Row r = new Row();
            r.setType("Component");
            r.setName(componentName);         // ← اسم المكوّن
            r.setScope(componentName);        // ← نفس الاسم كنطاق
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
        
        if (ctx.classDeclaration() != null) {                 // grammar الحالية
            exportClassNode.setClassNode(visitClassDeclaration(ctx.classDeclaration()));
        } 
        // لو حدث تغيير مستقبلاً:
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
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
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
        
        // Don't add to symbol table like merge-branch (only build AST)
        return classBodyNode;
    }

    @Override
    public DecoratorNode visitDecorator(AngularParser.DecoratorContext ctx) {
        DecoratorNode decoratorNode = new DecoratorNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.argumentList() != null) {
            decoratorNode.getArguments().add(visitArgumentList(ctx.argumentList()));
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return decoratorNode;
    }

    @Override
    public ArgumentListNode visitArgumentList(AngularParser.ArgumentListContext ctx) {
        ArgumentListNode argumentListNode = new ArgumentListNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        for (int i = 0; i < ctx.argument().size(); i++) {
            if (ctx.argument().get(i) != null) {
                argumentListNode.getArgumentNodeList().add(visitArgument(ctx.argument(i)));
            }
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.Identifier() != null) {
            String importedClass = ctx.Identifier().getText();
            importStatementNode.setIdentifier(importedClass);
            
            // تسجيل الاستيراد في الجدول العام بالشكل الصحيح
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
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
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
        
        // تم إزالة الإضافة المباشرة - ستتم الإضافة من SemanticAnalyzer
        
        return variableDeclarationNode;
    }

    public ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        
        // Apply the same structural approach as merge-branch
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
                // Fallback to text representation like merge-branch
                expressionNode.setOperator(ctx.getText());
            }
        } else {
            // For non-binary operations, use text representation like merge-branch
            expressionNode.setOperator(ctx.getText());
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // تم إزالة الإضافة المباشرة - ستتم الإضافة من SemanticAnalyzer
        
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
        
        // تم إزالة الإضافة المباشرة - ستتم الإضافة من SemanticAnalyzer
        
        return functionDeclarationNode;
    }

    @Override
    public TypeNode visitType(AngularParser.TypeContext ctx) {
        TypeNode typeNode = new TypeNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
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
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // تم إزالة الإضافة المباشرة - ستتم الإضافة من SemanticAnalyzer
        
        return objectDeclarationNode;
    }

    @Override
    public LiteralValueNode visitLiteralValue(AngularParser.LiteralValueContext ctx) {
        LiteralValueNode literalValueNode = new LiteralValueNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.StringLiteral() != null) {
            String stringValue = ctx.StringLiteral().getText();
            literalValueNode.setStirngValue(stringValue);
            
            // Check if this string contains HTML-like content for semantic analysis
            if (stringValue.contains("<") && stringValue.contains(">")) {
                analyzeStringForSemanticErrors(stringValue);
            }
        }
        if (ctx.templateString() != null) {
            // Handle template strings specifically
            String templateContent = ctx.templateString().getText();
            literalValueNode.setStirngValue(templateContent);
            
            // Analyze template string content for semantic errors
            analyzeTemplateStringForSemanticErrors(templateContent);
        }
        if (ctx.NumberLiteral() != null) {
            literalValueNode.setNumValue(ctx.NumberLiteral().getText());
        }
        if (ctx.BooleanLiteral() != null) {
            literalValueNode.setBooleanValue(ctx.BooleanLiteral().getText());
        } else {
            literalValueNode.setNull(true);
        }
        if (ctx.listLiteral() != null) {
            literalValueNode.setListLiteralNode(visitListLiteral(ctx.listLiteral()));
        }
        if (ctx.html() != null) {
            literalValueNode.setHtmlNode(visitHtml(ctx.html()));
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return literalValueNode;
    }

    @Override
    public ASTNode visitMapLiteral(AngularParser.MapLiteralContext ctx) {
        return null;
    }

    @Override
    public ListLiteralNode visitListLiteral(AngularParser.ListLiteralContext ctx) {
        ListLiteralNode listLiteralNode = new ListLiteralNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        for (int i = 0; i < ctx.Identifier().size(); i++) {
            if (ctx.Identifier().get(i) != null) {
                listLiteralNode.getIdentifiers().add(ctx.Identifier().get(i).getText());
            }
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
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
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.Identifier() != null) {
            identifierNode.setName(ctx.Identifier().getText());
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.Identifier() != null) {
            parameterNode.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.type() != null) {
            parameterNode.setType(visitType(ctx.type()));
        }
        if (ctx.literalValue() != null) {
            parameterNode.setDefaultValue(visitLiteralValue(ctx.literalValue()));
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return parameterNode;
    }

    @Override
    public FunctionCallNode visitFunction_call(AngularParser.Function_callContext ctx) {
        FunctionCallNode functionCallNode = new FunctionCallNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.Identifier() != null) {
            functionCallNode.setIdentifier(ctx.Identifier().getText());
        }
        
        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            // For now, just use the first expression as a placeholder
            // In a more complete implementation, you might want to handle multiple parameters
            functionCallNode.setExpression(visitExpression(ctx.expression(0)));
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return functionCallNode;
    }

    @Override
    public HtmlNode visitHtml(AngularParser.HtmlContext ctx) {
        logger.debug("ddddd");
        HtmlNode htmlNode = new HtmlNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
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
        
        // Don't add to symbol table like merge-branch (only build AST)
        return htmlNode;
    }

    @Override
    public HtmlContentNode visitHtml_content(AngularParser.Html_contentContext ctx) {
        HtmlContentNode htmlContentNode = new HtmlContentNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.html_element() != null) {
            for (int i = 0; i < ctx.html_element().size(); i++) {
                htmlContentNode.getHtmlElementNode().add(visitHtml_element(ctx.html_element().get(i)));
            }
        }
        if (ctx.expression() != null) {
            htmlContentNode.setIdentifierNode("ff");
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.Identifier() != null) {
            htmlTagNode.setIdentifierNode(ctx.Identifier().getText());
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return htmlTagNode;
    }

    @Override
    public HtmlAttributesNode visitHtml_attributes(AngularParser.Html_attributesContext ctx) {
        HtmlAttributesNode htmlAttributesNode = new HtmlAttributesNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.html_attribute() != null) {
            for (int i = 0; i < ctx.html_attribute().size(); i++) {
                htmlAttributesNode.getHtmlAttributeNodes().add(visitHtml_attribute(ctx.html_attribute(i)));
            }
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return htmlAttributesNode;
    }

    @Override
    public HtmlAttributeNode visitHtml_attribute(AngularParser.Html_attributeContext ctx) {
        HtmlAttributeNode htmlAttributeNode = new HtmlAttributeNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
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
        
        // Don't add to symbol table like merge-branch (only build AST)
        return htmlAttributeNode;
    }

    @Override
    public AccessSufNode visitAccess_suffix(AngularParser.Access_suffixContext ctx) {
        AccessSufNode accessSufNode = new AccessSufNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.Identifier() != null) {
            accessSufNode.setIdentifierNode(ctx.Identifier().getText());
        } else if (ctx.expression() != null) {
            accessSufNode.setExpressionNode(visitExpression(ctx.expression()));
        } else if (ctx.function_call() != null) {
            accessSufNode.setFunctionCallNode(visitFunction_call(ctx.function_call()));
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return accessSufNode;
    }

    @Override
    public HtmlAttributeValueNode visitHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx) {
        HtmlAttributeValueNode htmlAttributeValueNode = new HtmlAttributeValueNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.literalValue() != null) {
            htmlAttributeValueNode.setValue(visitLiteralValue(ctx.literalValue()));
        } else if (ctx.expression() != null) {
            htmlAttributeValueNode.setExpression(visitExpression(ctx.expression()));
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return htmlAttributeValueNode;
    }

    @Override
    public ASTNode visitCss(AngularParser.CssContext ctx) {
        CssNode cssNode = new CssNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.css_content() != null) {
            for (int i = 0; i < ctx.css_content().size(); i++) {
                cssNode.getCssContentNode().add(visitCss_content(ctx.css_content(i)));
            }
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return cssNode;
    }

    @Override
    public CssContentNode visitCss_content(AngularParser.Css_contentContext ctx) {
        CssContentNode cssContentNode = new CssContentNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.css_class_content() != null) {
            for (int i = 0; i < ctx.css_class_content().size(); i++) {
                cssContentNode.getCssClassContentList().add(visitCss_class_content(ctx.css_class_content(i)));
            }
        }
        if (ctx.Identifier() != null) {
            // cssContentNode.setIdentifierNode(ctx.Identifier().get());
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
        return cssContentNode;
    }

    @Override
    public CssClassContentNode visitCss_class_content(AngularParser.Css_class_contentContext ctx) {
        CssClassContentNode cssClassContentNode = new CssClassContentNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        if (ctx.Identifier() != null) {
            cssClassContentNode.setName(ctx.Identifier().get(0).getText());
        }
        
        // Don't add to symbol table like merge-branch (only build AST)
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
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        ngForNode.setExpressionNode(visitExpression(ctx.expression()));
        
        // Don't add to symbol table like merge-branch (only build AST)
        return ngForNode;
    }

    @Override
    public ASTNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) {
        NgIfNode ngIfNode = new NgIfNode();
        
        // Apply merge-branch approach: build AST only, don't add to symbol table
        ngIfNode.setExpressionNode(visitExpression(ctx.expression()));
        
        // Don't add to symbol table like merge-branch (only build AST)
        return ngIfNode;
    }

    // New State Management Methods
    @Override
    public ASTNode visitStateDeclaration(AngularParser.StateDeclarationContext ctx) {
        // TODO: Implement state declaration logic
        return null;
    }

    @Override
    public ASTNode visitActionDeclaration(AngularParser.ActionDeclarationContext ctx) {
        // TODO: Implement action declaration logic
        return null;
    }

    @Override
    public ASTNode visitStoreDispatch(AngularParser.StoreDispatchContext ctx) {
        // TODO: Implement store dispatch logic
        return null;
    }

    @Override
    public ASTNode visitStoreSelect(AngularParser.StoreSelectContext ctx) {
        // TODO: Implement store select logic
        return null;
    }

    @Override
    public ASTNode visitActionCall(AngularParser.ActionCallContext ctx) {
        // TODO: Implement action call logic
        return null;
    }

    // New Navigation Methods
    @Override
    public ASTNode visitRouterLink(AngularParser.RouterLinkContext ctx) {
        // TODO: Implement router link logic
        return null;
    }

    @Override
    public ASTNode visitRouterOutlet(AngularParser.RouterOutletContext ctx) {
        // TODO: Implement router outlet logic
        return null;
    }

    @Override
    public ASTNode visitRouterNavigate(AngularParser.RouterNavigateContext ctx) {
        // TODO: Implement router navigate logic
        return null;
    }

    @Override
    public ASTNode visitNavigationArray(AngularParser.NavigationArrayContext ctx) {
        // TODO: Implement navigation array logic
        return null;
    }

    // New Angular Template Methods
    @Override
    public ASTNode visitNgModel(AngularParser.NgModelContext ctx) {
        // TODO: Implement ngModel logic
        return null;
    }

    @Override
    public ASTNode visitNgSubmit(AngularParser.NgSubmitContext ctx) {
        // TODO: Implement ngSubmit logic
        return null;
    }

    public ASTNode visitNgClick(AngularParser.NgClickContext ctx) {
        // TODO: Implement ngClick logic
        return null;
    }

    // Additional Required Methods
    @Override
    public ASTNode visitStoreOperation(AngularParser.StoreOperationContext ctx) {
        // TODO: Implement store operation logic
        return null;
    }

    @Override
    public ASTNode visitEnumDeclaration(AngularParser.EnumDeclarationContext ctx) {
        // TODO: Implement enum declaration logic
        return null;
    }

    @Override
    public ASTNode visitAngularTemplate(AngularParser.AngularTemplateContext ctx) {
        // TODO: Implement angular template logic
        return null;
    }

    @Override
    public ASTNode visitStateManagement(AngularParser.StateManagementContext ctx) {
        // TODO: Implement state management logic
        return null;
    }

    @Override
    public ASTNode visitNavigation(AngularParser.NavigationContext ctx) {
        // TODO: Implement navigation logic
        return null;
    }

    // New Method Call Methods
    @Override
    public ASTNode visitMethodCallStatement(AngularParser.MethodCallStatementContext ctx) {
        // TODO: Implement method call statement logic
        return null;
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
}

