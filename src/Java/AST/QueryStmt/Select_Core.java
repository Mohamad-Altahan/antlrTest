package Java.AST.QueryStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Select_Core extends Node {
    public List<Result_Column> resultColumns = new ArrayList<>();
    public List<Table_Or_Subquery> tableOrSubqueries = new ArrayList<>();
    private Join_Clause joinClause;
    public List<ExpressionForAll> expression = new ArrayList<>();

    public Join_Clause getJoinClause() {
        return joinClause;
    }

    public void setJoinClause(Join_Clause joinClause) {
        this.joinClause = joinClause;
    }

    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Factored_Select_Stmt ***************");
        astVisitor.visit(this);

        if(this.resultColumns.size()>0){
            for(int i = 0 ;i<this.resultColumns.size();i++){
                this.resultColumns.get(i).accept(astVisitor);
            }
        }
        if(this.tableOrSubqueries.size()>0){
            for(int i = 0 ;i<this.tableOrSubqueries.size();i++){
                this.tableOrSubqueries.get(i).accept(astVisitor);

            }
        }


    }

}
