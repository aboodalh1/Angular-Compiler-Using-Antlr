package nodes.enum_node;

import nodes.ASTNode;

public class EnumValue implements ASTNode {
    private String name;
    private String value;

    public EnumValue(String name, String value) {
        this.name = name;
        this.value = value;
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
    public String toString(){
        return "'"+name+"' =" + value;
    }
}
