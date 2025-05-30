package nodes.statement;

import nodes.ASTNode;


public class VariableDeclarationNode implements ASTNode {
    public  String identifier ;
    public  TypeNode type;
    public  ASTNode expression;

    public AccessModifierNode getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifierNode accessModifier) {
        this.accessModifier = accessModifier;
    }

    public  AccessModifierNode accessModifier;
    @Override
    public String toString() {
        return "VariableDeclaration(AccessModifier = " + accessModifier + ", identifier=" + identifier + ", type=" + type + ", expression=" + expression + ")";
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public TypeNode getType() {
        return type;
    }

    public void setType(TypeNode type) {
        this.type = type;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }
}
