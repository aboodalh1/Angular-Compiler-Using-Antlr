package nodes.codegen;

import nodes.ASTNode;

/**
 * Interface for code generators that can convert AST nodes to target code
 */
public interface CodeGenerator {
    
    /**
     * Generate code from an AST node
     * @param node The AST node to generate code from
     * @return Generated code as a string
     */
    String generateCode(ASTNode node);
    
    /**
     * Get the file extension for the generated code
     * @return File extension (e.g., "html", "css", "js")
     */
    String getFileExtension();
    
    /**
     * Get the content type for the generated code
     * @return Content type (e.g., "text/html", "text/css", "application/javascript")
     */
    String getContentType();
}

