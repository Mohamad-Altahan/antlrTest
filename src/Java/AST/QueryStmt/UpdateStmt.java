package Java.AST.QueryStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class UpdateStmt extends SqlStmt {
    private String TableName;
    public List<Column_UpdateStmt> ColUpdateStmt = new ArrayList<Column_UpdateStmt>();
    public ExpressionForAll SqlExpr;


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
