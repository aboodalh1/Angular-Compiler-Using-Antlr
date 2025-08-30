package nodes.html_node.html_content;

import nodes.ASTNode;

/**
 * NgClickNode represents an ngClick directive in Angular templates
 * Example: (ngClick)="onClick()"
 */
public class NgClickNode implements ASTNode {
    private String handlerName;

    public NgClickNode() {
        this.handlerName = "";
    }

    public NgClickNode(String handlerName) {
        this.handlerName = handlerName;
    }

    // Getters and Setters
    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public String toString() {
        return "NgClickNode{handlerName='" + handlerName + "'}";
    }
}
