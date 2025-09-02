package nodes.statement;

import nodes.ASTNode;

// Node for expression
public class ExpressionNode implements ASTNode {
    public  String operator;
    public  ASTNode left;
    public  ASTNode right;
    private String identifier;
    private LiteralValueNode literalNode;
    private int line;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ASTNode getLeft() {
        return left;
    }

    public void setLeft(ASTNode left) {
        this.left = left;
    }

    public ASTNode getRight() {
        return right;
    }

    public void setRight(ASTNode right) {
        this.right = right;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public LiteralValueNode getLiteralNode() {
        return literalNode;
    }

    public void setLiteralNode(LiteralValueNode literalNode) {
        this.literalNode = literalNode;
    }

    @Override
    public String toString() {
        return "ExpressionNode{" +
                "operator='" + operator + '\'' +
                ", left=" + left +
                ", right=" + right +
                ", identifier=" + identifier +
                ", literalNode=" + literalNode +
                ", line=" + line +
                '}';
    }
}
