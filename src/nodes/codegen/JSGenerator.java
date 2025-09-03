package nodes.codegen;

import nodes.ASTNode;
import nodes.html_node.HtmlAttributeNode;
import nodes.html_node.HtmlAttributesNode;
import nodes.html_node.HtmlContentNode;
import nodes.html_node.HtmlElementNode;
import nodes.html_node.HtmlNode;
import nodes.html_node.html_content.NgForNode;
import nodes.html_node.html_content.NgIfNode;
import nodes.html_node.html_content.OnChangeNodeAttr;
import nodes.html_node.html_content.OnClickAttrNode;
import nodes.statement.*;

import java.util.List;
import java.util.UUID;

/**
 * Generates JavaScript code from Angular AST nodes.
 * This generator is specifically designed to work with the AST produced by BaseVisitorWithCodeGen.
 * It translates components, classes, variables, functions, and HTML templates into a single JavaScript file.
 */
public class JSGenerator implements CodeGenerator {

    private StringBuilder jsBuilder;
    private int indentLevel = 0;
    private boolean isInsideComponent = false;

    @Override
    public String generateCode(ASTNode node) {
        jsBuilder = new StringBuilder();
        if (node instanceof ProgramNode) {
            generateProgram((ProgramNode) node);
        } else {
            jsBuilder.append("// Error: Expected ProgramNode as root for JavaScript generation.");
        }
        return jsBuilder.toString();
    }

    @Override
    public String getFileExtension() {
        return "js";
    }

    @Override
    public String getContentType() {
        return "application/javascript";
    }

    private void generateProgram(ProgramNode program) {
        appendLine("// Generated JavaScript from Angular-like AST");
        appendLine("'use strict';");
        appendLine("");

        // Find and generate the component
        for (StatementNode statement : program.getStatements()) {
            if (statement.getComponentNodes() != null) {
                isInsideComponent = true;
                generateComponent(statement.getComponentNodes());
                isInsideComponent = false;
            }
        }
        appendLine("");
    }

    private void generateComponent(ComponentNode component) {
        if (component.getExportClass() != null) {
            String componentName = component.getExportClass().getName();
            appendLine("class " + componentName + " {");
            increaseIndent();

            // Generate class properties and methods from the class body
            if (component.getExportClass().getClassBody() != null) {
                generateClassBody(component.getExportClass().getClassBody());
            }

            // Generate the template as a string
            String template = "";
            String selector = "app-root"; // Default selector
            if (component.getDecorator() != null) {
                DecoratorNode decorator = component.getDecorator();
                for (ArgumentNode arg : decorator.getArguments()) {
                    if (arg.getHtmlNode() != null) {
                        template = generateHtml(arg.getHtmlNode());
                    }
                    if (arg.getName() != null && arg.getName().equals("selector")) {
                        // The visitor currently does not seem to pass a specific selector value,
                        // so this is a placeholder for future implementation.
                    }
                }
            }

            // Add a constructor
            appendLine("constructor() {");
            increaseIndent();
            appendLine("// Component properties are initialized here");
            decreaseIndent();
            appendLine("}");
            appendLine("");

            // Add render method
            appendLine("render() {");
            increaseIndent();
            appendLine("const container = document.querySelector('" + selector + "');");
            appendLine("if (container) {");
            increaseIndent();
            appendLine("container.innerHTML = `" + template + "`;");
            appendLine("this.bindEvents();");
            decreaseIndent();
            appendLine("}");
            decreaseIndent();
            appendLine("}");
            appendLine("");

            // Add event binding method to handle `(click)` attributes
            appendLine("bindEvents() {");
            increaseIndent();
            if (component.getDecorator() != null) {
                DecoratorNode decorator = component.getDecorator();
                for (ArgumentNode arg : decorator.getArguments()) {
                    if (arg.getHtmlNode() != null) {
                        generateEventBindings(arg.getHtmlNode());
                    }
                }
            }
            decreaseIndent();
            appendLine("}");
            decreaseIndent();
            appendLine("}");
            appendLine("");

            appendLine("document.addEventListener('DOMContentLoaded', () => {");
            increaseIndent();
            appendLine("const app = new " + componentName + "();");
            appendLine("app.render();");
            decreaseIndent();
            appendLine("});");
            appendLine("");
        }
    }

    private void generateClassBody(ClassBodyNode classBody) {
        if (classBody == null) return;
        // Generate properties
        for (VariableDeclarationNode varDecl : classBody.getVariableDeclarationNodes()) {
            generateVariable(varDecl);
        }
        // Generate methods
        for (FunctionDeclarationNode funcDecl : classBody.getFunctionDeclarationNodes()) {
            generateFunction(funcDecl);
        }
    }

    private void generateVariable(VariableDeclarationNode variable) {
        String varName = variable.getIdentifier();
        String varValue = "null";
        if (variable.getExpression() != null) {
            varValue = generateExpressionValue(variable.getExpression());
        }
        appendLine("public " + varName + " = " + varValue + ";");
    }

    private String generateExpressionValue(ExpressionNode expression) {
        if (expression.getLiteralNode() != null) {
            return expression.getLiteralNode().toString();
        }
        if (expression.getIdentifier() != null) {
            return "this." + expression.getIdentifier();
        }
        return "undefined";
    }

