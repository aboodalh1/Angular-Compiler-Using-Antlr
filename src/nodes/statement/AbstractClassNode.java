package nodes.statement;


import nodes.ASTNode;

public class AbstractClassNode implements ASTNode {

        private  String identifier;
        private  ClassBodyNode classBody ;

        @Override
        public String toString() {
            if(classBody!=null){
                return "\nAbstract Class Node{" +
                        "class Name='" + identifier + '\'' +
                    ", classBody=" + classBody +
                        "}\n";
            }
            return "\nAbstract Class Node{" +
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


