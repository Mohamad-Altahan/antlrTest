package Java.AST.QueryStmt;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class Foreign_Key_Clause extends Node {

    private String databaseName;
    private String foreignTable;
    public List<String> fkTargetColumnName = new ArrayList<>();
    public List<String> name = new ArrayList<>();



    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getForeignTable() {
        return foreignTable;
    }

    public void setForeignTable(String foreignTable) {
        this.foreignTable = foreignTable;
    }
}
