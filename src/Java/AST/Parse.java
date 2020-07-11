package Java.AST;

import Java.AST.Function.CreateAggFunc;
import Java.AST.Function.FunctionDeclaration;
import Java.AST.QueryStmt.Sql_Stmt_List;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.AggregationFunction;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node{
    private Sql_Stmt_List sqlStmts ;
    private List<FunctionDeclaration> functions = new ArrayList<FunctionDeclaration>();
    private List<AggregationFunction> AggFuncs = new ArrayList<AggregationFunction>();

//    public void addQuery(SqlStmt query){
//        this.sqlStmts.add(query);
//    }


    public Sql_Stmt_List getSqlStmts() {
        return sqlStmts;
    }

    public void setSqlStmts(Sql_Stmt_List sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public void setFunctions(List<FunctionDeclaration> functions) {
        this.functions = functions;
    }


    public List<FunctionDeclaration> getFunctions() {
        return functions;
    }

    public List<AggregationFunction> getAggFuncs() {
        return AggFuncs;
    }

    public void setAggFuncs(List<AggregationFunction> aggFuncs) {
        AggFuncs = aggFuncs;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        System.out.println("*************** Start Parse ***************");

        astVisitor.visit(this);
//        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
        if(this.sqlStmts!=null) {

                this.sqlStmts.accept(astVisitor);

        }


        if(this.functions.size()>0) {
            for (int i = 0; i < this.functions.size(); i++) {
                this.functions.get(i).accept(astVisitor);
            }
        }
        System.out.println("*************** End Parse ***************");

    }


   /* @Override
    public String toString(){
        return "sql stmts = "+ getSqlStmts().get(0).getName();
    }*/
}
