package Java.AST.JavaStmt;

import Java.AST.Expression.Condition;
import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;

public class JumpStmt extends JavaStmt {
    private Condition condition;
    private If_Stmt_Way2 ifStmtWay2;

    public If_Stmt_Way2 getIfStmtWay2() {
        return ifStmtWay2;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void setIfStmtWay2(If_Stmt_Way2 ifStmtWay2) {
        this.ifStmtWay2 = ifStmtWay2;
    }

    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Return_stmt ***************");


        astVisitor.visit(this);
        if(this.condition!=null){
            this.condition.accept(astVisitor);
        }
        else if(this.ifStmtWay2!=null){
            this.ifStmtWay2.accept(astVisitor);
        }


        System.out.println("*************** End Return_stmt ***************");

    }

}
