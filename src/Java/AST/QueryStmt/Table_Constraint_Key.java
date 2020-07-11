package Java.AST.QueryStmt;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class Table_Constraint_Key extends Node {
    private String name;
    public List<Indexed_Column> indexedColumns=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
