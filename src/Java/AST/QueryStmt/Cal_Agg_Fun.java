package Java.AST.QueryStmt;

import Java.AST.JavaStmt.Parameter_List_For_CalAggFunc;
import Java.AST.JavaStmt.Parameter_List_For_CalFunc;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Cal_Agg_Fun extends Node {

    private String funcName;
    public Parameter_List_For_CalAggFunc parameter_list_for_calAggFunc ;

    public Parameter_List_For_CalAggFunc getParameter_list_for_calAggFunc() {
        return parameter_list_for_calAggFunc;
    }

    public void setParameter_list_for_calAggFunc(Parameter_List_For_CalAggFunc parameter_list_for_calAggFunc) {
        this.parameter_list_for_calAggFunc = parameter_list_for_calAggFunc;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);



        if(this.parameter_list_for_calAggFunc!=null){
            this.parameter_list_for_calAggFunc.accept(astVisitor);
        }



    }
}
