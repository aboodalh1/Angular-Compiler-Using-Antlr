package nodes.codegen;

import nodes.ASTNode;
import nodes.html_node.*;
import nodes.html_node.HtmlElementNode;
import nodes.html_node.html_content.NgForNode;
import nodes.html_node.html_content.NgIfNode;
import nodes.statement.*;

/**
 * Generates HTML code from Angular AST nodes
 */
public class HTMLGenerator implements CodeGenerator {

    private StringBuilder htmlBuilder;
    private int indentLevel = 0;

    @Override
    public String generateCode(ASTNode node) {
        htmlBuilder = new StringBuilder();
        generateNode(node);
        return htmlBuilder.toString();
    }

    @Override
    public String getFileExtension() {
        return "html";
    }

    @Override
    public String getContentType() {
        return "text/html";
    }

    private void generateNode(ASTNode node) {
        if (node == null) return;

        if (node instanceof ProgramNode) {
            generateProgram((ProgramNode) node);
        } else if (node instanceof ComponentNode) {
            generateComponent((ComponentNode) node);
        } else if (node instanceof HtmlNode) {
            generateHtml((HtmlNode) node);
        } else if (node instanceof HtmlElementNode) {
            generateHtmlElement((HtmlElementNode) node);
        } else if (node instanceof HtmlContentNode) {
            generateHtmlContent((HtmlContentNode) node);
        } else if (node instanceof NgForNode) {
            generateNgFor((NgForNode) node);
        } else if (node instanceof NgIfNode) {
            generateNgIf((NgIfNode) node);
        }
    }

    private void generateProgram(ProgramNode program) {
        appendLine("<!DOCTYPE html>");
        appendLine("<html lang=\"en\">");
        appendLine("<head>");
        indentLevel++;
        appendLine("<meta charset=\"UTF-8\">");
        appendLine("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        appendLine("<title>Generated Angular App</title>");
        appendLine("<link rel=\"stylesheet\" href=\"styles.css\">");
        indentLevel--;
        appendLine("</head>");
        appendLine("<body>");
        indentLevel++;

        for (StatementNode statement : program.getStatements()) {
            if(statement.getComponentNodes() != null){
                ComponentNode component = statement.getComponentNodes();
                generateComponent(component);
            }
        }

        appendLine("<script src=\"app.js\"></script>");
        indentLevel--;
        appendLine("</body>");
        appendLine("</html>");
    }

    private void generateComponent(ComponentNode component) {
        // Look for template in decorator arguments
        if (component.getDecorator() != null && component.getDecorator().getArguments() != null) {
            for (ArgumentNode argument : component.getDecorator().getArguments()) {
                if ("template".equals(argument.getName()) && argument.getHtmlNode() != null) {
                    generateNode(argument.getHtmlNode());
                    return; // Found template, generate it and exit
                }
            }
        }

        // Fallback: generate a default component structure
        appendLine("<div class=\"component\">");
        indentLevel++;
        appendLine("<!-- Component content -->");
        indentLevel--;
        appendLine("</div>");
    }

    private void generateHtml(HtmlNode html) {
        if (html.getContent() != null) {
            generateNode(html.getContent());
        }
    }

    private void generateHtmlElement(HtmlElementNode element) {
        System.out.println(element);
        String tagName = element.getTagName().getIdentifierNode();

        append("<" + tagName);

        // Generate attributes
        if (element.getAttributes() != null) {
            generateAttributes(element.getAttributes());
        }

        append(">");

        // Generate content
        if (element.getContent() != null) {
            System.out.println(element.getContent());
            generateNode(element.getContent());
        }

        append("</" + tagName + ">");
    }

    private void generateHtmlContent(HtmlContentNode content) {
        if (content.getHtmlElementNode() != null) {
            for (HtmlElementNode element : content.getHtmlElementNode()) {
                generateNode(element);
            }
        }

        if (content.getExpression() != null) {
            for(ExpressionNode expressionNode:content.getExpression()){
                append("{{" + generateExpressionString(expressionNode) + "}}");
            }
        }
        if(content.getIdentifierNode() != null){
            for(String identifierNode:content.getIdentifierNode()){
                append("{{" + identifierNode + "}}");
            }
        }
    }

    private void generateAttributes(HtmlAttributesNode attributes) {
        if (attributes.getHtmlAttributeNodes() != null) {
            for (HtmlAttributeNode attr : attributes.getHtmlAttributeNodes()) {
                if (attr.getIdentifierNode() != null) {
                    append(" " + attr.getIdentifierNode());
                    if (attr.getHtmlAttributeValueNode() != null) {
                        append("=\"" + generateAttributeValue(attr.getHtmlAttributeValueNode()) + "\"");
                    }
                }
            }
        }
    }

    private String generateAttributeValue(HtmlAttributeValueNode value) {
        if (value.getValue() != null) {
            return generateLiteralValue(value.getValue());
        } else if (value.getExpression() != null) {
            return generateExpressionString(value.getExpression());
        }
        return "";
    }

    private String generateLiteralValue(LiteralValueNode literal) {
        if (literal.getStirngValue() != null) {
            return literal.getStirngValue().replace("\"", "");
        } else if (literal.getNumValue() != null) {
            return literal.getNumValue();
        } else if (literal.getBooleanValue() != null) {
            return literal.getBooleanValue();
        } else if (literal.getIdentifierValue() != null) {
            return literal.getIdentifierValue();
        }
        return "";
    }

    private void generateNgFor(NgForNode ngFor) {
        // Convert *ngFor to standard HTML with JavaScript loop
        appendLine("<!-- Generated from *ngFor -->");
        appendLine("<div class=\"ng-for-container\">");
        indentLevel++;
        appendLine("<!-- Loop content will be generated by JavaScript -->");
        indentLevel--;
        appendLine("</div>");
    }

    private void generateNgIf(NgIfNode ngIf) {
        // Convert *ngIf to standard HTML with JavaScript conditional
        appendLine("<!-- Generated from *ngIf -->");
        appendLine("<div class=\"ng-if-container\">");
        indentLevel++;
        appendLine("<!-- Conditional content will be generated by JavaScript -->");
        indentLevel--;
        appendLine("</div>");
    }

    private void generateExpression(ExpressionNode expression) {
        // Handle expressions that might contain HTML templates
        if (expression.getLeft() instanceof LiteralValueNode) {
            LiteralValueNode literal = (LiteralValueNode) expression.getLeft();
            if (literal.getHtmlNode() != null) {
                generateNode(literal.getHtmlNode());
            }
        }
    }

    private String generateExpressionString(ExpressionNode expression) {
        if (expression.getLeft() instanceof LiteralValueNode) {
            return generateLiteralValue((LiteralValueNode) expression.getLeft());
        }
        return "expression";
    }

    private void appendLine(String content) {
        append(getIndent() + content + "\n");
    }

    private void append(String content) {
        htmlBuilder.append(content);
    }

    private String getIndent() {
        return "  ".repeat(indentLevel);
    }
}

