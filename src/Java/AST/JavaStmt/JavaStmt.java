package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.QueryStmt.SqlStmt;
import Java.AST.Visitor.ASTVisitor;

public class JavaStmt extends Node {
   private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public void accept(ASTVisitor astVisitor){


    }
}
