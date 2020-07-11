package Java.AST.JavaStmt;

import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

import java.util.ArrayList;
import java.util.List;

public class If_Stmt_Way1 extends JavaStmt {
    private String Name;
    public If1 ifBase;
    public List<Else_If> ElseIf = new ArrayList<Else_If>();
    private Else Else ;
    private Scope scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Java.AST.JavaStmt.Else getElse() {
        return Else;
    }

    public void setElse(Java.AST.JavaStmt.Else anElse) {
        Else = anElse;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start If_Stmt_Way1 ***************");


        astVisitor.visit(this);
        if(this.ifBase!=null) {
            this.ifBase.accept(astVisitor);
        }
        if(this.ElseIf.size()>0)
        {
            for(int i = 0 ; i<this.ElseIf.size();i++){
                this.ElseIf.get(i).accept(astVisitor);
            }
        }
        if(this.Else!=null){

                this.Else.accept(astVisitor);


        }
        System.out.println("*************** End If_Stmt_Way1 ***************");


    }
}
