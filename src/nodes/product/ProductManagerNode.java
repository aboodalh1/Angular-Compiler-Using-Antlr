package nodes.product;

import nodes.ASTNode;
import nodes.crud.CRUDNode;
import nodes.state.StateNode;
import nodes.state.ActionNode;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductManagerNode represents the main product management component
 * Integrates State Management, CRUD operations, and Product entities
 */
public class ProductManagerNode implements ASTNode {
    private String componentName;
    private List<StateNode> stateNodes;
    private List<ActionNode> actionNodes;
    private List<CRUDNode> crudNodes;
    private List<ProductNode> products;
    private String currentScope;
    private String template;

    public ProductManagerNode() {
        this.stateNodes = new ArrayList<>();
        this.actionNodes = new ArrayList<>();
        this.crudNodes = new ArrayList<>();
        this.products = new ArrayList<>();
        this.currentScope = "ProductManager";
    }

    public ProductManagerNode(String componentName) {
        this();
        this.componentName = componentName;
    }

    // Getters and Setters
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public List<StateNode> getStateNodes() {
        return stateNodes;
    }

    public void setStateNodes(List<StateNode> stateNodes) {
        this.stateNodes = stateNodes;
    }

    public void addStateNode(StateNode stateNode) {
        this.stateNodes.add(stateNode);
    }

    public List<ActionNode> getActionNodes() {
        return actionNodes;
    }

    public void setActionNodes(List<ActionNode> actionNodes) {
        this.actionNodes = actionNodes;
    }

    public void addActionNode(ActionNode actionNode) {
        this.actionNodes.add(actionNode);
    }

    public List<CRUDNode> getCrudNodes() {
        return crudNodes;
    }

    public void setCrudNodes(List<CRUDNode> crudNodes) {
        this.crudNodes = crudNodes;
    }

    public void addCrudNode(CRUDNode crudNode) {
        this.crudNodes.add(crudNode);
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

    public String getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(String currentScope) {
        this.currentScope = currentScope;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    // Helper methods for product management
    public ProductNode findProductById(String productId) {
        return products.stream()
                .filter(p -> productId.equals(p.getProductId()))
                .findFirst()
                .orElse(null);
    }

    public List<ProductNode> getProductsByCategory(String category) {
        List<ProductNode> result = new ArrayList<>();
        for (ProductNode product : products) {
            if (category.equals(product.getCategory())) {
                result.add(product);
            }
        }
        return result;
    }

    public boolean hasProducts() {
        return !products.isEmpty();
    }

    public int getProductCount() {
        return products.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductManagerNode{");
        sb.append("componentName='").append(componentName).append('\'');
        sb.append(", stateNodes=").append(stateNodes);
        sb.append(", actionNodes=").append(actionNodes);
        sb.append(", crudNodes=").append(crudNodes);
        sb.append(", products=").append(products);
        sb.append(", currentScope='").append(currentScope).append('\'');
        sb.append(", template='").append(template).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
