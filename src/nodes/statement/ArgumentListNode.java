package nodes.statement;

import nodes.ASTNode;

import java.util.List;

public class ArgumentListNode implements ASTNode {
    List<ArgumentNode> argumentNodeList;


    public List<ArgumentNode> getArgumentNodeList() {
        return argumentNodeList;
    }

    public void setArgumentNodeList(List<ArgumentNode> argumentNodeList) {
        this.argumentNodeList = argumentNodeList;
    }

    @Override
    public String toString() {
        return "ArgumentListNode{" +
                "argumentNodeList=" + argumentNodeList +
                '}';
    }
}
