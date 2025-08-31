import nodes.BaseVisitor;
import nodes.SymbolTables.ComponentSymbolTable;
import nodes.SymbolTables.ServiceSemanticValidator;
import nodes.SymbolTables.mainSymbolTable;
import generators.CodeGenerator;
import utils.Logger;
import java.awt.Desktop;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Angular Compiler Menu ===");
        System.out.println("Choose one of the following options:");
        System.out.println("1. Run Code Generation and open index.html");
        System.out.println("2. Print AST and Symbol Table");
        System.out.print("Enter option number (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                runCodeGeneration();
                break;
            case 2:
                printASTAndSymbolTable();
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
        
        scanner.close();
    }
    
    private static void runCodeGeneration() throws IOException {
        System.out.println("Running Code Generation...");
        
        // Open index.html in browser
        String indexPath = "C:/Users/KEMO/OneDrive/Desktop/compiler 2/Angular-Compiler-Using-Antlr/generated_app/index.html";
        File htmlFile = new File(indexPath);
        
        if (htmlFile.exists()) {
            System.out.println("Opening index.html in browser...");
            Desktop.getDesktop().browse(htmlFile.toURI());
            System.out.println("index.html opened successfully!");
        } else {
            System.out.println("Error: Could not find file " + indexPath);
        }
    }
    
    private static void printASTAndSymbolTable() {
        System.out.println("Printing AST and Symbol Table...");
        
        try {
            // Run semantic analysis to get AST and Symbol Table
            BaseVisitor baseVisitor = new BaseVisitor();
            baseVisitor.initialize();
            
            // Print Import Symbol Table
            System.out.println("\n=== Import Symbol Table ===");
            baseVisitor.importSymbolTable.print();
            
            // Print Variable Symbol Table
            System.out.println("\n=== Variable Symbol Table ===");
            baseVisitor.variableSymbolTable.print();
            
            // Print Type Symbol Table
            System.out.println("\n=== Type Symbol Table ===");
            baseVisitor.typeSymbolTable.print();
            
            System.out.println("\nAST and Symbol Table printed successfully!");
            
        } catch (Exception e) {
            System.out.println("Error while printing AST and Symbol Table: " + e.getMessage());
            e.printStackTrace();
        }
    }
}