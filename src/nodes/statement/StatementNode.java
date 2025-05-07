package nodes.statement;

import nodes.ASTNode;
import nodes.html_node.HtmlNode;
// Statement node
public class StatementNode implements ASTNode {
    ArrayDeclarationNode arrayDeclarationNodeList ;
    EnumNode enumNodes ;
    VariableDeclarationNode variableDeclarationNodes ;
    FunctionDeclarationNode functionDeclarationNodes ;
    IfStatementNode ifStatementNodes;
    WhileStatementNode whileStatementNodes;
    AssignmentStatementNode assignmentStatementNodes;
    BreakStatementNode breakStatementNodes;
    ContinueStatementNode continueStatementNodes;
    ImportStatementNode importStatementNodes;
    ComponentNode componentNodes;
    ClassNode classNodes ;
    ExportClassNode exportClassNode ;
    HtmlElementNode htmlElementNodes ;
    HtmlNode htmlNodes ;

    public HtmlNode getHtmlNodes() {
        return htmlNodes;
    }

    public void setHtmlNodes(HtmlNode htmlNodes) {
        this.htmlNodes = htmlNodes;
    }

    public ExportClassNode getExportClassNode() {
        return exportClassNode;
    }

    public void setExportClassNode(ExportClassNode exportClassNode) {
        this.exportClassNode = exportClassNode;
    }
    public ArrayDeclarationNode getArrayDeclarationNodeList() {
        return arrayDeclarationNodeList;
    }

    public void setArrayDeclarationNodeList(ArrayDeclarationNode arrayDeclarationNodeList) {
        this.arrayDeclarationNodeList = arrayDeclarationNodeList;
    }

    public EnumNode getEnumNodes() {
        return enumNodes;
    }

    public void setEnumNodes(EnumNode enumNodes) {
        this.enumNodes = enumNodes;
    }

    public VariableDeclarationNode getVariableDeclarationNodes() {
        return variableDeclarationNodes;
    }

    public void setVariableDeclarationNodes(VariableDeclarationNode variableDeclarationNodes) {
        this.variableDeclarationNodes = variableDeclarationNodes;
    }

    public FunctionDeclarationNode getFunctionDeclarationNodes() {
        return functionDeclarationNodes;
    }

    public void setFunctionDeclarationNodes(FunctionDeclarationNode functionDeclarationNodes) {
        this.functionDeclarationNodes = functionDeclarationNodes;
    }

    public IfStatementNode getIfStatementNodes() {
        return ifStatementNodes;
    }

    public void setIfStatementNodes(IfStatementNode ifStatementNodes) {
        this.ifStatementNodes = ifStatementNodes;
    }

    public WhileStatementNode getWhileStatementNodes() {
        return whileStatementNodes;
    }

    public void setWhileStatementNodes(WhileStatementNode whileStatementNodes) {
        this.whileStatementNodes = whileStatementNodes;
    }

    public AssignmentStatementNode getAssignmentStatementNodes() {
        return assignmentStatementNodes;
    }

    public void setAssignmentStatementNodes(AssignmentStatementNode assignmentStatementNodes) {
        this.assignmentStatementNodes = assignmentStatementNodes;
    }

    public BreakStatementNode getBreakStatementNodes() {
        return breakStatementNodes;
    }

    public void setBreakStatementNodes(BreakStatementNode breakStatementNodes) {
        this.breakStatementNodes = breakStatementNodes;
    }

    public ContinueStatementNode getContinueStatementNodes() {
        return continueStatementNodes;
    }

    public void setContinueStatementNodes(ContinueStatementNode continueStatementNodes) {
        this.continueStatementNodes = continueStatementNodes;
    }

    public ImportStatementNode getImportStatementNodes() {
        return importStatementNodes;
    }

    public void setImportStatementNodes(ImportStatementNode importStatementNodes) {
        this.importStatementNodes = importStatementNodes;
    }

    public ComponentNode getComponentNodes() {
        return componentNodes;
    }

    public void setComponentNodes(ComponentNode componentNodes) {
        this.componentNodes = componentNodes;
    }

    public ClassNode getClassNodes() {
        return classNodes;
    }

    public void setClassNodes(ClassNode classNodes) {
        this.classNodes = classNodes;
    }

    public HtmlElementNode getHtmlElementNodes() {
        return htmlElementNodes;
    }

    public void setHtmlElementNodes(HtmlElementNode htmlElementNodes) {
        this.htmlElementNodes = htmlElementNodes;
    }

    @Override
    public String toString() {
        if (arrayDeclarationNodeList != null) {
            return "\nStatementNode{\n" +
                    "arrayDeclarationNodeList=" + arrayDeclarationNodeList +
                    "\n}";
        }
        if (classNodes != null) {
            return "\nStatementNode{\n" +
                    "classNodes=" + classNodes +
                    "\n}";
        }
        if (enumNodes != null) {
            return "\nStatementNode{" +
                    "enumNodes=" + enumNodes +
                    "\n}";
        }
        if (variableDeclarationNodes != null) {
            return "\nStatementNode{\n" +
                    "variableDeclarationNodes=" + variableDeclarationNodes +
                    "\n}";
        }
        if (functionDeclarationNodes != null) {
            return "\nStatementNode{\n" +
                    "functionDeclarationNodes=" + functionDeclarationNodes +
                    "\n}";
        }
        if (ifStatementNodes != null) {
            return "\nStatementNode{\n" +
                    "ifStatementNodes=" + ifStatementNodes +
                    "\n}";
        }
        if (whileStatementNodes != null) {
            return "\nStatementNode{\n" +
                    "whileStatementNodes=" + whileStatementNodes +
                    "\n}";
        }
        if (assignmentStatementNodes != null) {
            return "\nStatementNode{\n" +
                    "assignmentStatementNodes=" + assignmentStatementNodes +
                    "\n}";
        }
        if (breakStatementNodes != null) {
            return "\nStatementNode{\n" +
                    "breakStatementNodes=" + breakStatementNodes +
                    "\n}";
        }
        if (continueStatementNodes != null) {
            return "StatementNode{\n" +
                    "continueStatementNodes=" + continueStatementNodes +
                    "\n}";
        }
        if (importStatementNodes != null) {
            return "\n StatementNode{\n" +
                    "importStatementNodes=" + importStatementNodes +
                    "\n}";
        }
        if (componentNodes != null) {
            return "\nStatementNode{\n" +
                    "componentNodes=" + componentNodes +
                    "\n}";
        }
        if(htmlNodes!=null){
            return "\nStatementNode{\n" +
                    "htmlNodes=" + htmlNodes +
                    "\n}";
        }
        if (htmlElementNodes != null) {
            return "\nStatementNode{\n" +
                    "htmlElementNodes=" + htmlElementNodes +
                    "\n}";
        }
        return "StatementNode{}";
    }
}
