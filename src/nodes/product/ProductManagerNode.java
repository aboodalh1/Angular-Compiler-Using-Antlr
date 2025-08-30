package nodes.product;

import nodes.ASTNode;
import nodes.statement.FunctionDeclarationNode;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductManagerNode represents a manager for product entities
 * Handles CRUD operations, product lists, and product management
 */
public class ProductManagerNode implements ASTNode {
    private String managerName;
    private List<ProductNode> products;
    private List<FunctionDeclarationNode> crudOperations;
    private String scope;
    private String managerType; // "CRUD", "List", "Search", etc.

    public ProductManagerNode() {
        this.managerName = "ProductManager";
        this.products = new ArrayList<>();
        this.crudOperations = new ArrayList<>();
        this.scope = "Global";
        this.managerType = "CRUD";
    }

    public ProductManagerNode(String managerName) {
        this();
        this.managerName = managerName;
    }

    // Getters and Setters
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public List<ProductNode> getProducts() {
        return products;
    }

    public void setProducts(List<ProductNode> products) {
        this.products = products;
    }

    public void addProduct(ProductNode product) {
        this.products.add(product);
    }

    public List<FunctionDeclarationNode> getCrudOperations() {
        return crudOperations;
    }

    public void setCrudOperations(List<FunctionDeclarationNode> crudOperations) {
        this.crudOperations = crudOperations;
    }

    public void addCrudOperation(FunctionDeclarationNode operation) {
        this.crudOperations.add(operation);
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getManagerType() {
        return managerType;
    }

    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductManagerNode{");
        sb.append("managerName='").append(managerName).append('\'');
        sb.append(", products=").append(products.size()).append(" items");
        sb.append(", crudOperations=").append(crudOperations.size()).append(" operations");
        sb.append(", scope='").append(scope).append('\'');
        sb.append(", managerType='").append(managerType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
