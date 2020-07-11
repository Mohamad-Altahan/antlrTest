package Java.AST.JavaStmt;

import Java.AST.Node;
import Java.AST.QueryStmt.Result_Column;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Parameter_List_For_CalAggFunc extends Node {
    public List<Result_Column> resultColumns = new ArrayList<>();


    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.resultColumns.size()>0){
            for(int i = 0 ; i<this.resultColumns.size();i++) {
                System.out.print("  Result_Column(" + (i+1) + ") : ");
                this.resultColumns.get(i).accept(astVisitor);

            }
        }




    }
}
