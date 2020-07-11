package Java.AST.QueryStmt;

import Java.AST.Node;

public class DataBaseName extends Node {
    String DBName;

    public String getDBName() {
        return DBName;
    }

    public void setDBName(String DBName) {
        this.DBName = DBName;
    }
}
