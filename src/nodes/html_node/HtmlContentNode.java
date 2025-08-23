package nodes.html_node;

import java.util.ArrayList;
import java.util.List;
import nodes.ASTNode;
import nodes.statement.ExpressionNode;

public class HtmlContentNode implements ASTNode {
    private List<HtmlElementNode> htmlElementNode= new ArrayList<>();
    private String identifierNode ;
    private ExpressionNode expression;

    public ExpressionNode getExpression() {
        return expression;
    }

    public void setExpression(ExpressionNode expression) {
        this.expression = expression;
    }

    public List<HtmlElementNode> getHtmlElementNode() {
        return htmlElementNode;
    }

    public void setHtmlElementNode(List<HtmlElementNode> htmlElementNode) {
        this.htmlElementNode = htmlElementNode;
    }






    public String getIdentifierNode() {
        return identifierNode;
    }

    public void setIdentifierNode(String identifierNode) {
        this.identifierNode = identifierNode;
    }

    @Override
    public String toString() {
        if(htmlElementNode.isEmpty()){
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
}
