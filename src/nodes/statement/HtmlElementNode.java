package nodes.statement;

import nodes.ASTNode;
import nodes.html_node.HtmlAttributesNode;
import nodes.html_node.HtmlContentNode;
import nodes.html_node.HtmlTagNode;

public class HtmlElementNode extends nodes.html_node.HtmlElementNode implements ASTNode {
    private String htmlTagNode;
    private HtmlAttributesNode htmlAttributesNodes;
    private HtmlContentNode htmlContentNode;

    public String getHtmlTagNode() {
        return htmlTagNode;
    }

    public void setHtmlTagNode(String htmlTagNode) {
        this.htmlTagNode = htmlTagNode;
    }

    public HtmlAttributesNode getHtmlAttributesNodes() {
        return htmlAttributesNodes;
    }

    public void setHtmlAttributesNodes(HtmlAttributesNode htmlAttributesNodes) {
        this.htmlAttributesNodes = htmlAttributesNodes;
    }

    public HtmlContentNode getHtmlContentNode() {
        return htmlContentNode;
    }

    public void setHtmlContentNode(HtmlContentNode htmlContentNode) {
        this.htmlContentNode = htmlContentNode;
    }

    @Override
    public String toString() {
        return "\nHtmlElementNode{\n" +
                "htmlTagNode=" + htmlTagNode +
                ", htmlAttributesNodes=" + htmlAttributesNodes +
                ", htmlContentNode=" + htmlContentNode +
                "\n}";
    }
}
