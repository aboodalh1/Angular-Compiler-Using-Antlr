import nodes.BaseVisitorWithCodeGen;
//import nodes.BaseVisitor;
import nodes.ASTNode;
import nodes.codegen.CodeGenerationManager;

import java.io.IOException;

public class MainWithCodeGen {
    public static void main(String[] args) throws IOException {
        System.out.println("=== Angular Compiler with Code Generation ===");
        System.out.println("Initializing compiler and code generators...\n");

        BaseVisitorWithCodeGen baseVisitor = new BaseVisitorWithCodeGen("generated");
        // baseVisitor.initialize();
        
        ASTNode astRoot = baseVisitor.initialize();
        System.out.println(astRoot);

        // Initialize code generation manager
         CodeGenerationManager codeGenManager = new CodeGenerationManager();
        
        // // Generate code from the AST
         System.out.println("\n--- Code Generation ---");
         codeGenManager.generateWebApp(astRoot, "angular-app");
        
        // System.out.println("Code generation completed successfully!");
        // System.out.println("\n=== Code Generation Complete ===");
        // System.out.println("Generated files have been saved to the 'generated' directory");
        // System.out.println("- HTML: generated/app.html");
        // System.out.println("- CSS: generated/app.css");
        // System.out.println("- JavaScript: generated/app.js");
        // System.out.println("- Complete Web App: generated/angular-app/");
    }
}

