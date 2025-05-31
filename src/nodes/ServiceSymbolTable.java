package nodes;

import java.util.ArrayList;
import java.util.List;

public class ServiceSymbolTable {
    private final List<Row> serviceRows = new ArrayList<>();

    // Insert a service into the service symbol table
    public void insertService(String serviceName, String scope) {
        for (Row row : serviceRows) {
            if (row.getType() != null && row.getType().equals("service") && row.getName() != null && row.getName().equals(serviceName) && row.getScope() != null && row.getScope().equals(scope)) {
                throw new RuntimeException("Semantic Error: Redeclaration of service '" + serviceName + "' in scope '" + scope + "'.");
            }
        }
        serviceRows.add(new Row("service", serviceName, serviceName, scope));
    }

    // Check if a service is declared in the current or global scope
    public boolean isServiceDeclared(String serviceName, String scope) {
        for (Row row : serviceRows) {
            if (row.getType() != null && row.getType().equals("service") && row.getName() != null && row.getName().equals(serviceName) && row.getScope() != null && row.getScope().equals(scope)) {
                return true;
            }
        }
        // Check global scope
        for (Row row : serviceRows) {
            if (row.getType() != null && row.getType().equals("service") && row.getName() != null && row.getName().equals(serviceName) && row.getScope() != null && row.getScope().equals("Global")) {
                return true;
            }
        }
        return false;
    }

    // Semantic check: throw error if service is not declared
    public void checkServiceDeclaredOrThrow(String serviceName, String scope, int line) throws SemanticException {
        if (!isServiceDeclared(serviceName, scope)) {
            throw new SemanticException("Semantic Error: Service '" + serviceName + "' used in providers but not declared (line " + line + ")");
        }
    }

    // Optional: print the service symbol table
    public void print() {
        System.out.println("Service Symbol Table:");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-20s | %-20s | %-20s\n", "Type", "Name", "Scope");
        System.out.println("--------------------------------------------------------------");
        for (Row row : serviceRows) {
            System.out.printf("%-20s | %-20s | %-20s\n", row.getType(), row.getName(), row.getScope());
        }
        System.out.println("--------------------------------------------------------------");
    }
} 