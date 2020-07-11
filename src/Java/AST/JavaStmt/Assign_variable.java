package Java.AST.JavaStmt;


import Java.AST.Expression.Condition;
import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.QueryStmt.SqlStmt;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;
import Java.SymbolTablee.Type;


public class Assign_variable extends JavaStmt {
    private String Name;
    private Call_Json_Var callJsonVar;
    private ExpressionForAll expression;
    private Condition condition;
    private SqlStmt sqlStmt;
    private JavaStmt Json;
    private If_Stmt_Way2 ifStmtWay2;
    private String Operator;
    private Scope scopeParent;
    private Type  type;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Scope getScopeParent() {
        return scopeParent;
    }

    public void setScopeParent(Scope scopeParent) {
        this.scopeParent = scopeParent;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public ExpressionForAll getExpression() {
        return expression;
    }

    public void setExpression(ExpressionForAll expression) {
        this.expression = expression;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    public Call_Json_Var getCallJsonVar() {
        return callJsonVar;
    }

    public void setCallJsonVar(Call_Json_Var callJsonVar) {
        this.callJsonVar = callJsonVar;
    }



    public SqlStmt getSqlStmt() {
        return sqlStmt;
    }

    public void setSqlStmt(SqlStmt sqlStmt) {
        this.sqlStmt = sqlStmt;
    }

    public JavaStmt getJson() {
        return Json;
    }

    public void setJson(JavaStmt json) {
        Json = json;
    }

    public If_Stmt_Way2 getIfStmtWay2() {
        return ifStmtWay2;
    }

    public void setIfStmtWay2(If_Stmt_Way2 ifStmtWay2) {
        this.ifStmtWay2 = ifStmtWay2;
    }
    @Override
    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Assign_Variable ***************");

        astVisitor.visit(this);
        if(this.Name!=null){
            System.out.println("  Name Variable : " + this.Name);
            System.out.println("Operator : " + this.Operator);
        }
        else if(this.callJsonVar!=null){
            this.callJsonVar.accept(astVisitor);
        }
        if(this.condition!=null){
            this.condition.accept(astVisitor);
        }
        else if(this.Json!=null){
            this.Json.accept(astVisitor);
        }
        else if(this.sqlStmt!=null){
            this.sqlStmt.accept(astVisitor);

        }
        else if(this.ifStmtWay2!=null){
            this.ifStmtWay2.accept(astVisitor);
        }
        System.out.println("*************** End Assign_Variable ***************");



    }
}
