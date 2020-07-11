package Java.AST.JavaStmt;

import Java.AST.Expression.Condition;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

import java.util.ArrayList;
import java.util.List;

public class If1 extends Node {

    private Condition condition;

    private List<JavaStmt> Body = new ArrayList<JavaStmt>();
    private Scope scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<JavaStmt> getBody() {
        return Body;
    }

    public void setBody(List<JavaStmt> body) {
        Body = body;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.condition!=null){
            this.condition.accept(astVisitor);
        }
        System.out.println("  Block IFStatement : ");
        if(this.Body.size()>0){
            for(int i=0 ; i<this.Body.size();i++){

                this.Body.get(i).accept(astVisitor);
            }

        }



    }

}
