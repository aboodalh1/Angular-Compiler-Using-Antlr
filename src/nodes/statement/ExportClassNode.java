package nodes.statement;

import nodes.ASTNode;
import nodes.statement.ClassNode;

// Export class node
public class ExportClassNode implements ASTNode {
    private  ClassNode classNode;

    @Override
    public String toString() {
        return "ExportClassNode{" + "classNode=" + classNode + '}';
    }

    public ClassNode getClassNode() {
        return classNode;
    }

    public void setClassNode(ClassNode classNode) {
        this.classNode = classNode;
    }
}
