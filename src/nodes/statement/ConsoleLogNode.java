package nodes.statement;
import nodes.ASTNode;

public class ConsoleLogNode implements ASTNode {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConsoleLogNode {" +
                "value='" + value + '\'' +
                '}';
    }
}
