package generators;

import utils.Logger;

import nodes.ASTNode;
import nodes.product.ProductNode;
import nodes.product.ProductManagerNode;
import nodes.state.StateNode;
import nodes.state.ActionNode;
import nodes.crud.CRUDNode;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Main CodeGenerator that orchestrates all individual generators
 * Generates complete web application from AST nodes
 */
public class CodeGenerator {
    private HTMLGenerator htmlGenerator;
    private CSSGenerator cssGenerator;
    private JavaScriptGenerator jsGenerator;
    private PHPGenerator phpGenerator;
    private Logger logger = Logger.getInstance();
    private String outputDirectory;

    public CodeGenerator() {
        this.htmlGenerator = new HTMLGenerator();
        this.cssGenerator = new CSSGenerator();
        this.jsGenerator = new JavaScriptGenerator();
        this.phpGenerator = new PHPGenerator();
        this.outputDirectory = "generated_app";
    }

    public CodeGenerator(String outputDirectory) {
        this();
        this.outputDirectory = outputDirectory;
    }

    /**
     * Generate complete web application
     */
    public void generateApplication(ProductManagerNode productManager) {
        try {
            // Create output directory
            createOutputDirectory();

            // Generate HTML
            String html = htmlGenerator.generateHTML(productManager);
            writeToFile("index.html", html);

            // Generate CSS
            String css = cssGenerator.generateCSS();
            writeToFile("styles.css", css);

            // Generate JavaScript
            String javascript = jsGenerator.generateJavaScript(productManager);
            writeToFile("script.js", javascript);

            // Generate PHP (optional)
            String php = phpGenerator.generatePHP(productManager);
            writeToFile("app.php", php);



            System.out.println("✅ تم إنشاء التطبيق بنجاح في مجلد: " + outputDirectory);

        } catch (Exception e) {
            System.err.println("❌ خطأ في إنشاء التطبيق: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Generate HTML only
     */
    public void generateHTML(ProductManagerNode productManager) {
        try {
            createOutputDirectory();
            String html = htmlGenerator.generateHTML(productManager);
            writeToFile("index.html", html);
            System.out.println("✅ تم إنشاء HTML بنجاح");
        } catch (Exception e) {
            System.err.println("❌ خطأ في إنشاء HTML: " + e.getMessage());
        }
    }

    /**
     * Generate CSS only
     */
    public void generateCSS() {
        try {
            createOutputDirectory();
            String css = cssGenerator.generateCSS();
            writeToFile("styles.css", css);
            System.out.println("✅ تم إنشاء CSS بنجاح");
        } catch (Exception e) {
            System.err.println("❌ خطأ في إنشاء CSS: " + e.getMessage());
        }
    }

    /**
     * Generate JavaScript only
     */
    public void generateJavaScript(ProductManagerNode productManager) {
        try {
            createOutputDirectory();
            String javascript = jsGenerator.generateJavaScript(productManager);
            writeToFile("script.js", javascript);
            System.out.println("✅ تم إنشاء JavaScript بنجاح");
        } catch (Exception e) {
            System.err.println("❌ خطأ في إنشاء JavaScript: " + e.getMessage());
        }
    }

    /**
     * Generate PHP only
     */
    public void generatePHP(ProductManagerNode productManager) {
        try {
            createOutputDirectory();
            String php = phpGenerator.generatePHP(productManager);
            writeToFile("app.php", php);
            System.out.println("✅ تم إنشاء PHP بنجاح");
        } catch (Exception e) {
            System.err.println("❌ خطأ في إنشاء PHP: " + e.getMessage());
        }
    }

    /**
     * Create output directory
     */
    private void createOutputDirectory() throws IOException {
        if (!Files.exists(Paths.get(outputDirectory))) {
            Files.createDirectories(Paths.get(outputDirectory));
        }
    }

    /**
     * Write content to file
     */
    private void writeToFile(String filename, String content) throws IOException {
        String filePath = outputDirectory + "/" + filename;
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }

  
    /**
     * Get output directory
     */
    public String getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Set output directory
     */
    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    /**
     * Reset all generators
     */
    public void reset() {
        htmlGenerator.reset();
        cssGenerator.reset();
        jsGenerator.reset();
        phpGenerator.reset();
    }

    /**
     * Get current HTML content
     */
    public String getCurrentHTML() {
        return htmlGenerator.getCurrentHTML();
    }

    /**
     * Get current CSS content
     */
    public String getCurrentCSS() {
        return cssGenerator.getCurrentCSS();
    }

    /**
     * Get current JavaScript content
     */
    public String getCurrentJavaScript() {
        return jsGenerator.getCurrentJavaScript();
    }

    /**
     * Get current PHP content
     */
    public String getCurrentPHP() {
        return phpGenerator.getCurrentPHP();
    }

    /**
     * Main method for testing code generation
     */
    public static void main(String[] args) {
        System.out.println("🚀 بدء توليد الكود...");

        try {
            CodeGenerator codeGenerator = new CodeGenerator();

            // Test HTML generation
            System.out.println("📄 توليد HTML...");
            codeGenerator.generateHTML(null);

            // Test CSS generation
            System.out.println("🎨 توليد CSS...");
            codeGenerator.generateCSS();

            // Test JavaScript generation
            System.out.println("⚡ توليد JavaScript...");
            codeGenerator.generateJavaScript(null);

            // Test PHP generation
            System.out.println("🐘 توليد PHP...");
            codeGenerator.generatePHP(null);

            System.out.println("✅ تم إنشاء جميع الملفات بنجاح!");

        } catch (Exception e) {
            System.err.println("❌ خطأ في التوليد: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
