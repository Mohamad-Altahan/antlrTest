package Java.Base;

import Java.AST.Expression.Condition;
import Java.AST.Expression.Expression;
import Java.AST.Function.*;
import Java.AST.JavaStmt.*;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.AST.QueryStmt.SqlStmt;
import Java.Main;
import Java.SymbolTablee.AggregationFunction;
import Java.SymbolTablee.Scope;
import Java.SymbolTablee.Symbol;
import Java.SymbolTablee.Type;
import generated.SQLBaseListener;
import generated.SQLBaseVisitor;
import generated.SQLParser;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BaseVisitor extends SQLBaseVisitor {


    ////////////////////////////////////// START SQL

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */


    @Override
    public Parse visitParse(SQLParser.ParseContext ctx) {

    //    parameterName.setLine(ctx.getStart().getLine());
//        parameterName.setCol(ctx.getStart().getCharPositionInLine()+1);


        System.out.println("visitParse");
        Parse p = new Parse();


        if (ctx.sql_stmt_list().size() != 0) {
            Sql_Stmt_List sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(0));

            p.setSqlStmts(sqlStmts);
        }  if (ctx.create_function_stmt().size() != 0) {
            List<FunctionDeclaration> funDeclaration = new ArrayList<FunctionDeclaration>();
            for (int i = 0; i < ctx.create_function_stmt().size(); i++) {
                funDeclaration.add(visitCreate_function_stmt(ctx.create_function_stmt(i)));
            }
            p.setFunctions(funDeclaration);
        }
         if (ctx.create_agg_func().size() != 0) {
            List<AggregationFunction> aggregationFunctions = new ArrayList<AggregationFunction>();
            for (int i = 0; i < ctx.create_agg_func().size(); i++) {
                aggregationFunctions.add(visitCreate_agg_func(ctx.create_agg_func(i)));
            }
            p.setAggFuncs(aggregationFunctions);
        }

        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return p;
    }


    @Override
    public Object visitArray_of_Agg_function_params(SQLParser.Array_of_Agg_function_paramsContext ctx) {
        return super.visitArray_of_Agg_function_params(ctx);
    }

    @Override
    public CreateTableCompositionStmt visitCreate_table_composition_stmt(SQLParser.Create_table_composition_stmtContext ctx) {

        System.out.println("visitCreate_type_stmt");

        CreateTableCompositionStmt create = new CreateTableCompositionStmt();

        Type type =new Type();


//        if (ctx.database_name() != null) {
//        }
//        create.setTableName(visitTable_name(ctx.table_name()));
//        create.setFullName(create.getDataBaseName() + "." + create.getTableName());

        for(int i = 0 ; i<ctx.children.size();i++){

            if(ctx.children.get(i) instanceof SQLParser.Database_nameContext){
                create.setDataBaseName(visitDatabase_name((SQLParser.Database_nameContext)ctx.children.get(i)));
                if(ctx.children.get(i+2) instanceof SQLParser.Table_nameContext){
                    create.setTableName(visitTable_name((SQLParser.Table_nameContext)ctx.children.get(i+2)));
                    //type.setName(create.getTableName());
                }
            }
            else if(ctx.children.get(i) instanceof SQLParser.Table_nameContext){
                create.setTableName(visitTable_name((SQLParser.Table_nameContext)ctx.children.get(i)));
                type.setName(create.getTableName());

            }


            if(ctx.children.get(i) instanceof SQLParser.Column_defContext){
                create.columnDefList.add(visitColumn_def((SQLParser.Column_defContext)ctx.children.get(i)));

               int currentColumn= create.columnDefList.size() - 1;
               ////Add column for table to map in Object Type
                String nameColumn = create.columnDefList.get(currentColumn).getColumnName();
                if(type.columns.get(nameColumn)!=null){
                    create.columnDefList.get(currentColumn).setRepet(true);
                }
                type.addColumn(create.columnDefList.get(currentColumn).getColumnName(),create.columnDefList.get(currentColumn).getType());


            }
            if(ctx.children.get(i) instanceof  SQLParser.Table_constraintContext){
                create.tableConstraints.add(visitTable_constraint((SQLParser.Table_constraintContext)ctx.children.get(i)));
            }
            if(ctx.children.get(i) instanceof  SQLParser.FormatContext){
                create.setFormat(visitFormat((SQLParser.FormatContext)ctx.children.get(i)));
            }
            if(ctx.children.get(i) instanceof  SQLParser.PathContext){
                create.setPath(visitPath((SQLParser.PathContext)ctx.children.get(i)));
            }
            if(ctx.children.get(i) instanceof  SQLParser.Table_constraintContext){
                create.tableConstraints.add(visitTable_constraint((SQLParser.Table_constraintContext)ctx.children.get(i)));
            }

            if(ctx.children.get(i) instanceof  SQLParser.Factored_select_stmtContext){
                create.setFactoredSelectStmt(visitFactored_select_stmt((SQLParser.Factored_select_stmtContext)ctx.children.get(i)));
            }

        }

        create.setType(type);
        Main.symbolTable.addType(type);

        System.out.println("Size : " + Main.symbolTable.declaredTypes.size());
        return create;

    }

    @Override
    public String visitPath(SQLParser.PathContext ctx) {
        String path = "";

        if(ctx.IDENTIFIER()!=null){
            path = ctx.IDENTIFIER().getSymbol().getText();
        }

        return path;
    }

    @Override
    public String visitFormat(SQLParser.FormatContext ctx) {

        String format = "";

        if(ctx.IDENTIFIER()!=null){
            format = ctx.IDENTIFIER().getSymbol().getText();
        }

        return format;
    }

    @Override
    public CreateTypeStmt visitCreate_Type_stmt(SQLParser.Create_Type_stmtContext ctx) {
        System.out.println("visitCreate_type_stmt");

        CreateTypeStmt create = new CreateTypeStmt();

        Type type = new Type();

//        if (ctx.database_name() != null) {
//        }
//        create.setTableName(visitTable_name(ctx.table_name()));
//        create.setFullName(create.getDataBaseName() + "." + create.getTableName());

        for(int i = 0 ; i<ctx.children.size();i++){

            if(ctx.children.get(i) instanceof SQLParser.Database_nameContext){
                create.setDataBaseName(visitDatabase_name((SQLParser.Database_nameContext)ctx.children.get(i)));
                if(ctx.children.get(i+2) instanceof SQLParser.Table_nameContext){
                    create.setTableName(visitTable_name((SQLParser.Table_nameContext)ctx.children.get(i+2)));
                }
            }
            else if(ctx.children.get(i) instanceof SQLParser.Table_nameContext){
                create.setTableName(visitTable_name((SQLParser.Table_nameContext)ctx.children.get(i)));

                type.setName(create.getTableName());
            }


            if(ctx.children.get(i) instanceof SQLParser.Column_defContext){
                create.columnDefList.add(visitColumn_def((SQLParser.Column_defContext)ctx.children.get(i)));
                int currentColumn= create.columnDefList.size() - 1;
                String nameColumn = create.columnDefList.get(currentColumn).getColumnName();
                if(type.columns.get(nameColumn)!=null){
                    create.columnDefList.get(currentColumn).setRepet(true);
                }
                ////Add column for table to map in Object Type
                type.addColumn(create.columnDefList.get(currentColumn).getColumnName(),create.columnDefList.get(currentColumn).getType());

            }
            if(ctx.children.get(i) instanceof  SQLParser.Table_constraintContext){
                create.tableConstraints.add(visitTable_constraint((SQLParser.Table_constraintContext)ctx.children.get(i)));
            }
            if(ctx.children.get(i) instanceof  SQLParser.Factored_select_stmtContext){
                create.setFactoredSelectStmt(visitFactored_select_stmt((SQLParser.Factored_select_stmtContext)ctx.children.get(i)));
            }

        }

        create.setType(type);
        Main.symbolTable.addType(type);
       return create;
    }

    @Override
    public AggregationFunction visitCreate_agg_func(SQLParser.Create_agg_funcContext ctx) {
        System.out.println("visitCreate_agg_func");
        AggregationFunction aggregationFunction = new AggregationFunction();


        Scope funScope = new Scope();
        funScope.setIsParent(true);
        funScope.setId(createId());
        Main.symbolTable.addScope(funScope);
        if (ctx.any_name() != null) {
           aggregationFunction.setAggregationFunctionName(visitAny_name(ctx.any_name()));
        } if (ctx.jar_path() != null) {
            aggregationFunction.setJarPath(visitAny_name(ctx.jar_path().any_name()));
        } if (ctx.class_name() != null) {
            aggregationFunction.setClassName(visitAny_name(ctx.class_name().any_name()));
        } if (ctx.method_name() != null) {
            aggregationFunction.setMethodName(visitAny_name(ctx.method_name().any_name()));
        } if (ctx.dtype() != null) {
            aggregationFunction.setReturnType(visitDtype(ctx.dtype()));
        }if (ctx.array() != null) {
            aggregationFunction.setArray(visitArray(ctx.array()));


        }


        aggregationFunction.setScope(funScope);

        Main.symbolTable.declaredAggregationFunction.add(aggregationFunction);

        return aggregationFunction;
    }

