package nodes.statement;

import nodes.ASTNode;

public class InterfaceNode implements ASTNode {
    public String name;
    private  ClassBodyNode classBody ;

    public InterfaceNode(String name, ClassBodyNode classBody) {
        this.name = name;
        this.classBody = classBody;
    }

    public InterfaceNode() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassBodyNode getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBodyNode classBody) {
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        return "InterfaceNode{" +
                "name='" + name + '\'' +
                ", classBody=" + classBody +
                '}';
    }
}
