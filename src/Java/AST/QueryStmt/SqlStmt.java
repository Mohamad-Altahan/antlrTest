package Java.AST.QueryStmt;

import Java.AST.JavaStmt.JavaStmt;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class SqlStmt extends JavaStmt {

    private String name;

    private Factored_Select_Stmt factoredSelectStmt;
    private CreateTableCompositionStmt createTableCompositionStmt;
    private CreateTypeStmt createTypeStmt;

    public Factored_Select_Stmt getFactoredSelectStmt() {
        return factoredSelectStmt;
    }

    public void setFactoredSelectStmt(Factored_Select_Stmt factoredSelectStmt) {
        this.factoredSelectStmt = factoredSelectStmt;
    }

    public CreateTableCompositionStmt getCreateTableCompositionStmt() {
        return createTableCompositionStmt;
    }

    public void setCreateTableCompositionStmt(CreateTableCompositionStmt createTableCompositionStmt) {
        this.createTableCompositionStmt = createTableCompositionStmt;
    }

    public CreateTypeStmt getCreateTypeStmt() {
        return createTypeStmt;
    }

    public void setCreateTypeStmt(CreateTypeStmt createTypeStmt) {
        this.createTypeStmt = createTypeStmt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        System.out.println("*************** Start SqlStmt ***************");

        astVisitor.visit(this);
        if(this.factoredSelectStmt!=null){
            this.factoredSelectStmt.accept(astVisitor);
        }
        if(this.createTableCompositionStmt!=null){
            this.createTableCompositionStmt.accept(astVisitor);
        }
        if(this.createTypeStmt!=null){
            this.createTypeStmt.accept(astVisitor);
        }




    }

}
