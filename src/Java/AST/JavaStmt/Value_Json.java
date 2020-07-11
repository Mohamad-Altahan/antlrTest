package Java.AST.JavaStmt;

import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class Value_Json extends Node {

    private String Name;
    private Json_Object jsonObject;
    private ExpressionForAll expression;
    private Array_Json_Object arrayJsonObject;
    private Array array;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Json_Object getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(Json_Object jsonObject) {
        this.jsonObject = jsonObject;
    }

    public ExpressionForAll getExpression() {
        return expression;
    }

    public void setExpression(ExpressionForAll expression) {
        this.expression = expression;
    }

    public Array_Json_Object getArrayJsonObject() {
        return arrayJsonObject;
    }

    public void setArrayJsonObject(Array_Json_Object arrayJsonObject) {
        this.arrayJsonObject = arrayJsonObject;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public void accept(ASTVisitor astVisitor) {
        //astVisitor.visit(this);
        if(this.Name!=null){
            System.out.println("  Value : " + this.Name);
        }
        else if(this.arrayJsonObject!=null){
            System.out.print("  Value : ");
            this.arrayJsonObject.accept(astVisitor);
        }
        else if(this.jsonObject!=null){
            System.out.print("  Value : ");

            this.jsonObject.accept(astVisitor);
        }
        else if(this.array!=null){
            System.out.print("  Value : ");

            this.array.accept(astVisitor);
        }
        else if(this.expression!=null){
            System.out.print("  Value : ");

            this.expression.accept(astVisitor);

        }
    }

}
