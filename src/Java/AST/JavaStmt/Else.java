package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

import java.util.ArrayList;
import java.util.List;

public class Else extends Node {

  private List<JavaStmt> javaStmts = new ArrayList<JavaStmt>();
    private Scope scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
    public List<JavaStmt> getJavaStmts() {
        return javaStmts;
    }

    public void setJavaStmts(List<JavaStmt> javaStmts) {
        this.javaStmts = javaStmts;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("  Block Statement : ");
        if(this.javaStmts.size()>0){
            for(int i=0 ; i<this.javaStmts.size();i++){

                this.javaStmts.get(i).accept(astVisitor);
            }

        }
    }

}
