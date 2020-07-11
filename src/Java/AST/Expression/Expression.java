package Java.AST.Expression;

import Java.AST.JavaStmt.Cal_Function;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Expression {

    public Expression Left = null;
    public Expression Right = null;
    public Cal_Function calFunction;
    public List<String> Variables = new ArrayList<String>();
    private String Operation;
    private String Name;

    public Cal_Function getCalFunction() {
        return calFunction;
    }

    public void setCalFunction(Cal_Function calFunction) {
        this.calFunction = calFunction;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.Left!=null)
        {
            System.out.println("  Left Expression");

            this.Left.accept(astVisitor);
        }
        if(this.Right!=null)
        {
            System.out.println("  Right Expression");

            this.Right.accept(astVisitor);
        }
        if(this.Operation!=null){
            System.out.println("Operation : " + this.getOperation());
        }
        if(this.calFunction!=null){
            this.getCalFunction().accept(astVisitor);
        }
        if(this.Variables.size()>0){
            for(int  i = 0;i<this.Variables.size();i++){
                System.out.println("Variable : "+this.Variables.get(i));

            }
        }
    }

}
