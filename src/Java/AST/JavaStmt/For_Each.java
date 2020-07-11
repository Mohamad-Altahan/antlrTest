package Java.AST.JavaStmt;

import Java.AST.Function.FunctionBody;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

public class For_Each extends JavaStmt {

    private String Type;
    private String nameVar;
    private String nameArray;
    private FunctionBody body;
    private Scope scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getNameVar() {
        return nameVar;
    }

    public void setNameVar(String nameVar) {
        this.nameVar = nameVar;
    }

    public String getNameArray() {
        return nameArray;
    }

    public void setNameArray(String nameArray) {
        this.nameArray = nameArray;
    }

    public FunctionBody getBody() {
        return body;
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start For_Each_Stmt ***************");

        astVisitor.visit(this);
        if(this.Type!=null) {
            System.out.println("Var_type : " + this.Type);
        }
        if(this.nameVar!=null) {
            System.out.println("Var_Name : " + this.nameVar);
        }
        if(this.nameArray!=null){
            System.out.println("var_Array : " + this.nameArray);
        }
        if(this.body!=null){
            this.body.accept(astVisitor);
        }


        System.out.println("*************** End For_Each_Stmt ***************");



    }
}
