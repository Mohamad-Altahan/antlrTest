package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Parameter_List_For_CalFunc extends Node {

    public List<Parameter_For_CalFunc> Parameters = new ArrayList<Parameter_For_CalFunc>();

    public List<Parameter_For_CalFunc> getParameters() {
        return Parameters;
    }

    public void setParameters(List<Parameter_For_CalFunc> parameters) {
        Parameters = parameters;
    }


    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.Parameters.size()>0){
            for(int i = 0 ; i<this.Parameters.size();i++) {
                System.out.print("  Parameter(" + (i+1) + ") : ");
                this.Parameters.get(i).accept(astVisitor);

            }
        }


    }

}
