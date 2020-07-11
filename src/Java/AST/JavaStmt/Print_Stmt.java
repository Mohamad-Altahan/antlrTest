package Java.AST.JavaStmt;

import Java.AST.Expression.Condition;
import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Print_Stmt extends JavaStmt {

    public List<Call_Json_Var> callJsonVarList = new ArrayList<Call_Json_Var>();

    public List<Condition> conditions = new ArrayList<Condition>();;


    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Print_Stmt ***************");

        astVisitor.visit(this);

        if(this.conditions.size()>0){
            for(int i=0 ; i<this.conditions.size();i++){

                this.conditions.get(i).accept(astVisitor);
            }

        } if(this.callJsonVarList.size()>0){
            for(int i=0 ; i<this.callJsonVarList.size();i++){

                this.callJsonVarList.get(i).accept(astVisitor);
            }

        }

        System.out.println("*************** End Print_Stmt ***************");

    }


}
