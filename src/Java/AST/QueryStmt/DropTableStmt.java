package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;

public class DropTableStmt extends SqlStmt {

    private String dataBaseName = "";
    private String TableName;
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
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
