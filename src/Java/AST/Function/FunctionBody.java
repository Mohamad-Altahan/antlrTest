package Java.AST.Function;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody extends Node {

    private List<Java.AST.JavaStmt.JavaStmt> JavaStmt = new ArrayList<Java.AST.JavaStmt.JavaStmt>();

    public List<Java.AST.JavaStmt.JavaStmt> getJavaStmt() {
        return JavaStmt;
    }

    public void setJavaStmt(List<Java.AST.JavaStmt.JavaStmt> javaStmt) {
        JavaStmt = javaStmt;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.JavaStmt.size()>0) {
            for (int i = 0; i < this.JavaStmt.size(); i++) {
                this.JavaStmt.get(i).accept(astVisitor);



            }
        }

    }

}
