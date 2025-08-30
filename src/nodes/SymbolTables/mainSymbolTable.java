package nodes.SymbolTables;

import nodes.Row;
import java.util.ArrayList;
import java.util.List;

public class mainSymbolTable extends SymbolTable {
    
    public mainSymbolTable() {
        super();
    }
    
    public void addImport(String className) {
        Row row = new Row();
        row.setType("Import Statement");
        row.setName(className);
        row.setScope("Global");
        row.setValue("");
        getRows().add(row);
    }
    
    public boolean isImported(String className) {
        for (Row row : getRows()) {
            if (row.getType() != null && 
                row.getType().equals("Import Statement") && 
                row.getName() != null && 
                row.getName().equals(className)) {
                return true;
            }
        }
        return false;
    }
    
    public void addGlobalVariable(String varName, String type, String value) {
        Row row = new Row();
        row.setType("Global Variable");
        row.setName(varName);
        row.setScope("Global");
        row.setValue(value);
        getRows().add(row);
    }
    
    public void addGlobalFunction(String funcName, String params, String returnType) {
        String value = "params: " + (params != null ? params : "none");
        if (returnType != null) {
            value += ", return: " + returnType;
        }
        Row row = new Row();
        row.setType("Global Function");
        row.setName(funcName);
        row.setScope("Global");
        row.setValue(value);
        getRows().add(row);
    }
    
    public boolean variableExistsInGlobalScope(String name) {
        for (Row row : getRows()) {
            if (row.getType() != null && 
                row.getType().contains("Variable") && 
                row.getName() != null && 
                row.getName().equals(name) && 
                row.getScope() != null && 
                row.getScope().equals("Global")) {
                return true;
            }
        }
        return false;
    }
    
    public boolean functionExistsInGlobalScope(String name) {
        for (Row row : getRows()) {
            if (row.getType() != null && 
                row.getType().contains("Function") && 
                row.getName() != null && 
                row.getName().equals(name) && 
                row.getScope() != null && 
                row.getScope().equals("Global")) {
                return true;
            }
        }
        return false;
    }
}