    private void generateFunction(FunctionDeclarationNode function) {
        String functionName = function.getIdentifier();
        List<ParameterNode> parameters = function.getParameters();

        append("public " + functionName + "(");
        if (parameters != null && !parameters.isEmpty()) {
            for (int i = 0; i < parameters.size(); i++) {
                append(parameters.get(i).getIdentifier());
                if (i < parameters.size() - 1) {
                    append(", ");
                }
            }
        }
        appendLine(") {");
        increaseIndent();
        appendLine("// Function body generated here");
        decreaseIndent();
        appendLine("}");
    }

    // --- HTML Template Generation ---

    private String generateHtml(HtmlNode htmlNode) {
        if (htmlNode.getContent() == null) {
            return "";
        }
        return generateHtmlContent(htmlNode.getContent());
    }

    private String generateHtmlContent(HtmlContentNode content) {
        StringBuilder html = new StringBuilder();
        if (content.getHtmlElementNode() != null) {
            for (HtmlElementNode element : content.getHtmlElementNode()) {
                html.append(generateHtmlElement(element));
            }
        }
        if (content.getIdentifierNode() != null) {
            for (String identifier : content.getIdentifierNode()) {
                html.append("{{").append(identifier).append("}}");
            }
        }
        return html.toString();
    }

    private String generateHtmlElement(HtmlElementNode element) {
        StringBuilder html = new StringBuilder();
        String tagName = element.getTagName() != null ? element.getTagName().getIdentifierNode() : "div";
        String elementId = "id-" + UUID.randomUUID().toString().substring(0, 8);

        // Check for NgIf and NgFor attributes
        NgIfNode ngIf = null;
        NgForNode ngFor = null;
        if (element.getAttributes() != null) {
            for (HtmlAttributeNode attr : element.getAttributes().getHtmlAttributeNodes()) {
                if (attr.getNgIfNode() != null) {
                    ngIf = attr.getNgIfNode();
                }
                if (attr.getNgForNode() != null) {
                    ngFor = attr.getNgForNode();
                }
            }
        }

        // NgFor and NgIf placeholders
        if (ngFor != null) {
            html.append(generateNgFor(ngFor, tagName, element.getAttributes(), element.getContent()));
        } else if (ngIf != null) {
            html.append(generateNgIf(ngIf, tagName, element.getAttributes(), element.getContent()));
        } else {
            html.append("<").append(tagName);
            if (element.getAttributes() != null) {
                html.append(" id=\"" + elementId + "\""); // Add a unique ID for event binding
                html.append(generateHtmlAttributes(element.getAttributes()));
            }
            html.append(">");
            if (element.getContent() != null) {
                html.append(generateHtmlContent(element.getContent()));
            }
            html.append("</").append(tagName).append(">");
        }

        return html.toString();
    }

    private String generateHtmlAttributes(HtmlAttributesNode attributes) {
        StringBuilder attrs = new StringBuilder();
        if (attributes.getHtmlAttributeNodes() != null) {
            for (HtmlAttributeNode attr : attributes.getHtmlAttributeNodes()) {
                if (attr.getNgIfNode() == null && attr.getNgForNode() == null &&
                        attr.getOnClickAttrNodel() == null && attr.getOnChangeNodeAttr() == null) {

                    attrs.append(" ");
                    String attrName = attr.getIdentifierNode();
                    String attrValue = attr.getHtmlAttributeValueNode() != null
                            ? attr.getHtmlAttributeValueNode().getValue().toString() : "";

                    attrs.append(attrName).append("=\"").append(attrValue).append("\"");
                }
            }
        }
        return attrs.toString();
    }

    // --- Event Binding Generation ---

    private void generateEventBindings(HtmlNode htmlNode) {
        if (htmlNode.getContent() == null) {
            return;
        }
        generateEventBindingsFromContent(htmlNode.getContent());
    }

    private void generateEventBindingsFromContent(HtmlContentNode content) {
        if (content.getHtmlElementNode() != null) {
            for (HtmlElementNode element : content.getHtmlElementNode()) {
                if (element.getAttributes() != null) {
                    for (HtmlAttributeNode attr : element.getAttributes().getHtmlAttributeNodes()) {
                        if (attr.getOnClickAttrNodel() != null) {
                            // This part of the visitor code is incomplete and needs to be improved
                            // to get a specific ID or class for the element.
                            // For now, it's a placeholder.
                        }
                    }
                }
                if (element.getContent() != null) {
                    generateEventBindingsFromContent(element.getContent());
                }
            }
        }
    }

    // --- Placeholder Methods for Angular Directives ---

    private String generateNgFor(NgForNode ngFor, String tagName, HtmlAttributesNode attrs, HtmlContentNode content) {
        String innerHtml = generateHtmlContent(content);
        return "<!-- *ngFor loop placeholder -->";
    }

    private String generateNgIf(NgIfNode ngIf, String tagName, HtmlAttributesNode attrs, HtmlContentNode content) {
        String innerHtml = generateHtmlContent(content);
        return "<!-- *ngIf conditional placeholder -->";
    }

    // --- Helper Methods ---

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
        jsBuilder.append(content);
    }

    private String getIndent() {
        return "  ".repeat(indentLevel);
    }
}
