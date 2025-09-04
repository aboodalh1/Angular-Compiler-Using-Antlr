package nodes.statement;

import nodes.ASTNode;

import java.util.List;

// Node for list literal
public class ListLiteralNode implements ASTNode {
    public String name;
    public  List<String> identifiers;


    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ListLiteralNode{" +
                "name='" + name + '\'' +
                ", identifiers=" + identifiers +
                '}';
    }
}
