package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Table_Or_Subquery extends Node {
    private String dataBaseName;
    private String tableName;
    private String fullName;
    public String tableAlias ;
    private String indexName;
    public List<Table_Or_Subquery> tableOrSubqueries = new ArrayList<>();
    private Join_Clause joinClause;
    private Factored_Select_Stmt factoredSelectStmt;

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public Join_Clause getJoinClause() {
        return joinClause;
    }

    public void setJoinClause(Join_Clause joinClause) {
        this.joinClause = joinClause;
    }

    public Factored_Select_Stmt getFactoredSelectStmt() {
        return factoredSelectStmt;
    }

    public void setFactoredSelectStmt(Factored_Select_Stmt factoredSelectStmt) {
        this.factoredSelectStmt = factoredSelectStmt;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void accept(ASTVisitor astVisitor) {
        System.out.println("*************** Start Table_Or_Subquery ***************");
        astVisitor.visit(this);


        if(this.tableOrSubqueries.size()>0){
            for(int i = 0 ;i<this.tableOrSubqueries.size();i++){
                this.tableOrSubqueries.get(i).accept(astVisitor);
            }
        }
        if(this.joinClause!=null){
            this.joinClause.accept(astVisitor);
        }
        if(this.factoredSelectStmt!=null){
            this.factoredSelectStmt.accept(astVisitor);
        }


    }

}
