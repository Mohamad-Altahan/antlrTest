package Java.AST.JavaStmt;

import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Node;
import Java.AST.QueryStmt.SqlStmt;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Scope;
import Java.SymbolTablee.Symbol;

public class Assign_Variable_For_Loop extends Node {
    private String kind;
    private String Name;
    private ExpressionForAll expression;
    private SqlStmt sqlStmt;
    private  If_Stmt_Way2 ifStmtWay2;
    private Json_Stmt jsonStmt;
    private Symbol symbol;
    private Scope scopeParent;

    public Scope getScopeParent() {
        return scopeParent;
    }

    public void setScopeParent(Scope scopeParent) {
        this.scopeParent = scopeParent;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Json_Stmt getJsonStmt() {
        return jsonStmt;
    }

    public void setJsonStmt(Json_Stmt jsonStmt) {
        this.jsonStmt = jsonStmt;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public If_Stmt_Way2 getIfStmtWay2() {
        return ifStmtWay2;
    }

    public void setIfStmtWay2(If_Stmt_Way2 ifStmtWay2) {
        this.ifStmtWay2 = ifStmtWay2;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public ExpressionForAll getExpression() {
        return expression;
    }

    public void setExpression(ExpressionForAll expression) {
        this.expression = expression;
    }

    public SqlStmt getSqlStmt() {
        return sqlStmt;
    }

    public void setSqlStmt(SqlStmt sqlStmt) {
        this.sqlStmt = sqlStmt;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.kind!=null){
            System.out.println("  Kind : " + this.kind);
        }
        if(this.Name!=null){
            System.out.println("  Name : " + this.Name);
        }
        if(this.expression!=null){
            this.expression.accept(astVisitor);
        }
        if(this.ifStmtWay2!=null){
            this.ifStmtWay2.accept(astVisitor);
        }
        if(this.sqlStmt!=null){
            this.sqlStmt.accept(astVisitor);
        }
        if(this.jsonStmt!=null){
            this.jsonStmt.accept(astVisitor);
        }


    }
}
