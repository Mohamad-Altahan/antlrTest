package Java.AST.QueryStmt;

import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;

public class Column_UpdateStmt {

    private String ColName;
    public ExpressionForAll expr;

    public String getColName() {
        return ColName;
    }

    public void setColName(String colName) {
        ColName = colName;
    }
}
