package nodes.html_node.html_content;

import nodes.ASTNode;

public class OnClickAttrNode implements ASTNode {
    private String name;
    private String value;

    public OnClickAttrNode(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public OnClickAttrNode() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "OnClickAttrNode{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
