package Java.AST.JavaStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Assign_Variable_Array extends Node {

    private ExpressionForAll indexName;
    private String valueName;
    private String variableName;
    public List<ExpressionForAll> expression = new ArrayList<ExpressionForAll>();


    public ExpressionForAll getIndexName() {
        return indexName;
    }

    public void setIndexName(ExpressionForAll indexName) {
        this.indexName = indexName;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }


    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }


    public void accept(ASTVisitor astVisitor) {
         astVisitor.visit(this);
         if(this.indexName!=null){
             System.out.print("index : " );
             this.indexName.accept(astVisitor);
             if(this.variableName!=null){
                 System.out.println("VariableName : " + this.variableName);
             }
         }
        if(this.variableName!=null){
            System.out.println("VariableName : " + this.variableName);
        }
        if(this.valueName!=null){
                System.out.println("index : " + this.valueName);
            if(this.variableName!=null){
                System.out.println("VariableName : " + this.variableName);
            }
        }
       // if(this.expression.size()>0){
            if(this.expression.size()>0){
            for(int i = 0 ;i<this.expression.size();i++){
                System.out.print("  Value ("+(i+1) +")");
                this.expression.get(i).accept(astVisitor);
            }
        }



    }
}
