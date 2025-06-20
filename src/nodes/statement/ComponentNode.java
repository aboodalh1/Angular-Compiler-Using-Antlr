package nodes.statement;
import nodes.ASTNode;

// Component node
public class ComponentNode extends StatementNode {
    private  DecoratorNode decorator ;
    private  ExportClassNode exportClass ;

    @Override
    public String toString() {
        return "\nComponentNode{\n" +
                "decorator=" + decorator +
                ", exportClass=" + exportClass +
                "\n}";
    }

    public DecoratorNode getDecorator() {
        return decorator;
    }

    public void setDecorator(DecoratorNode decorator) {
        this.decorator = decorator;
    }

    public ExportClassNode getExportClass() {
        return exportClass;
    }

    public void setExportClass(ExportClassNode exportClass) {
        this.exportClass = exportClass;
    }
}
