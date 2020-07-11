package Java.AST.JavaStmt;

import Java.AST.Expression.Condition;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

import java.util.ArrayList;
import java.util.List;

public class While_Simple extends JavaStmt {

    private Condition condition;
    private List<JavaStmt> statementList = new ArrayList<>();
    private Scope scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<JavaStmt> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<JavaStmt> statementList) {
        this.statementList = statementList;
    }

    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start While_stmt ***************");

        astVisitor.visit(this);

        //////////////condition
        if(this.condition!=null){
            this.condition.accept(astVisitor);
        }

        ////////////While_Stmt Body
        System.out.println("  Block Statement : ");
        if(this.statementList.size()>0){
            for(int i = 0 ; i <this.statementList.size();i++){
                this.statementList.get(i).accept(astVisitor);
            }
        }
        System.out.println("*************** End While_stmt ***************");


    }

}
