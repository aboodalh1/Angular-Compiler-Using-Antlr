package nodes.statement;

import nodes.ASTNode;

public class ThisVariableNode implements ASTNode {
     String name;
     ThisIdentifierOrPropertyAssignmentNode thisIdentifierOrPropertyAssignmentNode;
     ThisNewInstanceAssignmentNode thisNewInstanceAssignmentNode;
     NestedThisAssignmentNode nestedThisAssignmentNode;


    public ThisVariableNode() {}

    public ThisVariableNode(String name, ThisIdentifierOrPropertyAssignmentNode thisIdentifierOrPropertyAssignmentNode, ThisNewInstanceAssignmentNode thisNewInstanceAssignmentNode, NestedThisAssignmentNode nestedThisAssignmentNode) {
        this.name = name;
        this.thisIdentifierOrPropertyAssignmentNode = thisIdentifierOrPropertyAssignmentNode;
        this.thisNewInstanceAssignmentNode = thisNewInstanceAssignmentNode;
        this.nestedThisAssignmentNode = nestedThisAssignmentNode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ThisIdentifierOrPropertyAssignmentNode getThisIdentifierOrPropertyAssignmentNode() {
        return thisIdentifierOrPropertyAssignmentNode;
    }

    public void setThisIdentifierOrPropertyAssignmentNode(ThisIdentifierOrPropertyAssignmentNode thisIdentifierOrPropertyAssignmentNode) {
        this.thisIdentifierOrPropertyAssignmentNode = thisIdentifierOrPropertyAssignmentNode;
    }

    public ThisNewInstanceAssignmentNode getThisNewInstanceAssignmentNode() {
        return thisNewInstanceAssignmentNode;
    }

    public void setThisNewInstanceAssignmentNode(ThisNewInstanceAssignmentNode thisNewInstanceAssignmentNode) {
        this.thisNewInstanceAssignmentNode = thisNewInstanceAssignmentNode;
    }

    public NestedThisAssignmentNode getNestedThisAssignmentNode() {
        return nestedThisAssignmentNode;
    }

    public void setNestedThisAssignmentNode(NestedThisAssignmentNode nestedThisAssignmentNode) {
        this.nestedThisAssignmentNode = nestedThisAssignmentNode;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ThisVariableNode:\n");

        if (name != null) {
            sb.append("  Name: ").append(name).append("\n");
        }
        if (thisIdentifierOrPropertyAssignmentNode != null) {
            sb.append("  IdentifierOrPropertyAssignment:\n")
                    .append(indent(thisIdentifierOrPropertyAssignmentNode.toString(), "    "))
                    .append("\n");
        }
        if (thisNewInstanceAssignmentNode != null) {
            sb.append("  NewInstanceAssignment:\n")
                    .append(indent(thisNewInstanceAssignmentNode.toString(), "    "))
                    .append("\n");
        }
        if (nestedThisAssignmentNode != null) {
            sb.append("  NestedThisAssignment:\n")
                    .append(indent(nestedThisAssignmentNode.toString(), "    "))
                    .append("\n");
        }

        return sb.toString();
    }

    private String indent(String text, String prefix) {
        return text.replaceAll("(?m)^", prefix);
    }
}
