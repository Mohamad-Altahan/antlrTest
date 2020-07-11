package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Cal_Function_Simple extends Node {
    private String Name;
    private Parameter_List_For_CalFunc listParamater;

    public Parameter_List_For_CalFunc getListParamater() {
        return listParamater;
    }

    public void setListParamater(Parameter_List_For_CalFunc listParamater) {
        this.listParamater = listParamater;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void accept(ASTVisitor astVisitor) {


       astVisitor.visit(this);

        if(this.Name!=null){
            System.out.println("  Function Name : " + this.getName());
        }
        if(this.listParamater!=null){
            this.listParamater.accept(astVisitor);
        }
    }

}
