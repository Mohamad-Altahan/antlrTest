package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

public class Decrease extends Node {

    private String Name;
    private String Operator;
    private Scope scopeParent;

    public Scope getScopeParent() {
        return scopeParent;
    }

    public void setScopeParent(Scope scopeParent) {
        this.scopeParent = scopeParent;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.Operator!=null){
            System.out.println("  Operator : " + this.Operator);
        }
        if(this.Name!=null){
            System.out.println("  Name : " + this.Name);
        }
    }
}
