// Generated from C:/Users/mhd/Desktop/co_Final/antlrTest/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(SQLParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SQLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#increase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrease(SQLParser.IncreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#decrease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrease(SQLParser.DecreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declare_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_variable(SQLParser.Declare_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assign_variable_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_variable_array(SQLParser.Assign_variable_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assign_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_variable(SQLParser.Assign_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SQLParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_stmt_way1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt_way1(SQLParser.If_stmt_way1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf1(SQLParser.If1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(SQLParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#else1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse1(SQLParser.Else1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_stmt_way2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt_way2(SQLParser.If_stmt_way2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(SQLParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_simple(SQLParser.While_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(SQLParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(SQLParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_simple(SQLParser.For_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assign_variable_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_variable_for_loop(SQLParser.Assign_variable_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(SQLParser.For_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(SQLParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#case1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase1(SQLParser.Case1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#switch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stmt(SQLParser.Switch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#default_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_stmt(SQLParser.Default_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_composition_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_composition_stmt(SQLParser.Create_table_composition_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(SQLParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(SQLParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_Type_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_Type_stmt(SQLParser.Create_Type_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(SQLParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(SQLParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclarationlist(SQLParser.ParameterdeclarationlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclaration(SQLParser.ParameterdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(SQLParser.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#jumpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpstatement(SQLParser.JumpstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_agg_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_agg_func(SQLParser.Create_agg_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(SQLParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(SQLParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#jar_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_path(SQLParser.Jar_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_of_Agg_function_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_of_Agg_function_params(SQLParser.Array_of_Agg_function_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(SQLParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#call_json_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_json_var(SQLParser.Call_json_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_access_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_access_name(SQLParser.Json_access_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_access_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_access_key(SQLParser.Json_access_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SQLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#updateparameter_forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateparameter_forloop(SQLParser.Updateparameter_forloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator_for_loop(SQLParser.Unary_operator_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cal_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCal_func(SQLParser.Cal_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#agg_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgg_fun(SQLParser.Agg_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#paramete_list_for_call_agg_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamete_list_for_call_agg_func(SQLParser.Paramete_list_for_call_agg_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_simple(SQLParser.Function_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#func_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_parameter_list(SQLParser.Func_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#higher_order_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigher_order_function(SQLParser.Higher_order_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_order(SQLParser.Function_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#func_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_parameter(SQLParser.Func_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(SQLParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_object(SQLParser.Json_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_value(SQLParser.Key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(SQLParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SQLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_json_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_json_object(SQLParser.Array_json_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(SQLParser.BoolContext ctx);
}