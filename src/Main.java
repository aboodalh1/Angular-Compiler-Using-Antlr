import generators.CodeGenerator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("🚀 بدء تشغيل Angular Compiler...");

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