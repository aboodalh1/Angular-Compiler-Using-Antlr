package nodes.statement;
import nodes.ASTNode;
import java.util.ArrayList;
import java.util.List;

// Decorator node
public class DecoratorNode implements ASTNode {
    private  List<ArgumentListNode> arguments = new ArrayList<>();



    @Override
    public String toString() {
        return "\nDecoratorNode{\n" + "arguments=" + arguments + "\n}";
    }

    public List<ArgumentListNode> getArguments() {
        return arguments;
    }

    public void setArguments(List<ArgumentListNode> arguments) {
        this.arguments = arguments;
    }
}
