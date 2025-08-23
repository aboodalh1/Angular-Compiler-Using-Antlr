package nodes.state;

import nodes.ASTNode;
import java.util.ArrayList;
import java.util.List;

/**
 * StoreNode represents store operations in Angular state management
 * Examples: store.dispatch(), store.select()
 */
public class StoreNode implements ASTNode {
    private String operationType; // "dispatch", "select"
    private String actionName;
    private List<String> parameters;
    private String selector;
    private String scope;
    private String componentName;

    public StoreNode() {
        this.parameters = new ArrayList<>();
        this.scope = "Global";
    }

    public StoreNode(String operationType, String actionName) {
        this();
        this.operationType = operationType;
        this.actionName = actionName;
    }

    // Getters and Setters
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
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

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    // Helper methods
    public boolean isDispatchOperation() {
        return "dispatch".equals(operationType);
    }

    public boolean isSelectOperation() {
        return "select".equals(operationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StoreNode{");
        sb.append("operationType='").append(operationType).append('\'');
        sb.append(", actionName='").append(actionName).append('\'');
        sb.append(", parameters=").append(parameters);
        sb.append(", selector='").append(selector).append('\'');
        sb.append(", scope='").append(scope).append('\'');
        sb.append(", componentName='").append(componentName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
