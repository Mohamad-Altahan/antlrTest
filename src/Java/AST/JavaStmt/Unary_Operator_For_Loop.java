package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

public class Unary_Operator_For_Loop extends Node {

    private Decrease decrease;
    private Increase increase;
    private Scope scopeParent;

    public Scope getScopeParent() {
        return scopeParent;
    }

    public void setScopeParent(Scope scopeParent) {
        this.scopeParent = scopeParent;
    }

    public Decrease getDecrease() {
        return decrease;
    }

    public void setDecrease(Decrease decrease) {
        this.decrease = decrease;
    }

    public Increase getIncrease() {
        return increase;
    }

    public void setIncrease(Increase increase) {
        this.increase = increase;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(this.increase!=null){
            this.increase.accept(astVisitor);
        }
        else if(this.decrease!=null){
            this.decrease.accept(astVisitor);

        }


    }

}
