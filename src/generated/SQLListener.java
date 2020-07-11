// Generated from C:/Users/mhd/Desktop/co_Final/antlrTest/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(SQLParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(SQLParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SQLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SQLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#increase}.
	 * @param ctx the parse tree
	 */
	void enterIncrease(SQLParser.IncreaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#increase}.
	 * @param ctx the parse tree
	 */
	void exitIncrease(SQLParser.IncreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#decrease}.
	 * @param ctx the parse tree
	 */
	void enterDecrease(SQLParser.DecreaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#decrease}.
	 * @param ctx the parse tree
	 */
	void exitDecrease(SQLParser.DecreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_variable(SQLParser.Declare_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_variable(SQLParser.Declare_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assign_variable_array}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable_array(SQLParser.Assign_variable_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assign_variable_array}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable_array(SQLParser.Assign_variable_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assign_variable}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable(SQLParser.Assign_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assign_variable}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable(SQLParser.Assign_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SQLParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SQLParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_stmt_way1}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_way1(SQLParser.If_stmt_way1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_stmt_way1}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_way1(SQLParser.If_stmt_way1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if1}.
	 * @param ctx the parse tree
	 */
	void enterIf1(SQLParser.If1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if1}.
	 * @param ctx the parse tree
	 */
	void exitIf1(SQLParser.If1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(SQLParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(SQLParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#else1}.
	 * @param ctx the parse tree
	 */
	void enterElse1(SQLParser.Else1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#else1}.
	 * @param ctx the parse tree
	 */
	void exitElse1(SQLParser.Else1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_stmt_way2}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt_way2(SQLParser.If_stmt_way2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_stmt_way2}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt_way2(SQLParser.If_stmt_way2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(SQLParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(SQLParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_simple}.
	 * @param ctx the parse tree
	 */
	void enterWhile_simple(SQLParser.While_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_simple}.
	 * @param ctx the parse tree
	 */
	void exitWhile_simple(SQLParser.While_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(SQLParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(SQLParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(SQLParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(SQLParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_simple}.
	 * @param ctx the parse tree
	 */
	void enterFor_simple(SQLParser.For_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_simple}.
	 * @param ctx the parse tree
	 */
	void exitFor_simple(SQLParser.For_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assign_variable_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterAssign_variable_for_loop(SQLParser.Assign_variable_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assign_variable_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitAssign_variable_for_loop(SQLParser.Assign_variable_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_each}.
	 * @param ctx the parse tree
	 */
	void enterFor_each(SQLParser.For_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_each}.
	 * @param ctx the parse tree
	 */
	void exitFor_each(SQLParser.For_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(SQLParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(SQLParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#case1}.
	 * @param ctx the parse tree
	 */
	void enterCase1(SQLParser.Case1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#case1}.
	 * @param ctx the parse tree
	 */
	void exitCase1(SQLParser.Case1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(SQLParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(SQLParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#default_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDefault_stmt(SQLParser.Default_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#default_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDefault_stmt(SQLParser.Default_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_composition_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_composition_stmt(SQLParser.Create_table_composition_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_composition_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_composition_stmt(SQLParser.Create_table_composition_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(SQLParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(SQLParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(SQLParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(SQLParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_Type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_Type_stmt(SQLParser.Create_Type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_Type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_Type_stmt(SQLParser.Create_Type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(SQLParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(SQLParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(SQLParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(SQLParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationlist(SQLParser.ParameterdeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationlist(SQLParser.ParameterdeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclaration(SQLParser.ParameterdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclaration(SQLParser.ParameterdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(SQLParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(SQLParser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpstatement(SQLParser.JumpstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpstatement(SQLParser.JumpstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_agg_func}.
	 * @param ctx the parse tree
	 */
	void enterCreate_agg_func(SQLParser.Create_agg_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_agg_func}.
	 * @param ctx the parse tree
	 */
	void exitCreate_agg_func(SQLParser.Create_agg_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(SQLParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(SQLParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(SQLParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(SQLParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#jar_path}.
	 * @param ctx the parse tree
	 */
	void enterJar_path(SQLParser.Jar_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#jar_path}.
	 * @param ctx the parse tree
	 */
	void exitJar_path(SQLParser.Jar_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_of_Agg_function_params}.
	 * @param ctx the parse tree
	 */
	void enterArray_of_Agg_function_params(SQLParser.Array_of_Agg_function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_of_Agg_function_params}.
	 * @param ctx the parse tree
	 */
	void exitArray_of_Agg_function_params(SQLParser.Array_of_Agg_function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(SQLParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(SQLParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#call_json_var}.
	 * @param ctx the parse tree
	 */
	void enterCall_json_var(SQLParser.Call_json_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#call_json_var}.
	 * @param ctx the parse tree
	 */
	void exitCall_json_var(SQLParser.Call_json_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_access_name}.
	 * @param ctx the parse tree
	 */
	void enterJson_access_name(SQLParser.Json_access_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_access_name}.
	 * @param ctx the parse tree
	 */
	void exitJson_access_name(SQLParser.Json_access_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_access_key}.
	 * @param ctx the parse tree
	 */
	void enterJson_access_key(SQLParser.Json_access_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_access_key}.
	 * @param ctx the parse tree
	 */
	void exitJson_access_key(SQLParser.Json_access_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SQLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#updateparameter_forloop}.
	 * @param ctx the parse tree
	 */
	void enterUpdateparameter_forloop(SQLParser.Updateparameter_forloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#updateparameter_forloop}.
	 * @param ctx the parse tree
	 */
	void exitUpdateparameter_forloop(SQLParser.Updateparameter_forloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_for_loop(SQLParser.Unary_operator_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_for_loop(SQLParser.Unary_operator_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cal_func}.
	 * @param ctx the parse tree
	 */
	void enterCal_func(SQLParser.Cal_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cal_func}.
	 * @param ctx the parse tree
	 */
	void exitCal_func(SQLParser.Cal_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#agg_fun}.
	 * @param ctx the parse tree
	 */
	void enterAgg_fun(SQLParser.Agg_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#agg_fun}.
	 * @param ctx the parse tree
	 */
	void exitAgg_fun(SQLParser.Agg_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#paramete_list_for_call_agg_func}.
	 * @param ctx the parse tree
	 */
	void enterParamete_list_for_call_agg_func(SQLParser.Paramete_list_for_call_agg_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#paramete_list_for_call_agg_func}.
	 * @param ctx the parse tree
	 */
	void exitParamete_list_for_call_agg_func(SQLParser.Paramete_list_for_call_agg_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_simple}.
	 * @param ctx the parse tree
	 */
	void enterFunction_simple(SQLParser.Function_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_simple}.
	 * @param ctx the parse tree
	 */
	void exitFunction_simple(SQLParser.Function_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#func_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_parameter_list(SQLParser.Func_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#func_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_parameter_list(SQLParser.Func_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#higher_order_function}.
	 * @param ctx the parse tree
	 */
	void enterHigher_order_function(SQLParser.Higher_order_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#higher_order_function}.
	 * @param ctx the parse tree
	 */
	void exitHigher_order_function(SQLParser.Higher_order_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_order}.
	 * @param ctx the parse tree
	 */
	void enterFunction_order(SQLParser.Function_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_order}.
	 * @param ctx the parse tree
	 */
	void exitFunction_order(SQLParser.Function_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#func_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunc_parameter(SQLParser.Func_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#func_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunc_parameter(SQLParser.Func_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(SQLParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(SQLParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_object}.
	 * @param ctx the parse tree
	 */
	void enterJson_object(SQLParser.Json_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_object}.
	 * @param ctx the parse tree
	 */
	void exitJson_object(SQLParser.Json_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#key_value}.
	 * @param ctx the parse tree
	 */
	void enterKey_value(SQLParser.Key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#key_value}.
	 * @param ctx the parse tree
	 */
	void exitKey_value(SQLParser.Key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(SQLParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(SQLParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SQLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SQLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_json_object}.
	 * @param ctx the parse tree
	 */
	void enterArray_json_object(SQLParser.Array_json_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_json_object}.
	 * @param ctx the parse tree
	 */
	void exitArray_json_object(SQLParser.Array_json_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(SQLParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(SQLParser.BoolContext ctx);
}