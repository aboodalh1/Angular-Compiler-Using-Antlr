package nodes.codegen;

import nodes.ASTNode;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


public class CodeGenerationManager {
    
    private Map<String, CodeGenerator> generators;
    private String outputDirectory;
    
    public CodeGenerationManager() {
        this.generators = new HashMap<>();
        this.outputDirectory = "generated";
        initializeGenerators();
    }
    
    public CodeGenerationManager(String outputDirectory) {
        this.generators = new HashMap<>();
        this.outputDirectory = outputDirectory;
        initializeGenerators();
    }
    
    private void initializeGenerators() {
        generators.put("html", new HTMLGenerator());
        generators.put("css", new CSSGenerator());
        generators.put("js", new JSGenerator());
    }
    

    public Map<String, String> generateAll(ASTNode rootNode) {
        Map<String, String> generatedCode = new HashMap<>();
        
        for (Map.Entry<String, CodeGenerator> entry : generators.entrySet()) {
            String format = entry.getKey();
            CodeGenerator generator = entry.getValue();
            
            try {
                String code = generator.generateCode(rootNode);
                generatedCode.put(format, code);
                System.out.println("Generated " + format.toUpperCase() + " code successfully");
            } catch (Exception e) {
                System.err.println("Error generating " + format.toUpperCase() + " code: " + e.getMessage());
                generatedCode.put(format, "// Error generating code: " + e.getMessage());
            }
        }
        
        return generatedCode;
    }
    

    public String generate(ASTNode rootNode, String format) {
        CodeGenerator generator = generators.get(format.toLowerCase());
        if (generator == null) {
            throw new IllegalArgumentException("Unsupported format: " + format);
        }
        
        return generator.generateCode(rootNode);
    }
    

    public void generateAndSave(ASTNode rootNode, String baseFileName) {
        try {
            // Create output directory if it doesn't exist
            Path outputPath = Paths.get(outputDirectory);
            if (!Files.exists(outputPath)) {
                Files.createDirectories(outputPath);
            }
            
            Map<String, String> generatedCode = generateAll(rootNode);
            
            for (Map.Entry<String, String> entry : generatedCode.entrySet()) {
                String format = entry.getKey();
                String code = entry.getValue();
                
                String fileName = baseFileName + "." + format;
                Path filePath = outputPath.resolve(fileName);
                
                try (FileWriter writer = new FileWriter(filePath.toFile())) {
                    writer.write(code);
                    System.out.println("Saved " + format.toUpperCase() + " code to: " + filePath);
                } catch (IOException e) {
                    System.err.println("Error saving " + format.toUpperCase() + " file: " + e.getMessage());
                }
            }
            
        } catch (IOException e) {
            System.err.println("Error creating output directory: " + e.getMessage());
        }
    }
    

    public void addGenerator(String format, CodeGenerator generator) {
        generators.put(format.toLowerCase(), generator);
    }
    

    public void removeGenerator(String format) {
        generators.remove(format.toLowerCase());
    }
    

    public String[] getSupportedFormats() {
        return generators.keySet().toArray(new String[0]);
    }
    

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }
    

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void generateWebApp(ASTNode rootNode, String appName) {
        try {
            // Create app directory structure
            Path appPath = Paths.get(outputDirectory, appName);
            if (!Files.exists(appPath)) {
                Files.createDirectories(appPath);
            }
            
            // Generate main files
            Map<String, String> generatedCode = generateAll(rootNode);
            
            // Save HTML file
            if (generatedCode.containsKey("html")) {
                Path htmlFile = appPath.resolve("index.html");
                try (FileWriter writer = new FileWriter(htmlFile.toFile())) {
                    writer.write(generatedCode.get("html"));
                }
            }
            
            // Save CSS file
            if (generatedCode.containsKey("css")) {
                Path cssFile = appPath.resolve("styles.css");
                try (FileWriter writer = new FileWriter(cssFile.toFile())) {
                    writer.write(generatedCode.get("css"));
                }
            }
            
            // Save JS file
            if (generatedCode.containsKey("js")) {
                Path jsFile = appPath.resolve("app.js");
                try (FileWriter writer = new FileWriter(jsFile.toFile())) {
                    writer.write(generatedCode.get("js"));
                }
            }
            
            System.out.println("Generated complete web application in: " + appPath);
            
        } catch (IOException e) {
            System.err.println("Error generating web application: " + e.getMessage());
        }
    }
}

