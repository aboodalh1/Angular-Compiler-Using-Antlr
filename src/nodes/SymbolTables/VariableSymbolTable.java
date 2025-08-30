package nodes.SymbolTables;

import static helper.keyWords.GLOBAL;
import static helper.keyWords.VARIABLE_DECLARATION;
import nodes.Row;
import nodes.SemanticException;

public class VariableSymbolTable extends SymbolTable {

    public void insertVariable(String variableName, String type, String scope) {
        for (Row row : rows) {
            if (row.getType().equals(VARIABLE_DECLARATION) && row.getName().equals(variableName) && row.getScope().equals(scope)) {
                throw new RuntimeException("Semantic Error: Redeclaration of variable '" + variableName + "' in scope '" + scope + "'.");
            }
        }
        rows.add(new Row(VARIABLE_DECLARATION, type, variableName, scope));
    }

    @Override
    public boolean variableExistsInScope(String variableName, String scope) {
        // Check current scope
        for (Row row : rows) {
            if (row.getType().equals(VARIABLE_DECLARATION) && row.getName().equals(variableName) && row.getScope().equals(scope)) {
                return true;
            }
        }
        return false;
    }

    public boolean variableExists(String variableName, String scope) {
        // Check current scope first
        if (variableExistsInScope(variableName, scope)) {
            return true;
        }
        // Check global scope
        for (Row row : rows) {
            if (row.getType().equals(VARIABLE_DECLARATION) && row.getName().equals(variableName) && row.getScope().equals(GLOBAL)) {
                return true;
            }
        }
        return false;
    }

    public String getVariableType(String variableName, String scope) {
        // Check current scope first
        for (Row row : rows) {
            if (row.getType().equals(VARIABLE_DECLARATION) && row.getName().equals(variableName) && row.getScope().equals(scope)) {
                return row.getValue();
            }
        }
        // Check global scope
        for (Row row : rows) {
            if (row.getType().equals(VARIABLE_DECLARATION) && row.getName().equals(variableName) && row.getScope().equals(GLOBAL)) {
                return row.getValue();
            }
        }
        return null;
    }

    public void checkVariableDeclaredOrThrow(String variableName, String scope, int line) throws SemanticException {
        if (!variableExists(variableName, scope)) {
            throw new SemanticException("Semantic Error: Variable '" + variableName + "' used but not declared (line " + line + ")");
        }
    }

    public void checkVariableNotRedeclaredOrThrow(String variableName, String scope, int line) throws SemanticException {
        if (variableExistsInScope(variableName, scope)) {
            throw new SemanticException("Semantic Error: Duplicate variable declaration in the same scope: '" + variableName + "' (line " + line + ")");
        }
    }
}
