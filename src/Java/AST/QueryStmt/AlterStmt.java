package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;

public class AlterStmt extends SqlStmt {

   private String DataBaseName;
    private String SourceTableName;
    private String fullName;
    private String NewTableName;
    private AlterTableAdd AlterTableAdd;
    private Alter_Table_Add_Constraint AlterTableAddConstraint;
    private ColumnDef ColumnDef;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Java.AST.QueryStmt.AlterTableAdd getAlterTableAdd() {
        return AlterTableAdd;
    }

    public void setAlterTableAdd(Java.AST.QueryStmt.AlterTableAdd alterTableAdd) {
        AlterTableAdd = alterTableAdd;
    }

    public Alter_Table_Add_Constraint getAlterTableAddConstraint() {
        return AlterTableAddConstraint;
    }

    public void setAlterTableAddConstraint(Alter_Table_Add_Constraint alterTableAddConstraint) {
        AlterTableAddConstraint = alterTableAddConstraint;
    }

    public Java.AST.QueryStmt.ColumnDef getColumnDef() {
        return ColumnDef;
    }

    public void setColumnDef(Java.AST.QueryStmt.ColumnDef columnDef) {
        ColumnDef = columnDef;
    }

    public String getDataBaseName() {
        return DataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        DataBaseName = dataBaseName;
    }

    public String getSourceTableName() {
        return SourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        SourceTableName = sourceTableName;
    }

    public String getNewTableName() {
        return NewTableName;
    }

    public void setNewTableName(String newTableName) {
        NewTableName = newTableName;
    }

    public void accept(ASTVisitor astVisitor)
    {
        System.out.println("*************** Start Alter_table_Stmt ***************");
        astVisitor.visit(this);

        if(this.SourceTableName!=null){

            System.out.println("Full Name : " + this.getFullName());
        }
        if(this.NewTableName!=null){
            System.out.println("New Table Name : " + this.getNewTableName());
        }
        else if(this.AlterTableAdd!=null){
            this.AlterTableAdd.accept(astVisitor);
        }
        else if(this.AlterTableAddConstraint!=null){
            this.AlterTableAddConstraint.accept(astVisitor);
        }
        else if(this.ColumnDef!=null){
            this.ColumnDef.accept(astVisitor);
        }

        System.out.println("*************** End Alter_table_Stmt ***************");

    }


}
