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
    public void enterHtml_element(AngularParser.Html_elementContext ctx) {
        int ngIfCount = 0;
        int ngForCount = 0;

        if (ctx.html_attributes() != null) {
            for (AngularParser.Html_attributeContext attrCtx : ctx.html_attributes().html_attribute()) {
                if (attrCtx.ngIfAttribute() != null) {
                    ngIfCount++;
                }
                if (attrCtx.ngForAttribute() != null) {
                    ngForCount++;
                }
            }
        }

        // إذا العنصر فيه *ngIf و *ngFor معًا، منرفع خطأ
        if (ngIfCount > 0 && ngForCount > 0) {
            semanticErrors.add("Semantic Error: Element cannot have both *ngIf and *ngFor at the same time. Consider wrapping with <ng-container>.");
            System.err.println("Semantic Error: Element cannot have both *ngIf and *ngFor at the same time. Consider wrapping with <ng-container>.");
        }
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
        String varName = ctx.Identifier().getText();
        String currentScope = "Global"; // استخدم نظام النطاق لديك إذا كان متقدماً
        if (symbolTable.variableExistsInScope(varName, currentScope)) {
            semanticErrors.add("Semantic Error: Duplicate variable declaration in the same scope: " + varName);
            System.err.println("Semantic Error: Duplicate variable declaration in the same scope: " + varName);
        }
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