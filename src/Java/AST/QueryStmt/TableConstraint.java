package Java.AST.QueryStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;

public class TableConstraint extends Node {
    private String name;
    private Table_Constraint_Primary_Key tableConstraintPrimaryKey;
    private Table_Constraint_Key tableConstraintKey;
    private Table_Constraint_Unique tableConstraintUnique;
    private ExpressionForAll expression;
    private Table_Constraint_Foreign_Key tableConstraintForeignKey;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Table_Constraint_Primary_Key getTableConstraintPrimaryKey() {
        return tableConstraintPrimaryKey;
    }

    public void setTableConstraintPrimaryKey(Table_Constraint_Primary_Key tableConstraintPrimaryKey) {
        this.tableConstraintPrimaryKey = tableConstraintPrimaryKey;
    }

    public Table_Constraint_Key getTableConstraintKey() {
        return tableConstraintKey;
    }

    public void setTableConstraintKey(Table_Constraint_Key tableConstraintKey) {
        this.tableConstraintKey = tableConstraintKey;
    }

    public Table_Constraint_Unique getTableConstraintUnique() {
        return tableConstraintUnique;
    }

    public void setTableConstraintUnique(Table_Constraint_Unique tableConstraintUnique) {
        this.tableConstraintUnique = tableConstraintUnique;
    }

    public ExpressionForAll getExpression() {
        return expression;
    }

    public void setExpression(ExpressionForAll expression) {
        this.expression = expression;
    }

    public Table_Constraint_Foreign_Key getTableConstraintForeignKey() {
        return tableConstraintForeignKey;
    }

    public void setTableConstraintForeignKey(Table_Constraint_Foreign_Key tableConstraintForeignKey) {
        this.tableConstraintForeignKey = tableConstraintForeignKey;
    }
}
