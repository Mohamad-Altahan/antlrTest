package Java.AST.JavaStmt;

import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;
import Java.SymbolTablee.Symbol;

public class Declare_Variable extends JavaStmt {

    private String dType;
    private String Name;
    private Assign_variable assignVariable;
    private Assign_Variable_Array assignVariableArray;
    private Symbol symbol;
    private Scope scopeParent;
    private boolean isrepet = false;

    public boolean isIsrepet() {
        return isrepet;
    }

    public void setIsrepet(boolean isrepet) {
        this.isrepet = isrepet;
    }

    public Scope getScopeParent() {
        return scopeParent;
    }

    public void setScopeParent(Scope scopeParent) {
        this.scopeParent = scopeParent;
    }

    public Symbol getSymbol() {
        return symbol;
    }
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Assign_Variable_Array getAssignVariableArray() {
        return assignVariableArray;
    }

    public void setAssignVariableArray(Assign_Variable_Array assignVariableArray) {
        this.assignVariableArray = assignVariableArray;
    }

    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    public Assign_variable getAssignVariable() {
        return assignVariable;
    }

    public void setAssignVariable(Assign_variable assignVariable) {
        this.assignVariable = assignVariable;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Declare_Variable ***************");

        astVisitor.visit(this);

        if(this.assignVariable!=null){
            System.out.println("  Kind : " + this.dType);
            this.assignVariable.accept(astVisitor);
        }
        else if(this.assignVariableArray!=null){
            System.out.println("  Kind : " + this.dType);
            this.assignVariableArray.accept(astVisitor);

        }
        else{
            System.out.println("  Kind : " + this.dType);
            System.out.println("  Name Variable : " + this.Name);
        }




    }
}
