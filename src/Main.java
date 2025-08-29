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
        System.out.println("1. test_ngif_ngfor_error.txt - Contains ngIf + ngFor semantic error");
        System.out.println("2. test_duplicate_variables.txt - Contains duplicate variable declaration error");
        System.out.println("3. test_unimported_types.txt - Contains unimported types semantic error");
        
        System.out.print("\nSelect test file (1-3): ");
        int fileChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        String fileName = "";
        switch (fileChoice) {
            case 1:
                fileName = "test_ngif_ngfor_error.txt";
                break;
            case 2:
                fileName = "test_duplicate_variables.txt";
                break;
            case 3:
                fileName = "test_unimported_types.txt";
                break;
            default:
                System.out.println("Invalid choice. Using default test file.");
                fileName = "test_ngif_ngfor_error.txt";
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