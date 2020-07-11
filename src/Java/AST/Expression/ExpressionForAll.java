package Java.AST.Expression;

import Java.AST.JavaStmt.Cal_Function;
import Java.AST.JavaStmt.JavaStmt;
import Java.AST.JavaStmt.Unary_Operator_For_Loop;
import Java.AST.JavaStmt.Updateparameter_Forloop;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ExpressionForAll extends JavaStmt {

    public ExpressionForAll right = null;
    public ExpressionForAll left = null;



    private String dataBaseName  ;
    private String tableName  ;
    private String columnName  ;
    private String fullName  ;
    private String literalValue  ;

    public Cal_Function calFunction;

    private String operator;

    private Unary_Operator_For_Loop unaryOperatorForLoop;
    private Updateparameter_Forloop updateparameterForloop;

    public Updateparameter_Forloop getUpdateparameterForloop() {
        return updateparameterForloop;
    }

    public void setUpdateparameterForloop(Updateparameter_Forloop updateparameterForloop) {
        this.updateparameterForloop = updateparameterForloop;
    }

    public Unary_Operator_For_Loop getUnaryOperatorForLoop() {
        return unaryOperatorForLoop;
    }

    public void setUnaryOperatorForLoop(Unary_Operator_For_Loop unaryOperatorForLoop) {
        this.unaryOperatorForLoop = unaryOperatorForLoop;
    }

    public Cal_Function getCalFunction() {
        return calFunction;
    }

    public void setCalFunction(Cal_Function calFunction) {
        this.calFunction = calFunction;
    }

    public String getliteralValue() {
        return literalValue;
    }

    public void setliteralValue(String value) {
        this.literalValue = value;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);


        if(this.literalValue!=null){
            System.out.println("Literal_Value : " + this.getliteralValue());
        }

          if(this.columnName!=null){
            System.out.println("Full Name : " + this.getColumnName());


        }

        if(this.left!=null)
        {
            System.out.println("BinaryExpression");
            System.out.println(" Left Expression");

            this.left.accept(astVisitor);
        }
        if(this.operator!=null){
            System.out.println("Operation : " + this.getOperator());
        }
        if(this.right!=null)
        {
            System.out.println(" Right Expression");

            this.right.accept(astVisitor);
        }


        if(this.calFunction!=null){
            this.getCalFunction().accept(astVisitor);
        }

        if(this.unaryOperatorForLoop!=null){
            this.getUnaryOperatorForLoop().accept(astVisitor);
        }
        if(this.updateparameterForloop!=null){
            this.getUpdateparameterForloop().accept(astVisitor);
        }

    }
}
