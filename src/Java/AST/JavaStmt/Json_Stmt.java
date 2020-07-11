package Java.AST.JavaStmt;

import Java.AST.Visitor.ASTVisitor;

public class Json_Stmt extends JavaStmt {

    private Json_Object jsonObject;
    private Array_Json_Object  arrayJsonObject;

    public Array_Json_Object getArrayJsonObject() {
        return arrayJsonObject;
    }

    public void setArrayJsonObject(Array_Json_Object arrayJsonObject) {
        this.arrayJsonObject = arrayJsonObject;
    }

    public Json_Object getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(Json_Object jsonObject) {
        this.jsonObject = jsonObject;
    }

    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Json_Stmt ***************");
        //astVisitor.visit(this);
        if(this.jsonObject!=null){
            this.jsonObject.accept(astVisitor);
        }
        else if(this.arrayJsonObject!=null){
            this.arrayJsonObject.accept(astVisitor);
        }
        System.out.println("*************** End Json_Stmt ***************");


    }
}
