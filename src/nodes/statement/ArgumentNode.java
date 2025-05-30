package nodes.statement;

import nodes.ASTNode;

public class ArgumentNode implements ASTNode {
    String name;
    String value;


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

        return "\nArgumentNode{ \n" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' + "\n"+
                '}';
    }
}

