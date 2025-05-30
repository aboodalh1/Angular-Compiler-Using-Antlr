package nodes.statement;

import nodes.ASTNode;

public class AccessModifierNode implements ASTNode {

    private String accessModifier;

    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }
    
    @Override
    public String toString() {
        return "accessModifierNode{" +
                "accessModifier='" + accessModifier + '\'' +
                '}';
    }
}
