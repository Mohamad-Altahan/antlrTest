package Java.AST.QueryStmt;

import Java.AST.Expression.ExpressionForAll;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class SelectStmt extends SqlStmt {

//    private Distinct distinct;
//    private List<SelectItem> selectItems;
//    private List<Table> intoTables;
    private FromItem fromItem;
    private String colu;
    public List<String> columns = new ArrayList<String>();

    public ExpressionForAll expr = new ExpressionForAll();

    public void setFromItem(FromItem fromItem) {
        this.fromItem = fromItem;
    }

    //    private List<Join> joins;
//    private Expression where;
//    private GroupByElement groupBy;
//    private List<OrderByElement> orderByElements;
//    private Expression having;
//    private Limit limit;
//    private Offset offset;



    public String getColu() {
        return colu;
    }

    public void setColu(String colu) {
        this.colu = colu;
    }


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}
