package Java.AST.QueryStmt;

import Java.AST.Node;

public class Join_Operator extends Node {
    private String joinOperator = "";

    public String getJoinOperator() {
        return joinOperator;
    }

    public void setJoinOperator(String joinOperator) {
        this.joinOperator = joinOperator;
    }
}
