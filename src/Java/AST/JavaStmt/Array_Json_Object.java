package Java.AST.JavaStmt;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Array_Json_Object extends JavaStmt {

    public List<Json_Object> objectList = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.objectList.size()>0){
            for(int i = 0 ;i<this.objectList.size();i++){
                this.objectList.get(i).accept(astVisitor);
            }
        }
    }
}
