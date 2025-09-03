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
        // Only generate CSS from component styles - no static CSS
        appendLine("/* Generated CSS from Angular Components */");
        appendLine("");
        
        // Generate component-specific styles only
        for (StatementNode statement : program.getStatements()) {
            if (statement.getComponentNodes() != null) {
                generateComponent(statement.getComponentNodes());
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
            indentLevel++;
            
            // Generate CSS properties dynamically from the parsed content
            if (classContent.getProperties() != null && !classContent.getProperties().isEmpty()) {
                for (int i = 0; i < classContent.getProperties().size(); i++) {
                    String property = classContent.getProperties().get(i);
                    String value = "";
                    
                    // Get corresponding value if available
                    if (classContent.getValues() != null && i < classContent.getValues().size()) {
                        value = classContent.getValues().get(i);
                    }
                    
                    // Generate CSS property line
                    if (!value.isEmpty()) {
                        appendLine(property + ": " + value + ";");
                    } else {
                        appendLine(property + ";");
                    }
                }
            } else {
                // Don't add default properties - only generate what's in the component
                // This ensures we only generate CSS from the input
            }
            
            indentLevel--;
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
