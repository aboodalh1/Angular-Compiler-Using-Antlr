package nodes.statement;

import nodes.ASTNode;

// Export class node
public class ExportClassNode extends StatementNode {
    private String name;
    private ClassBodyNode classBody;
    private ClassNode classNode;


    public ClassNode getClassNode() {
        return classNode;
    }

    public void setClassNode(ClassNode classNode) {
        this.classNode = classNode;
    }
    public ExportClassNode(String name, ClassBodyNode classBody) {
        this.name = name;
        this.classBody = classBody;
    }

    public ExportClassNode() {
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
        return "ExportClassNode{" +
                "name='" + name + '\'' +
                ", classBody=" + classBody +
                ", classNode=" + classNode +
                '}';
    }
}
