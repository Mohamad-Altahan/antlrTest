package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class Key_Value extends Node {

    private String Key;
    private Value_Json value;

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public Value_Json getValue() {
        return value;
    }

    public void setValue(Value_Json value) {
        this.value = value;
    }
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.Key!=null){
            System.out.println("  Key : " + this.Key);
        }
        if(this.value!=null){
            this.value.accept(astVisitor);
        }
    }

}
