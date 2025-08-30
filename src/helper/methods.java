package helper;

import nodes.SemanticAnalyzer;
import nodes.SymbolTables.SymbolTable;
import nodes.statement.ProgramNode;

import java.util.List;

public class methods {

    public static void printAST(ProgramNode programNode) {
            System.out.println("\n=== AST ===");
            System.out.println(programNode);
    }

    public static void printSemanticError(SemanticAnalyzer analyzer  , SymbolTable symbolTable) {

        System.out.println("\n--- Semantic Analysis Results ---");

        // Print semantic errors from the analyzer
        printErrors("Semantic Errors (from Analyzer)", analyzer.getSemanticErrors());

        // Print symbol table
        System.out.println("\n=== Symbol Table ===");
        symbolTable.print();
    }

    private static void printErrors(String title, List<String> errors) {
        System.out.println("\n=== " + title + " ===");
        if (errors == null || errors.isEmpty()) {
            System.out.println("No errors found.");
        } else {
            System.err.println("Found " + errors.size() + " error(s):");
            errors.forEach(System.err::println);
        }
    }
}
