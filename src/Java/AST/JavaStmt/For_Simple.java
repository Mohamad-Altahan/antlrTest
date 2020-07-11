package Java.AST.JavaStmt;

import Java.AST.Expression.Condition;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;

import java.util.ArrayList;
import java.util.List;

public class For_Simple extends JavaStmt {

    private Assign_Variable_For_Loop variableForLoop ;
    private Condition condition;
    private Unary_Operator_For_Loop unaryOperatorForLoop;
    private Updateparameter_Forloop updateparameterForloop;
    private List<JavaStmt> javaStmtList = new ArrayList<JavaStmt>();
    private Scope scope;


    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
    public Updateparameter_Forloop getUpdateparameterForloop() {
        return updateparameterForloop;
    }

    public void setUpdateparameterForloop(Updateparameter_Forloop updateparameterForloop) {
        this.updateparameterForloop = updateparameterForloop;
    }

    public Assign_Variable_For_Loop getVariableForLoop() {
        return variableForLoop;
    }

    public void setVariableForLoop(Assign_Variable_For_Loop variableForLoop) {
        this.variableForLoop = variableForLoop;
    }


    public Unary_Operator_For_Loop getUnaryOperatorForLoop() {
        return unaryOperatorForLoop;
    }

    public void setUnaryOperatorForLoop(Unary_Operator_For_Loop unaryOperatorForLoop) {
        this.unaryOperatorForLoop = unaryOperatorForLoop;
    }

    public List<JavaStmt> getJavaStmtList() {
        return javaStmtList;
    }

    public void setJavaStmtList(List<JavaStmt> javaStmtList) {
        this.javaStmtList = javaStmtList;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start For_Stmt ***************");

        astVisitor.visit(this);

        if(this.variableForLoop!=null){
            this.variableForLoop.accept(astVisitor);
        }
        if(this.condition!=null){

            this.condition.accept(astVisitor);
        }
        //////////////Update Expression
        if(this.unaryOperatorForLoop!=null){
            this.unaryOperatorForLoop.accept(astVisitor);
        }
        else if(this.updateparameterForloop!=null){
            this.updateparameterForloop.accept(astVisitor);
        }
        //////////////ForLoop Body
        System.out.println(" Block Statement : ");
        if(this.javaStmtList.size()>0){
            for(int i=0 ; i<this.javaStmtList.size();i++){

                this.javaStmtList.get(i).accept(astVisitor);
            }

        }

        System.out.println("*************** End For_Stmt ***************");

    }
}
