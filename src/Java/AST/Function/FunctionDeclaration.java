package Java.AST.Function;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;
import Java.SymbolTablee.Type;

public class FunctionDeclaration extends Node {



    private String funName;
    public ParameterDeclarationList Parameters ;
    public FunctionBody Body;
    private Scope scope;
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName;
    }
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Create_Function ***************");

        astVisitor.visit(this);


        if(this.funName!=null){
            System.out.println("Function Name : "  + this.funName);

        }
        if(this.Parameters!=null) {
                this.Parameters.accept(astVisitor);

        }
        if(this.Body !=null) {
            this.Body.accept(astVisitor);

        }

        System.out.println("*************** End Create_Function ***************");

    }

}
