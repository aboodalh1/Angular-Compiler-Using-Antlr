package nodes.html_node;

import nodes.ASTNode;

public class HtmlElementNode implements ASTNode {

    private String tagName;
    private HtmlAttributesNode attributes;
    private HtmlContentNode content;

    public HtmlElementNode(String tagName, HtmlAttributesNode attributes, HtmlContentNode content) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.content = content;
    }


    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
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
