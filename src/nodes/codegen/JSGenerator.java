package nodes.codegen;

import nodes.ASTNode;
import nodes.html_node.*;
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
        if(variable.getArrayDeclarationNodeList()!=null){
            for(int i=0;i<variable.getArrayDeclarationNodeList().getValues().size();i++){
                String varValue2=variable.getArrayDeclarationNodeList().getValues().get(i).getArrayValue();
                String varValue1="null";
                if (variable.getArrayDeclarationNodeList().getIdentifier() != null) {
                    varValue1 = variable.getIdentifier();
                }
                appendLine("public " + varValue1 + "[" + i + "]" + " = " + varValue2 + ";");
            }
        }
        appendLine("public " + varName + " = " + varValue + ";");
    }

    private String generateExpressionValue(ExpressionNode expression) {
        if (expression.getLiteralNode() != null) {
            if(expression.getLiteralNode().getStirngValue()!=null){
                return expression.getLiteralNode().getStirngValue();
            }
            if(expression.getLiteralNode().getNumValue()!=null){
                return expression.getLiteralNode().getNumValue();
            }
            if(expression.getLiteralNode().getBooleanValue()!=null){
                return expression.getLiteralNode().getBooleanValue();
            }
            if(expression.getLiteralNode().getIdentifierValue()!=null){
                return expression.getLiteralNode().getIdentifierValue();
            }
            if(expression.getLiteralNode().getArrayValue()!=null){
                return expression.getLiteralNode().getArrayValue();
            }
            if(expression.getLiteralNode().getListLiteralNode()!=null){
                for(int i=0;i<expression.getLiteralNode().getListLiteralNode().getIdentifiers().size();i++){
                    List<String> identifiers=expression.getLiteralNode().getListLiteralNode().getIdentifiers();
                    return identifiers.get(i);
                }
            }
            if(expression.getLiteralNode().getHtmlNode()!=null){
                return generateHtml(expression.getLiteralNode().getHtmlNode());
            }
            if(expression.getLiteralNode().getArrayValue()!=null){
                return expression.getLiteralNode().getArrayValue();
            }
            if(expression.getLiteralNode().getMapLiteralNode()!=null){
                return expression.getLiteralNode().getMapLiteralNode().toString();
            }
            if(expression.getLiteralNode().getListLiteralNode()!=null){
                return expression.getLiteralNode().getListLiteralNode().toString();
            }
            return expression.getLiteralNode().getClass().getName();

        }
        if (expression.getIdentifier() != null) {
            return "this." + expression.getIdentifier();
        }
        return "undefined";
    }

    private void generateFunction(FunctionDeclarationNode function) {
        String functionName = function.getIdentifier();
        List<ParameterNode> parameters = function.getParameters();

        append("function " + functionName + "(");
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

        // Attribute holders
        String identifierNode = null;
        String classNode = null;
        List<AccessSufNode> accessSufNode = null;
        HtmlAttributeValueNode htmlAttributeValueNode = null;
        NgIfNode ngIfNode = null;
        NgForNode ngForNode = null;
        OnChangeNodeAttr onChangeNodeAttr = null;
        OnClickAttrNode onClickAttrNode = null;
        StringBuilder extraAttributes = new StringBuilder();
        String onClickHandler = null;
        String onChangeHandler = null;

        if (element.getAttributes() != null) {
            for (HtmlAttributeNode attr : element.getAttributes().getHtmlAttributeNodes()) {
                if (attr.getNgIfNode() != null) {
                    ngIfNode = attr.getNgIfNode();
                }
                if (attr.getNgForNode() != null) {
                    ngForNode = attr.getNgForNode();
                }
                if (attr.getHtmlAttributeValueNode() != null) {
                    htmlAttributeValueNode = attr.getHtmlAttributeValueNode();
                }
                if (attr.getAccessSufNode() != null) {
                    accessSufNode = attr.getAccessSufNode();
                }
                if (attr.getIdentifierNode() != null) {
                    identifierNode = attr.getIdentifierNode();
                }
                if (attr.getClassNode() != null) {
                    classNode = attr.getClassNode();
                }
                if (attr.getOnChangeNodeAttr() != null) {
                    onChangeNodeAttr = attr.getOnChangeNodeAttr();
                    if (onChangeNodeAttr.getAttrValue() != null) {
                        onChangeHandler = onChangeNodeAttr.getAttrValue();
                    }
                }
                if (attr.getOnClickAttrNodel() != null) {
                    onClickAttrNode = attr.getOnClickAttrNodel();
                    if (onClickAttrNode.getValue() != null) {
                        onClickHandler = onClickAttrNode.getValue();
                    }
                }
                // Standard HTML attributes
                if (attr.getIdentifierNode() != null && attr.getHtmlAttributeValueNode() != null) {
                    String attrName = attr.getIdentifierNode();
                    String attrValue = "";
                    if (attr.getHtmlAttributeValueNode().getValue() != null) {
                        attrValue = attr.getHtmlAttributeValueNode().getValue().getStirngValue();
                    } else if (attr.getHtmlAttributeValueNode().getExpression() != null) {
                        attrValue = generateExpressionValue(attr.getHtmlAttributeValueNode().getExpression());
                    }
                    extraAttributes.append(" ").append(attrName).append("=\"").append(attrValue).append("\"");
                }
            }
        }
        // NgFor and NgIf placeholders
        if (ngForNode != null) {
            html.append(generateNgFor(ngForNode, tagName, element.getAttributes(), element.getContent()));
        } else if (ngIfNode != null) {
            html.append(generateNgIf(ngIfNode, tagName, element.getAttributes(), element.getContent()));
        }
        else {
            html.append("<").append(tagName);
            // Always add a unique ID for event binding
            html.append(" id=\"").append(elementId).append("\"");
            if (classNode != null) {
                html.append(" class=\"").append(classNode).append("\"");
            }
            if (identifierNode != null) {
                html.append(" name=\"").append(identifierNode).append("\"");
            }
            if (onClickHandler != null) {
                html.append(" data-onclick=\"").append(onClickHandler).append("\"");
            }

            if (onChangeHandler != null) {
                html.append(" data-onchange=\"").append(onChangeHandler).append("\"");
            }
            // Add any extra attributes
            html.append(extraAttributes);
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
