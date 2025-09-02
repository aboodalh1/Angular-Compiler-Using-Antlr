package nodes.html_node;

import java.util.ArrayList;
import java.util.List;

import nodes.ASTNode;
import nodes.statement.ExpressionNode;

public class HtmlContentNode implements ASTNode {
    private List<HtmlElementNode> htmlElementNode = new ArrayList<>();
    private List<String> identifierNode;
    private List<ExpressionNode> expression;

    public List<ExpressionNode> getExpression() {
        return expression;
    }

    public void setExpression(List<ExpressionNode> expression) {
        this.expression = expression;
    }

    public List<HtmlElementNode> getHtmlElementNode() {
        return htmlElementNode;
    }

    public void setHtmlElementNode(List<HtmlElementNode> htmlElementNode) {
        this.htmlElementNode = htmlElementNode;
    }


    public List<String> getIdentifierNode() {
        return identifierNode;
    }


    @Override
    public String toString() {
        if (htmlElementNode.isEmpty()) {
            return "HtmlContentNode{" +
                    "expression=" + expression +
                    ", identifierNode=" + identifierNode +
                    '}';
        }
        return "HtmlContentNode{" +
                "htmlElementNode=" +
                htmlElementNode +
                ", expression=" + expression +
                ", identifierNode=" + identifierNode +
                '}';
    }

    public void setIdentifierNode(List<String> identifierNode) {
        this.identifierNode = identifierNode;
    }
}
