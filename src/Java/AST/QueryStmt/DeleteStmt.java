package Java.AST.QueryStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;

public class DeleteStmt extends SqlStmt {

    private String TableName;
    public ExpressionForAll expr = new ExpressionForAll();


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
