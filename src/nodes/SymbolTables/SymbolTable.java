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
        for (Row row : rows) {
            if ("Import Statement".equals(row.getType()) && className.equals(row.getName())) {
                return true;
            }
        }
        return false;
    }

    public void addImport(String className) {
        Row row = new Row();
        row.setType("Import Statement");
        row.setName(className);
        row.setScope("Global");
        row.setValue("");
        rows.add(row);
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

