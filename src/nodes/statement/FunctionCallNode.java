package nodes.statement;

import java.util.ArrayList;
import java.util.List;
import nodes.ASTNode;

public class FunctionCallNode implements ASTNode {
    private String identifier;
    private List<ExpressionNode> arguments = new ArrayList<>();

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    public void setArguments(List<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "\nFunctionCallNode{\n" +
                "identifier='" + identifier + '\'' +
                ", arguments=" + arguments +
                "\n}";
    }
}
