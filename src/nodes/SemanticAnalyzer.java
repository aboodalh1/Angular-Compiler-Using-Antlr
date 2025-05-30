package nodes;

import gen.AngularParser;
import gen.AngularParserBaseListener;
import java.util.ArrayList;
import java.util.List;

public class SemanticAnalyzer extends AngularParserBaseListener {
    private SymbolTable symbolTable;
    private List<String> semanticErrors = new ArrayList<>();

    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public List<String> getSemanticErrors() {
        return semanticErrors;
    }

    @Override
    public void enterImportStatement(AngularParser.ImportStatementContext ctx) {
        String importedClass = ctx.Identifier().getText();
        symbolTable.addImport(importedClass);
    }

    @Override
    public void enterObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) {
        String className = ctx.Identifier(1).getText();
        if (!symbolTable.isImported(className)) {
            semanticErrors.add("Semantic Error: Class '" + className + "' used but not imported.");
            System.err.printf("error: %s\n", "Semantic Error: Class '" + className + "' used but not imported.");
        }
    }

    @Override
    public void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        if (ctx.type() != null) {
            String type = ctx.type().getText();
            if (!isPrimitiveType(type) && !symbolTable.isImported(type)) {
                semanticErrors.add("Semantic Error: Type '" + type + "' used but not imported.");
            }
        }
    }

    private boolean isPrimitiveType(String type) {
        return type.equals("number") || type.equals("string") || type.equals("boolean") ||
                type.equals("any") || type.equals("Array");
    }
}