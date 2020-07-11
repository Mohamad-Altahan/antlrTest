package Java.AST.JavaStmt;

import Java.AST.Expression.Condition;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

import java.util.ArrayList;
import java.util.List;

public class Switch_Stmt extends JavaStmt {


    private ExpressionForAll expression;
    public List<Case> aCase= new ArrayList<Case>();
    private Default aDefault;
    private Scope scope;

    public ExpressionForAll getExpression() {
        return expression;
    }

    public void setExpression(ExpressionForAll expression) {
        this.expression = expression;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public List<Case> getaCase() {
        return aCase;
    }

    public void setaCase(List<Case> aCase) {
        this.aCase = aCase;
    }

    public Default getaDefault() {
        return aDefault;
    }

    public void setaDefault(Default aDefault) {
        this.aDefault = aDefault;
    }
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Switch_Stmt ***************");

        astVisitor.visit(this);
        if(this.expression!=null){
            this.expression.accept(astVisitor);
        }
        if(this.aCase.size()>0){
            for(int i=0 ; i<this.aCase.size();i++){

                this.aCase.get(i).accept(astVisitor);
            }
        }

        if(this.aDefault!=null){
            this.aDefault.accept(astVisitor);
        }

        System.out.println("*************** End Switch_Stmt ***************");

    }



}
