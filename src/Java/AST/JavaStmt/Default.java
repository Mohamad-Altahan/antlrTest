package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

import java.util.ArrayList;
import java.util.List;

public class Default extends Node {

    public List<JavaStmt> javaStmtList = new ArrayList<JavaStmt>();

    public List<JavaStmt> getJavaStmtList() {
        return javaStmtList;
    }

    private Scope scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public void setJavaStmtList(List<JavaStmt> javaStmtList) {
        this.javaStmtList = javaStmtList;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("  Block Statement : ");
        if(this.javaStmtList.size()>0){
            for(int i=0 ; i<this.javaStmtList.size();i++){

                this.javaStmtList.get(i).accept(astVisitor);
            }
        }
    }

}
