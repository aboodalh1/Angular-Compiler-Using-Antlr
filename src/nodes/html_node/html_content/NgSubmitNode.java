package nodes.html_node.html_content;

import nodes.ASTNode;

/**
 * NgSubmitNode represents an ngSubmit directive in Angular templates
 * Example: (ngSubmit)="onSubmit()"
 */
public class NgSubmitNode implements ASTNode {
    private String handlerName;

    public NgSubmitNode() {
        this.handlerName = "";
    }

    public NgSubmitNode(String handlerName) {
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
        return "NgSubmitNode{handlerName='" + handlerName + "'}";
    }
}
