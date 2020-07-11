package Java.AST.QueryStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class Join_Constraint extends Node {
    private ExpressionForAll expression;

    public ExpressionForAll getExpression() {
        return expression;
    }

    public void setExpression(ExpressionForAll expression) {
        this.expression = expression;
    }

    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Join_Constraint ***************");
        astVisitor.visit(this);


      if(this.expression!=null){
          this.expression.accept(astVisitor);
      }




    }
}
