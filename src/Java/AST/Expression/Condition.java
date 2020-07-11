package Java.AST.Expression;

import Java.AST.JavaStmt.Cal_Function;
import Java.AST.JavaStmt.JavaStmt;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

public class Condition extends JavaStmt {

    public Condition right = null;
    public Condition left = null;


    private String variableName  ;
    private String literalValue  ;

    private String operator;
    public Cal_Function calFunction;

    private Scope scopeParent;

    public Scope getScopeParent() {
        return scopeParent;
    }

    public void setScopeParent(Scope scopeParent) {
        this.scopeParent = scopeParent;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Cal_Function getCalFunction() {
        return calFunction;
    }

    public void setCalFunction(Cal_Function calFunction) {
        this.calFunction = calFunction;
    }

    public Condition getRight() {
        return right;
    }

    public void setRight(Condition right) {
        this.right = right;
    }

    public Condition getLeft() {
        return left;
    }

    public void setLeft(Condition left) {
        this.left = left;
    }




    public String getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(String literalValue) {
        this.literalValue = literalValue;
    }


    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);


        if(this.literalValue!=null){
            System.out.println("Literal_Value : " + this.getLiteralValue());
        }

        if(this.variableName!=null){
            System.out.println("Variable_Name : " + this.getVariableName());


        }

        if(this.left!=null)
        {
            System.out.println("BinaryExpression");
            System.out.println(" Left Expression");

            this.left.accept(astVisitor);
        }
        if(this.operator!=null){
            System.out.println("Operation : " + this.getOperator());
        }
        if(this.right!=null)
        {
            System.out.println(" Right Expression");

            this.right.accept(astVisitor);
        }


        if(this.calFunction!=null){
            this.getCalFunction().accept(astVisitor);
        }



    }
}
