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
        // Add base styles
        appendLine("/* Generated CSS from Angular Components */");
        appendLine("");
        appendLine("* {");
        appendLine("  box-sizing: border-box;");
        appendLine("  margin: 0;");
        appendLine("  padding: 0;");
        appendLine("}");
        appendLine("");
        appendLine("body {");
        appendLine("  font-family: Arial, sans-serif;");
        appendLine("  line-height: 1.6;");
        appendLine("  color: #333;");
        appendLine("}");
        appendLine("");
        appendLine(".component {");
        appendLine("  padding: 20px;");
        appendLine("  margin: 10px;");
        appendLine("  border: 1px solid #ddd;");
        appendLine("  border-radius: 5px;");
        appendLine("}");
        appendLine("");
        
        // Generate component-specific styles
        for (StatementNode statement : program.getStatements()) {
            if (statement.getComponentNodes() != null) {
                generateNode(statement.getComponentNodes());
            }
        }
        
        // Add utility classes
        appendLine("/* Utility Classes */");
        appendLine(".ng-for-container {");
        appendLine("  display: flex;");
        appendLine("  flex-wrap: wrap;");
        appendLine("  gap: 10px;");
        appendLine("}");
        appendLine("");
        appendLine(".ng-if-container {");
        appendLine("  display: block;");
        appendLine("}");
        appendLine("");
        appendLine(".hidden {");
        appendLine("  display: none !important;");
        appendLine("}");
    }
    
    private void generateComponent(ComponentNode component) {
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
        if (css.getCssContentNode() != null) {
            for (CssContentNode content : css.getCssContentNode()) {
                generateNode(content);
            }
        }
    }
    
    private void generateCssContent(CssContentNode content) {
        if (content.getCssClassContentList() != null) {
            for (CssClassContentNode classContent : content.getCssClassContentList()) {
                generateNode(classContent);
            }
        }
    }
    
    private void generateCssClassContent(CssClassContentNode classContent) {
        if (classContent.getName() != null) {
            appendLine("." + classContent.getName() + " {");
            indentLevel++;
            // Add default properties
            appendLine("display: block;");
            appendLine("margin: 5px 0;");
            indentLevel--;
            appendLine("}");
            appendLine("");
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

