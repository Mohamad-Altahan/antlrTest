package Java.AST.QueryStmt;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class Indexed_Column extends Node {

    private String columnName ;
    private String collationName ;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }
}
