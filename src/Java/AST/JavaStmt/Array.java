package Java.AST.JavaStmt;

import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Array extends JavaStmt {

    public List<ExpressionForAll> expressionList = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
