package Java.AST.QueryStmt;

import Java.AST.Node;

public class Alter_Table_Add_Constraint extends Node {
    private String name;
    private TableConstraint tableConstraint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableConstraint getTableConstraint() {
        return tableConstraint;
    }

    public void setTableConstraint(TableConstraint tableConstraint) {
        this.tableConstraint = tableConstraint;
    }
}
