package Java.AST.JavaStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;


public class Updateparameter_Forloop extends Node {

    private String name;
    private String Operator;
    private String assign;
    private ExpressionForAll expression;

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public ExpressionForAll getExpression() {
        return expression;
    }

    public void setExpression(ExpressionForAll expression) {
        this.expression = expression;
    }



    public void accept(ASTVisitor astVisitor) {

        astVisitor.visit(this);

        if(this.name!=null){
            System.out.println("  Name : " + this.name);
        }
        if(this.Operator!=null){
            System.out.println("  Operator : " + this.Operator);
        }
        if(this.assign !=null){
            System.out.println(" Assign : "+ this.assign);
        }
        if(this.expression!=null){
            System.out.print("  Value : ");
            this.expression.accept(astVisitor);
        }

    }

}
