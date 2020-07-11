package Java.AST.JavaStmt;

import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

import java.util.ArrayList;
import java.util.List;

public class Case extends Node {

    private ExpressionForAll expression;

    public List<JavaStmt> javaStmtList = new ArrayList<JavaStmt>();
    private Scope  scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public ExpressionForAll getExpression() {
        return expression;
    }

    public void setExpression(ExpressionForAll expression) {
        this.expression = expression;
    }

    public List<JavaStmt> getJavaStmtList() {
        return javaStmtList;
    }

    public void setJavaStmtList(List<JavaStmt> javaStmtList) {
        this.javaStmtList = javaStmtList;
    }
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.expression!=null){
            this.expression.accept(astVisitor);
        }

        System.out.println("  Block Statement : ");
        if(this.javaStmtList.size()>0){
            for(int i=0 ; i<this.javaStmtList.size();i++){

                this.javaStmtList.get(i).accept(astVisitor);
            }
        }
    }

}
