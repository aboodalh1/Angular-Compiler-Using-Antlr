package nodes.SymbolTables;

import nodes.Row;
import java.util.ArrayList;
import java.util.List;

public class ComponentSymbolTable extends SymbolTable {
    private String componentName;
    private boolean isInsideComponent = false;
    private List<String> componentScopeNames = new ArrayList<>();
    
    public ComponentSymbolTable() {
        super();
    }
    
    public void setComponentName(String componentName) {
        this.componentName = componentName;
        this.isInsideComponent = true;
        this.componentScopeNames.add(componentName);
    }
    
    public boolean isInsideComponent() {
        return isInsideComponent;
    }
    
    public String getComponentName() {
        return componentName;
    }
    
    public List<String> getComponentScopeNames() {
        return componentScopeNames;
    }
    
    public void addComponentVariable(String varName, String type, String value) {
        Row row = new Row();
        row.setType("Component Variable (" + (type != null ? type : "unknown") + ")");
        row.setName(varName);
        row.setScope(componentName);
        row.setValue(value != null ? value : "");
        getRows().add(row);
    }
    
    public void addComponentFunction(String funcName, String params, String returnType) {
        String value = params != null ? params : "none";
        if (returnType != null) {
            value += ", return: " + returnType;
        }
        Row row = new Row();
        row.setType("Component Function");
        row.setName(funcName);
        row.setScope(componentName);
        row.setValue(value);
        getRows().add(row);
    }
    
    public void addComponentArray(String arrayName, String type) {
        addComponentArray(arrayName, type, "");
    }
    
    public void addComponentArray(String arrayName, String type, String value) {
        Row row = new Row();
        row.setType("Component Variable (Array)");
        row.setName(arrayName);
        row.setScope(componentName);
        row.setValue(value != null ? value : "");
        getRows().add(row);
    }
    
    public void addComponentObject(String objectName, String className) {
        Row row = new Row();
        row.setType("Object");
        row.setName(objectName);
        row.setScope(componentName);
        row.setValue(className != null ? className : "unknown");
        getRows().add(row);
    }
    
    public boolean variableExistsInComponentScope(String name) {
        for (Row row : getRows()) {
            if (row.getType() != null && 
                row.getType().contains("Component Variable") && 
                row.getName() != null && 
                row.getName().equals(name) && 
                row.getScope() != null && 
                row.getScope().equals(componentName)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean functionExistsInComponentScope(String name) {
        for (Row row : getRows()) {
            if (row.getType() != null && 
                row.getType().contains("Component Function") && 
                row.getName() != null && 
                row.getName().equals(name) && 
                row.getScope() != null && 
                row.getScope().equals(componentName)) {
                return true;
            }
        }
        return false;
    }
} 