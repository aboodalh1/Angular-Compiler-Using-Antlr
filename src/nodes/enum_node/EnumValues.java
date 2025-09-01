package nodes.enum_node;

import nodes.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class EnumValues implements ASTNode {
    List<EnumValue> values ;

    public EnumValues(List<EnumValue> values) {
        this.values = new ArrayList<>();

    }

    public List<EnumValue> getValues() {
        return values;
    }

    public void setValues(List<EnumValue> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "EnumValues{" +
                "values=" + values +
                '}';
    }
}
