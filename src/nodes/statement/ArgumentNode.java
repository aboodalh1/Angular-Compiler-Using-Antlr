package nodes.statement;

import nodes.ASTNode;
import nodes.css_node.CssNode;
import nodes.html_node.HtmlNode;

public class ArgumentNode implements ASTNode {
    String name;

    public LiteralValueNode setLiteralNode() {
        return value;
    }

    LiteralValueNode value;
    HtmlNode htmlNode;
    CssNode cssNode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setLiteralNode(LiteralValueNode value) {
        this.value = value;
    }




    public HtmlNode getHtmlNode() {
        return htmlNode;
    }

    public void setHtmlNode(HtmlNode htmlNode) {
        this.htmlNode = htmlNode;
    }

    public CssNode getCssNode() {
        return cssNode;
    }

    public void setCssNode(CssNode cssNode) {
        this.cssNode = cssNode;
    }

    public LiteralValueNode getValue() {
        return value;
    }

    public void setValue(LiteralValueNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ArgumentNode{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", htmlNode=" + htmlNode +
                ", cssNode=" + cssNode +
                '}';
    }
}

