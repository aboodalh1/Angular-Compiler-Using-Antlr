package nodes.statement;

import nodes.ASTNode;



// Class node
public class ClassNode implements ASTNode {
    public   String identifier;
    public   ClassBodyNode classBody ;


    @Override
    public String toString() {
        if(classBody!=null){
        return "\nClassNode{" +
                "class Name='" + identifier + '\'' +
                ", classBody=" + classBody +
                "}\n";
        }
        return "\nClassNode{" +
                "class Name='" + identifier + '\'' +
                "}\n";
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ClassBodyNode getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBodyNode classBody) {
        this.classBody = classBody;
    }
}
