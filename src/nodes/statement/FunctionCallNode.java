package nodes.statement;

import nodes.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode implements ASTNode {
    private String identifier;
    private ExpressionNode expression;
    private List<ASTNode> arguments = new ArrayList<>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public void setExpression(ExpressionNode expression) {
        this.expression = expression;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "\nFunctionCallNode{\n" +
                "identifier='" + identifier + '\'' +
                ", expression=" + expression +
                "\n}";
    }
}
