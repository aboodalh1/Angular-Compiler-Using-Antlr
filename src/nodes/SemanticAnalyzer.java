package nodes;

import gen.AngularParser;
import gen.AngularParserBaseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import utils.Logger;

public class SemanticAnalyzer extends AngularParserBaseListener {
    private SymbolTable symbolTable;
    private List<String> semanticErrors = new ArrayList<>();
    private Logger logger = Logger.getInstance();
    
    // نظام تتبع منفصل للمتغيرات - لا يعتمد على SymbolTable
    private final Map<String, Set<String>> declaredVars = new HashMap<>();
    private String currentScope = "Global";
    private Stack<String> scopeStack = new Stack<>();

    public SemanticAnalyzer(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public List<String> getSemanticErrors() {
        return semanticErrors;
    }
    
    // إعادة تعيين النظام المحلي عند بدء تحليل ملف جديد
    public void reset() {
        declaredVars.clear();
        semanticErrors.clear();
        currentScope = "Global";
        scopeStack.clear();
    }
    
    private void enterScope(String newScope) {
        scopeStack.push(newScope);
        this.currentScope = newScope;
    }
    
    private void exitScope() {
        if (!scopeStack.isEmpty()) {
            scopeStack.pop();
            currentScope = scopeStack.isEmpty() ? "Global" : scopeStack.peek();
        }
    }

    @Override
    public void enterHtml_element(AngularParser.Html_elementContext ctx) {
        int ngIfCount = 0;
        int ngForCount = 0;

        if (ctx.html_attributes() != null) {
            for (AngularParser.Html_attributeContext attrCtx : ctx.html_attributes().html_attribute()) {
                if (attrCtx.ngIfAttribute() != null || attrCtx.NgIfDirective() != null) {
                    ngIfCount++;
                }
                if (attrCtx.ngForAttribute() != null || attrCtx.NgForDirective() != null) {
                    ngForCount++;
                }
            }
        }

        // إذا العنصر فيه *ngIf و *ngFor معًا، منرفع خطأ
        if (ngIfCount > 0 && ngForCount > 0) {
            semanticErrors.add("Semantic Error: Element cannot have both *ngIf and *ngFor at the same time. Consider wrapping with <ng-container>.");
            logger.error("Semantic Error: Element cannot have both *ngIf and *ngFor at the same time. Consider wrapping with <ng-container>.");
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
            logger.error("Semantic Error: Class '" + className + "' used but not imported.");
        }
    }
    
    @Override
    public void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        if (ctx.Identifier() != null) {
            String functionName = ctx.Identifier().getText();
            enterScope(functionName);
        }
    }
    
    @Override
    public void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        exitScope();
    }
    
    @Override
    public void enterParameter(AngularParser.ParameterContext ctx) {
        if (ctx.type() != null) {
            String type = ctx.type().getText();
            if (!isPrimitiveType(type) && !symbolTable.isImported(type)) {
                semanticErrors.add("Semantic Error: Type '" + type + "' used in parameter but not imported.");
                logger.error("Semantic Error: Type '" + type + "' used in parameter but not imported.");
            }
        }
    }

    @Override
    public void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        String varName = ctx.Identifier().getText();
        
        // استخدم النظام المحلي بدلاً من SymbolTable لتجنب التضارب
        Set<String> inScope = declaredVars.computeIfAbsent(currentScope, k -> new HashSet<>());
        if (inScope.contains(varName)) {
            semanticErrors.add("Semantic Error: Duplicate variable declaration in the same scope: " + varName);
            logger.error("Semantic Error: Duplicate variable declaration in the same scope: " + varName);
        } else {
            inScope.add(varName);
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