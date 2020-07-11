package Java.AST.QueryStmt;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class Table_Constraint_Foreign_Key extends Node {

    public List<String> fkOriginColumnName =new ArrayList<>();
    private Foreign_Key_Clause foreignKeyClause;

    public Foreign_Key_Clause getForeignKeyClause() {
        return foreignKeyClause;
    }

    public void setForeignKeyClause(Foreign_Key_Clause foreignKeyClause) {
        this.foreignKeyClause = foreignKeyClause;
    }
}
