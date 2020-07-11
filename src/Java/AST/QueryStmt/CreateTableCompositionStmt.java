package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTablee.Type;

import java.util.ArrayList;
import java.util.List;

public class CreateTableCompositionStmt extends SqlStmt {

    private String dataBaseName = "";
    private String TableName;
    private String fullName;
    private String format;
    private String path;
    private Type type;
    public List<ColumnDef> columnDefList = new ArrayList<ColumnDef>();
    public List<TableConstraint> tableConstraints = new ArrayList<>();
    private Factored_Select_Stmt factoredSelectStmt;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);


    }

}
