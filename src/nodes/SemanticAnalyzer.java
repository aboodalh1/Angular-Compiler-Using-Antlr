package nodes;

import gen.AngularParser;
import gen.AngularParserBaseListener;
import nodes.SymbolTables.ComponentSymbolTable;
import nodes.SymbolTables.ServiceSemanticValidator;
import nodes.SymbolTables.mainSymbolTable;

import java.util.ArrayList;
import java.util.List;

import static helper.keyWords.*;

public class SemanticAnalyzer extends AngularParserBaseListener {
    private mainSymbolTable symbolTable;
    private final ServiceSemanticValidator serviceSymbolTable;
    private final ComponentSymbolTable componentSymbolTable;
    private final List<String> semanticErrors = new ArrayList<>();

    public SemanticAnalyzer(ServiceSemanticValidator serviceSymbolTable, ComponentSymbolTable componentSymbolTable) {
        this.serviceSymbolTable = serviceSymbolTable;
        this.componentSymbolTable = componentSymbolTable;
    }

    public SemanticAnalyzer(mainSymbolTable symbolTable, ServiceSemanticValidator serviceSymbolTable, ComponentSymbolTable componentSymbolTable) {
        this.symbolTable = symbolTable;
        this.serviceSymbolTable = serviceSymbolTable;
        this.componentSymbolTable = componentSymbolTable;
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

        // If element has both *ngIf and *ngFor, raise an error
        if (ngIfCount > 0 && ngForCount > 0) {
            semanticErrors.add("Semantic Error: Element cannot have both *ngIf and *ngFor at the same time. Consider wrapping with <ng-container>.");
        }
    }

    @Override
    public void enterImportStatement(AngularParser.ImportStatementContext ctx) {
        String importedClass = ctx.Identifier().getText();
//        symbolTable.addImport(importedClass);
    }

    @Override
    public void enterObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) {

        if (ctx.Identifier() == null || ctx.Identifier().size() != 2) {
            semanticErrors.add("Syntax Error: Invalid object declaration structure found: " + ctx.getText());
            return;
        }

        String className = ctx.Identifier(1).getText();
//        if (!symbolTable.isImported(className)) {
//            semanticErrors.add("Semantic Error: Class '" + className + "' used but not imported.");
//        }
    }

    @Override
    public void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        String varName = ctx.Identifier().getText();
        String currentScope = GLOBAL; // Use your scope system if more advanced
//        if (symbolTable.variableExistsInScope(varName, currentScope)) {
//            semanticErrors.add("Semantic Error: Duplicate variable declaration in the same scope: " + varName);
//        }
        if (ctx.type() != null) {
            String type = ctx.type().getText();
//            if (!isPrimitiveType(type) && !symbolTable.isImported(type)) {
//                semanticErrors.add("Semantic Error: Type '" + type + "' used but not imported.");
//            }
        }
    }

    @Override
    public void enterComponent(AngularParser.ComponentContext ctx) {
        System.out.println("CHCKenterComponent");
        // --- Provider Semantic Check ---
        if (ctx.decorator() != null && ctx.decorator().argumentList() != null) {
            for (AngularParser.ArgumentContext arg : ctx.decorator().argumentList().argument()) {
                if (PROVIDERS.equals(arg.Identifier().getText()) && arg.literalValue() != null) {
                    // This assumes the providers are listed in a list literal
                    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("[A-Za-z_][A-Za-z0-9_]*").matcher(arg.literalValue().getText());
                    while (matcher.find()) {
                        String providerName = matcher.group();
                        // Keywords like 'provide', 'useClass', etc., are ignored
                        if (!USE_EXISTING.equals(providerName) && !USE_CLASS.equals(providerName) && !PROVIDE.equals(providerName)) {
                            if (!serviceSymbolTable.isServiceDeclared(providerName, GLOBAL)) {
                                semanticErrors.add("Semantic Error: Service '" + providerName + "' is not provided. It must be declared in a module or component.");
                            }
                        }
                    }
                }
            }
        }
        checkTemplateAndTemplateUrlConflict(ctx);
    }

    private void checkTemplateAndTemplateUrlConflict(AngularParser.ComponentContext ctx) {
        if (ctx.decorator() != null && ctx.decorator().argumentList() != null) {
            boolean hasTemplate = false;
            boolean hasTemplateUrl = false;

            for (AngularParser.ArgumentContext arg : ctx.decorator().argumentList().argument()) {

                String argName = arg.Identifier().getText();

                if (TEMPLATE.equals(argName)) {
                    hasTemplate = true;
                } else if (TEMPLATE_URL.equals(argName)) {
                    hasTemplateUrl = true;
                }
            }

            if (hasTemplate && hasTemplateUrl) {
                semanticErrors.add("Semantic Error: Component cannot have both 'template' and 'templateUrl' properties.");
            }
        }
    }

    private boolean isPrimitiveType(String type) {
        return type.equals("number") || type.equals("string") || type.equals("boolean") ||
                type.equals("any") || type.equals("Array");
    }
}