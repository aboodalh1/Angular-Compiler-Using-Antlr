package nodes;

import gen.AngularParser;
import gen.AngularParserBaseListener;
import nodes.SymbolTables.ComponentSymbolTable;
import nodes.SymbolTables.ServiceSemanticValidator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import utils.Logger;

public class SemanticAnalyzer extends AngularParserBaseListener {
    private SymbolTable mainSymbolTable;
    private ComponentSymbolTable componentSymbolTable;
    private ServiceSemanticValidator serviceSymbolTable;
    private List<String> semanticErrors = new ArrayList<>();
    private Logger logger = Logger.getInstance();
    
    // نظام تتبع منفصل للمتغيرات - لا يعتمد على SymbolTable
    private final Map<String, Set<String>> declaredVars = new HashMap<>();
    private String currentScope = "Global";
    private Stack<String> scopeStack = new Stack<>();
    
    // تتبع نطاق المكوّنات
    private boolean isInsideComponent = false;
    private String currentComponentName = null;

    public SemanticAnalyzer(SymbolTable mainSymbolTable) {
        this.mainSymbolTable = mainSymbolTable;
        this.componentSymbolTable = new ComponentSymbolTable();
        this.serviceSymbolTable = new ServiceSemanticValidator();
    }
    
    public SemanticAnalyzer(SymbolTable mainSymbolTable, ComponentSymbolTable componentSymbolTable, ServiceSemanticValidator serviceSymbolTable) {
        this.mainSymbolTable = mainSymbolTable;
        this.componentSymbolTable = componentSymbolTable;
        this.serviceSymbolTable = serviceSymbolTable;
    }

    public List<String> getSemanticErrors() {
        return semanticErrors;
    }
    
    public ComponentSymbolTable getComponentSymbolTable() {
        return componentSymbolTable;
    }
    
    public ServiceSemanticValidator getServiceSymbolTable() {
        return serviceSymbolTable;
    }
    
    // إعادة تعيين النظام المحلي عند بدء تحليل ملف جديد
    public void reset() {
        declaredVars.clear();
        semanticErrors.clear();
        currentScope = "Global";
        scopeStack.clear();
        isInsideComponent = false;
        currentComponentName = null;
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
    
    private void enterComponentScope(String componentName) {
        this.isInsideComponent = true;
        this.currentComponentName = componentName;
        this.componentSymbolTable.setComponentName(componentName);
        enterScope(componentName);
    }
    
    private void exitComponentScope() {
        this.isInsideComponent = false;
        this.currentComponentName = null;
        exitScope();
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
        // تم إزالة التسجيل المكرر - التسجيل يتم من BaseVisitor فقط
        // String importedClass = ctx.Identifier().getText();
        // mainSymbolTable.addImport(importedClass);
    }

    // تم إزالة المكرر - سيتم معالجة الكائنات في Method الجديد
    
    @Override
    public void enterComponent(AngularParser.ComponentContext ctx) {
        // Detect component decorator
        if (ctx.exportClass() != null && ctx.exportClass().classDeclaration() != null) {
            String className = ctx.exportClass().classDeclaration().Identifier().getText();
            enterComponentScope(className);
            logger.debug("Entering component scope: " + className);
        }
    }
    
    @Override
    public void exitComponent(AngularParser.ComponentContext ctx) {
        exitComponentScope();
    }
    
    @Override
    public void enterExportClass(AngularParser.ExportClassContext ctx) {
        // Check if this is a service (exported class without @Component)
        if (ctx.classDeclaration() != null && !isInsideComponent) {
            String className = ctx.classDeclaration().Identifier().getText();
            if (serviceSymbolTable.shouldBeService(className, false)) {
                serviceSymbolTable.insertService(className, currentScope);
                logger.info("Service detected: " + className);
            }
        }
    }
    
    @Override
    public void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        if (ctx.Identifier() != null) {
            String functionName = ctx.Identifier().getText();
            enterScope(functionName);
            
            // Add to appropriate symbol table
            if (isInsideComponent && currentComponentName != null) {
                // بناء توقيع البارامترات الفعلي
                String paramsSig = ctx.parameter().isEmpty() ? "()" : 
                    "(" + ctx.parameter().stream().map(p -> p.getText()).collect(java.util.stream.Collectors.joining(", ")) + ")";
                componentSymbolTable.addComponentFunction(functionName, paramsSig, null);
            } else {
                            // Add to main symbol table
            Row row = new Row();
            row.setType("Function Declaration");
            row.setName(functionName);
            row.setScope(currentScope);
            row.setValue("");
            mainSymbolTable.getRows().add(row);
            }
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
            if (!isPrimitiveType(type) && !mainSymbolTable.isImported(type)) {
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
        
        // Add to appropriate symbol table
        if (isInsideComponent && currentComponentName != null) {
            String type = ctx.type() != null ? ctx.type().getText() : "any";
            String displayVal = "";
            if (ctx.expression() != null) {
                displayVal = ctx.expression().getText();
            } else if (ctx.templateString() != null) {
                displayVal = ctx.templateString().getText();
            }
            componentSymbolTable.addComponentVariable(varName, type, displayVal);
        } else {
            // Add to main symbol table
            Row row = new Row();
            row.setType("Variable Declaration");
            row.setName(varName);
            row.setScope(currentScope);
            row.setValue("");
            mainSymbolTable.getRows().add(row);
        }
        
        if (ctx.type() != null) {
            String type = ctx.type().getText();
            if (!isPrimitiveType(type) && !mainSymbolTable.isImported(type)) {
                semanticErrors.add("Semantic Error: Type '" + type + "' used but not imported.");
            }
        }
    }

    @Override
    public void enterArrayDeclaration(AngularParser.ArrayDeclarationContext ctx) {
        if (isInsideComponent && currentComponentName != null) {
            String arrayName = ctx.Identifier().getText();
            String type = ctx.type() != null ? ctx.type().getText() : "Array";
            
            // بناء قيمة المصفوفة من القيم الفعلية
            StringBuilder arrayValue = new StringBuilder();
            if (!ctx.literalValue().isEmpty()) {
                arrayValue.append("[");
                for (int i = 0; i < ctx.literalValue().size(); i++) {
                    if (i > 0) arrayValue.append(", ");
                    arrayValue.append(ctx.literalValue().get(i).getText());
                }
                arrayValue.append("]");
            }
            
            componentSymbolTable.addComponentArray(arrayName, type, arrayValue.toString());
        }
    }
    
    @Override
    public void enterObjectDeclataion(AngularParser.ObjectDeclataionContext ctx) {
        if (isInsideComponent && currentComponentName != null) {
            String objectName = ctx.Identifier(0).getText();
            String className = ctx.Identifier().size() >= 2 ? ctx.Identifier(1).getText() : "unknown";
            componentSymbolTable.addComponentObject(objectName, className);
        }
        
        // Check if class is imported
        if (ctx.Identifier().size() >= 2) {
            String className = ctx.Identifier(1).getText();
            if (!mainSymbolTable.isImported(className)) {
                semanticErrors.add("Semantic Error: Class '" + className + "' used but not imported.");
                logger.error("Semantic Error: Class '" + className + "' used but not imported.");
            }
        }
    }
    
    private boolean isPrimitiveType(String type) {
        return type.equals("number") || type.equals("string") || type.equals("boolean") ||
                type.equals("any") || type.equals("Array");
    }
}