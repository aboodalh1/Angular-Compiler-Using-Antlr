package nodes.html_node.html_content;

import nodes.ASTNode;
import nodes.statement.ExpressionNode;

public class NgIfNode implements ASTNode {
    private ExpressionNode expressionNode;

    public ExpressionNode getExpressionNode() {
        return expressionNode;
    }

    public void setExpressionNode(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    @Override
    public String toString() {
        return "NgIfNode{" +
                "expressionNode=" + expressionNode +
                '}';
    }
}
