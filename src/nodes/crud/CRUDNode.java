package nodes.crud;

import nodes.ASTNode;
import nodes.product.ProductNode;
import java.util.ArrayList;
import java.util.List;

/**
 * CRUDNode represents CRUD operations (Create, Read, Update, Delete) for products
 * Supports different operation types and parameters
 */
public class CRUDNode implements ASTNode {
    private String operationType; // "CREATE", "READ", "UPDATE", "DELETE"
    private String operationName; // "addProduct", "getProduct", "updateProduct", "deleteProduct"
    private List<ProductNode> products;
    private List<String> parameters;
    private String targetId;
    private String scope;
    private Boolean success;

    public CRUDNode() {
        this.products = new ArrayList<>();
        this.parameters = new ArrayList<>();
        this.scope = "Global";
        this.success = false;
    }

    public CRUDNode(String operationType, String operationName) {
        this();
        this.operationType = operationType;
        this.operationName = operationName;
    }

    // Getters and Setters
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
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

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public void addParameter(String parameter) {
        this.parameters.add(parameter);
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    // Helper methods for specific CRUD operations
    public boolean isCreateOperation() {
        return "CREATE".equals(operationType);
    }

    public boolean isReadOperation() {
        return "READ".equals(operationType);
    }

    public boolean isUpdateOperation() {
        return "UPDATE".equals(operationType);
    }

    public boolean isDeleteOperation() {
        return "DELETE".equals(operationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CRUDNode{");
        sb.append("operationType='").append(operationType).append('\'');
        sb.append(", operationName='").append(operationName).append('\'');
        sb.append(", products=").append(products);
        sb.append(", parameters=").append(parameters);
        sb.append(", targetId='").append(targetId).append('\'');
        sb.append(", scope='").append(scope).append('\'');
        sb.append(", success=").append(success);
        sb.append('}');
        return sb.toString();
    }
}
