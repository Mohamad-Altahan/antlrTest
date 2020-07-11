package Java.AST.JavaStmt;

import Java.AST.QueryStmt.Cal_Agg_Fun;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Cal_Function extends JavaStmt {
    public Cal_Function_Simple calFunctionSimple;
    public Cal_Agg_Fun calAggFun;

    public Cal_Agg_Fun getCalAggFun() {
        return calAggFun;
    }

    public void setCalAggFun(Cal_Agg_Fun calAggFun) {
        this.calAggFun = calAggFun;
    }

    public Cal_Function_Simple getCalFunctionSimple() {
        return calFunctionSimple;
    }

    public void setCalFunctionSimple(Cal_Function_Simple calFunctionSimple) {
        this.calFunctionSimple = calFunctionSimple;
    }
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Cal_Function ***************");

        astVisitor.visit(this);

        if(this.calFunctionSimple!=null){
            this.calFunctionSimple.accept(astVisitor);
        }
        else if(this.calAggFun!=null){
            this.calAggFun.accept(astVisitor);
        }
        System.out.println("*************** End Cal_Function ***************");

    }

}
