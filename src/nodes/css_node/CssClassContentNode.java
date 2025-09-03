package nodes.css_node;

import nodes.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class CssClassContentNode implements ASTNode {
    private String name;
    private String value;
    private List<String> properties = new ArrayList<>();
    private List<String> values = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "CssClassContent{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", properties=" + properties +
                ", values=" + values +
                '}';
    }
}
