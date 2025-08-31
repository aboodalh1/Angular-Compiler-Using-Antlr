package nodes;

import gen.AngularParser;
import gen.AngularParserBaseListener;
import nodes.SymbolTables.ComponentSymbolTable;
import nodes.SymbolTables.ServiceSemanticValidator;
import nodes.SymbolTables.mainSymbolTable;
import nodes.SymbolTables.ImportSymbolTable;
import nodes.SymbolTables.VariableSymbolTable;
import nodes.SymbolTables.TypeSymbolTable;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

import static helper.keyWords.*;

public class SemanticAnalyzer extends AngularParserBaseListener {
    private mainSymbolTable symbolTable;
    private final ServiceSemanticValidator serviceSymbolTable;
    private final ComponentSymbolTable componentSymbolTable;
    private final ImportSymbolTable importSymbolTable;
    private final VariableSymbolTable variableSymbolTable;
    private final TypeSymbolTable typeSymbolTable;
    private final List<String> semanticErrors = new ArrayList<>();

    public SemanticAnalyzer(ServiceSemanticValidator serviceSymbolTable, ComponentSymbolTable componentSymbolTable) {
        this.serviceSymbolTable = serviceSymbolTable;
        this.componentSymbolTable = componentSymbolTable;
        this.importSymbolTable = new ImportSymbolTable();
        this.variableSymbolTable = new VariableSymbolTable();
        this.typeSymbolTable = new TypeSymbolTable();
    }

    public SemanticAnalyzer(mainSymbolTable symbolTable, ServiceSemanticValidator serviceSymbolTable, ComponentSymbolTable componentSymbolTable) {
        this.symbolTable = symbolTable;
        this.serviceSymbolTable = serviceSymbolTable;
        this.componentSymbolTable = componentSymbolTable;
        this.importSymbolTable = new ImportSymbolTable();
        this.variableSymbolTable = new VariableSymbolTable();
        this.typeSymbolTable = new TypeSymbolTable();
    }

    public SemanticAnalyzer(mainSymbolTable symbolTable, ServiceSemanticValidator serviceSymbolTable, ComponentSymbolTable componentSymbolTable, ImportSymbolTable importSymbolTable, VariableSymbolTable variableSymbolTable, TypeSymbolTable typeSymbolTable) {
        this.symbolTable = symbolTable;
        this.serviceSymbolTable = serviceSymbolTable;
        this.componentSymbolTable = componentSymbolTable;
        this.importSymbolTable = importSymbolTable;
        this.variableSymbolTable = variableSymbolTable;
        this.typeSymbolTable = typeSymbolTable;
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
        if (ctx.Identifier() != null && !ctx.Identifier().isEmpty()) {
            String importedClass = ctx.Identifier().get(0).getText();
            try {
                importSymbolTable.insertImport(importedClass, GLOBAL);
            } catch (RuntimeException e) {
                semanticErrors.add(e.getMessage());
            }
        }
    }

    @Override
    public void enterObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) {
        if (ctx.Identifier() == null || ctx.Identifier().size() != 2) {
            semanticErrors.add("Syntax Error: Invalid object declaration structure found: " + ctx.getText());
            return;
        }

        String className = ctx.Identifier(1).getText();
        if (!importSymbolTable.isPrimitiveType(className) && !importSymbolTable.isImported(className, GLOBAL)) {
            semanticErrors.add("Semantic Error: Class '" + className + "' used but not imported.");
        }
    }

    @Override
    public void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        if (ctx.Identifier() != null) {
            String varName = ctx.Identifier().getText();
            String currentScope = GLOBAL; // Use your scope system if more advanced
            
            if (variableSymbolTable.variableExistsInScope(varName, currentScope)) {
                semanticErrors.add("Semantic Error: Duplicate variable declaration in the same scope: " + varName);
            } else {
                String type = "any"; // default type
                if (ctx.type() != null) {
                    type = ctx.type().getText();
                    if (!typeSymbolTable.isPrimitiveType(type) && !importSymbolTable.isImported(type, GLOBAL)) {
                        semanticErrors.add("Semantic Error: Type '" + type + "' used but not imported.");
                    }
                }
                try {
                    variableSymbolTable.insertVariable(varName, type, currentScope);
                } catch (RuntimeException e) {
                    semanticErrors.add(e.getMessage());
                }
            }
        }
    }

    @Override
    public void enterComponent(AngularParser.ComponentContext ctx) {
        System.out.println("CHCKenterComponent");
        // --- Provider Semantic Check ---
        if (ctx.argumentList() != null) {
            // Process decorator properties
            // For now, skip provider checking since decorator structure is different
        }
        checkTemplateAndTemplateUrlConflict(ctx);
    }

    private void checkTemplateAndTemplateUrlConflict(AngularParser.ComponentContext ctx) {
        if (ctx.argumentList() != null) {
            // Process decorator properties
            // For now, skip template conflict checking since decorator structure is different
        }
    }

    private boolean isPrimitiveType(String type) {
        return typeSymbolTable.isPrimitiveType(type);
    }

    // Getter methods for the symbol tables
    public ImportSymbolTable getImportSymbolTable() {
        return importSymbolTable;
    }

    public VariableSymbolTable getVariableSymbolTable() {
        return variableSymbolTable;
    }

    public TypeSymbolTable getTypeSymbolTable() {
        return typeSymbolTable;
    }
}