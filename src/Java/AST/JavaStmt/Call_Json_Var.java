package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Call_Json_Var extends Node {
    public List<String> key = new ArrayList<String>();
    private String jsonName ;



    public String getJsonName() {
        return jsonName;
    }

    public void setJsonName(String jsonName) {
        this.jsonName = jsonName;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        String FullName="";
        if(this.jsonName!=null){
            System.out.println("  JsonName : "+this.jsonName);
            FullName = this.jsonName;
        }
        if(this.key.size()>0){
            for(int i = 0 ;i<this.key.size();i++){
                System.out.println("  Key("+ (i+1) +") : "+this.key.get(i));
                FullName += "."+this.key.get(i);
            }
        }
        System.out.println("  FullName : " + FullName);
    }
}
