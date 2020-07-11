package Java.AST.JavaStmt;

import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class Parameter_For_CalFunc extends Node {
    public ExpressionForAll parameter;

    public ExpressionForAll getParameter() {
        return parameter;
    }

    public void setParameter(ExpressionForAll parameter) {
        this.parameter = parameter;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.parameter!=null){
            this.parameter.accept(astVisitor);
        }

    }
}
