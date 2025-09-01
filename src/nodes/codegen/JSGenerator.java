package nodes.codegen;

import nodes.ASTNode;
import nodes.html_node.html_content.NgForNode;
import nodes.html_node.html_content.NgIfNode;
import nodes.statement.*;

/**
 * Generates JavaScript code from Angular AST nodes
 */
public class JSGenerator implements CodeGenerator {
    
    private StringBuilder jsBuilder;
    private int indentLevel = 0;
    
    @Override
    public String generateCode(ASTNode node) {
        jsBuilder = new StringBuilder();
        generateNode(node);
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
    
    private void generateNode(ASTNode node) {
        if (node == null) return;
        
        if (node instanceof ProgramNode) {
            generateProgram((ProgramNode) node);
        } else if (node instanceof ComponentNode) {
            generateComponent((ComponentNode) node);
        } else if (node instanceof ClassNode) {
            generateClass((ClassNode) node);
        } else if (node instanceof FunctionDeclarationNode) {
            generateFunction((FunctionDeclarationNode) node);
        } else if (node instanceof VariableDeclarationNode) {
            generateVariable((VariableDeclarationNode) node);
        } else if (node instanceof NgForNode) {
            generateNgFor((NgForNode) node);
        } else if (node instanceof NgIfNode) {
            generateNgIf((NgIfNode) node);
        }
    }
    
    private void generateProgram(ProgramNode program) {
        appendLine("// Generated JavaScript from Angular Components");
        appendLine("'use strict';");
        appendLine("");
        appendLine("// Application namespace");
        appendLine("const App = {};");
        appendLine("");
        
        // Generate components
        for (StatementNode statement : program.getStatements()) {
            if (statement.getComponentNodes() != null) {
                generateNode(statement.getComponentNodes());
            }
        }
        
        // Add initialization code
        appendLine("// Initialize application");
        appendLine("document.addEventListener('DOMContentLoaded', function() {");
        indentLevel++;
        appendLine("App.init();");
        indentLevel--;
        appendLine("});");
        appendLine("");
        
        // Add utility functions
        generateUtilityFunctions();
    }
    
    private void generateComponent(ComponentNode component) {
        if (component.getExportClass() != null && 
            component.getExportClass().getClassNode() != null) {
            
            ClassNode classNode = component.getExportClass().getClassNode();
            String componentName = classNode.getIdentifier();
            
            if (componentName != null) {
                appendLine("// " + componentName);
                appendLine("App." + componentName + " = {");
                indentLevel++;
                
                // Generate component properties and methods
                if (classNode.getClassBody() != null) {
                    generateClassBody(classNode.getClassBody());
                }
                
                // Add init method
                appendLine("init: function() {");
                indentLevel++;
                appendLine("this.render();");
                appendLine("this.bindEvents();");
                indentLevel--;
                appendLine("},");
                appendLine("");
                
                // Add render method
                appendLine("render: function() {");
                indentLevel++;
                appendLine("// Render component template");
                appendLine("console.log('Rendering " + componentName + "');");
                indentLevel--;
                appendLine("},");
                appendLine("");
                
                // Add event binding method
                appendLine("bindEvents: function() {");
                indentLevel++;
                appendLine("// Bind component events");
                appendLine("console.log('Binding events for " + componentName + "');");
                indentLevel--;
                appendLine("}");
                
                indentLevel--;
                appendLine("};");
                appendLine("");
            }
        }
    }
    
    private void generateClass(ClassNode classNode) {
        String className = classNode.getIdentifier();
        
        appendLine("// Class: " + className);
        appendLine("function " + className + "() {");
        indentLevel++;
        
        if (classNode.getClassBody() != null) {
            generateClassBody(classNode.getClassBody());
        }
        
        indentLevel--;
        appendLine("}");
        appendLine("");
    }
    
    private void generateClassBody(ClassBodyNode classBody) {
        // Generate properties
        for (VariableDeclarationNode varDecl : classBody.getVariableDeclarationNodes()) {
            generateNode(varDecl);
        }
        
        // Generate methods
        for (FunctionDeclarationNode funcDecl : classBody.getFunctionDeclarationNodes()) {
            generateNode(funcDecl);
        }
    }
    
    private void generateFunction(FunctionDeclarationNode function) {
        String functionName = function.getIdentifier();
        
        if ("Constructor".equals(functionName)) {
            // Handle constructor
            appendLine("// Constructor");
        } else {
            appendLine(functionName + ": function(");
            
            // Generate parameters
            if (function.getParameters() != null && !function.getParameters().isEmpty()) {
                for (int i = 0; i < function.getParameters().size(); i++) {
                    ParameterNode param = function.getParameters().get(i);
                    append(param.getIdentifier());
                    if (i < function.getParameters().size() - 1) {
                        append(", ");
                    }
                }
            }
            
            appendLine(") {");
            indentLevel++;
            appendLine("// Function implementation");
            appendLine("console.log('Executing " + functionName + "');");
            indentLevel--;
            appendLine("},");
            appendLine("");
        }
    }
    
    private void generateVariable(VariableDeclarationNode variable) {
        String varName = variable.getIdentifier();
        
        if (variable.getExpression() != null) {
            appendLine(varName + ": " + generateExpressionValue(variable.getExpression()) + ",");
        } else {
            appendLine(varName + ": null,");
        }
    }
    
    private String generateExpressionValue(ExpressionNode expression) {
        if (expression.getLeft() instanceof LiteralValueNode) {
            LiteralValueNode literal = (LiteralValueNode) expression.getLeft();
            if (literal.getStirngValue() != null) {
                return literal.getStirngValue();
            } else if (literal.getNumValue() != null) {
                return literal.getNumValue();
            } else if (literal.getBooleanValue() != null) {
                return literal.getBooleanValue();
            } else if (literal.getIdentifierValue() != null) {
                return "'" + literal.getIdentifierValue() + "'";
            }
        }
        return "undefined";
    }
    
    private void generateNgFor(NgForNode ngFor) {
        appendLine("// Generated from *ngFor directive");
        appendLine("forEach: function(items, callback) {");
        indentLevel++;
        appendLine("if (Array.isArray(items)) {");
        indentLevel++;
        appendLine("items.forEach(callback);");
        indentLevel--;
        appendLine("}");
        indentLevel--;
        appendLine("},");
        appendLine("");
    }
    
    private void generateNgIf(NgIfNode ngIf) {
        appendLine("// Generated from *ngIf directive");
        appendLine("conditionalRender: function(condition, element) {");
        indentLevel++;
        appendLine("if (condition) {");
        indentLevel++;
        appendLine("element.style.display = 'block';");
        indentLevel--;
        appendLine("} else {");
        indentLevel++;
        appendLine("element.style.display = 'none';");
        indentLevel--;
        appendLine("}");
        indentLevel--;
        appendLine("},");
        appendLine("");
    }
    
    private void generateUtilityFunctions() {
        appendLine("// Utility functions");
        appendLine("App.utils = {");
        indentLevel++;
        
        appendLine("getElementById: function(id) {");
        indentLevel++;
        appendLine("return document.getElementById(id);");
        indentLevel--;
        appendLine("},");
        appendLine("");
        
        appendLine("querySelector: function(selector) {");
        indentLevel++;
        appendLine("return document.querySelector(selector);");
        indentLevel--;
        appendLine("},");
        appendLine("");
        
        appendLine("querySelectorAll: function(selector) {");
        indentLevel++;
        appendLine("return document.querySelectorAll(selector);");
        indentLevel--;
        appendLine("},");
        appendLine("");
        
        appendLine("addClass: function(element, className) {");
        indentLevel++;
        appendLine("if (element && element.classList) {");
        indentLevel++;
        appendLine("element.classList.add(className);");
        indentLevel--;
        appendLine("}");
        indentLevel--;
        appendLine("},");
        appendLine("");
        
        appendLine("removeClass: function(element, className) {");
        indentLevel++;
        appendLine("if (element && element.classList) {");
        indentLevel++;
        appendLine("element.classList.remove(className);");
        indentLevel--;
        appendLine("}");
        indentLevel--;
        appendLine("}");
        
        indentLevel--;
        appendLine("};");
        appendLine("");
        
        // Add main init function
        appendLine("App.init = function() {");
        indentLevel++;
        appendLine("console.log('Initializing Angular App...');");
        appendLine("// Initialize all components");
        appendLine("for (let componentName in App) {");
        indentLevel++;
        appendLine("if (App[componentName] && typeof App[componentName].init === 'function') {");
        indentLevel++;
        appendLine("App[componentName].init();");
        indentLevel--;
        appendLine("}");
        indentLevel--;
        appendLine("}");
        indentLevel--;
        appendLine("};");
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

