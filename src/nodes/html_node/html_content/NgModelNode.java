package nodes.html_node.html_content;

import nodes.ASTNode;

/**
 * NgModelNode represents an ngModel directive in Angular templates
 * Example: [ngModel]="propertyName"
 */
public class NgModelNode implements ASTNode {
    private String boundIdentifier;

    public NgModelNode() {
        this.boundIdentifier = "";
    }

    public NgModelNode(String boundIdentifier) {
        this.boundIdentifier = boundIdentifier;
    }

    // Getters and Setters
    public String getBoundIdentifier() {
        return boundIdentifier;
    }

    public void setBoundIdentifier(String boundIdentifier) {
        this.boundIdentifier = boundIdentifier;
    }

    @Override
    public String toString() {
        return "NgModelNode{boundIdentifier='" + boundIdentifier + "'}";
    }
}
