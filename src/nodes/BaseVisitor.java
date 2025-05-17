package nodes;

import java.io.IOException;

import gen.AngularLexer;
import gen.AngularParser;
import gen.AngularParserVisitor;
import nodes.css_node.CssClassContentNode;
import nodes.css_node.CssContentNode;
import nodes.css_node.CssNode;
import nodes.html_node.*;
import nodes.statement.*;
import nodes.statement.HtmlElementNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class BaseVisitor extends AbstractParseTreeVisitor<ASTNode> implements AngularParserVisitor<ASTNode> {

    SymbolTable symbolTable = new SymbolTable();

    public void printAst() {
        String source = "D:\\\\Spring projects\\\\Learn\\\\angular_compiler\\\\src\\\\angular_compiler.txt";
        CharStream cs = null;
        try {
            cs = fromFileName(source);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        ProgramNode programNode = (ProgramNode) new BaseVisitor().visitProgram(parser.program());
        System.out.println(programNode);
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
        symbolTable.getRows().add(row);
        this.symbolTable.print();
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
            statementRow.setName(ctx.class_().getText());
        }
        if (ctx.arrayDeclaration() != null) {
            ArrayDeclarationNode arrayDeclarationNode = visitArrayDeclaration(ctx.arrayDeclaration());
            statement.setArrayDeclarationNodeList(arrayDeclarationNode);
            statementRow.setType("Array Declaration");
            statementRow.setValue(ctx.arrayDeclaration().getText());
            statementRow.setScope("Global");
            statementRow.setName(ctx.arrayDeclaration().getText());
        }
        if (ctx.variableDeclaration() != null) {
            VariableDeclarationNode variableDeclarationNode = visitVariableDeclaration(ctx.variableDeclaration());
            statement.setVariableDeclarationNodes(variableDeclarationNode);
            statementRow.setType("Variable Declaration");
            statementRow.setValue(ctx.variableDeclaration().getText());
            statementRow.setScope("Global");
            statementRow.setName(ctx.variableDeclaration().getText());
        }
        if (ctx.functionDeclaration() != null) {
            FunctionDeclarationNode functionDeclarationNode = visitFunctionDeclaration(ctx.functionDeclaration());
            statement.setFunctionDeclarationNodes(functionDeclarationNode);
            statementRow.setType("Function Declaration");
            statementRow.setValue(ctx.functionDeclaration().getText());
            statementRow.setScope("Global");
            statementRow.setName(ctx.getText());
        }
        if (ctx.ifStatement() != null) {
            IfStatementNode ifStatementNode = visitIfStatement(ctx.ifStatement());
            statement.setIfStatementNodes(ifStatementNode);
            statementRow.setType("If Statement");
            statementRow.setValue(ctx.ifStatement().getText());
            statementRow.setScope("Global");
        }
        if (ctx.whileStatement() != null) {
            WhileStatementNode whileStatementNode = visitWhileStatement(ctx.whileStatement());
            statement.setWhileStatementNodes(whileStatementNode);
            statementRow.setType("While Statement");
            statementRow.setValue(ctx.whileStatement().getText());
            statementRow.setScope("Global");
        }
        if (ctx.assignmentStatement() != null) {
            AssignmentStatementNode assignmentStatementNode = visitAssignmentStatement(ctx.assignmentStatement());
            statement.setAssignmentStatementNodes(assignmentStatementNode);
            statementRow.setType("Assignment Statement");
            statementRow.setValue(ctx.assignmentStatement().getText());
            statementRow.setScope("Global");
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
        if (ctx.html() != null) {
            HtmlElementNode htmlElementNode = visitHtml_element(ctx.html_element());
            statement.setHtmlElementNodes(htmlElementNode);
            statementRow.setType("Html Element");
            statementRow.setScope("Global");
            statementRow.setName(ctx.getText());
//            statementRow.setValue(ctx.html_element().getText());
        }
        if (ctx.importStatement() != null) {
            ImportStatementNode importStatementNode = visitImportStatement(ctx.importStatement());
            statement.setImportStatementNodes(importStatementNode);
            statementRow.setType("Import Statement");
            statementRow.setValue(ctx.importStatement().getText());
            statementRow.setScope("Global");
            statementRow.setName(ctx.getText());
        }
        if (ctx.component() != null) {
            ComponentNode componentNode = visitComponent(ctx.component());
            statement.setComponentNodes(componentNode);
            statementRow.setType("Component");
            statementRow.setValue(ctx.component().getText());
            statementRow.setScope("Global");
//           statementRow.setName(ctx.importStatement().getText());

        }
        if (ctx.exportClass() != null) {
            ExportClassNode exportClassNode = visitExportClass(ctx.exportClass());
            statement.setExportClassNode(exportClassNode);
            statementRow.setType("Export Class");
            statementRow.setValue(ctx.exportClass().getText());
            statementRow.setScope("Global");

        }
        if (ctx.html() != null) {
            HtmlNode htmlNode = visitHtml(ctx.html());
            statement.setHtmlNodes(htmlNode);
            statementRow.setType("Html");
            statementRow.setValue(ctx.html().getText());
            statementRow.setScope("Global");

        }
        symbolTable.getRows().add(statementRow);
        return statement;
    }

    @Override
    public ComponentNode visitComponent(AngularParser.ComponentContext ctx) {
        ComponentNode componentNode = new ComponentNode();
        Row componentRow = new Row();
        if (ctx.decorator() != null) {
            DecoratorNode decoratorNode = visitDecorator(ctx.decorator());
            componentNode.setDecorator(decoratorNode);
            componentRow.setType("Decorator");
            componentRow.setValue(ctx.decorator().getText());
            componentRow.setScope("Global");


        }
        if (ctx.exportClass() != null) {
            componentNode.setExportClass(visitExportClass(ctx.exportClass()));
            componentRow.setType("Export Class");
            componentRow.setValue(ctx.exportClass().getText());
            componentRow.setScope("Global");
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
            exportClassRow.setScope("Global");
        }
        symbolTable.getRows().add(exportClassRow);
        return exportClassNode;
    }

    @Override
    public ClassNode visitClass(AngularParser.ClassContext ctx) {
        ClassNode classNode = new ClassNode();
        if (ctx.Identifier() != null) {
            classNode.setIdentifier(ctx.Identifier().getText());
        }
        if (ctx.classBody() != null) {
            classNode.setClassBody(visitClassBody(ctx.classBody()));
        }
        Row classRow = new Row();
        classRow.setType(ctx.Identifier().getText());
        if (ctx.classBody() != null)
            classRow.setValue("Class Body");
        classRow.setScope("Global");
        symbolTable.getRows().add(classRow);
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
                classBodyRow.setScope("Global");

            }
        }
        for (int i = 0; i < ctx.functionDeclaration().size(); i++) {
            if (ctx.functionDeclaration().get(i) != null) {
                classBodyNode.getFunctionDeclarationNodes().add(visitFunctionDeclaration(ctx.functionDeclaration(i)));
                classBodyRow.setType("Function Declaration");
                classBodyRow.setValue(ctx.functionDeclaration().get(0).getText());
                classBodyRow.setScope("Global");

            }
        }
        for (int i = 0; i < ctx.arrayDeclaration().size(); i++) {
            if (ctx.arrayDeclaration().get(i) != null) {
                classBodyNode.getArrayDeclarationNodeList().add(visitArrayDeclaration(ctx.arrayDeclaration(i)));
                classBodyRow.setType("Array Declaration");
                classBodyRow.setValue(ctx.arrayDeclaration().get(0).getText());
                classBodyRow.setScope("Global");
            }
        }
        for (int i = 0; i < ctx.objectDeclataion().size(); i++) {
            if (ctx.objectDeclataion().get(i) != null) {
                classBodyNode.getObjectDeclarationNodes().add(visitObjectDeclataion(ctx.objectDeclataion(i)));
                classBodyRow.setType("Array Declaration");
                classBodyRow.setValue(ctx.arrayDeclaration().get(0).getText());
                classBodyRow.setScope("Global");
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
                argumentListRow.setValue(ctx.argument().get(i).getText());
                argumentListRow.setScope("Global");
            }
        }
        symbolTable.getRows().add(argumentListRow);
        return argumentListNode;
    }

    @Override
    public ArgumentNode visitArgument(AngularParser.ArgumentContext ctx) {
        ArgumentNode argumentNode = new ArgumentNode();
        Row argumentRow = new Row();
        if (ctx.Identifier() != null) {
            argumentNode.setName(ctx.Identifier().getText());
            argumentRow.setType("Agrument");
            argumentRow.setValue(ctx.getText());
            argumentRow.setScope("Global");
        }
        symbolTable.getRows().add(argumentRow);
        return argumentNode;

    }

    @Override
    public ImportStatementNode visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatementNode importStatementNode = new ImportStatementNode();
        Row importRow = new Row();
        if (ctx.Identifier() != null) {
            importStatementNode.setIdentifier(ctx.Identifier().getText());
            importRow.setType("Import");
            importRow.setValue(ctx.Identifier().getText());
            importRow.setScope("Global");
        }
        if (ctx.StringLiteral() != null) {
            importStatementNode.setSource(ctx.StringLiteral().getText());
            importRow.setType("Import from");
            importRow.setValue(ctx.StringLiteral().getText());
            importRow.setScope("Global");

        }
        symbolTable.getRows().add(importRow);
        return importStatementNode;
    }

    @Override
    public ASTNode visitThisVarible(AngularParser.ThisVaribleContext ctx) {
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
    public VariableDeclarationNode visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclarationNode variableDeclarationNode = new VariableDeclarationNode();
        Row variableRow = new Row();
        if (ctx.Identifier() != null) {
            variableDeclarationNode.setIdentifier(ctx.Identifier().getText());
            variableRow.setType("Variable Declaration");
            variableRow.setValue(ctx.Identifier().getText());
            variableRow.setScope("Global");

        }
        if (ctx.type() != null) {
            variableDeclarationNode.setType(visitType(ctx.type()));
            variableRow.setType("Variable Type");
            variableRow.setValue(ctx.type().getText());
            variableRow.setScope("Global");
        }
        if (ctx.expression() != null) {
            variableDeclarationNode.setExpression(visitExpression(ctx.expression()));
            variableRow.setType("Variable Expression");
            variableRow.setValue(ctx.expression().getText());
            variableRow.setScope("Global");
        }
        symbolTable.getRows().add(variableRow);
        return variableDeclarationNode;
    }

    private ExpressionNode visitExpression(AngularParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        Row expressionRow = new Row();
        if (expressionNode.operator != null) {
            expressionNode.setOperator(ctx.getText());
            expressionRow.setType("Operator");
            expressionRow.setValue(ctx.getText());
            expressionRow.setScope("Global");
        }
        if (expressionNode.left != null) {
            expressionNode.setLeft(expressionNode.left);
            expressionRow.setType("Left");
            expressionRow.setValue(expressionNode.left.toString());
            expressionRow.setScope("Global");
        }
        if (expressionNode.right != null) {
            expressionNode.setRight(expressionNode.right);
            expressionRow.setType("Right");
            expressionRow.setValue(expressionNode.right.toString());
            expressionRow.setScope("Global");
        }
        symbolTable.getRows().add(expressionRow);
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
            arrayDeclarationRow.setScope("Global");
        }
        if (ctx.type() != null) {
            arrayDeclarationNode.setType(visitType(ctx.type()));
            arrayDeclarationRow.setType("Array Type");
            arrayDeclarationRow.setValue(ctx.type().getText());
            arrayDeclarationRow.setScope("Global");
        }
        symbolTable.getRows().add(arrayDeclarationRow);
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
            functionDeclarationRow.setScope("Global");
        }
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter().get(i) != null) {
                functionDeclarationNode.getParameters().add(visitParameter(ctx.parameter(i)));
                functionDeclarationRow.setType("Function Parameter");
                functionDeclarationRow.setValue(ctx.parameter().get(0).getText());
                functionDeclarationRow.setScope("Global");
            }
        }
        symbolTable.getRows().add(functionDeclarationRow);
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
            typeRow.setScope("Global");
        }
        if (ctx.TypeBoolean() != null) {
            typeNode.setAnboolean(ctx.TypeBoolean().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.TypeBoolean().getText());
            typeRow.setScope("Global");
        }
        if (ctx.TypeString() != null) {
            typeNode.setString(ctx.TypeString().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.TypeString().getText());
            typeRow.setScope("Global");
        }
        if (ctx.Array() != null) {
            typeNode.setArray(ctx.Array().getText());
            typeRow.setType("Type");
            typeRow.setValue(ctx.Array().getText());
            typeRow.setScope("Global");
        }
        symbolTable.getRows().add(typeRow);
        return typeNode;
    }

    @Override
    public ObjectDeclarationNode visitObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) {
        ObjectDeclarationNode objectDeclarationNode = new ObjectDeclarationNode();
        if (ctx.Identifier() != null) {
            objectDeclarationNode.setIdentifier(ctx.Identifier().toString());
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
            literalValueRow.setScope("Global");
        }
        if (ctx.NumberLiteral() != null) {
            literalValueNode.setNumValue(ctx.NumberLiteral().getText());
            literalValueRow.setType("Number");
            literalValueRow.setValue(ctx.NumberLiteral().getText());
            literalValueRow.setScope("Global");
        }
        if (ctx.BooleanLiteral() != null) {
            literalValueNode.setBooleanValue(ctx.BooleanLiteral().getText());
            literalValueRow.setType("Boolean");
            literalValueRow.setValue(ctx.BooleanLiteral().getText());
            literalValueRow.setScope("Global");
        }
        if (ctx.Null().getText() == "true") {
            literalValueNode.setNull(false);
        } else {
            literalValueNode.setNull(true);
        }
        if (ctx.listLiteral() != null) {
            literalValueNode.setListLiteralNode(visitListLiteral(ctx.listLiteral()));
            literalValueRow.setType("List");
            literalValueRow.setValue(ctx.listLiteral().getText());
            literalValueRow.setScope("Global");
        }
        symbolTable.getRows().add(literalValueRow);
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
                listLiteralRow.setScope("Global");
            }
        }
        symbolTable.getRows().add(listLiteralRow);
        return listLiteralNode;
    }

    @Override
    public AssignmentStatementNode visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx) {
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
            identifierRow.setScope("Global");
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
        return null;
    }

    @Override
    public ASTNode visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx) {
        return null;
    }
}
