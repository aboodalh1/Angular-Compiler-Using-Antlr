//
//import nodes.BaseVisitor;
//import nodes.ASTNode;
//import nodes.codegen.CodeGenerationManager;
//
//import java.io.IOException;
//
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        // Initialize the visitor and get the AST
//        BaseVisitor baseVisitor = new BaseVisitor();
//        ASTNode astRoot = baseVisitor.initialize();
//        System.out.println(astRoot);
//
//        // Initialize code generation manager
//        CodeGenerationManager codeGenManager = new CodeGenerationManager();
//
//        // Generate code from the AST
//        System.out.println("\n--- Code Generation ---");
//        codeGenManager.generateWebApp(astRoot, "angular-app");
//
//        System.out.println("Code generation completed successfully!");
//    }
//}