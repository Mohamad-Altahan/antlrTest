package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class AlterTableAdd extends Node {

    private TableConstraint tableConstraint;

    public TableConstraint getTableConstraint() {
        return tableConstraint;
    }

    public void setTableConstraint(TableConstraint tableConstraint) {
        this.tableConstraint = tableConstraint;
    }


    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Alter_table_Add ***************");
        astVisitor.visit(this);
        System.out.println("*************** End Alter_table_Add ***************");

    }
}
