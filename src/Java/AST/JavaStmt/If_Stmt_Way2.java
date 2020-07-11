package Java.AST.JavaStmt;

import Java.AST.Expression.Condition;
import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;
import generated.SQLParser;

import java.util.ArrayList;
import java.util.List;

public class If_Stmt_Way2 extends JavaStmt {
    public List<Condition> conditions = new ArrayList<>();
    public List<If_Stmt_Way2>  if_stmt_way2 = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start If_Stmt_way2 ***************");
        astVisitor.visit(this);

//        if(this.expressionList.size()>0 && this.if_stmt_way2.size()>0){
//            for(int i=0 ; i<(this.expressionList.size())+(this.if_stmt_way2.size());i++){
//                if(this.expressionList.get(i) != null){
//                    this.expressionList.get(i).accept(astVisitor);
//
//                }
//                else if(this.if_stmt_way2.get(i) != null ){
//                    this.if_stmt_way2.get(i).accept((astVisitor));
//                }
//            }
//        }
        if(this.conditions.size()>0){
            this.conditions.get(0).accept(astVisitor);
        }
        if(this.if_stmt_way2.size()>0){
            for (int i=0;i<this.if_stmt_way2.size();i++){
                System.out.println("If_Stmt_Number(" + (i + 1) + ") :");
                this.if_stmt_way2.get(i).accept(astVisitor);
            }
        }
        else{
            for(int i=1;i<this.conditions.size();i++){
                this.conditions.get(i).accept(astVisitor);
            }
        }

        System.out.println("*************** End If_Stmt_way2 ***************");



    }
}
