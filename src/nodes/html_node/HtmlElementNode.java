package nodes.html_node;

import nodes.ASTNode;

public class HtmlElementNode implements ASTNode {

    private HtmlTagNode tagName;
    private HtmlAttributesNode attributes;
    private HtmlContentNode content;

    public HtmlElementNode(HtmlTagNode tagName, HtmlAttributesNode attributes, HtmlContentNode content) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.content = content;
    }

    public HtmlElementNode() {
    }


    public HtmlTagNode getTagName() {
        return tagName;
    }

    public void setTagName(HtmlTagNode tagName) {
        this.tagName = tagName;
    }

    public HtmlAttributesNode getAttributes() {
        return attributes;
    }

    public void setAttributes(HtmlAttributesNode attributes) {
        this.attributes = attributes;
    }

    public HtmlContentNode getContent() {
        return content;
    }

    public void setContent(HtmlContentNode content) {
        this.content = content;
    }
}
