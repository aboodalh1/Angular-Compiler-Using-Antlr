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
    BaseVisitor baseVisitor = new BaseVisitor();
    baseVisitor.initialize();
    }
}