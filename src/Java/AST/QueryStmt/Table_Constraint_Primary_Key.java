package Java.AST.QueryStmt;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class Table_Constraint_Primary_Key extends Node {
    public List<Indexed_Column> indexedColumns = new ArrayList<>();

}
