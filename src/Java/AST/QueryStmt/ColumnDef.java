package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.SymbolTablee.Type;

import java.util.ArrayList;
import java.util.List;

public class ColumnDef extends Node {

    private String columnName;
    public List<String> Constraints = new ArrayList<>();
    public List<String> TypeName = new ArrayList<>();
    private Type type;
    private boolean isRepet=false;

    public boolean isRepet() {
        return isRepet;
    }

    public void setRepet(boolean repet) {
        isRepet = repet;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
