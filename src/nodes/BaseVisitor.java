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
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import utils.Logger;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {

    SymbolTable symbolTable = new SymbolTable();
    private String currentScope = "Global";
    Stack<String> scopeStack = new Stack<>();
    private List<String> semanticErrors = new ArrayList<>();
    private Logger logger = Logger.getInstance();

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

    public void printAst() {
        // Reset symbol table and semantic errors for new file
        this.symbolTable = new SymbolTable();
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
            SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable);
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
        logger.info("=== Symbol Table ===");
        this.symbolTable.print();
    }

    public void testFile(String fileName) {
        // Reset symbol table and semantic errors for new file
        this.symbolTable = new SymbolTable();
        this.semanticErrors.clear();
        
        // Try multiple possible file paths for the given filename
        String[] possiblePaths = {
                fileName, // Direct path
                "src/" + fileName, // From project directory
                "test/" + fileName // From test directory if it exists
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
            SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable);
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

            logger.info("=== Symbol Table ===");
            this.symbolTable.print();

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

        logger.info("=== Symbol Table ===");
        this.symbolTable.print();
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
        ComponentNode componentNode = new ComponentNode();
        Row componentRow = new Row();

        // Handle argumentList instead of decorator
        if (ctx.argumentList() != null) {
            ArgumentListNode argumentListNode = visitArgumentList(ctx.argumentList());
            componentNode.setDecorator(new DecoratorNode()); // Create empty decorator for now
            componentRow.setType("Component");
            componentRow.setValue(ctx.argumentList().getText());
            componentRow.setScope(currentScope);
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
        if (ctx.classDeclaration() != null) {
            exportClassNode.setClassNode(visitClassDeclaration(ctx.classDeclaration()));
            exportClassRow.setType("Class");
            exportClassRow.setValue(ctx.classDeclaration().getText());
            exportClassRow.setScope(currentScope);
        }
        symbolTable.getRows().add(exportClassRow);
        return exportClassNode;
    }

    @Override
    public ClassNode visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassNode classNode = new ClassNode();

        // Check if Identifier exists before accessing it
        if (ctx.Identifier() != null) {
            String className = ctx.Identifier().getText();
            classNode.setIdentifier(className);
            addRowToSymbolTable("Class", className, ctx.getText());
            enterScope(className);
        } else {
            // Handle case where class name is missing
            String className = "AnonymousClass";
            classNode.setIdentifier(className);
            addRowToSymbolTable("Class", className, ctx.getText());
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
        for (int i = 0; i < ctx.argumentList().argument().size(); i++) {
            if (ctx.argumentList().argument().get(i) != null) {
                decoratorNode.getArguments().add(visitArgumentList(ctx.argumentList()));
                decoratorRow.setType("Decorator List");
                decoratorRow.setValue(ctx.argumentList().argument().get(i).getText());
            }
        }
        symbolTable.getRows().add(decoratorRow);
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
                
                // Check if Identifier exists before accessing it
                if (ctx.argument().get(i).Identifier() != null) {
                    argumentListRow.setName(ctx.argument().get(i).Identifier().getText());
                } else {
                    argumentListRow.setName("anonymousArg");
                }
                
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
        
        // Check if Identifier exists before accessing it
        if (ctx.Identifier() != null) {
            String name = ctx.Identifier().getText();
            node.setName(name);
            if (ctx.literalValue() != null) {
                node.setValue(visitLiteralValue(ctx.literalValue()));
            }
            addRowToSymbolTable("Argument", name, "value");
        } else {
            // Handle case where argument name is missing
            String name = "anonymousArg";
            node.setName(name);
            if (ctx.literalValue() != null) {
                node.setValue(visitLiteralValue(ctx.literalValue()));
            }
            addRowToSymbolTable("Argument", name, "value");
        }
        
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
        Row variableRow = new Row();
        
        if (ctx.Identifier() != null) {
            String varName = ctx.Identifier().getText();
            variableRow.setType("Variable Declaration");
            variableRow.setName(varName);
            variableRow.setScope(currentScope);
            symbolTable.getRows().add(variableRow);
            variableDeclarationNode.setIdentifier(varName);
        } else {
            // Handle case where identifier is missing
            String varName = "anonymousVariable";
            variableRow.setType("Variable Declaration");
            variableRow.setName(varName);
            variableRow.setScope(currentScope);
            symbolTable.getRows().add(variableRow);
            variableDeclarationNode.setIdentifier(varName);
        }
        
        if (ctx.type() != null) {
            variableDeclarationNode.setType(visitType(ctx.type()));
        }
        
        if (ctx.expression() != null) {
            variableDeclarationNode.setExpression(visitExpression(ctx.expression()));
            Row exprRow = new Row();
            exprRow.setType("Variable Expression");
            
            // Check if Identifier exists before accessing it
            if (ctx.Identifier() != null) {
                exprRow.setName(ctx.Identifier().getText());
            } else {
                exprRow.setName("anonymousVariable");
            }
            
            exprRow.setScope(currentScope);
            exprRow.setValue(ctx.expression().getText());
            symbolTable.getRows().add(exprRow);
        }
        
        // Handle template strings specifically
        if (ctx.templateString() != null) {
            visitTemplateString(ctx.templateString());
        }
        
        return variableDeclarationNode;
    }

    public ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        Row expressionRow = new Row();
        
        // Handle expression text
        if (ctx.getText() != null && !ctx.getText().isEmpty()) {
            expressionNode.setOperator(ctx.getText());
            expressionRow.setType("Expression");
            expressionRow.setName(ctx.getText());
            expressionRow.setValue(ctx.getText());
            expressionRow.setScope(currentScope);
        }
        
        symbolTable.getRows().add(expressionRow);
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
        
        String arrayName = ctx.Identifier() != null ? ctx.Identifier().getText() : "anonymousArray";
        List<String> arrayValues = new ArrayList<>();
        
        if (ctx.type() != null) {
            arrayDeclarationNode.setType(visitType(ctx.type()));
        }
        
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
        
        if (ctx.Identifier() != null && ctx.Identifier().size() >= 2) {
            objectDeclarationNode.setIdentifier(ctx.Identifier().get(0).getText());
            addRowToSymbolTable("Object", ctx.Identifier().get(0).getText(), ctx.Identifier().get(1).getText());
            
            // Check if the second identifier exists before checking import
            if (ctx.Identifier().get(1) != null) {
                if (!symbolTable.isImported(ctx.Identifier().get(1).getText())) {
                    logger.error("Semantic Error: Class '" + ctx.Identifier().get(1).getText() + "' used but not imported.");
                }
            }
        } else {
            // Handle case where identifiers are missing
            objectDeclarationNode.setIdentifier("anonymousObject");
            addRowToSymbolTable("Object", "anonymousObject", "unknown");
        }
        
        return objectDeclarationNode;
    }

    @Override
    public LiteralValueNode visitLiteralValue(AngularParser.LiteralValueContext ctx) {
        LiteralValueNode literalValueNode = new LiteralValueNode();
        if (ctx.StringLiteral() != null) {
            String stringValue = ctx.StringLiteral().getText();
            literalValueNode.setStirngValue(stringValue);
            addRowToSymbolTable("String", stringValue, stringValue);
            
            // Check if this string contains HTML-like content for semantic analysis
            if (stringValue.contains("<") && stringValue.contains(">")) {
                analyzeStringForSemanticErrors(stringValue);
            }
        }
        if (ctx.templateString() != null) {
            // Handle template strings specifically
            String templateContent = ctx.templateString().getText();
            literalValueNode.setStirngValue(templateContent);
            addRowToSymbolTable("Template String", templateContent, templateContent);
            
            // Analyze template string content for semantic errors
            analyzeTemplateStringForSemanticErrors(templateContent);
        }
        if (ctx.NumberLiteral() != null) {
            literalValueNode.setNumValue(ctx.NumberLiteral().getText());
            addRowToSymbolTable("Number", ctx.NumberLiteral().getText(), ctx.NumberLiteral().getText());
        }
        if (ctx.BooleanLiteral() != null) {
            literalValueNode.setBooleanValue(ctx.BooleanLiteral().getText());
            addRowToSymbolTable("Boolean", ctx.BooleanLiteral().getText(), ctx.BooleanLiteral().getText());
        } else {
            literalValueNode.setNull(true);
        }
        if (ctx.listLiteral() != null) {
            literalValueNode.setListLiteralNode(visitListLiteral(ctx.listLiteral()));
            addRowToSymbolTable("List", ctx.listLiteral().getText(), ctx.listLiteral().getText());
        }
        if (ctx.html() != null) {
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
        
        // Check if Identifier exists before accessing it
        if (ctx.Identifier() != null) {
            assignmentStatementNode.setIdentifier(ctx.Identifier().getText());
        } else {
            assignmentStatementNode.setIdentifier("anonymousAssignment");
        }
        
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
        
        String identifier = ctx.Identifier() != null ? ctx.Identifier().getText() : "anonymousAssignment";
        addRowToSymbolTable("Assignment", identifier, values.toString());
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
        logger.debug("ddddd");
        HtmlNode htmlNode = new HtmlNode();
        Row htmlRow = new Row();
        if (ctx.html_content() != null) {
            htmlNode.setContent(visitHtml_content(ctx.html_content()));
            htmlRow.setType("Content");
            htmlRow.setValue(ctx.html_content().getText());
            
            // Run semantic analysis on HTML content
            try {
                ParseTreeWalker walker = new ParseTreeWalker();
                SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable);
                walker.walk(analyzer, ctx);
                
                // Add any semantic errors found
                semanticErrors.addAll(analyzer.getSemanticErrors());
            } catch (Exception e) {
                logger.error("Error during HTML semantic analysis: " + e.getMessage());
            }
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
            // htmlAttributeNode.setHtmlAttributeValueNode(visitHtml_attribute_value(ctx.html_attribute_value()));
        }
        if (ctx.access_suffix() != null) {
            for (int i = 0; i < ctx.access_suffix().size(); i++) {
                htmlAttributeNode.getAccessSufNode().add(visitAccess_suffix(ctx.access_suffix().get(i)));
                htmlAttributeRow.setType("Access Suffix");
                htmlAttributeRow.setValue(ctx.access_suffix().get(i).getText());
            }
        }
        if (ctx.Identifier() != null) {
            // htmlAttributeNode.setClassNode(visitClass(ctx.Identifier().getText()));
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
            // cssContentNode.setIdentifierNode(ctx.Identifier().get());
            cssContentRow.setType("Identifier");
            // cssContentRow.setValue(ctx.Identifier().getText());
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
        addRowToSymbolTable("NgFor", "*NgFor", ctx.expression().getText());
        return ngForNode;
    }

    @Override
    public ASTNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) {
        NgIfNode ngIfNode = new NgIfNode();
        ngIfNode.setExpressionNode(visitExpression(ctx.expression()));
        addRowToSymbolTable("NgIf", "*NgIf", ctx.expression().getText());
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
            SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable);
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
                SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable);
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
            SemanticAnalyzer analyzer = new SemanticAnalyzer(this.symbolTable);
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
