import nodes.BaseVisitor;
import generators.CodeGenerator;
import utils.Logger;
import java.awt.Desktop;
import java.io.File;
import java.util.Scanner;

public class Main {
    private static final Logger logger = Logger.getInstance();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseVisitor baseVisitor = new BaseVisitor();
        
        // Add shutdown hook to ensure logger is closed properly
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\nShutting down gracefully...");
            logger.close();
        }));
        
        System.out.println("=== Angular Compiler Using ANTLR ===");
        System.out.println("1. Test specific file");
        System.out.println("2. Print AST from default file");
        System.out.println("3. Open generated app");
        System.out.println("4. Exit");
        
        while (true) {
            System.out.print("\nEnter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    testSpecificFile(baseVisitor, scanner);
                    break;
                case 2:
                    printAST(baseVisitor);
                    break;
                case 3:
                    openIndexHtml();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    logger.close();
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void testSpecificFile(BaseVisitor baseVisitor, Scanner scanner) {
        System.out.println("\n=== Available Test Files ===");
        System.out.println("1. test_syntax_error.txt - Contains syntax error");
        System.out.println("2. test_semantic_error.txt - Contains semantic error (ngIf + ngFor)");
        System.out.println("3. test_valid_code.txt - Valid Angular component");
        System.out.println("4. test_complex_component.txt - Complex component with advanced features");
        System.out.println("5. test_import_error.txt - Contains import error");
        
        System.out.print("\nSelect test file (1-5): ");
        int fileChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        String fileName = "";
        switch (fileChoice) {
            case 1:
                fileName = "test_syntax_error.txt";
                break;
            case 2:
                fileName = "test_semantic_error.txt";
                break;
            case 3:
                fileName = "test_valid_code.txt";
                break;
            case 4:
                fileName = "test_complex_component.txt";
                break;
            case 5:
                fileName = "test_import_error.txt";
                break;
            default:
                System.out.println("Invalid choice. Using default test file.");
                fileName = "test_valid_code.txt";
        }
        
        System.out.println("Testing file: " + fileName);
        logger.info("Testing file: " + fileName);
        try {
            baseVisitor.testFile(fileName);
        } catch (Exception e) {
            logger.error("Error testing file: " + e.getMessage(), e);
        }
    }
    
    private static void printAST(BaseVisitor baseVisitor) {
        System.out.println("Printing AST from default file...");
        logger.info("Printing AST from default file...");
        try {
            baseVisitor.printAst();
        } catch (Exception e) {
            logger.error("Error printing AST: " + e.getMessage(), e);
        }
    }

    private static void openIndexHtml() {
        try {
            String indexHtmlPath = "C:\\Users\\KEMO\\OneDrive\\Desktop\\compiler 2\\Angular-Compiler-Using-Antlr\\generated_app\\index.html";
            File indexHtmlFile = new File(indexHtmlPath);

            if (indexHtmlFile.exists()) {
                System.out.println("Opening generated app...");
                logger.info("Opening generated app...");
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(indexHtmlFile.toURI());
                }
            } else {
                logger.error("Generated app not found at: " + indexHtmlPath);
            }
        } catch (Exception e) {
            logger.error("Error opening generated app: " + e.getMessage(), e);
        }
    }
}