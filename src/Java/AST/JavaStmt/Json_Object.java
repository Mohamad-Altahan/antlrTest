package Java.AST.JavaStmt;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Json_Object extends JavaStmt {

    public List<Key_Value> keyValueList = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(this.keyValueList.size()>0){
            for(int i = 0 ;i<this.keyValueList.size();i++){
                this.keyValueList.get(i).accept(astVisitor);
            }
        }


    }
}
