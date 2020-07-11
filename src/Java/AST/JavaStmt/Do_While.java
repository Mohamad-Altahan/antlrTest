package Java.AST.JavaStmt;

import Java.AST.Expression.Condition;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Function.FunctionBody;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

public class Do_While extends JavaStmt {
    private FunctionBody functionBody ;
    private Condition condition;
    private Scope scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Do_While ***************");
        astVisitor.visit(this);

        if(this.functionBody!=null){
            this.functionBody.accept(astVisitor);
        }
        if(this.condition!=null){
            this.condition.accept(astVisitor);
        }
        System.out.println("*************** End Do_While ***************");
    }
}
