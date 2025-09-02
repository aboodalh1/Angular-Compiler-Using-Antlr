package nodes.html_node.html_content;

import nodes.ASTNode;

public class OnChangeNodeAttr implements ASTNode {
    private String attrName;
    private String attrValue;
    public OnChangeNodeAttr(String attrName) {
        this.attrName = attrName;
    }

    public OnChangeNodeAttr(String attrName, String attrValue) {
        this.attrName = attrName;
        this.attrValue = attrValue;
    }

    public OnChangeNodeAttr() {
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    @Override
    public String toString() {
        return "OnChangeNodeAttr{" +
                "attrName='" + attrName + '\'' +
                ", attrValue='" + attrValue + '\'' +
                '}';
    }
}
