package nodes.SymbolTables;

import nodes.Row;
import nodes.SemanticException;
import java.util.ArrayList;
import java.util.List;

import static helper.keyWords.SERVICE;

public class ServiceSemanticValidator extends SymbolTable {
    private List<String> detectedServices = new ArrayList<>();
    private List<String> serviceProviders = new ArrayList<>();

    public void insertService(String serviceName, String scope) {
        // Check for redeclaration
        for (Row row : rows) {
            if (row.getType() != null && 
                row.getType().equals(SERVICE) && 
                row.getName() != null && 
                row.getName().equals(serviceName) && 
                row.getScope() != null && 
                row.getScope().equals(scope)) {
                throw new RuntimeException("Semantic Error: Redeclaration of service '" + serviceName + "' in scope '" + scope + "'.");
            }
        }
        
        // Add service to table
        Row row = new Row();
        row.setType(SERVICE);
        row.setName(serviceName);
        row.setScope(scope);
        row.setValue("");
        rows.add(row);
        detectedServices.add(serviceName);
        
        // Log service detection
        System.out.println("Service detected: " + serviceName + " in scope: " + scope);
    }

    public boolean isServiceDeclared(String serviceName, String scope) {
        // Check current scope
        for (Row row : rows) {
            if (row.getType() != null && 
                row.getType().equals(SERVICE) && 
                row.getName() != null && 
                row.getName().equals(serviceName) && 
                row.getScope() != null && 
                row.getScope().equals(scope)) {
                return true;
            }
        }
        // Check global scope
        for (Row row : rows) {
            if (row.getType() != null && 
                row.getType().equals(SERVICE) && 
                row.getName() != null && 
                row.getName().equals(serviceName) && 
                row.getScope() != null && 
                row.getScope().equals("Global")) {
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
    
    public void addServiceProvider(String providerName) {
        serviceProviders.add(providerName);
        Row row = new Row();
        row.setType("Service Provider");
        row.setName(providerName);
        row.setScope("Global");
        row.setValue("");
        rows.add(row);
    }
    
    public List<String> getDetectedServices() {
        return detectedServices;
    }
    
    public List<String> getServiceProviders() {
        return serviceProviders;
    }
    
    public boolean isServiceProvider(String name) {
        return serviceProviders.contains(name);
    }
    
    // Heuristic method to detect services: any exported class outside @Component
    public boolean shouldBeService(String className, boolean hasComponentDecorator) {
        return !hasComponentDecorator && className != null && !className.isEmpty();
    }
} 