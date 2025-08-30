package nodes.SymbolTables;

import static helper.keyWords.GLOBAL;
import static helper.keyWords.IMPORT_STATEMENT;
import nodes.Row;
import nodes.SemanticException;

public class ImportSymbolTable extends SymbolTable {

    public void insertImport(String className, String scope) {
        for (Row row : rows) {
            if (row.getType().equals(IMPORT_STATEMENT) && row.getName().equals(className) && row.getScope().equals(scope)) {
                throw new RuntimeException("Semantic Error: Redeclaration of import '" + className + "' in scope '" + scope + "'.");
            }
        }
        rows.add(new Row(IMPORT_STATEMENT, "", className, scope));
    }

    public boolean isImported(String className, String scope) {
        // Check current scope
        for (Row row : rows) {
            if (row.getType().equals(IMPORT_STATEMENT) && row.getName().equals(className) && row.getScope().equals(scope)) {
                return true;
            }
        }
        // Check global scope
        for (Row row : rows) {
            if (row.getType().equals(IMPORT_STATEMENT) && row.getName().equals(className) && row.getScope().equals(GLOBAL)) {
                return true;
            }
        }
        return false;
    }

    public void checkImportedOrThrow(String className, String scope, int line) throws SemanticException {
        if (!isImported(className, scope)) {
            throw new SemanticException("Semantic Error: Class '" + className + "' used but not imported (line " + line + ")");
        }
    }

    @Override
    public void addImport(String className) {
        insertImport(className, GLOBAL);
    }

    public boolean isPrimitiveType(String type) {
        return type.equals("number") || type.equals("string") || type.equals("boolean") ||
                type.equals("any") || type.equals("Array") || type.equals("void") ||
                type.equals("object") || type.equals("undefined") || type.equals("null");
    }
}
