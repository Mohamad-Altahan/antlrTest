package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class InsertStmt extends SqlStmt {

    private String TableName;
    public List<String> Columns = new ArrayList<String>();
    public List<Row> Values = new ArrayList<Row>();

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