//    @Override
//    public AggFuncBody visitAgg_function_Body(SQLParser.Agg_function_BodyContext ctx) {
//        AggFuncBody aggFuncBody = new AggFuncBody();
//
//        for(int i = 0 ; i<ctx.children.size();i++){
//
//            if(ctx.children.get(i) instanceof SQLParser.Jar_pathContext){
//                aggFuncBody.setJarPath(visitAny_name(ctx.jar_path().any_name()));
//            }
//            if(ctx.children.get(i) instanceof SQLParser.Class_nameContext){
//                aggFuncBody.setClassName(visitAny_name(ctx.class_name().any_name()));
//            }
//            if(ctx.children.get(i) instanceof SQLParser.Method_nameContext){
//                aggFuncBody.setMethodName(visitAny_name(ctx.method_name().any_name()));
//            }
////            if(ctx.children.get(i) instanceof SQLParser.Array_of_Agg_function_paramsContext){
////                aggFuncBody.setParameterDeclarationList(visitParameterdeclarationlist(ctx.array_of_Agg_function_params().parameterdeclarationlist()));
////            }
//
//        }
//
//
//
//        return aggFuncBody;
//    }

    @Override
    public Object visitMethod_name(SQLParser.Method_nameContext ctx) {
        return super.visitMethod_name(ctx);
    }

    @Override
    public Object visitClass_name(SQLParser.Class_nameContext ctx) {
        return super.visitClass_name(ctx);
    }

    @Override
    public Object visitJar_path(SQLParser.Jar_pathContext ctx) {
        return super.visitJar_path(ctx);
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Object visitError(SQLParser.ErrorContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Sql_Stmt_List visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

        System.out.println("visitSql_stmt_list");

        Sql_Stmt_List sqlStmt = new Sql_Stmt_List();
        for (int i = 0; i < ctx.sql_stmt().size(); i++) {
            sqlStmt.sqlStmtList.add(visitSql_stmt(ctx.sql_stmt(i)));
        }

        return sqlStmt;
//        return visitChildren(ctx);
    }

    @Override
    public List<JavaStmt> visitStmt_list(SQLParser.Stmt_listContext ctx) {
        System.out.println("visitJava_Stmt_list");

        List<JavaStmt> JavaStmtList = new ArrayList<Java.AST.JavaStmt.JavaStmt>();
        for (int i = 0; i < ctx.stmt().size(); i++) {
            JavaStmtList.add(visitStmt(ctx.stmt(i)));
        }

        return JavaStmtList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public SqlStmt visitSql_stmt(SQLParser.Sql_stmtContext ctx) {

        System.out.println("visitSql_stmt   ");
        SqlStmt s = new SqlStmt();


        //1111111111111111
        if (ctx.drop_table_stmt() != null) {
            s.setName("DropTable");
            s = visitDrop_table_stmt(ctx.drop_table_stmt());
        }
        //222222222222222222
        else if (ctx.create_table_stmt() != null) {
            s.setName("CreateTable");
            s = visitCreate_table_stmt(ctx.create_table_stmt());
        }
        //33333333333333333
        else if (ctx.factored_select_stmt() != null) {
            s.setName("Factored_select_stmt");
            s.setFactoredSelectStmt(visitFactored_select_stmt(ctx.factored_select_stmt()));
        }
        //44444444444444444
        else if (ctx.delete_stmt() != null) {
            s.setName("DeleteStmt");
            s = visitDelete_stmt(ctx.delete_stmt());
        }
        //5555555555
        else if (ctx.alter_table_stmt() != null) {
            s.setName("AlterTable");
            s = visitAlter_table_stmt(ctx.alter_table_stmt());
        }
        //6666666666666666666666
        else if (ctx.insert_stmt() != null) {
            s.setName("InsertStmt");
            s = visitInsert_stmt(ctx.insert_stmt());
        }
        //7777777777777777777777
        else if (ctx.update_stmt() != null) {
            s.setName("Update_stmt");
            s = visitUpdate_stmt(ctx.update_stmt());
        }
        /////////////////////////8
        else if (ctx.create_Type_stmt() != null) {
            s.setName("Create_Type_stmt");
            s.setCreateTypeStmt(visitCreate_Type_stmt(ctx.create_Type_stmt()));
        }
        //////////////////////////9
        else if (ctx.create_table_composition_stmt() != null) {
            s.setName("Create_Table_Composition_stmt");
            s.setCreateTableCompositionStmt(visitCreate_table_composition_stmt(ctx.create_table_composition_stmt()));
        }

        return s;

//        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    @Override
    public SelectStmt visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");
        SelectStmt selectStmt = new SelectStmt();

//        for (int i = 0; i < ctx.children.size(); i++) {
//            if (ctx.children.get(i) instanceof SQLParser.Result_columnContext)
//                selectStmt.columns.add(visitResult_column((SQLParser.Result_columnContext) ctx.children.get(i)));
//            else if (ctx.children.get(i) instanceof SQLParser.Table_or_subqueryContext)
//                selectStmt.setFromItem(visitTable_or_subquery((SQLParser.Table_or_subqueryContext) ctx.children.get(i)));
//            else if (ctx.children.get(i) instanceof SQLParser.ExprContext)
//                selectStmt.expr = visitExpr((SQLParser.ExprContext) ctx.children.get(i));
//        }


        return selectStmt;
        //return visitChildren(ctx)
    }


    @Override
    public DropTableStmt visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx) {
        System.out.println("visitDrop_table_stmt ");


        DropTableStmt drop = new DropTableStmt();

        if (ctx.database_name() != null) {
            drop.setDataBaseName(visitDatabase_name(ctx.database_name()));
        }
        drop.setTableName(visitTable_name(ctx.table_name()));

        drop.setFullName(drop.getDataBaseName() + "." + drop.getTableName());

        return drop;


        //return super.visitDrop_table_stmt(ctx);
    }

    @Override
    public CreateTableStmt visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {
        System.out.println("visitCreate_table_stmt");

        CreateTableStmt create = new CreateTableStmt();

//        if (ctx.database_name() != null) {
//        }
//        create.setTableName(visitTable_name(ctx.table_name()));
//        create.setFullName(create.getDataBaseName() + "." + create.getTableName());

        for(int i = 0 ; i<ctx.children.size();i++){

            if(ctx.children.get(i) instanceof SQLParser.Database_nameContext){
                create.setDataBaseName(visitDatabase_name((SQLParser.Database_nameContext)ctx.children.get(i)));
                if(ctx.children.get(i+2) instanceof SQLParser.Table_nameContext){
                    create.setTableName(visitTable_name((SQLParser.Table_nameContext)ctx.children.get(i+2)));
                }
            }
           else if(ctx.children.get(i) instanceof SQLParser.Table_nameContext){
                create.setTableName(visitTable_name((SQLParser.Table_nameContext)ctx.children.get(i)));
            }


           if(ctx.children.get(i) instanceof SQLParser.Column_defContext){
               create.columnDefList.add(visitColumn_def((SQLParser.Column_defContext)ctx.children.get(i)));
           }
           if(ctx.children.get(i) instanceof  SQLParser.Table_constraintContext){
                create.tableConstraints.add(visitTable_constraint((SQLParser.Table_constraintContext)ctx.children.get(i)));
           }
           if(ctx.children.get(i) instanceof  SQLParser.Factored_select_stmtContext){
                create.setFactoredSelectStmt(visitFactored_select_stmt((SQLParser.Factored_select_stmtContext)ctx.children.get(i)));
           }

       }
        return create;


        //return super.visitCreate_table_stmt(ctx);
    }

    @Override
    public DeleteStmt visitDelete_stmt(SQLParser.Delete_stmtContext ctx) {
        System.out.println("visitDelete_stmt");

        DeleteStmt delete = new DeleteStmt();

        delete.setTableName(visitQualified_table_name(ctx.qualified_table_name()));
        if (ctx.expr() != null)
            delete.expr = visitExpr(ctx.expr());

        return delete;
        //return super.visitDelete_stmt(ctx);

    }
    @Override
    public String visitSource_table_name(SQLParser.Source_table_nameContext ctx) {
        System.out.println("visitSource_table_name");
        String sourceTableName="";
        if(ctx.any_name().IDENTIFIER()!=null){
            sourceTableName=ctx.any_name().IDENTIFIER().getText();
        }
        else{
            sourceTableName=ctx.any_name().STRING_LITERAL().getText();
        }
        return sourceTableName;

        //return super.visitSource_table_name(ctx);
    }

    @Override
    public String visitNew_table_name(SQLParser.New_table_nameContext ctx) {

        System.out.println("visitNew_table_name");
        String name = "";

        if(ctx.any_name().IDENTIFIER()!= null) {
            name = ctx.any_name().IDENTIFIER().getSymbol().getText();
        }

        else if(ctx.any_name().STRING_LITERAL()!=null) {
            name = ctx.any_name().STRING_LITERAL().getSymbol().getText();
        }

        return name;

        //return super.visitNew_table_name(ctx);
    }



    @Override
    public Alter_Table_Add_Constraint visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx) {
        System.out.println("visitAlter_table_add_constraint");
        Alter_Table_Add_Constraint alterTableAddConstraint=new Alter_Table_Add_Constraint();
        if(ctx.any_name()!=null){
            alterTableAddConstraint.setName(visitAny_name(ctx.any_name()));
        }
        if(ctx.table_constraint()!=null){
            alterTableAddConstraint.setTableConstraint(visitTable_constraint(ctx.table_constraint()));
        }

        return alterTableAddConstraint;
        //return super.visitAlter_table_add_constraint(ctx);
    }

    @Override
    public AlterTableAdd visitAlter_table_add(SQLParser.Alter_table_addContext ctx) {
        System.out.println("visitAlter_table_add");


        AlterTableAdd alterTableAdd = new AlterTableAdd();

        if(ctx.table_constraint()!=null){
            alterTableAdd.setTableConstraint(visitTable_constraint(ctx.table_constraint()));
        }


      return alterTableAdd;
       // return super.visitAlter_table_add(ctx);
    }

    @Override
    public String visitType_name(SQLParser.Type_nameContext ctx) {

        System.out.println("visitType_name");
        String typeName ="";
        if(ctx.name()!=null){
            if(ctx.name().any_name().IDENTIFIER()!=null)
            {
                typeName = ctx.name().any_name().IDENTIFIER().getSymbol().getText();
            }
            else{
                typeName = ctx.name().any_name().STRING_LITERAL().getSymbol().getText();
            }
        }
        else if(ctx.dtype()!=null){
            typeName = visitDtype(ctx.dtype());
        }


        return typeName;
    }

    @Override
    public ColumnDef visitColumn_def(SQLParser.Column_defContext ctx) {
        System.out.println("visitColumn_def");
        ColumnDef columnDef = new ColumnDef();
        Type typeColumn = new Type();
        columnDef.setLine(ctx.start.getLine());

        columnDef.setColumnName(visitColumn_name(ctx.column_name()));
        columnDef.setCol(ctx.start.getCharPositionInLine()+1);

        if(ctx.column_constraint().size()>0){
            for(int i=0;i<ctx.column_constraint().size();i++){
                columnDef.Constraints.add(visitColumn_constraint(ctx.column_constraint(i)));
            }

        }
        if(ctx.type_name().size()>0){
            for(int i=0;i<ctx.type_name().size();i++){
                columnDef.TypeName.add(visitType_name(ctx.type_name(i)));
                typeColumn.setName(columnDef.TypeName.get(i));

            }
        }
//        if(ctx.children.get(ctx.children.size()-1) instanceof SQLParser.Type_nameContext)
//            columnDef.setTypeName(visitType_name((SQLParser.Type_nameContext)ctx.children.get(ctx.children.size()-1)));
//        if(ctx.column_constraint()!=null)
//            for(int i=0;i<ctx.column_constraint().size();i++){
//                columnDef.Constraints.add(visitColumn_constraint(ctx.column_constraint(i)));
//            }
        columnDef.setType(typeColumn);
        return columnDef;




        //return super.visitColumn_def(ctx);
    }

    @Override
    public String visitColumn_constraint(SQLParser.Column_constraintContext ctx) {
        System.out.println("visitColumn_constraint");

        String constraint;

        if(ctx.column_constraint_primary_key()!=null) {
            constraint = "Primary Key";
            return constraint;
        }
        if(ctx.column_constraint_not_null()!=null) {
            constraint ="Not Null";
            return constraint;
        }
        if(ctx.column_constraint_null()!=null) {
            constraint ="Null";
            return constraint;
        }

        return ctx.getText();



        // return super.visitColumn_constraint(ctx);
    }

    @Override
    public Object visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx) {
        return super.visitColumn_constraint_primary_key(ctx);
    }

    @Override
    public Indexed_Column visitIndexed_column(SQLParser.Indexed_columnContext ctx) {
        System.out.println("visitIndexed_column");

        Indexed_Column indexedColumn = new Indexed_Column();

        if(ctx.column_name()!=null){
            indexedColumn.setColumnName(visitAny_name(ctx.column_name().any_name()));
//            if(ctx.column_name().any_name().IDENTIFIER()!=null)
//            {
//                indexedColumn.setColumnName(ctx.column_name().any_name().IDENTIFIER().getSymbol().getText());
//            }
//            else{
//                indexedColumn.setColumnName(ctx.column_name().any_name().STRING_LITERAL().getSymbol().getText());
//            }
        }
        if(ctx.K_COLLATE()!=null){

            if(ctx.collation_name()!=null){
                indexedColumn.setCollationName(visitAny_name(ctx.collation_name().any_name()));

//                if(ctx.collation_name().any_name().IDENTIFIER()!=null)
//                {
//                    indexedColumn.setCollationName(ctx.collation_name().any_name().IDENTIFIER().getSymbol().getText());
//                }
//                else{
//                    indexedColumn.setCollationName(ctx.collation_name().any_name().STRING_LITERAL().getSymbol().getText());
//                }
            }
        }



        return indexedColumn;
        // return super.visitIndexed_column(ctx);
    }

    @Override
    public TableConstraint visitTable_constraint(SQLParser.Table_constraintContext ctx) {
        System.out.println("visitTable_constraint");
        TableConstraint tableConstraint = new TableConstraint();

        String name = "";

        if(ctx.name()!=null){
            if(ctx.name().any_name().IDENTIFIER()!=null)
            {
                tableConstraint.setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());

            }
            else{
                tableConstraint.setName(ctx.name().any_name().STRING_LITERAL().getSymbol().getText());
            }
        }
        if(ctx.table_constraint_primary_key()!=null){
            tableConstraint.setTableConstraintPrimaryKey(visitTable_constraint_primary_key(ctx.table_constraint_primary_key()));
        }
        else if(ctx.table_constraint_key()!=null){
            tableConstraint.setTableConstraintKey(visitTable_constraint_key(ctx.table_constraint_key()));
        }
        else if(ctx.table_constraint_unique()!=null){

            tableConstraint.setTableConstraintUnique(visitTable_constraint_unique(ctx.table_constraint_unique()));
        }
        else if(ctx.table_constraint_foreign_key()!=null){
            tableConstraint.setTableConstraintForeignKey(visitTable_constraint_foreign_key(ctx.table_constraint_foreign_key()));
        }
        else if(ctx.expr()!=null){
            tableConstraint.setExpression(visitExpr(ctx.expr()));

        }

        return tableConstraint;

        //return super.visitTable_constraint(ctx);
    }

    @Override
    public Table_Constraint_Primary_Key visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx) {
        System.out.println("visitTable_constraint_primary_key");

        Table_Constraint_Primary_Key tableConstraintPrimaryKey = new Table_Constraint_Primary_Key();
        if(ctx.indexed_column().size()>0){
            for(int i=0;i<ctx.indexed_column().size();i++){
                tableConstraintPrimaryKey.indexedColumns.add(visitIndexed_column(ctx.indexed_column(i)));
            }
        }

        return tableConstraintPrimaryKey;
        //return super.visitTable_constraint_primary_key(ctx);
    }

    @Override
    public Table_Constraint_Foreign_Key visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx) {
        System.out.println("visitTable_constraint_foreign_key");
        Table_Constraint_Foreign_Key tableConstraintForeignKey = new Table_Constraint_Foreign_Key();
        if(ctx.fk_origin_column_name().size()>0){
            for(int i =0;i<ctx.fk_origin_column_name().size();i++) {
                tableConstraintForeignKey.fkOriginColumnName.add(visitAny_name(ctx.fk_origin_column_name(i).column_name().any_name()));
            }
            if(ctx.foreign_key_clause()!=null){
                tableConstraintForeignKey.setForeignKeyClause(visitForeign_key_clause(ctx.foreign_key_clause()));
            }
        }

      return tableConstraintForeignKey;

        //return super.visitTable_constraint_foreign_key(ctx);
    }

    @Override
    public Table_Constraint_Unique visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx) {
        System.out.println("visitTable_constraint_unique");

        Table_Constraint_Unique  tableConstraintUnique = new Table_Constraint_Unique();

        if(ctx.name()!=null){
            tableConstraintUnique.setName(visitAny_name(ctx.name().any_name()));
        }
        if(ctx.indexed_column().size()>0){
            for(int i=0;i<ctx.indexed_column().size();i++){
                tableConstraintUnique.indexedColumns.add(visitIndexed_column(ctx.indexed_column(i)));
            }
        }

        return tableConstraintUnique;



        //return super.visitTable_constraint_unique(ctx);
    }

   @Override
    public Table_Constraint_Key visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx) {
       System.out.println("visitTable_constraint_key");

        Table_Constraint_Key  tableConstraintKey = new Table_Constraint_Key();

        if(ctx.name()!=null){
            tableConstraintKey.setName(visitAny_name(ctx.name().any_name()));
        }
        if(ctx.indexed_column().size()>0){
            for(int i=0;i<ctx.indexed_column().size();i++){
                tableConstraintKey.indexedColumns.add(visitIndexed_column(ctx.indexed_column(i)));
            }
        }

        return tableConstraintKey;

        //return super.visitTable_constraint_key(ctx);
    }



    @Override
    public String visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx) {
        System.out.println("visitQualified_table_name");


        String TableName = "";
        if(ctx.database_name()!=null) {
            TableName = visitDatabase_name(ctx.database_name()) + ".";
        }
        if (ctx.table_name() != null) {
            TableName += visitTable_name(ctx.table_name());
        }

        return TableName;


        //return super.visitQualified_table_name(ctx);
    }

    @Override
    public InsertStmt visitInsert_stmt(SQLParser.Insert_stmtContext ctx) {
        System.out.println("visitInsert_stmt");
        InsertStmt insertStmt = new InsertStmt();
        if(ctx.database_name()!=null)
            insertStmt.setTableName(visitDatabase_name(ctx.database_name())+".");
        if(ctx.table_name()!=null)
            insertStmt.setTableName(insertStmt.getTableName() +  ctx.table_name().any_name().getText());
        int indexValues=0;
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Column_nameContext){
                insertStmt.Columns.add(visitColumn_name((SQLParser.Column_nameContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i).toString().equals("values")){
                indexValues = i;
            }
        }
        Row row = new Row();
        for(int i=indexValues;i<ctx.children.size();i++){
            if(ctx.children.get(i).toString().equals("(") && row.Rows.size() > 0){
                insertStmt.Values.add(row);
                row=new Row();
            }
            if(ctx.children.get(i)instanceof SQLParser.ExprContext)
                row.Rows.add(visitExpr((SQLParser.ExprContext)ctx.children.get(i)));
        }
        if(row.Rows.size() > 0)
            insertStmt.Values.add(row);

        return insertStmt;

        //return super.visitInsert_stmt(ctx);
    }

    public Expression GetExpression(SQLParser.ExprContext ctx){

        System.out.println("visitExpr");
        Expression expression = new Expression();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.ExprContext) {
                if(i==0)
                    expression.Left = GetExpression((SQLParser.ExprContext) ctx.children.get(i));
                else if(i==2)
                    expression.Right = GetExpression((SQLParser.ExprContext) ctx.children.get(i));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Literal_valueContext)
                expression.Variables.add(visitLiteral_value((SQLParser.Literal_valueContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Cal_funcContext){
                expression.setCalFunction( visitCal_func(ctx.cal_func())) ;
            }
            else if(ctx.children.get(i) instanceof SQLParser.Column_nameContext)
                expression.Variables.add(visitColumn_name((SQLParser.Column_nameContext)ctx.children.get(i)));
            else if(ctx.children.get(i).toString().equals("*") || ctx.children.get(i).toString().equals("/")
                    ||ctx.children.get(i).toString().equals("-") || ctx.children.get(i).toString().equals("+"))
                expression.setOperation(ctx.children.get(i).toString());
        }
        return expression;
    }
   /* public Expression GetExpressionByFunction(SQLParser.ExprContext ctx){
        Expression expression = new Expression();
        expression.setName("ProtoType");
        expression.Variables.add(visitFunction_name((SQLParser.Function_nameContext)ctx.children.get(0))+";");
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.ExprContext)
                expression.Variables.add(visitColumn_name((SQLParser.Column_nameContext)((SQLParser.ExprContext)ctx.children.get(i)).children.get(0))+";");
        }
        return expression;
    }*/


    @Override
    public UpdateStmt visitUpdate_stmt(SQLParser.Update_stmtContext ctx) {
        System.out.println("visitUpdate_stmt");
        UpdateStmt update = new UpdateStmt();
        update.setTableName(visitQualified_table_name((SQLParser.Qualified_table_nameContext)ctx.children.get(1)));
        Column_UpdateStmt col = new Column_UpdateStmt();
        for(int i=3;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Column_nameContext)
                col.setColName(visitColumn_name((SQLParser.Column_nameContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.ExprContext)
                col.expr = visitExpr((SQLParser.ExprContext)ctx.children.get(i));
            else if(ctx.children.get(i).toString().equals(",")){
                update.ColUpdateStmt.add(col);
                col = new Column_UpdateStmt();
            }
            else if(ctx.children.get(i).toString().equals("where"))
                break;
        }
        if(col.expr != null)
            update.ColUpdateStmt.add(col);
        update.SqlExpr = visitExpr((SQLParser.ExprContext)ctx.children.get(ctx.children.size()-1));


        return update;


        //return super.visitUpdate_stmt(ctx);
    }



    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Factored_Select_Stmt visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx)
    {
        System.out.println("visitFactored_select_stmt");

        Factored_Select_Stmt factoredSelectStmt = new Factored_Select_Stmt();

        if(ctx.select_core()!=null){
            factoredSelectStmt.setSelectCore(visitSelect_core(ctx.select_core()));
        }
        if(ctx.K_BY()!=null && ctx.K_ORDER()!=null){
            if(ctx.ordering_term().size()>0){
                for(int i=0;i<ctx.ordering_term().size();i++){
                    factoredSelectStmt.orderingTerm.add(visitOrdering_term(ctx.ordering_term(i)));
                }
            }
        }
        if(ctx.K_LIMIT()!=null){
        if(ctx.expr().size()>0){
            for(int i=0;i<ctx.expr().size();i++){
                factoredSelectStmt.expression.add(visitExpr(ctx.expr(i)));
            }
        }
        }

        return factoredSelectStmt;
//        return visitChildren(ctx);

    }

    @Override
    public Select_Core visitSelect_core(SQLParser.Select_coreContext ctx) {
        System.out.println("visitSelect_core");
        Select_Core selectCore = new Select_Core();
        selectCore.setLine(ctx.start.getLine());

        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Result_columnContext)
                selectCore.resultColumns.add(visitResult_column((SQLParser.Result_columnContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Join_clauseContext)
                selectCore.setJoinClause(visitJoin_clause((SQLParser.Join_clauseContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Table_or_subqueryContext)
                selectCore.tableOrSubqueries.add(visitTable_or_subquery((SQLParser.Table_or_subqueryContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.ExprContext) {
                selectCore.expression.add(visitExpr((SQLParser.ExprContext) ctx.children.get(i)));
                selectCore.setCol( ((SQLParser.ExprContext) ctx.children.get(i)).start.getCharPositionInLine()+1);
            }

        }

        return selectCore;
    }

    @Override
    public Join_Clause visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        System.out.println("visitJoin_clause");

        Join_Clause joinClause = new Join_Clause();

        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Table_or_subqueryContext)
                joinClause.tableOrSubqueries.add(visitTable_or_subquery((SQLParser.Table_or_subqueryContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Join_operatorContext)
                joinClause.joinOperators.add(visitJoin_operator((SQLParser.Join_operatorContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Join_constraintContext)
                joinClause.joinConstraints.add(visitJoin_constraint((SQLParser.Join_constraintContext)ctx.children.get(i)));

        }

        return joinClause;
        //return super.visitJoin_clause(ctx);
    }

    @Override
    public Join_Operator visitJoin_operator(SQLParser.Join_operatorContext ctx) {
        System.out.println("visitJoin_operator");

        Join_Operator joinOperator = new Join_Operator();

        if(ctx.K_JOIN()==null){
            joinOperator.setJoinOperator(",");
        }

        else {
            if (ctx.K_LEFT() == null && ctx.K_INNER() == null) {
                joinOperator.setJoinOperator(ctx.K_JOIN().getSymbol().getText());
            } else {
                if (ctx.K_LEFT() != null) {
                    joinOperator.setJoinOperator(ctx.K_LEFT().getSymbol().getText());
                    if (ctx.K_OUTER() != null) {
                        joinOperator.setJoinOperator(joinOperator.getJoinOperator() + " " + ctx.K_OUTER().getSymbol().getText());
                    }
                } else if (ctx.K_INNER() != null) {
                    joinOperator.setJoinOperator(ctx.K_INNER().getSymbol().getText());
                }
                joinOperator.setJoinOperator(joinOperator.getJoinOperator() + " " + ctx.K_JOIN());
            }
        }



        return joinOperator;
        //return super.visitJoin_operator(ctx);
    }

    @Override
    public Join_Constraint visitJoin_constraint(SQLParser.Join_constraintContext ctx) {
        System.out.println("visitJoin_constraint");

        Join_Constraint joinConstraint = new Join_Constraint();

        if(ctx.K_ON()!=null){
            if(ctx.expr()!=null){

                joinConstraint.setExpression(visitExpr(ctx.expr()));
            }
        }

        return joinConstraint;
        // return super.visitJoin_constraint(ctx);
    }

    @Override
    public AlterStmt visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx) {
        System.out.println("visitAlter_table_stmt");

        AlterStmt alter = new AlterStmt();
        if(ctx.database_name()!=null && ctx.source_table_name()!=null) {
            alter.setDataBaseName(visitDatabase_name(ctx.database_name()));
            alter.setSourceTableName(visitSource_table_name(ctx.source_table_name()));
            alter.setFullName(alter.getDataBaseName() + "." + alter.getSourceTableName());
        }
       else if(ctx.source_table_name()!=null) {
            alter.setSourceTableName(visitSource_table_name(ctx.source_table_name()));
            alter.setFullName( alter.getSourceTableName());

            if(ctx.K_RENAME()!=null && ctx.K_TO() != null){
                alter.setNewTableName(visitNew_table_name(ctx.new_table_name())) ;
            }
            else if(ctx.alter_table_add()!=null){
                alter.setAlterTableAdd(visitAlter_table_add(ctx.alter_table_add()));
            }
            else if(ctx.alter_table_add_constraint()!=null){
                alter.setAlterTableAddConstraint(visitAlter_table_add_constraint(ctx.alter_table_add_constraint()));
            }
            else if(ctx.K_ADD()!=null || (  ctx.K_ADD()!=null && ctx.K_COLUMN()!=null )){
                int size = ctx.children.size();
                //alter.setColumnDef(visitColumn_def((SQLParser.Column_defContext)ctx.children.get(size-1)));
                alter.setColumnDef(visitColumn_def(ctx.column_def()));
            }
           // alter.setSourceTableName(("here"));
        }

        //alter.setSourceTableName(visitSource_table_name(ctx.source_table_name()));





        return alter;

        //return super.visitAlter_table_stmt(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Ordering_Term visitOrdering_term(SQLParser.Ordering_termContext ctx) {

        System.out.println("visitOrdering_term");

        Ordering_Term orderingTerm = new Ordering_Term();

        if(ctx.expr()!=null){
            orderingTerm.setExpression(visitExpr(ctx.expr()));
            if(ctx.K_COLLATE()!=null){
                orderingTerm.setCollationName(visitAny_name(ctx.collation_name().any_name()));
            }
        }
        return orderingTerm;
     //   return visitChildren(ctx);
         }
    /**
     * {@inheritDoc}`
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public ExpressionForAll visitExpr(SQLParser.ExprContext ctx) {
        System.out.println("visitExpr");
        ExpressionForAll expr = new ExpressionForAll();
        expr.setLine(ctx.getStart().getLine());

        if(ctx.children.size()==1){
            if(ctx.literal_value()!=null) {
                //expr.setValue(visitLiteral_value(ctx.literal_value()));
                expr.setliteralValue(ctx.literal_value().getText());
            }
            else if(ctx.column_name()!=null) {
                expr.setColumnName(visitColumn_name(ctx.column_name()));
                expr.setCol(ctx.column_name().getStart().getCharPositionInLine()+1);
            }
            else if(ctx.cal_func()!=null){
                expr.setCalFunction( visitCal_func(ctx.cal_func()));
            }
            else if(ctx.unary_operator_for_loop()!=null){
                expr.setUnaryOperatorForLoop( visitUnary_operator_for_loop(ctx.unary_operator_for_loop()));
            }
            else if(ctx.updateparameter_forloop()!=null){
                expr.setUpdateparameterForloop( visitUpdateparameter_forloop(ctx.updateparameter_forloop()));
            }

            return expr;
        }



        else if(ctx.children.get(0) instanceof SQLParser.ExprContext){
            expr.left = visitExpr((SQLParser.ExprContext)ctx.children.get(0));
//            if(ctx.left.column_name()!=null) {
//                expr.left.setCol(ctx.column_name().getStart().getCharPositionInLine()+1);
//            }

            expr.right = visitExpr((SQLParser.ExprContext)ctx.children.get(2));
//            if(ctx.right.column_name()!=null) {
//                expr.right.setCol(ctx.column_name().getStart().getCharPositionInLine() + 1);
//            }

            expr.setOperator(ctx.children.get(1).toString());

        }
        else if(ctx.column_name()!=null){
            if(ctx.database_name()!=null) {
                expr.setDataBaseName(visitDatabase_name(ctx.database_name()));
                expr.setTableName( visitTable_name(ctx.table_name()));
                expr.setColumnName(visitColumn_name(ctx.column_name()));
                expr.setFullname(expr.getDataBaseName() + "." + expr.getTableName() + "." + expr.getColumnName());
            }
           else if(ctx.table_name()!=null){
                expr.setTableName(visitTable_name(ctx.table_name()));
                expr.setColumnName(visitColumn_name(ctx.column_name()));
                expr.setFullname( expr.getTableName() + "." + expr.getColumnName());

            }
           else{
                expr.setColumnName(visitColumn_name(ctx.column_name()));
                expr.setFullname( expr.getColumnName());

            }

        }
        return expr;

        //return visitChildren(ctx);

    }

    @Override
    public Condition visitCondition(SQLParser.ConditionContext ctx) {
        System.out.println("visitCondition");
        Condition condition=new Condition();
        condition.setScopeParent(condition.getParentToNode());
       // System.out.println(condition.getScopeParent().getId());
        condition.setLine(ctx.getStart().getLine());
        if(ctx.children.size()==1) {
            if (ctx.literal_value() != null) {
                //expr.setValue(visitLiteral_value(ctx.literal_value()));
                condition.setLiteralValue(ctx.literal_value().getText());
            } else if (ctx.any_name() != null) {
                condition.setVariableName(visitAny_name(ctx.any_name()));
                condition.setCol(ctx.any_name().getStart().getCharPositionInLine() + 1);
            } else if (ctx.cal_func() != null) {
                condition.setCalFunction(visitCal_func(ctx.cal_func()));
            }
        }

        else if(ctx.children.get(0) instanceof SQLParser.ConditionContext){
            condition.left = visitCondition((SQLParser.ConditionContext) ctx.children.get(0));
//            if(ctx.left.column_name()!=null) {
//                expr.left.setCol(ctx.column_name().getStart().getCharPositionInLine()+1);
//            }

            condition.right = visitCondition((SQLParser.ConditionContext)ctx.children.get(2));
//            if(ctx.right.column_name()!=null) {
//                expr.right.setCol(ctx.column_name().getStart().getCharPositionInLine() + 1);
//            }

            condition.setOperator(ctx.children.get(1).toString());
        }

        return condition;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Result_Column visitResult_column(SQLParser.Result_columnContext ctx) {

        System.out.println("visitResult_column");
        Result_Column resultColumn = new Result_Column();

        resultColumn.setLine(ctx.start.getLine());
        String col = "";

        if( ctx.table_name()!= null){
            resultColumn.setTableName(visitAny_name(ctx.table_name().any_name()) + "." + " *");
        }
        else if(ctx.expr()!=null){
            resultColumn.setExpression(visitExpr(ctx.expr()));
            resultColumn.setCol(ctx.expr().column_name().start.getCharPositionInLine()+1);
            if(ctx.column_alias()!=null){
                if(ctx.column_alias().STRING_LITERAL()!=null){
                    resultColumn.setColumnAlias(ctx.column_alias().STRING_LITERAL().getSymbol().getText());
                }
                else{
                    resultColumn.setColumnAlias(ctx.column_alias().IDENTIFIER().getSymbol().getText());
                }
            }
        }
        else{
            resultColumn.setColumnName("*");
        }

        return resultColumn;


    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Table_Or_Subquery visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {
        System.out.println("visitTable_or_subquery");
        String Name = "" ;
        Table_Or_Subquery tableOrSubquery =new Table_Or_Subquery();

        tableOrSubquery.setLine(ctx.start.getLine());


        if(ctx.children.get(0) instanceof SQLParser.Database_nameContext || ctx.children.get(0) instanceof SQLParser.Table_nameContext){
            if(ctx.database_name()!=null){
                tableOrSubquery.setDataBaseName(visitDatabase_name((SQLParser.Database_nameContext)ctx.children.get(0)));

            }
            if(ctx.table_name()!=null){
                tableOrSubquery.setTableName(visitTable_name((SQLParser.Table_nameContext)ctx.children.get(0)));
                tableOrSubquery.setCol(ctx.table_name().start.getCharPositionInLine()+1);
                if(ctx.database_name()!=null && ctx.table_name()!=null){
                    tableOrSubquery.setFullName(tableOrSubquery.getDataBaseName() + "." + tableOrSubquery.getTableName());
                }
                if(ctx.table_alias()!=null){
                    tableOrSubquery.setTableAlias(visitAny_name(ctx.table_alias().any_name()));
                }
                if(ctx.index_name()!=null){
                    tableOrSubquery.setIndexName(visitAny_name(ctx.index_name().any_name()));
                }
            }
        }
        else if(ctx.children.get(1) instanceof SQLParser.Table_or_subqueryContext || ctx.children.get(1) instanceof SQLParser.Join_clauseContext){

            if(ctx.table_or_subquery().size()>0){
                for(int i = 0; i <ctx.table_or_subquery().size();i++){
                    tableOrSubquery.tableOrSubqueries.add(visitTable_or_subquery((SQLParser.Table_or_subqueryContext)ctx.children.get(i)));
                }

            }else {
                tableOrSubquery.setJoinClause(visitJoin_clause((SQLParser.Join_clauseContext)ctx.children.get(1)));
            }
            if(ctx.table_alias()!=null){
                tableOrSubquery.setTableAlias(visitAny_name(ctx.table_alias().any_name()));
            }
        }
        else if(ctx.children.get(1) instanceof SQLParser.Factored_select_stmtContext){
            tableOrSubquery.setFactoredSelectStmt(visitFactored_select_stmt((SQLParser.Factored_select_stmtContext)ctx.children.get(1)));
            if(ctx.table_alias()!=null){
                tableOrSubquery.setTableAlias(visitAny_name(ctx.table_alias().any_name()));
            }
        }





//        if(ctx.table_name() != null){
//            tableOrSubquery.fromItem = visitAny_name(ctx.table_name().any_name());
//        }
//        if(ctx.select_stmt()!=null){
//            tableOrSubquery.selectStmt= visitSelect_stmt(ctx.select_stmt());
//        }

        return tableOrSubquery;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitColumn_alias(SQLParser.Column_aliasContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  String visitColumn_name(SQLParser.Column_nameContext ctx) {

        System.out.println("visitColumn_name");
        String columnName;

        if(ctx.any_name().IDENTIFIER()!=null){
            columnName=ctx.any_name().IDENTIFIER().getText();

        }
        else{
            columnName=ctx.any_name().STRING_LITERAL().getText();
        }

        return columnName;
        //return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  String visitTable_name(SQLParser.Table_nameContext ctx) {
        System.out.println("visitTable_name");
        String TableName;
        if(ctx.any_name().IDENTIFIER()!=null){
            TableName=ctx.any_name().IDENTIFIER().getText();
        }

        else{
            TableName=ctx.any_name().STRING_LITERAL().getText();

        }

        return TableName;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  String visitDatabase_name(SQLParser.Database_nameContext ctx) {
        System.out.println("visitDatabase_name");
        String name = "";

        name = visitAny_name(ctx.any_name());

//        if(ctx.any_name().IDENTIFIER()!=null) {
//            name = ctx.any_name().IDENTIFIER().getSymbol().getText();
//        }
//        else {
//            name = ctx.any_name().STRING_LITERAL().getSymbol().getText();
//
//        }
        return name;
        // return visitChildren(ctx);

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitCollation_name(SQLParser.Collation_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  String visitLiteral_value(SQLParser.Literal_valueContext ctx) {

        System.out.println("visitLiteral_value");

        String literal;

        if(ctx.BLOB_LITERAL()!=null)
        {
            literal = ctx.BLOB_LITERAL().getSymbol().getText();
        }
        else if(ctx.NUMERIC_LITERAL()!=null)
        {
            literal = ctx.NUMERIC_LITERAL().getSymbol().getText();
        }
        else {

            literal = ctx.STRING_LITERAL().getSymbol().getText();

        }


        return literal;

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  String visitAny_name(SQLParser.Any_nameContext ctx) {
        System.out.println("visitAny_name");
        if(ctx.STRING_LITERAL()!=null){
            return ctx.STRING_LITERAL().getSymbol().getText();
        }
        else{
            return ctx.IDENTIFIER().getSymbol().getText();}



    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitKeyword(SQLParser.KeywordContext ctx) { return visitChildren(ctx); }

    //////////////////////////////////////END SQL


    //////////////////////////////////////START JAVA
    @Override
    public JavaStmt visitStmt(SQLParser.StmtContext ctx) {

        System.out.println("visitJavaStmt");
        JavaStmt JavaStmt = new JavaStmt();
        if (ctx.if_stmt() != null) {
            JavaStmt.setName("If_Stmt");
            JavaStmt = visitIf_stmt(ctx.if_stmt());
        } else if (ctx.while_stmt() != null) {
            JavaStmt.setName("While_Stmt");
            JavaStmt = visitWhile_stmt(ctx.while_stmt());
        } else if (ctx.for_stmt() != null) {
            JavaStmt.setName("For_Stmt");
            JavaStmt = visitFor_stmt(ctx.for_stmt());
        } else if (ctx.json() != null) {
            JavaStmt.setName("Json");

            JavaStmt = visitJson(ctx.json());
        } else if (ctx.jumpstatement() != null) {
            JavaStmt.setName("Return_Stmt");

            JavaStmt = visitJumpstatement(ctx.jumpstatement());
        } else if (ctx.assign_variable() != null) {
            JavaStmt.setName("Assign_Variable");
            JavaStmt = visitAssign_variable(ctx.assign_variable());
        } else if (ctx.declare_variable() != null) {
            JavaStmt.setName("declare_variable");
            JavaStmt = visitDeclare_variable(ctx.declare_variable());
        } else if (ctx.sql_stmt() != null) {
            JavaStmt.setName("sql_stmt");
            JavaStmt = visitSql_stmt(ctx.sql_stmt());

        } else if (ctx.cal_func() != null) {
            JavaStmt.setName("cal_func");
            JavaStmt = visitCal_func(ctx.cal_func());

        } else if (ctx.print_stmt() != null) {
            JavaStmt.setName("print_stmt");
            JavaStmt = visitPrint_stmt(ctx.print_stmt());

        } else if (ctx.switch_stmt() != null) {
            JavaStmt.setName("switch_stmt");
            JavaStmt = visitSwitch_stmt(ctx.switch_stmt());

        } else if (ctx.expr() != null) {

            JavaStmt = visitExpr(ctx.expr());

        }


        return JavaStmt;
    }

    @Override
    public Increase visitIncrease(SQLParser.IncreaseContext ctx) {
        System.out.println("visitIncrease");

        Increase increase = new Increase();

        increase.setScopeParent(increase.getParentToNode());
        increase.setLine(ctx.start.getLine());
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof SQLParser.Any_nameContext) {
                if (i == 0) {
                    increase.setName(visitAny_name(ctx.any_name()));
                    increase.setCol(ctx.any_name().start.getCharPositionInLine()+1);
                    increase.setOperator(ctx.children.get(1).toString());
                    System.out.println("i=" + i);
                }
                else if (i == 1) {
                    increase.setName(visitAny_name(ctx.any_name()));
                    increase.setCol(ctx.any_name().start.getCharPositionInLine()+1);

                    increase.setOperator(ctx.children.get(0).toString());
                    System.out.println("i=" + i);
                }
            }
            // System.out.println("Operator"+ctx.children.get(i).getText());
//            else if(ctx.children.get(i).toString() == "++"){
//                increase.setOperator(ctx.children.get(i).toString());
//                System.out.println(increase.getOperator());
//            }
        }

        return increase;

        //return super.visitIncrease(ctx);
    }

    @Override
    public Decrease visitDecrease(SQLParser.DecreaseContext ctx) {
        System.out.println("visitDecrease");

        Decrease decrease = new Decrease();

        decrease.setScopeParent(decrease.getParentToNode());
        decrease.setLine(ctx.start.getLine());
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof SQLParser.Any_nameContext) {
                if (i == 0) {
                    decrease.setName(visitAny_name(ctx.any_name()));
                    decrease.setCol(ctx.any_name().start.getCharPositionInLine()+1);
                    decrease.setOperator(ctx.children.get(1).toString());
                }
                if (i == 1) {
                    decrease.setName(visitAny_name(ctx.any_name()));
                    decrease.setCol(ctx.any_name().start.getCharPositionInLine()+1);

                    decrease.setOperator(ctx.children.get(0).toString());
                }
            }
        }

        return decrease;
    }

    @Override
    public Declare_Variable visitDeclare_variable(SQLParser.Declare_variableContext ctx) {

        System.out.println("visitDeclare_variable");
        Declare_Variable declareVariable = new Declare_Variable();
        declareVariable.setLine(ctx.start.getLine());
        declareVariable.setScopeParent(declareVariable.getParentToNode());
        Symbol symbol = new Symbol();
        Type type =new Type();
       // Scope currentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() -1);
        Scope currentScope = declareVariable.getParentToNode();


        if (ctx.children.size() == 3) {

            System.out.println("Declare_variable_Only");
            symbol.setWithAssign(false);
            if (ctx.dtype() != null) {
                declareVariable.setdType(visitDtype(ctx.dtype()));
            }
            if (ctx.any_name() != null) {
                declareVariable.setName(visitAny_name(ctx.any_name()));
                symbol.setName(declareVariable.getName());




                        if(currentScope.symbolMap.get(symbol.getName())!=null){
                            declareVariable.setIsrepet(true);
                        }




                declareVariable.setCol(ctx.start.getCharPositionInLine()+1);
            }
        } else if (ctx.children.size() == 2) {
            System.out.println("Declare_variable_With_Assign");
            symbol.setWithAssign(true);
            if (ctx.children.get(1) instanceof SQLParser.Assign_variable_arrayContext) {
                if (ctx.dtype() != null) {
                    declareVariable.setdType(visitDtype(ctx.dtype()));
                }
                if (ctx.assign_variable_array() != null) {
                    declareVariable.setAssignVariableArray(visitAssign_variable_array(ctx.assign_variable_array()));
                }
            }
            if (ctx.children.get(1) instanceof SQLParser.Assign_variableContext) {

                if (ctx.dtype() != null) {
                    declareVariable.setdType(visitDtype(ctx.dtype()));
                }
                if (ctx.assign_variable() != null) {
                    declareVariable.setAssignVariable(visitAssign_variable(ctx.assign_variable()));
                    if (ctx.assign_variable().any_name() != null) {
                        System.out.println("test Any Nameeee" + visitAny_name(ctx.assign_variable().any_name()));
                        symbol.setName(visitAny_name(ctx.assign_variable().any_name()));
                        if (currentScope.symbolMap.get(symbol.getName()) != null) {
                            declareVariable.setIsrepet(true);
                        }
                        declareVariable.setCol(ctx.assign_variable().start.getCharPositionInLine() + 1);
                    }
                    if (ctx.assign_variable().condition() != null){
                        if (ctx.assign_variable().condition().literal_value() != null) {
                            if (ctx.assign_variable().condition().literal_value().STRING_LITERAL() != null) {
                                type.setName(type.STRING_CONST);
                            } else if (ctx.assign_variable().condition().literal_value().NUMERIC_LITERAL() != null) {
                                type.setName(type.NUMBER_CONST);
                            } else if (ctx.assign_variable().condition().literal_value().bool() != null) {
                                type.setName(type.BOOLEAN_CONST);
                            }

                        }
                }

//                    if(ctx.assign_variable().sql_stmt().factored_select_stmt()!=null){
//
//                       Result_Column result_columns ;
//                        Type tableNewType = new Type();
//                        tableNewType.setName(declareVariable.getName());
//                       if(ctx.assign_variable().sql_stmt().factored_select_stmt().select_core().result_column().size()>0){
//                           for(int i = 0;i<ctx.assign_variable().sql_stmt().factored_select_stmt().select_core().result_column().size();i++){
//                               result_columns = visitResult_column(ctx.assign_variable().sql_stmt().factored_select_stmt().select_core().result_column(i));
//                               if(result_columns.getColumnAlias()!=null){
//                                   tableNewType.addColumn(result_columns.getColumnAlias(),null);
//                               }
//
//                           }
//
//                       }
//                        type.setName("table");
//
//
//                        Main.symbolTable.declaredTypes.add(tableNewType);
//
//                    }


                }
            }

        }
        if(type.getName()!=null){
        symbol.setType(type);
        }


        symbol.setScope(currentScope);
        currentScope.addSymbol(symbol.getName(),symbol);
        declareVariable.setSymbol(symbol);
        return declareVariable;
    }

    @Override
    public Assign_Variable_Array visitAssign_variable_array(SQLParser.Assign_variable_arrayContext ctx) {
        System.out.println("visitAssign_variable_array");

        Assign_Variable_Array assignVariableArray = new Assign_Variable_Array();
        if (ctx.children.get(1) instanceof SQLParser.ExprContext) {


            assignVariableArray.setIndexName(visitExpr(ctx.expr(1)));
            if (ctx.any_name() != null) {
                assignVariableArray.setVariableName(visitAny_name(ctx.any_name()));
            }
        }
        if (ctx.expr().size() > 0) {
            if (ctx.any_name() != null) {
                System.out.println("name var");
                assignVariableArray.setVariableName(visitAny_name(ctx.any_name()));
            }
            for (int i = 0; i < ctx.expr().size(); i++) {
                assignVariableArray.expression.add(visitExpr(ctx.expr(i)));
            }
        }

        return assignVariableArray;
        // return super.visitAssign_variable_array(ctx);
    }

    @Override
    public Assign_variable visitAssign_variable(SQLParser.Assign_variableContext ctx) {
        System.out.println("visitAssign_variable");

        Assign_variable assignVariable = new Assign_variable();
        assignVariable.setLine(ctx.getStart().getLine());

        assignVariable.setScopeParent(assignVariable.getParentToNode());
        Type type =new Type();
       // Scope currentScope =Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() -1);

        Scope scopeParent = assignVariable.getParentToNode();


        if (ctx.any_name() != null) {
            //System.out.println("heeeer assign variable basevisitor");
            assignVariable.setName(visitAny_name(ctx.any_name()));
            assignVariable.setOperator(ctx.ASSIGN().getSymbol().getText());

            assignVariable.setCol(ctx.getStart().getCharPositionInLine()+1);
            //System.out.println(assignVariable.getCol());


//            for(int i = 0 ; i<currentScope.getSymbolMap().size();i++){
//                System.out.println(currentScope.getSymbolMap().size());
//                System.out.println(currentScope.getSymbolMap().get());
//            }
        } else if (ctx.call_json_var() != null) {
            assignVariable.setCallJsonVar(visitCall_json_var(ctx.call_json_var()));
            assignVariable.setOperator(ctx.ASSIGN().getSymbol().getText());

        }
        //System.out.println("type variable : "+scopeParent.symbolMap.get(assignVariable.getName()).getType().getName());

        if (ctx.condition() != null) {
            assignVariable.setCondition(visitCondition(ctx.condition()));
            assignVariable.getCondition().setCol(ctx.start.getCharPositionInLine()+1);

        if(ctx.condition().literal_value()!=null) {
            if (ctx.condition().literal_value().NUMERIC_LITERAL() != null) {
                type.setName(Type.NUMBER_CONST);
            } else if (ctx.condition().literal_value().STRING_LITERAL() != null) {
                type.setName(Type.STRING_CONST);
            } else if (ctx.condition().literal_value().bool() != null) {
                type.setName(Type.BOOLEAN_CONST);
            }
        }
            //System.out.println("name if found in map : "+scopeParent.symbolMap.get(assignVariable.getName()).getName());
////////////////check if the variable with type and take type &&&&& check if the variable with type but defrnt type the source
            for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--) {

                if(Main.symbolTable.getScopes().get(i)==scopeParent){
                    scopeParent = Main.symbolTable.getScopes().get(i);
                    if(scopeParent.symbolMap.get(assignVariable.getName())!=null && !scopeParent.symbolMap.get(assignVariable.getName()).isWithAssign() ){

                        scopeParent.symbolMap.get(assignVariable.getName()).setType(type);
                    }
//                    else if(scopeParent.symbolMap.get(assignVariable.getName())!=null && scopeParent.symbolMap.get(assignVariable.getName()).isWithAssign() ){
//                        if()
//                    }

                    scopeParent=scopeParent.getParent();
                }


            }
               // scopeParent.getParent().getId();

//            if(scopeParent.symbolMap.get(assignVariable.getName())!=null && !scopeParent.symbolMap.get(assignVariable.getName()).isWithAssign() ){
//
//                scopeParent.symbolMap.get(assignVariable.getName()).setType(type);
//            }
            //System.out.println("type of variable"+scopeParent.symbolMap.get(assignVariable.getName()).getType().getName());

        } else if (ctx.json() != null) {
            assignVariable.setJson(visitJson(ctx.json()));
        } else if (ctx.sql_stmt() != null) {
            assignVariable.setSqlStmt(visitSql_stmt(ctx.sql_stmt()));
        } else if (ctx.if_stmt_way2() != null) {
            assignVariable.setIfStmtWay2(visitIf_stmt_way2(ctx.if_stmt_way2()));
        }
         assignVariable.setType(type);
        return assignVariable;
    }



    @Override
    public JavaStmt visitIf_stmt(SQLParser.If_stmtContext ctx) {
        System.out.println("visitIf_stmt");

        JavaStmt JavaStmt = new JavaStmt();

        if (ctx.if_stmt_way1() != null) {
            JavaStmt = visitIf_stmt_way1(ctx.if_stmt_way1());

        }
        if (ctx.if_stmt_way2() != null) {
            JavaStmt = visitIf_stmt_way2(ctx.if_stmt_way2());

        }


        return JavaStmt;
    }

    @Override
    public If_Stmt_Way1 visitIf_stmt_way1(SQLParser.If_stmt_way1Context ctx) {
        System.out.println("visitIf_stmt_way1");
        If_Stmt_Way1 ifStatement = new If_Stmt_Way1();

        ifStatement.setName("If_stmt_way1");
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof SQLParser.If1Context)
                ifStatement.ifBase = visitIf1(ctx.if1());
            else if (ctx.children.get(i) instanceof SQLParser.Else_ifContext)
                ifStatement.ElseIf.add(visitElse_if((SQLParser.Else_ifContext) ctx.children.get(i)));
            else if (ctx.children.get(i) instanceof SQLParser.Else1Context) {
                ifStatement.setElse(visitElse1((SQLParser.Else1Context) ctx.children.get(i)));
            }
        }


        return ifStatement;

        //return super.visitIf_stmt_way1(ctx);
    }

    @Override
    public If1 visitIf1(SQLParser.If1Context ctx) {
        System.out.println("visitIf1");
        If1 ifStatement = new If1();
        ifStatement.setLine(ctx.getStart().getLine());


        Scope scope = new Scope();
        scope.setId(createId());
        scope.setParent(ifStatement.getParentToNode());
        Main.symbolTable.addScope(scope);


        if (ctx.condition() != null) {
            ifStatement.setCondition(visitCondition(ctx.condition()));
//            if(ctx.expr().column_name()!=null) {
//                ifStatement.setCol(ctx.expr().getStart().getCharPositionInLine() + 1);
//            }

        }

        if (ctx.stmt_list() != null) {
           // if(ctx.stmt_list().stmt(0).)
           // System.out.println(ctx.stmt_list().stmt() + " truee");
//            for(int i = 0 ;i<ctx.stmt_list().stmt().size();i++){
//                if(ctx.stmt_list().stmt(i).switch_stmt()!=null){
//                    scope.setIsParent(true);
//                }else if(ctx.stmt_list().stmt(i).for_stmt()!=null){
//                    scope.setIsParent(true);
//                }else if(ctx.stmt_list().stmt(i).while_stmt()!=null){
//                    scope.setIsParent(true);
//                }else if(ctx.stmt_list().stmt(i).if_stmt()!=null){
//                    scope.setIsParent(true);
//                }
//            }
            scope.setIsParent(true);
            ifStatement.setBody((visitStmt_list(ctx.stmt_list())));
            scope.setIsParent(false);

        }

        ifStatement.setScope(scope);

//        if(ctx.def_stmt_list() !=null && ctx.def_stmt_list().children!=null)
//            ifStatement.Body = visitDef_stmt_list(ctx.def_stmt_list());
        return ifStatement;


        //return super.visitIf1(ctx);
    }

    @Override
    public Else_If visitElse_if(SQLParser.Else_ifContext ctx) {
        System.out.println("visitElse_if");
        Else_If elseIf = new Else_If();

        Scope scope = new Scope();
        scope.setId(createId());
        scope.setParent(elseIf.getParentToNode());

        Main.symbolTable.addScope(scope);

        if (ctx.condition() != null)
            elseIf.setCondition(visitCondition(ctx.condition()));

        if (ctx.stmt_list() != null) {
//            for(int i = 0 ;i<ctx.stmt_list().stmt().size();i++){
//                if(ctx.stmt_list().stmt(i).switch_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).for_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).while_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).if_stmt()!=null){
//                    scope.setIsParent(true);
//                }
//            }
            scope.setIsParent(true);
            elseIf.setBody((visitStmt_list(ctx.stmt_list())));
            scope.setIsParent(false);
        }

        elseIf.setScope(scope);

        return elseIf;
    }

    @Override
    public Else visitElse1(SQLParser.Else1Context ctx) {

        System.out.println("visitElse");

        Else anElse = new Else();

        Scope scope = new Scope();
        scope.setId(createId());
        scope.setParent(anElse.getParentToNode());

        Main.symbolTable.addScope(scope);


        if (ctx.stmt_list() != null) {
//            for(int i = 0 ;i<ctx.stmt_list().stmt().size();i++){
//                if(ctx.stmt_list().stmt(i).switch_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).for_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).while_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).if_stmt()!=null){
//                    scope.setIsParent(true);
//                }
//            }
            scope.setIsParent(true);
            anElse.setJavaStmts(visitStmt_list(ctx.stmt_list()));
            scope.setIsParent(false);
        }

        anElse.setScope(scope);

        return anElse;
        //return super.visitElse1(ctx);
    }

    @Override
    public If_Stmt_Way2 visitIf_stmt_way2(SQLParser.If_stmt_way2Context ctx) {
        System.out.println("visitIf_stmt_way2");

        If_Stmt_Way2 ifStmt = new If_Stmt_Way2();
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof SQLParser.ExprContext)
                ifStmt.conditions.add(visitCondition((SQLParser.ConditionContext) ctx.children.get(i)));
            else if (ctx.children.get(i) instanceof SQLParser.If_stmt_way2Context)
                ifStmt.if_stmt_way2.add(visitIf_stmt_way2((SQLParser.If_stmt_way2Context) ctx.children.get(i))) ;
        }
        return ifStmt;
    }

    public JavaStmt visitWhile_stmt(SQLParser.While_stmtContext ctx) {

        System.out.println("visitWhile_stmt");
        JavaStmt whileStmt = new JavaStmt();

        if (ctx.while_simple() != null) {
            whileStmt.setName("visitWhile_simple");
            whileStmt = visitWhile_simple(ctx.while_simple());
        } else {
            whileStmt.setName("visitWhile_simple");
            whileStmt = visitDo_while(ctx.do_while());

        }

        return whileStmt;

        // return super.visitWhile_stmt(ctx);
    }

    @Override
    public While_Simple visitWhile_simple(SQLParser.While_simpleContext ctx) {
        System.out.println("visitWhile_simple");
        While_Simple while_simple = new While_Simple();
        while_simple.setLine(ctx.start.getLine());
        Scope scope = new Scope();
        scope.setId(createId());
        scope.setParent(while_simple.getParentToNode());
        Main.symbolTable.addScope(scope);




        if (ctx.condition() != null) {
            while_simple.setCondition(visitCondition(ctx.condition()));
        }
        if (ctx.stmt_list() != null) {
//            for(int i = 0 ;i<ctx.stmt_list().stmt().size();i++){
//                if(ctx.stmt_list().stmt(i).switch_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).for_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).while_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).if_stmt()!=null){
//                    scope.setIsParent(true);
//                }
//            }
            scope.setIsParent(true);
            while_simple.setStatementList(visitStmt_list(ctx.stmt_list()));
            scope.setIsParent(false);
        }

        while_simple.setScope(scope);

        return while_simple;

        //return super.visitWhile_simple(ctx);
    }

    @Override
    public Do_While visitDo_while(SQLParser.Do_whileContext ctx) {
        System.out.println("visitDo_while");
        Do_While do_while = new Do_While();
        Scope scope = new Scope();
        scope.setId(createId());

        scope.setParent(do_while.getParentToNode());
//        for(int i = Main.symbolTable.getScopes().size() ;i>=0 ;i--){
//            if(Main.symbolTable.getScopes().get(i).isParent()){
//                Scope parentScope = Main.symbolTable.getScopes().get(i);
//                scope.setParent(parentScope);
//                break;
//            }
//        }
        Main.symbolTable.addScope(scope);


        if (ctx.functionbody() != null){
//            for(int i = 0 ;i<ctx.functionbody().stmt_list().stmt().size();i++){
//                if(ctx.functionbody().stmt_list().stmt(i).switch_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.functionbody().stmt_list().stmt(i).for_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.functionbody().stmt_list().stmt(i).while_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.functionbody().stmt_list().stmt(i).if_stmt()!=null){
//                    scope.setIsParent(true);
//                }
//            }
            scope.setIsParent(true);
            do_while.setFunctionBody(visitFunctionbody(ctx.functionbody()));

        }
        if (ctx.condition() != null){
            do_while.setCondition(visitCondition(ctx.condition()));
        }
        scope.setIsParent(false);

        do_while.setScope(scope);
        return do_while;
        //return super.visitDo_while(ctx);
    }

    @Override
    public JavaStmt visitFor_stmt(SQLParser.For_stmtContext ctx) {

        System.out.println("visitFor_stmt");
        JavaStmt forStmt = new JavaStmt();
        if (ctx.for_simple() != null)
            forStmt = visitFor_simple(ctx.for_simple());
        else
            visitFor_each(ctx.for_each());


        return forStmt;
    }

    @Override
    public For_Simple visitFor_simple(SQLParser.For_simpleContext ctx) {
        System.out.println("visitFor_simple");

        For_Simple forSimple = new For_Simple();
        Scope scope = new Scope();
        scope.setId(createId());
        System.out.println(scope.getId());
        //Scope parentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);
        scope.setParent(forSimple.getParentToNode());
        scope.setIsParent(true);
        Main.symbolTable.addScope(scope);


        if (ctx.assign_variable_for_loop() != null) {

            forSimple.setVariableForLoop(visitAssign_variable_for_loop(ctx.assign_variable_for_loop()));
        }
        if (ctx.condition() != null) {

            forSimple.setCondition(visitCondition(ctx.condition()));
        }
        if (ctx.unary_operator_for_loop() != null) {
            forSimple.setUnaryOperatorForLoop(visitUnary_operator_for_loop(ctx.unary_operator_for_loop()));

        }
        if(ctx.updateparameter_forloop() != null){
            forSimple.setUpdateparameterForloop((visitUpdateparameter_forloop(ctx.updateparameter_forloop())));
        }

        if (ctx.stmt_list() != null) {
//            for(int i = 0 ;i<ctx.stmt_list().stmt().size();i++){
//                if(ctx.stmt_list().stmt(i).switch_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).for_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).while_stmt()!=null){
//                    scope.setIsParent(true);
//                }if(ctx.stmt_list().stmt(i).if_stmt()!=null){
//                    scope.setIsParent(true);
//                }
//            }
            scope.setIsParent(true);
            forSimple.setJavaStmtList(visitStmt_list(ctx.stmt_list()));
            scope.setIsParent(false);
        }
        scope.setIsParent(false);
        forSimple.setScope(scope);
        return forSimple;
        //return super.visitFor_simple(ctx);
    }

    @Override
    public Assign_Variable_For_Loop visitAssign_variable_for_loop(SQLParser.Assign_variable_for_loopContext ctx) {
        System.out.println("visitAssign_variable_for_loop");
        Assign_Variable_For_Loop assignVariableForLoop = new Assign_Variable_For_Loop();
        assignVariableForLoop.setLine(ctx.start.getLine());
        Symbol symbol =new Symbol();
        Type type = new Type();


        assignVariableForLoop.setScopeParent(assignVariableForLoop.getParentToNode());
        Scope currentcope = assignVariableForLoop.getParentToNode();
        System.out.println(currentcope.getId());

        if (ctx.dtype() != null) {
            assignVariableForLoop.setKind(visitDtype(ctx.dtype()));
            if (ctx.any_name() != null){
                assignVariableForLoop.setName(visitAny_name(ctx.any_name()));
                assignVariableForLoop.setCol(ctx.start.getCharPositionInLine() +1);
                symbol.setName(assignVariableForLoop.getName());
            }
            if (ctx.expr() != null) {
                assignVariableForLoop.setExpression(visitExpr(ctx.expr()));
                symbol.setWithAssign(true);
                if(ctx.expr().literal_value().STRING_LITERAL()!=null){
                    type.setName(type.STRING_CONST);
                }
                else if(ctx.expr().literal_value().NUMERIC_LITERAL()!=null){
                    type.setName(type.NUMBER_CONST);
                }
                else if(ctx.expr().literal_value().bool()!=null){
                    type.setName(type.BOOLEAN_CONST);
                }
            } else if (ctx.json() != null) {
                assignVariableForLoop.setJsonStmt(visitJson(ctx.json()));
            } else if (ctx.sql_stmt() != null) {
                assignVariableForLoop.setSqlStmt(visitSql_stmt(ctx.sql_stmt()));
            } else if (ctx.if_stmt_way2() != null) {
                assignVariableForLoop.setIfStmtWay2(visitIf_stmt_way2(ctx.if_stmt_way2()));
            }

            symbol.setType(type);
            symbol.setScope(currentcope);

            System.out.println(symbol.getScope().getId());
            currentcope.addSymbol(symbol.getName(),symbol);

            System.out.println( "name symbol in forloop"+symbol.getName());
            assignVariableForLoop.setSymbol(symbol);
        }

        else if(ctx.dtype()==null) {
            if (ctx.any_name() != null ) {
                assignVariableForLoop.setName(visitAny_name(ctx.any_name()));
                assignVariableForLoop.setCol(ctx.start.getCharPositionInLine() + 1);
            }
            if (ctx.expr() != null) {
                assignVariableForLoop.setExpression(visitExpr(ctx.expr()));

            } else if (ctx.json() != null) {
                assignVariableForLoop.setJsonStmt(visitJson(ctx.json()));
            } else if (ctx.sql_stmt() != null) {
                assignVariableForLoop.setSqlStmt(visitSql_stmt(ctx.sql_stmt()));
            } else if (ctx.if_stmt_way2() != null) {
                assignVariableForLoop.setIfStmtWay2(visitIf_stmt_way2(ctx.if_stmt_way2()));
            }
        }


        return assignVariableForLoop;

        //return super.visitAssign_variable_for_loop(ctx);
    }

    @Override
    public Unary_Operator_For_Loop visitUnary_operator_for_loop(SQLParser.Unary_operator_for_loopContext ctx) {

        System.out.println("visitUnary_operator_for_loop");

        Unary_Operator_For_Loop unaryOperatorForLoop = new Unary_Operator_For_Loop();

        unaryOperatorForLoop.setScopeParent(unaryOperatorForLoop.getParentToNode());
        System.out.println(unaryOperatorForLoop.getScopeParent());
        unaryOperatorForLoop.setLine(ctx.start.getLine());
        if (ctx.decrease() != null) {
            unaryOperatorForLoop.setDecrease(visitDecrease(ctx.decrease()));
        } else if (ctx.increase() != null) {
            unaryOperatorForLoop.setIncrease(visitIncrease(ctx.increase()));

        }


        return unaryOperatorForLoop;
    }

    @Override
    public For_Each visitFor_each(SQLParser.For_eachContext ctx) {
        System.out.println("visitFor_each");

        For_Each forEach = new For_Each();
        Scope scope = new Scope();
        scope.setId(createId());
        Main.symbolTable.addScope(scope);


        if (ctx.dtype() != null) {
            forEach.setType(visitDtype(ctx.dtype()));
        }
        if (ctx.any_name().size() != 0) {
            forEach.setNameVar(visitAny_name(ctx.any_name(0)));
            forEach.setNameArray(visitAny_name(ctx.any_name(1)));
        }
        if (ctx.functionbody() != null) {
            for(int i = 0 ;i<ctx.functionbody().stmt_list().stmt().size();i++){
                if(ctx.functionbody().stmt_list().stmt(i).switch_stmt()!=null){
                    scope.setIsParent(true);
                }if(ctx.functionbody().stmt_list().stmt(i).for_stmt()!=null){
                    scope.setIsParent(true);
                }if(ctx.functionbody().stmt_list().stmt(i).while_stmt()!=null){
                    scope.setIsParent(true);
                }if(ctx.functionbody().stmt_list().stmt(i).if_stmt()!=null){
                    scope.setIsParent(true);
                }
            }
            forEach.setBody(visitFunctionbody(ctx.functionbody()));
            scope.setIsParent(false);
        }


        forEach.setScope(scope);

        return forEach;
    }

    @Override
    public Print_Stmt visitPrint_stmt(SQLParser.Print_stmtContext ctx) {

        System.out.println("visitPrint_stmt");
        Print_Stmt printStmt = new Print_Stmt();

        if (ctx.call_json_var().size() > 0) {
            for (int i = 0; i < ctx.call_json_var().size(); i++) {
                printStmt.callJsonVarList.add(visitCall_json_var(ctx.call_json_var(i)));
            }
        } else if (ctx.condition().size() > 0) {
            for (int i = 0; i < ctx.condition().size(); i++) {
                printStmt.conditions.add(visitCondition(ctx.condition(i)));
            }
        }


        return printStmt;
    }

    @Override
    public Case visitCase1(SQLParser.Case1Context ctx) {
        System.out.println("visitCase1");
        Case aCase = new Case();

        Scope scope = new Scope();
        scope.setId(createId());
        scope.setParent(aCase.getParentToNode());
        Main.symbolTable.addScope(scope);

        if (ctx.expr() != null) {
            aCase.setExpression(visitExpr(ctx.expr()));
        }

        if (ctx.stmt_list() != null) {
            for(int i = 0 ;i<ctx.stmt_list().stmt().size();i++){
                if(ctx.stmt_list().stmt(i).switch_stmt()!=null){
                    scope.setIsParent(true);
                }if(ctx.stmt_list().stmt(i).for_stmt()!=null){
                    scope.setIsParent(true);
                }if(ctx.stmt_list().stmt(i).while_stmt()!=null){
                    scope.setIsParent(true);
                }if(ctx.stmt_list().stmt(i).if_stmt()!=null){
                    scope.setIsParent(true);
                }
            }
            aCase.setJavaStmtList(visitStmt_list(ctx.stmt_list()));
            scope.setIsParent(false);
        }

        aCase.setScope(scope);
        return aCase;
    }

    @Override
    public Switch_Stmt visitSwitch_stmt(SQLParser.Switch_stmtContext ctx) {

        System.out.println("visitSwitch_stmt");

        Switch_Stmt switchStmt = new Switch_Stmt();
        switchStmt.setLine(ctx.getStart().getLine());
        Scope scope = new Scope();
        scope.setId(createId());

        scope.setParent(switchStmt.getParentToNode());

        Main.symbolTable.addScope(scope);


        if (ctx.expr() != null) {
            switchStmt.setExpression(visitExpr(ctx.expr()));
            System.out.println( "Swithc EXPRRRRRRRRRRRR"+switchStmt.getExpression().getColumnName());
            switchStmt.setCol(ctx.expr().getStart().getCharPositionInLine()+1);
        }
        if (ctx.case1().size() > 0) {
            scope.setIsParent(true);
            for (int i = 0; i < ctx.case1().size(); i++) {
                switchStmt.aCase.add(visitCase1(ctx.case1(i)));
            }
            scope.setIsParent(false);
        }
        if (ctx.default_stmt() != null) {

            switchStmt.setaDefault(visitDefault_stmt(ctx.default_stmt()));
        }

        switchStmt.setScope(scope);
        return switchStmt;
    }

    @Override
    public Default visitDefault_stmt(SQLParser.Default_stmtContext ctx) {
        System.out.println("visitDefault_stmt");

        Default aDefault = new Default();

        Scope scope = new Scope();
        scope.setId(createId());
        scope.setParent(aDefault.getParentToNode());
        Main.symbolTable.addScope(scope);

        if (ctx.stmt_list() != null) {
            for(int i = 0 ;i<ctx.stmt_list().stmt().size();i++){
                if(ctx.stmt_list().stmt(i).switch_stmt()!=null){
                    scope.setIsParent(true);
                }if(ctx.stmt_list().stmt(i).for_stmt()!=null){
                    scope.setIsParent(true);
                }if(ctx.stmt_list().stmt(i).while_stmt()!=null){
                    scope.setIsParent(true);
                }if(ctx.stmt_list().stmt(i).if_stmt()!=null){
                    scope.setIsParent(true);
                }
            }
            aDefault.setJavaStmtList(visitStmt_list(ctx.stmt_list()));

        }


        aDefault.setScope(scope);
        return aDefault;
    }

    @Override
    public FunctionDeclaration visitCreate_function_stmt(SQLParser.Create_function_stmtContext ctx) {
        System.out.println("visitCreate_function_stmt");
        FunctionDeclaration fun = new FunctionDeclaration();
        fun.setLine(ctx.getStart().getLine());
        Scope funScope = new Scope();
        funScope.setIsParent(true);
        funScope.setId(createId());

        Main.symbolTable.addScope(funScope);

        if (ctx.any_name() != null) {
            fun.setFunName(ctx.any_name().getText());


        }


        if (ctx.parameterdeclarationlist() != null) {
            fun.Parameters = visitParameterdeclarationlist(ctx.parameterdeclarationlist());
        }

        if (ctx.functionbody() != null) {
            fun.Body = visitFunctionbody(ctx.functionbody());
        }

        fun.setScope(funScope);

        Main.symbolTable.functionDeclarations.add(fun);
        return fun;

        //return fun;
//


    }

    @Override
    public ParameterDeclarationList visitParameterdeclarationlist(SQLParser.ParameterdeclarationlistContext ctx) {

        System.out.println("visitParameterdeclarationlist");
        ParameterDeclarationList function = new ParameterDeclarationList();

        for (int i = 0; i < ctx.parameterdeclaration().size(); i++) {
            function.parameters.add(visitParameterdeclaration(ctx.parameterdeclaration(i)));
        }

        return function;

        //return super.visitParameterdeclarationlist(ctx);
    }

    @Override
    public ParameterDeclaration visitParameterdeclaration(SQLParser.ParameterdeclarationContext ctx) {
        System.out.println("visitParameterdeclaration");



        ParameterDeclaration parameterName = new ParameterDeclaration();

        parameterName.setLine(ctx.getStart().getLine());


        if (ctx.dtype() != null) {

            parameterName.setDeclear(true);
            Symbol symbol = new Symbol();
            Type type = new Type();

            Scope currentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);
            System.out.println("1");
            parameterName.setType(visitDtype(ctx.dtype()));
            if (ctx.any_name().IDENTIFIER() != null) {
                parameterName.setParameterName(ctx.any_name().IDENTIFIER().getSymbol().getText());

            } else {
                parameterName.setParameterName(ctx.any_name().STRING_LITERAL().getSymbol().getText());
            }
            parameterName.setCol(ctx.getStart().getCharPositionInLine()+1);

            symbol.setName(parameterName.getParameterName());



            if (ctx.expr()!= null) {
                parameterName.setValue(visitExpr(ctx.expr()));

                if(ctx.expr().literal_value().STRING_LITERAL()!=null){
                    type.setName(type.STRING_CONST);

                    System.out.println(type.getName());
                }
                else if(ctx.expr().literal_value().NUMERIC_LITERAL()!=null) {
                    type.setName(type.NUMBER_CONST);
                    System.out.println(type.getName());
                }
            }


            symbol.setType(type);
            symbol.setScope(currentScope);

            currentScope.addSymbol(parameterName.getParameterName(),symbol);
            parameterName.setSymbol(symbol);


        }

        if(ctx.dtype()==null){
            System.out.println("typeeeeee nulllllllllllllllllll");
            parameterName.setDeclear(false);
            if (ctx.any_name().IDENTIFIER() != null) {
                parameterName.setParameterName(ctx.any_name().IDENTIFIER().getSymbol().getText());

                parameterName.setCol(ctx.getStart().getCharPositionInLine()+1);
            } else {
                parameterName.setParameterName(ctx.any_name().STRING_LITERAL().getSymbol().getText());
                parameterName.setCol(ctx.getStart().getCharPositionInLine()+1);
            }


            if (ctx.expr()!= null) {
                parameterName.setValue(visitExpr(ctx.expr()));

            }
        }





        return parameterName;

        //return super.visitParameterdeclaration(ctx);
    }

    @Override
    public FunctionBody visitFunctionbody(SQLParser.FunctionbodyContext ctx) {

        System.out.println("visitFunctionbody");

        FunctionBody fun = new FunctionBody();
        if (ctx.stmt_list() != null) {
            fun.setJavaStmt(visitStmt_list(ctx.stmt_list()));
        }

        return fun;
    }

    @Override
    public JumpStmt visitJumpstatement(SQLParser.JumpstatementContext ctx) {
        System.out.println("visitJumpstatement");
        JumpStmt jumpStmt = new JumpStmt();
        if (ctx.condition() != null) {
            jumpStmt.setCondition(visitCondition(ctx.condition()));
        } else if (ctx.if_stmt_way2() != null) {
            jumpStmt.setIfStmtWay2(visitIf_stmt_way2(ctx.if_stmt_way2()));
        }


        return jumpStmt;
    }

    @Override
    public String visitDtype(SQLParser.DtypeContext ctx) {
        System.out.println("visitDtype");


        return ctx.getText().toString();
    }

    @Override
    public Updateparameter_Forloop visitUpdateparameter_forloop(SQLParser.Updateparameter_forloopContext ctx) {
        System.out.println("Updateparameter_Forloop");

        Updateparameter_Forloop updateparameterForloop = new Updateparameter_Forloop();
        if (ctx.IDENTIFIER() != null) {
            updateparameterForloop.setName(ctx.IDENTIFIER().getSymbol().getText());
        }
        if (ctx.PLUS() != null) {
            updateparameterForloop.setOperator(ctx.PLUS().getSymbol().getText());
        } else if (ctx.MINUS() != null) {
            updateparameterForloop.setOperator(ctx.MINUS().getSymbol().getText());
        }
        if(ctx.ASSIGN() !=null){
            updateparameterForloop.setAssign(ctx.ASSIGN().getSymbol().getText());
        }
        if (ctx.expr() != null) {
            updateparameterForloop.setExpression(visitExpr(ctx.expr()));
        }

        return updateparameterForloop;
        // return super.visitUpdateparameter_forloop(ctx);
    }

    @Override
    public Call_Json_Var visitCall_json_var(SQLParser.Call_json_varContext ctx) {
        System.out.println("visitCall_json_var");
        Call_Json_Var jsonVar = new Call_Json_Var();

        if (ctx.json_access_name() != null) {
            jsonVar.setJsonName(ctx.json_access_name().any_name().IDENTIFIER().getSymbol().getText());
        }
        if (ctx.json_access_key().size() > 0) {
            for (int i = 0; i < ctx.json_access_key().size(); i++) {
                jsonVar.key.add(ctx.json_access_key(i).any_name().IDENTIFIER().getSymbol().getText());
            }
        }


        return jsonVar;
    }

    @Override
    public Object visitJson_access_name(SQLParser.Json_access_nameContext ctx) {
        return super.visitJson_access_name(ctx);
    }

    @Override
    public Object visitJson_access_key(SQLParser.Json_access_keyContext ctx) {
        return super.visitJson_access_key(ctx);
    }

    @Override
    public Foreign_Key_Clause visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx) {
        System.out.println("visitForeign_key_clause");
        Foreign_Key_Clause foreignKeyClause = new Foreign_Key_Clause();
        if(ctx.database_name()!=null){

            foreignKeyClause.setDatabaseName(visitDatabase_name(ctx.database_name()));
        }
        if(ctx.foreign_table()!=null){
            foreignKeyClause.setForeignTable(visitAny_name(ctx.foreign_table().any_name()));
        }
        if(ctx.fk_target_column_name().size()>0){
            for(int i=0;i<ctx.fk_target_column_name().size();i++){
                foreignKeyClause.fkTargetColumnName.add(visitAny_name(ctx.fk_target_column_name(i).name().any_name()));
            }
        }
        if(ctx.name().size()>0){
            for(int i = 0;i<ctx.name().size();i++){
                foreignKeyClause.name.add(visitAny_name(ctx.name(i).any_name()));
            }
        }


        return foreignKeyClause;
        //return super.visitForeign_key_clause(ctx);
    }

    @Override
    public Object visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx) {
        return super.visitFk_target_column_name(ctx);
    }

    @Override
    public Cal_Function visitCal_func(SQLParser.Cal_funcContext ctx) {

        System.out.println("visitCal_func");

        Cal_Function calFunction = new Cal_Function();
        if (ctx.function_simple() != null) {
            calFunction.setCalFunctionSimple(visitFunction_simple(ctx.function_simple()));
        }
        else if (ctx.agg_fun()!=null){

            calFunction.setCalAggFun(visitAgg_fun(ctx.agg_fun()));

        }
        else if (ctx.higher_order_function() != null) {
            visitHigher_order_function(ctx.higher_order_function());
        }

        return calFunction;


        //return super.visitCal_func(ctx);
    }



    @Override
    public Cal_Function_Simple visitFunction_simple(SQLParser.Function_simpleContext ctx) {

        System.out.println("visitFunction_simple");


        Cal_Function_Simple calFunctionSimple = new Cal_Function_Simple();

        calFunctionSimple.setLine(ctx.getStart().getLine());
        if (ctx.function_name() != null) {

            calFunctionSimple.setName(ctx.function_name().any_name().getText());
            calFunctionSimple.setCol(ctx.function_name().getStart().getCharPositionInLine()+1);


        }
        if (ctx.func_parameter_list() != null) {
            calFunctionSimple.setListParamater(visitFunc_parameter_list(ctx.func_parameter_list()));
        }


        return calFunctionSimple;
    }
    /////call agg_fun
    @Override
    public Cal_Agg_Fun visitAgg_fun(SQLParser.Agg_funContext ctx) {

        System.out.println("visitCal_Agg_Fun");
        Cal_Agg_Fun calAggFun =new Cal_Agg_Fun();
        calAggFun.setLine(ctx.getStart().getLine());


        if (ctx.function_name() != null) {

            calAggFun.setFuncName(ctx.function_name().any_name().getText());
            calAggFun.setCol(ctx.function_name().getStart().getCharPositionInLine()+1);


        }
        if (ctx.paramete_list_for_call_agg_func() != null) {
            calAggFun.setParameter_list_for_calAggFunc(visitParamete_list_for_call_agg_func(ctx.paramete_list_for_call_agg_func()));
        }

        return calAggFun;
    }

    @Override
    public Parameter_List_For_CalAggFunc visitParamete_list_for_call_agg_func(SQLParser.Paramete_list_for_call_agg_funcContext ctx) {

        System.out.println("visitParameter_List_For_CalAggFunc");
        Parameter_List_For_CalAggFunc parameterListForCalAggFunc=new Parameter_List_For_CalAggFunc();

        if (ctx.result_column().size() > 0) {
            for (int i = 0; i < ctx.result_column().size(); i++) {
                parameterListForCalAggFunc.resultColumns.add(visitResult_column(ctx.result_column(i)));

            }
        }



        return  parameterListForCalAggFunc;
    }

    @Override
    public Parameter_List_For_CalFunc visitFunc_parameter_list(SQLParser.Func_parameter_listContext ctx) {
        System.out.println("visitFunc_parameter_list");
        Parameter_List_For_CalFunc parameterListForCalFunc = new Parameter_List_For_CalFunc();

        if (ctx.func_parameter().size() > 0) {
            for (int i = 0; i < ctx.func_parameter().size(); i++) {
                parameterListForCalFunc.Parameters.add(visitFunc_parameter(ctx.func_parameter(i)));

            }
        }


        return parameterListForCalFunc;
    }

    @Override
    public Object visitHigher_order_function(SQLParser.Higher_order_functionContext ctx) {
        return super.visitHigher_order_function(ctx);
    }

    @Override
    public Object visitFunction_order(SQLParser.Function_orderContext ctx) {
        return super.visitFunction_order(ctx);
    }

    @Override
    public Parameter_For_CalFunc visitFunc_parameter(SQLParser.Func_parameterContext ctx) {
        System.out.println("visitFunc_parameter");
        Parameter_For_CalFunc parameterForCalFunc = new Parameter_For_CalFunc();


        if (ctx.expr() != null) {
            parameterForCalFunc.setParameter(visitExpr(ctx.expr()));
        }


        return parameterForCalFunc;


        //return super.visitFunc_parameter(ctx);
    }

    @Override
    public Json_Stmt visitJson(SQLParser.JsonContext ctx) {
        System.out.println("visitJson");

        Json_Stmt jsonStmt = new Json_Stmt();
        if (ctx.json_object() != null)
            jsonStmt.setJsonObject(visitJson_object(ctx.json_object()));
        else
            jsonStmt.setArrayJsonObject(visitArray_json_object(ctx.array_json_object()));

        return jsonStmt;


        //return super.visitJson(ctx);
    }

    @Override
    public Json_Object visitJson_object(SQLParser.Json_objectContext ctx) {
        System.out.println("visitJson_object");
        Json_Object object = new Json_Object();
        if (ctx.key_value().size() != 0) {
            for (int i = 0; i < ctx.key_value().size(); i++) {
                object.keyValueList.add(visitKey_value(ctx.key_value(i)));
            }
        }


        return object;
    }

    @Override
    public Key_Value visitKey_value(SQLParser.Key_valueContext ctx) {

        //System.out.println("visitKey_value");
        Key_Value keyValue = new Key_Value();
        if (ctx.key() != null) {
            keyValue.setKey(ctx.key().IDENTIFIER().getSymbol().getText());
            System.out.println("visitKey");
        }
        if (ctx.value() != null) {
            keyValue.setValue(visitValue(ctx.value()));
        }

        return keyValue;
    }

    @Override
    public Object visitKey(SQLParser.KeyContext ctx) {
        return super.visitKey(ctx);
    }

    @Override
    public Value_Json visitValue(SQLParser.ValueContext ctx) {
        System.out.println("visitValue");
        Value_Json valueJson = new Value_Json();

        if (ctx.IDENTIFIER() != null) {
            valueJson.setName(ctx.IDENTIFIER().getSymbol().getText());
        } else if (ctx.array_json_object() != null) {
            valueJson.setArrayJsonObject(visitArray_json_object(ctx.array_json_object()));
        } else if (ctx.json_object() != null) {
            valueJson.setJsonObject(visitJson_object(ctx.json_object()));
        } else if (ctx.array() != null) {
            valueJson.setArray(visitArray(ctx.array()));

        } else if (ctx.expr() != null) {
            valueJson.setExpression(visitExpr(ctx.expr()));
        }


        return valueJson;
    }

    @Override
    public Array visitArray(SQLParser.ArrayContext ctx) {
        System.out.println("visitArray");

        Array array = new Array();
        if (ctx.expr().size() != 0) {
            for (int i = 0; i < ctx.expr().size(); i++) {
                array.expressionList.add(visitExpr(ctx.expr(i)));
            }
        }

        return array;
    }

    @Override
    public Array_Json_Object visitArray_json_object(SQLParser.Array_json_objectContext ctx) {

        System.out.println("visitArray_json_object");
        Array_Json_Object arrayJsonObject = new Array_Json_Object();
        if (ctx.json_object().size() != 0) {
            for (int i = 0; i < ctx.json_object().size(); i++)
                arrayJsonObject.objectList.add(visitJson_object(ctx.json_object(i)));
        }


        return arrayJsonObject;
    }
    //////////////////////////////////////END JAVA

    public static String createId() {

        String currentCounter = String.valueOf(Main.atomicCounter.getAndIncrement());
        String uniqueId = UUID.randomUUID().toString();

        return uniqueId + "-" + currentCounter;
    }

    public boolean IsParent(Scope scope , SQLParser ctx){
        for(int i = 0 ;i<ctx.functionbody().stmt_list().stmt().size();i++){
            if(ctx.functionbody().stmt_list().stmt(i).switch_stmt()!=null){
                return true;
            }
            else if(ctx.functionbody().stmt_list().stmt(i).for_stmt()!=null){
                return true;
            }
            else if(ctx.functionbody().stmt_list().stmt(i).while_stmt()!=null){
                return true;
            }
            else if(ctx.functionbody().stmt_list().stmt(i).if_stmt()!=null){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}