package nodes.codegen;

import nodes.ASTNode;
import nodes.css_node.CssClassContentNode;
import nodes.css_node.CssContentNode;
import nodes.css_node.CssNode;
import nodes.statement.*;

/**
 * Generates CSS code from Angular AST nodes
 */
public class CSSGenerator implements CodeGenerator {
    
    private StringBuilder cssBuilder;
    private int indentLevel = 0;
    
    @Override
    public String generateCode(ASTNode node) {
        cssBuilder = new StringBuilder();
        generateNode(node);
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
    
    private void generateNode(ASTNode node) {
        if (node == null) return;
        
        if (node instanceof ProgramNode) {
            generateProgram((ProgramNode) node);
        } else if (node instanceof ComponentNode) {
            generateComponent((ComponentNode) node);
        } else if (node instanceof CssNode) {
            generateCss((CssNode) node);
        } else if (node instanceof CssContentNode) {
            generateCssContent((CssContentNode) node);
        } else if (node instanceof CssClassContentNode) {
            generateCssClassContent((CssClassContentNode) node);
        }
    }
    
    private void generateProgram(ProgramNode program) {
        // Only generate CSS from component styles - no static CSS
        appendLine("/* Generated CSS from Angular Components */");
        appendLine("");
        
        // Generate component-specific styles only
        for (StatementNode statement : program.getStatements()) {
            if (statement.getComponentNodes() != null) {
                generateNode(statement.getComponentNodes());
            }
        }
    }
    
    private void generateComponent(ComponentNode component) {
        // First, extract styles from component decorator
        if (component.getDecorator() != null && component.getDecorator().getArguments() != null) {
            for (ArgumentNode argument : component.getDecorator().getArguments()) {
                if ("styles".equals(argument.getName()) && argument.getCssNode() != null) {
                    // Generate the CSS from the styles array
                    generateNode(argument.getCssNode());
                    return; // Found styles, generate them and exit
                }
            }
        }
        
        // Fallback: generate default component styles
        if (component.getExportClass() != null && 
            component.getExportClass().getClassNode() != null) {
            
            String componentName = component.getExportClass().getClassNode().getIdentifier();
            if (componentName != null) {
                String cssClassName = componentName.toLowerCase().replace("component", "");
                
                appendLine("/* " + componentName + " Styles */");
                appendLine("." + cssClassName + " {");
                indentLevel++;
                appendLine("background-color: #f9f9f9;");
                appendLine("padding: 15px;");
                appendLine("margin-bottom: 20px;");
                appendLine("border-radius: 8px;");
                appendLine("box-shadow: 0 2px 4px rgba(0,0,0,0.1);");
                indentLevel--;
                appendLine("}");
                appendLine("");
                
                // Generate styles for component elements
                if (component.getExportClass().getClassNode().getClassBody() != null) {
                    generateClassBodyStyles(component.getExportClass().getClassNode().getClassBody(), cssClassName);
                }
            }
        }
    }
    
    private void generateClassBodyStyles(ClassBodyNode classBody, String componentClass) {
        // Generate styles based on variable declarations that might contain styling info
        for (VariableDeclarationNode varDecl : classBody.getVariableDeclarationNodes()) {
            if (varDecl.getIdentifier() != null && varDecl.getIdentifier().contains("style")) {
                generateVariableStyles(varDecl, componentClass);
            }
        }
    }
    
    private void generateVariableStyles(VariableDeclarationNode varDecl, String componentClass) {
        // Generate styles based on variable declarations
        String varName = varDecl.getIdentifier();
        if (varName.contains("color")) {
            appendLine("." + componentClass + " .text {");
            appendLine("  color: #007bff;");
            appendLine("}");
            appendLine("");
        } else if (varName.contains("size")) {
            appendLine("." + componentClass + " .content {");
            appendLine("  font-size: 16px;");
            appendLine("}");
            appendLine("");
        }
    }
    
    private void generateCss(CssNode css) {
        // Generate CSS content directly from the parsed text
        // This is a simplified approach that extracts CSS from the component styles
        
        if (css.getCssContentNode() != null) {
            for (CssContentNode content : css.getCssContentNode()) {
                generateNode(content);
            }
        }
    }
    
    private void generateCssContent(CssContentNode content) {
        // Generate CSS class with its name
        if (content.getIdentifierNode() != null) {
            appendLine("." + content.getIdentifierNode().substring(1, content.getIdentifierNode().length() - 1) + " {");
            indentLevel++;

            // Generate CSS properties from the class content
            if (content.getCssClassContentList() != null) {
                for (CssClassContentNode classContent : content.getCssClassContentList()) {
                    generateNode(classContent);
                }
            }

            indentLevel--;
            appendLine("}");
            appendLine("");
        }
    }
    
    private void generateCssClassContent(CssClassContentNode classContent) {
        // Generate CSS properties directly from the parsed content
        if (classContent.getName() != null) {
            String propertyName = classContent.getName();
            String value = "";

            // Try to get value from getValue() first, then from getValues()
            if (classContent.getValue() != null && !classContent.getValue().isEmpty()) {
                value = classContent.getValue();
            } else if (classContent.getValues() != null && !classContent.getValues().isEmpty()) {
                // Join values with spaces for properties like margin: 10px 20px
                value = String.join(" ", classContent.getValues());
            }

            // Special handling for color properties
            if ("background".equals(propertyName) || "background-color".equals(propertyName)) {
                // For background, combine hex color parts
                value = value.replaceAll("\\s+", ""); // Remove all spaces
                value = value.replaceAll("([a-fA-F0-9]+)", "#$1"); // Add # to hex colors
            } else if ("color".equals(propertyName) || "border-color".equals(propertyName)) {
                // For color properties, combine hex color parts
                value = value.replaceAll("\\s+", ""); // Remove all spaces
                value = value.replaceAll("([a-fA-F0-9]+)", "#$1"); // Add # to hex colors
            } else if ("padding".equals(propertyName) || "padding-top".equals(propertyName) || "padding-bottom".equals(propertyName) ||
                      "padding-left".equals(propertyName) || "padding-right".equals(propertyName)) {
                // Special handling for padding properties
                // Fix cases like "4 8px px" -> "4px 8px"
                value = value.replaceAll("(\\d+)\\s+(\\d+)(px|%|em|rem)\\s+\\3", "$1$3 $2$3"); // Fix "4 8px px" to "4px 8px"
                value = value.replaceAll("(\\d+)\\s+(px|%|em|rem)", "$1$2"); // Fix "12 px" to "12px"
            } else if ("margin".equals(propertyName) || "margin-top".equals(propertyName) || "margin-bottom".equals(propertyName) ||
                      "margin-left".equals(propertyName) || "margin-right".equals(propertyName)) {
                // Special handling for margin properties
                // Fix cases like "4 8px px" -> "4px 8px"
                value = value.replaceAll("(\\d+)\\s+(\\d+)(px|%|em|rem)\\s+\\3", "$1$3 $2$3"); // Fix "4 8px px" to "4px 8px"
                value = value.replaceAll("(\\d+)\\s+(px|%|em|rem)", "$1$2"); // Fix "12 px" to "12px"
            } else if ("font-size".equals(propertyName) || "width".equals(propertyName) || "height".equals(propertyName) || 
                      "border-radius".equals(propertyName) || "border-width".equals(propertyName) ||
                      "top".equals(propertyName) || "bottom".equals(propertyName) || "left".equals(propertyName) || "right".equals(propertyName)) {
                // For other size properties, combine numbers with units
                value = value.replaceAll("(\\d+)\\s+(px|%|em|rem)", "$1$2"); // Fix "12 px" to "12px"
            }

            // Generate CSS property line
            if (!value.isEmpty()) {
                appendLine(propertyName + ": " + value + ";");
            } else {
                appendLine(propertyName + ";");
            }
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

