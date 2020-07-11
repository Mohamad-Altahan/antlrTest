package Java.AST.QueryStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class Result_Column extends Node {
    private String tableName;
    private String ColumnName ;
    private ExpressionForAll expression;
    private String columnAlias;

    public String getColumnName() {
        return ColumnName;
    }

    public void setColumnName(String columnName) {
        ColumnName = columnName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ExpressionForAll getExpression() {
        return expression;
    }

    public void setExpression(ExpressionForAll expression) {
        this.expression = expression;
    }

    public String getColumnAlias() {
        return columnAlias;
    }

    public void setColumnAlias(String columnAlias) {
        this.columnAlias = columnAlias;
    }
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);


        if(this.expression!=null){
            this.expression.accept(astVisitor);
        }

    }

}
