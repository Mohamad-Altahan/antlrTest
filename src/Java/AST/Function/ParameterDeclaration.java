package Java.AST.Function;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Symbol;
import Java.SymbolTablee.Type;

import java.util.ArrayList;
import java.util.List;

public class ParameterDeclaration extends Node {

    private String parameterName;
    private String type;
    private Symbol symbol;
    private ExpressionForAll value;
    private boolean isDeclear = false;

    public boolean isDeclear() {
        return isDeclear;
    }

    public void setDeclear(boolean declear) {
        isDeclear = declear;
    }
    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }


    public ExpressionForAll getValue() {
        return value;
    }

    public void setValue(ExpressionForAll expression) {
        this.value = expression;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameter) {
        this.parameterName = parameter;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.type!=null){
            System.out.println("  Kind : " + this.type);
        }

        System.out.println("   Parameter Name: " + parameterName);
        if(this.value!=null){
            System.out.print("  Value : ");
            this.value.accept(astVisitor);
        }
    }

}
