package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Join_Clause extends Node {
    public List<Table_Or_Subquery> tableOrSubqueries = new ArrayList<>();
    public List<Join_Operator> joinOperators = new ArrayList<>();
    public List<Join_Constraint> joinConstraints = new ArrayList<>();

    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Join_Clause ***************");
        astVisitor.visit(this);


        if(this.tableOrSubqueries.size()>0){
            for(int i = 0 ;i<this.tableOrSubqueries.size();i++){
                this.tableOrSubqueries.get(i).accept(astVisitor);
            }
        }
        if(this.joinOperators.size()>0){
            for(int i = 0 ;i<this.joinOperators.size();i++){
                this.joinOperators.get(i).accept(astVisitor);
            }
        }
        if(this.joinConstraints.size()>0){
            for(int i = 0 ;i<this.joinConstraints.size();i++){
                this.joinConstraints.get(i).accept(astVisitor);
            }
        }



    }
}
