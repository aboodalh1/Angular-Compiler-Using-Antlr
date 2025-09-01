package nodes.statement;
import nodes.ASTNode;
import java.util.ArrayList;
import java.util.List;

// Decorator node
public class DecoratorNode extends ComponentNode {
    private  List<ArgumentNode> arguments = new ArrayList<>();



    @Override
    public String toString() {
        return "\nDecoratorNode{\n" + "arguments=" + arguments + "\n}";
    }

    public List<ArgumentNode> getArguments() {
        return arguments;
    }

    public void setArguments(List<ArgumentNode> arguments) {
        this.arguments = arguments;
    }
}
