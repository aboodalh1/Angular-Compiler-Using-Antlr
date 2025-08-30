package nodes.SymbolTables;

import static helper.keyWords.GLOBAL;
import static helper.keyWords.TYPE;
import nodes.Row;
import nodes.SemanticException;

public class TypeSymbolTable extends SymbolTable {

    public void insertType(String typeName, String scope) {
        for (Row row : rows) {
            if (row.getType().equals(TYPE) && row.getName().equals(typeName) && row.getScope().equals(scope)) {
                throw new RuntimeException("Semantic Error: Redeclaration of type '" + typeName + "' in scope '" + scope + "'.");
            }
        }
        rows.add(new Row(TYPE, "", typeName, scope));
    }

    public boolean isTypeDeclared(String typeName, String scope) {
        // Check if it's a primitive type first
        if (isPrimitiveType(typeName)) {
            return true;
        }

        // Check current scope
        for (Row row : rows) {
            if (row.getType().equals(TYPE) && row.getName().equals(typeName) && row.getScope().equals(scope)) {
                return true;
            }
        }
        // Check global scope
        for (Row row : rows) {
            if (row.getType().equals(TYPE) && row.getName().equals(typeName) && row.getScope().equals(GLOBAL)) {
                return true;
            }
        }
        return false;
    }

    public void checkTypeDeclaredOrThrow(String typeName, String scope, int line) throws SemanticException {
        if (!isTypeDeclared(typeName, scope)) {
            throw new SemanticException("Semantic Error: Type '" + typeName + "' used but not declared (line " + line + ")");
        }
    }

    public boolean isPrimitiveType(String type) {
        return type.equals("number") || type.equals("string") || type.equals("boolean") ||
                type.equals("any") || type.equals("Array") || type.equals("void") ||
                type.equals("object") || type.equals("undefined") || type.equals("null") ||
                type.equals("Date") || type.equals("RegExp") || type.equals("Error") ||
                type.equals("Function") || type.equals("Promise");
    }

    public void addType(String typeName) {
        insertType(typeName, GLOBAL);
    }

    public boolean isValidType(String typeName, String scope) {
        return isTypeDeclared(typeName, scope);
    }
}
