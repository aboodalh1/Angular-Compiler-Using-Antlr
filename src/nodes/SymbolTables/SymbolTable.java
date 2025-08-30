package nodes.SymbolTables;

import nodes.Row;

import java.util.ArrayList;
import java.util.List;

public abstract class SymbolTable {

    List<Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public void print() {
        System.out.println("Symbol table: ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-40s | %-40s| %-40s | %-40s\n", "Type", "Name", "Scope", "Value");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Row row : rows) {
            System.out.printf("%-40s |%-40s  | %-40s |%-40s\n", row.getType(), row.getName(), row.getScope(), row.getValue());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public boolean isImported(String className) {
        System.out.println("ddd");
        for (Row row : rows) {
            System.out.println(row.getType());
            if (row.getType() == "Import Statement" && row.getName() == className) {
                return true;
            }
        }
        return false;
    }

    public void addImport(String className) {
        rows.add(new Row("import", className, "global", ""));
    }

    public boolean variableExistsInScope(String name, String scope) {
        for (Row row : rows) {
            if (row.getType() != null && row.getType().equals("Variable Declaration") && row.getName() != null && row.getName().equals(name) && row.getScope() != null && row.getScope().equals(scope)) {
                return true;
            }
        }
        return false;
    }

}

