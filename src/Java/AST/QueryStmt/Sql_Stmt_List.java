package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.QueryStmt.SqlStmt;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Sql_Stmt_List extends Node {

    public List<SqlStmt> sqlStmtList = new ArrayList<>();

    public List<SqlStmt> getSqlStmtList() {
        return sqlStmtList;
    }

    public void setSqlStmtList(List<SqlStmt> sqlStmtList) {
        this.sqlStmtList = sqlStmtList;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(this.sqlStmtList.size()>0) {
            for (int i = 0; i < this.sqlStmtList.size(); i++) {
                this.sqlStmtList.get(i).accept(astVisitor);

            }
        }
    }

}
