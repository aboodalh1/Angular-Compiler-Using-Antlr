package nodes.codegen;

import nodes.ASTNode;
import nodes.css_node.CssClassContentNode;
import nodes.css_node.CssContentNode;
import nodes.css_node.CssNode;
import nodes.statement.*;

import java.util.List;


public class CSSGenerator implements CodeGenerator {

    private StringBuilder cssBuilder;
    private int indentLevel = 0;

    @Override
    public String generateCode(ASTNode node) {
        cssBuilder = new StringBuilder();
        // The root node is expected to be a ProgramNode
        if (node instanceof ProgramNode) {
            generateProgram((ProgramNode) node);
        } else {
            // Handle unexpected root node
            cssBuilder.append("/* Error: Expected ProgramNode as root */");
        }
        return cssBuilder.toString();
    }

    @Override
    public String getFileExtension() {
        return "css";
    }

    @Override
    public String getContentType() {
        return "text/css";
    }

    private void generateProgram(ProgramNode program) {
        appendLine("/* Generated CSS from Angular Components */");
        appendLine("");

        for (StatementNode statement : program.getStatements()) {
            if (statement.getComponentNodes() != null) {
                generateComponent(statement.getComponentNodes());
            }
        }
    }

    private void generateComponent(ComponentNode component) {
        if (component.getDecorator() != null) {
            generateDecorator(component.getDecorator());
        }
    }

    private void generateDecorator(DecoratorNode decorator) {
        // Search for the argument containing the CSS node
        for (ArgumentNode argument : decorator.getArguments()) {
            if (argument.getCssNode() != null) {
                generateCss(argument.getCssNode());
            }
        }
    }

    private void generateCss(CssNode css) {
        if (css.getCssContentNode() != null) {
            for (CssContentNode content : css.getCssContentNode()) {
                generateCssContent(content);
            }
        }
    }

    private void generateCssContent(CssContentNode content) {
        String selector = content.getIdentifierNode();
        List<CssClassContentNode> classList = content.getCssClassContentList();

        // 1. Generate styles for the main selector (e.g., "app-root")
        if (selector != null) {
            appendLine(selector + " {");
            increaseIndent();
            appendLine("/* Styles for " + selector + " */");
            // NOTE: The AST doesn't seem to capture CSS properties,
            // so we generate a placeholder comment here.
            appendLine("/* Add your styles here */");
            decreaseIndent();
            appendLine("}");
            appendLine("");
        }

        // 2. Generate styles for all child CSS classes
        if (classList != null) {
            for (CssClassContentNode classContent : classList) {
                generateCssClassContent(classContent);
            }
        }
    }

    private void generateCssClassContent(CssClassContentNode classContent) {
        if (classContent.getName() != null) {
            appendLine("." + classContent.getName() + " {");
            increaseIndent();
            // Same as above, properties are not captured in the AST
            appendLine("/* Styles for ." + classContent.getName() + " */");
            appendLine("  color: #333;");
            appendLine("  font-size: 16px;");
            appendLine("  padding: 10px;");
            decreaseIndent();
            appendLine("}");
            appendLine("");
        }
    }

    private void increaseIndent() {
        indentLevel++;
    }

    private void decreaseIndent() {
        if (indentLevel > 0) {
            indentLevel--;
        }
    }

    private void appendLine(String content) {
        append(getIndent() + content + "\n");
    }

    private void append(String content) {
        cssBuilder.append(content);
    }

    private String getIndent() {
        return "  ".repeat(indentLevel);
    }
}
