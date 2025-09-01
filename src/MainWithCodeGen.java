import nodes.BaseVisitorWithCodeGen;

import java.io.IOException;

public class MainWithCodeGen {
    public static void main(String[] args) throws IOException {
        System.out.println("=== Angular Compiler with Code Generation ===");
        System.out.println("Initializing compiler and code generators...\n");
        
        BaseVisitorWithCodeGen baseVisitor = new BaseVisitorWithCodeGen("generated");
        baseVisitor.initialize();
        
        System.out.println("\n=== Code Generation Complete ===");
        System.out.println("Generated files have been saved to the 'generated' directory");
        System.out.println("- HTML: generated/app.html");
        System.out.println("- CSS: generated/app.css");
        System.out.println("- JavaScript: generated/app.js");
        System.out.println("- Complete Web App: generated/angular-app/");
    }
}

