package nodes.state;

import nodes.ASTNode;
import nodes.statement.FunctionDeclarationNode;
import java.util.ArrayList;
import java.util.List;

/**
 * ActionNode represents an action declaration in Angular state management
 * Example: @Action() addProduct(product: Product) { ... }
 */
public class ActionNode implements ASTNode {
    private String actionName;
    private FunctionDeclarationNode functionDeclaration;
    private List<String> metadata;
    private String scope;
    private String actionType; // "dispatch", "select", etc.

    public ActionNode() {
        this.metadata = new ArrayList<>();
        this.scope = "Global";
        this.actionType = "dispatch";
    }

    public ActionNode(String actionName, FunctionDeclarationNode functionDeclaration) {
        this();
        this.actionName = actionName;
        this.functionDeclaration = functionDeclaration;
    }

    // Getters and Setters
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public FunctionDeclarationNode getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclarationNode functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public List<String> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<String> metadata) {
        this.metadata = metadata;
    }

    public void addMetadata(String metadata) {
        this.metadata.add(metadata);
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActionNode{");
        sb.append("actionName='").append(actionName).append('\'');
        sb.append(", functionDeclaration=").append(functionDeclaration);
        sb.append(", metadata=").append(metadata);
        sb.append(", scope='").append(scope).append('\'');
        sb.append(", actionType='").append(actionType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
