package nodes.statement;

import nodes.ASTNode;

import java.util.List;

public class ThisNewInstanceAssignmentNode implements ASTNode {
    String name;
    List<ExpressionNode> expressionNode;

    public ThisNewInstanceAssignmentNode(String name, List<ExpressionNode> expressionNode) {
        this.name = name;
        this.expressionNode = expressionNode;
    }

    public ThisNewInstanceAssignmentNode() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExpressionNode> getExpressionNode() {
        return expressionNode;
    }

    public void setExpressionNode(List<ExpressionNode> expressionNode) {
        this.expressionNode = expressionNode;
    }

    @Override
    public String toString() {
        if (name != null) {
            return "ThisNewInstanceAssignmentNode{" +
                    "name='" + name + '\'' +
                    '}';

        }

        return "ThisNewInstanceAssignmentNode{" +
                "name='" + name + '\'' +
                ", expressionNode=" + expressionNode +
                '}';
    }
}
