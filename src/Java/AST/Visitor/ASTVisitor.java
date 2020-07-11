package Java.AST.Visitor;

import Java.AST.Expression.Condition;
import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Function.*;
import Java.AST.JavaStmt.*;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.SymbolTablee.AggregationFunction;

public interface ASTVisitor {
    ////////////////////////////////Parse
    public void visit(Parse p);
    ////////////////////////////////Sql Stmt
    public void visit(SqlStmt stmt);
    public void visit(Sql_Stmt_List sqlStmtList);
    public void visit(SelectStmt selectStmt);
    public void visit(Select_Core selectCore);
    public void visit(DropTableStmt dropTableStmt);
    public void visit(InsertStmt insertStmt);
    public void visit(DeleteStmt deleteStmt);
    public void visit(CreateTableStmt createTableStmt);
    public void visit(UpdateStmt updateStmt);
    public void visit(AlterStmt alterStmt);
    public void visit(AlterTableAdd alterTableAdd);
    public void visit(CreateTypeStmt createTypeStmt);
    public void visit(CreateTableCompositionStmt createTableCompositionStmt);
    public void visit(CreateAggFunc createAggFunc);
    public void visit(AggregationFunction aggregationFunction);
    public void visit(Cal_Agg_Fun calAggFun);
    public void visit(Parameter_List_For_CalAggFunc parameterListForCalAggFunc);
    public void visit(Result_Column resultColumn);
    public void visit(Factored_Select_Stmt factoredSelectStmt);
    public void visit(Join_Clause joinClause);
    public void visit(Join_Constraint joinConstraint);
    public void visit(Table_Or_Subquery tableOrSubquery);






    ////////////////////// Create Function
    public void visit(FunctionDeclaration functionDeclaration );
    public void visit(ParameterDeclarationList parameterDeclarationList);
    public void visit(ParameterDeclaration parameterDeclaration) ;
    public void visit(FunctionBody functionBody);
    //////////////////////Function Stmt
    public void visit(Array array);
    public void visit(Array_Json_Object array_json_object);
    public void visit(Assign_variable assignVariable);
    public void visit(Assign_Variable_For_Loop assignVariableForLoop);
    public void visit(Call_Json_Var callJsonVar);
    public void visit(Declare_Variable declareVariable);
    public void visit(Decrease decrease);
    public void visit(Do_While doWhile);
    public void visit(Else_If elseIf);
    public void visit(For_Each forEach);
    public void visit(For_Simple forSimple);
    public void visit(If1 if1);
    public void visit(If_Stmt_Way1 ifStmt__way1);
    public void visit(If_Stmt_Way2 ifStmtWay2);
    public void visit(Increase increase);
    public void visit(Json_Object jsonObject);
    public void visit(JumpStmt jumpStmt);
    public void visit(Key_Value keyValue);
    public void visit(Unary_Operator_For_Loop unaryOperatorForLoop);
    public void visit(Value_Json  valueJson);
    public void visit(While_Simple whileSimple);
    public void visit(Cal_Function calFunction);
    public void visit(Cal_Function_Simple calFunctionSimple);
    public void visit(Switch_Stmt switchStmt);
    public void visit(Case aCase);
    public void visit(Default aDefault);
    public void visit(Print_Stmt printStmt);
    public void visit(Else anElse);

    public void visit(ExpressionForAll expression);
    public void visit(Condition condition);
    public void visit(Parameter_List_For_CalFunc parameterListForCalFunc);
    public void visit(Parameter_For_CalFunc parameterForCalFunc);
    public void visit(Expression expression);
    public void visit(Json_Stmt jsonStmt);
    public void visit(Assign_Variable_Array assignVariableArray);
    public void visit(Updateparameter_Forloop updateparameterForloop);






}
