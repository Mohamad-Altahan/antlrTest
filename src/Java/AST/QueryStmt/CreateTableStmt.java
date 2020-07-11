package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class CreateTableStmt extends SqlStmt {
    private String dataBaseName = "";
    private String TableName;
    private String fullName;
    public List<ColumnDef> columnDefList = new ArrayList<ColumnDef>();
    public List<TableConstraint> tableConstraints = new ArrayList<>();
    private Factored_Select_Stmt factoredSelectStmt;

    public Factored_Select_Stmt getFactoredSelectStmt() {
        return factoredSelectStmt;
    }

    public void setFactoredSelectStmt(Factored_Select_Stmt factoredSelectStmt) {
        this.factoredSelectStmt = factoredSelectStmt;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
