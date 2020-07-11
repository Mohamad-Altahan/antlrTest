package Java.AST.QueryStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Factored_Select_Stmt extends SqlStmt {

    private Select_Core selectCore;
    public List<Ordering_Term> orderingTerm = new ArrayList<>();
    public List<ExpressionForAll> expression = new ArrayList<>();

    public Select_Core getSelectCore() {
        return selectCore;
    }

    public void setSelectCore(Select_Core selectCore) {
        this.selectCore = selectCore;
    }

    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Factored_Select_Stmt ***************");

        astVisitor.visit(this);
        if(this.selectCore!=null){
            this.selectCore.accept(astVisitor);
        }
        if(this.orderingTerm.size()>0){
            for(int i = 0 ;i<this.orderingTerm.size();i++){
                this.orderingTerm.get(i).accept(astVisitor);
            }
        }
        if(this.expression.size()>0){
            for(int i = 0 ;i<this.expression.size();i++){
                this.expression.get(i).accept(astVisitor);
            }
        }



    }
}
