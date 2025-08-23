package nodes.state;

import nodes.ASTNode;
import nodes.statement.VariableDeclarationNode;
import java.util.ArrayList;
import java.util.List;

/**
 * StateNode represents a state declaration in Angular state management
 * Example: @State() products: Product[] = [];
 */
public class StateNode implements ASTNode {
    private String stateName;
    private VariableDeclarationNode variableDeclaration;
    private List<String> metadata;
    private String scope;

    public StateNode() {
        this.metadata = new ArrayList<>();
        this.scope = "Global";
    }

    public StateNode(String stateName, VariableDeclarationNode variableDeclaration) {
        this();
        this.stateName = stateName;
        this.variableDeclaration = variableDeclaration;
    }

    // Getters and Setters
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public VariableDeclarationNode getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclarationNode variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StateNode{");
        sb.append("stateName='").append(stateName).append('\'');
        sb.append(", variableDeclaration=").append(variableDeclaration);
        sb.append(", metadata=").append(metadata);
        sb.append(", scope='").append(scope).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
