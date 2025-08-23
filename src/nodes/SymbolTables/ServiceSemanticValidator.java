package nodes.SymbolTables;

import nodes.Row;
import nodes.SemanticException;

import static helper.keyWords.SERVICE;

public class ServiceSemanticValidator extends SymbolTable {

    public void insertService(String serviceName, String scope) {
        for (Row row : rows) {
            if (row.getType().equals("service") && row.getName().equals(serviceName) && row.getScope().equals(scope)) {
                throw new RuntimeException("Semantic Error: Redeclaration of service '" + serviceName + "' in scope '" + scope + "'.");
            }
        }
        rows.add(new Row(SERVICE, serviceName, scope, ""));
    }

    public boolean isServiceDeclared(String serviceName, String scope) {
        // Check current scope
        for (Row row : rows) {
            if (row.getType().equals("service") && row.getName().equals(serviceName) && row.getScope().equals(scope)) {
                return true;
            }
        }
        // Check global scope
        for (Row row : rows) {
            if (row.getType().equals("service") && row.getName().equals(serviceName) && row.getScope().equals("Global")) {
                return true;
            }
        }
        return false;
    }

    public void checkServiceDeclaredOrThrow(String serviceName, String scope, int line) throws SemanticException {
        if (!isServiceDeclared(serviceName, scope)) {
            throw new SemanticException("Semantic Error: Service '" + serviceName + "' used in providers but not declared (line " + line + ")");
        }
    }
} 