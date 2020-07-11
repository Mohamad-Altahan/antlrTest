package Java.AST.Visitor;

import Java.AST.Expression.Condition;
import Java.AST.Expression.Expression;
import Java.AST.Expression.ExpressionForAll;
import Java.AST.Function.*;
import Java.AST.JavaStmt.*;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.Main;
import Java.SymbolTablee.AggregationFunction;
import Java.SymbolTablee.Scope;
import Java.SymbolTablee.Symbol;
import Java.SymbolTablee.Type;
import generated.SQLParser;

import java.util.Map;

public class BaseASTVisitor implements ASTVisitor {

    @Override
    public void visit(Parse p) {
        System.out.println("AST parse ");
            Main.w.println();
    //    boolean isfound=false;
//        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--){
//            for (Map.Entry<String, Symbol> entry : Main.symbolTable.getScopes().get(i).getSymbolMap().entrySet()) {
//                // System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//
//                if(entry.getKey().equals(switchStmt.getExpression().getColumnName())){
//                    isfound=true;
//                }
//
//            }}
//        if(!isfound){
//
//            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());
//
//        }
    }

    @Override
    public void visit(Sql_Stmt_List sqlStmtList) {
        System.out.println("AST sqlStmtList");
    }

    @Override
    public void visit(SqlStmt stmt) {
        System.out.println("AST Statement ");

    }

    @Override
    public void visit(SelectStmt selectStmt) {
        System.out.println("AST selectStmt ");

    }

    @Override
    public void visit(Select_Core selectCore) {
        System.out.println("AST selectCore ");
//
//       boolean tableIsDeclare = false;
//        boolean columnIsFound =false;
//        int sizeListTableInST = Main.symbolTable.declaredTypes.size() ;
//        System.out.println("size of type in symbol_table : " +sizeListTableInST );
//        if(selectCore.tableOrSubqueries.size()>0){
//            for(int i =0 ;i<selectCore.tableOrSubqueries.size();i++){
//                tableIsDeclare =false;
//                for(int j = 0 ;j<sizeListTableInST;j++){
//                    System.out.println("Type :"+ Main.symbolTable.declaredTypes.get(j).getName());
//                    System.out.println("Table:"+ selectCore.tableOrSubqueries.get(i).getTableName());
//                    if(Main.symbolTable.declaredTypes.get(j).getName().equals(selectCore.tableOrSubqueries.get(i).getTableName())){
//                        tableIsDeclare =true;
//                        /////// for select id -column
//                        if(selectCore.resultColumns.size()>0 ){
//                            for(int z =0 ;z<selectCore.resultColumns.size();z++){
//                                columnIsFound = false;
//                                if(Main.symbolTable.declaredTypes.get(j).getColumns().get(selectCore.resultColumns.get(z).getExpression().getColumnName())!=null){
//
//                                    columnIsFound =true;
//                                }
//                            }
//                            if(!columnIsFound){
//                                System.out.println("Error for using un-existed column of a type/table LINE : " + selectCore.resultColumns.get(i).getLine() + "COLUMNE : " + selectCore.resultColumns.get(i).getCol());
//
//                            }
//                        }
//                        //////////// for WHERE (X=5)  -column
//                        if(selectCore.expression.size()>0 ){
//                            for(int z =0 ;z<selectCore.expression.size();z++){
//                                columnIsFound = false;
//                                if(Main.symbolTable.declaredTypes.get(j).getColumns().get(selectCore.expression.get(z).getColumnName())!=null){
//
//                                    columnIsFound =true;
//                                }
//                            }
//                            if(!columnIsFound){
//                                System.out.println("Error for using un-existed column of a type/table LINE : " + selectCore.getLine() + "COLUMNE : " + selectCore.getCol());
//
//                            }
//                        }
//                    }
//                }
//                if(!tableIsDeclare){
//                    System.out.println("Error while using of undeclared type LINE : " + selectCore.tableOrSubqueries.get(i).getLine() + "COLUMNE : " + selectCore.tableOrSubqueries.get(i).getCol());
//                }
//
//
//            }
//        }

        ///////////////////////////////////////////



//        if(selectCore.resultColumns.size()>0){
//            for(int i =0 ;i<selectCore.resultColumns.size();i++){
//                if(selectCore.resultColumns.get(i))
//            }
//        }

    }

    @Override
    public void visit(Factored_Select_Stmt factoredSelectStmt) {
        System.out.println("AST factoredSelectStmt ");




    }

    @Override
    public void visit(Table_Or_Subquery tableOrSubquery) {

        System.out.println("AST tableOrSubquery ");

//        int sizeListTableInST = Main.symbolTable.declaredTypes.size() -1;
//        boolean tableIsDeclare = false;
//        if(tableOrSubquery.getTableName()!=null){
//            for(int i = 0 ;i<sizeListTableInST;i++){
//                if(Main.symbolTable.declaredTypes.get(i).equals(tableOrSubquery.getTableName())){
//                    tableIsDeclare =true;
//                }
//            }
//            if(!tableIsDeclare){
//                System.out.println("Error while using of undeclared type LINE : " + tableOrSubquery.getLine() + "COLUMNE : " + tableOrSubquery.getCol());
//            }
//        }


    }

    @Override
    public void visit(Join_Clause joinClause) {

    }

    @Override
    public void visit(Join_Constraint joinConstraint) {

    }

    @Override
    public void visit(DropTableStmt dropTableStmt) {
        System.out.println("AST dropTableStmt ");

    }

    @Override
    public void visit(InsertStmt insertStmt) {
        System.out.println("AST insertStmt ");
    }

    @Override
    public void visit(DeleteStmt deleteStmt) {
        System.out.println("AST deleteStmt ");
    }

    @Override
    public void visit(CreateTableStmt createTableStmt) {
        System.out.println("AST createTableStmt ");
    }

    @Override
    public void visit(UpdateStmt updateStmt) {
        System.out.println("AST updateStmt ");
    }

    @Override
    public void visit(AlterStmt alterStmt) {
        System.out.println("AST alterStmt ");
    }

    @Override
    public void visit(AlterTableAdd alterTableAdd) {
        System.out.println("AST alterTableAdd ");

    }

    @Override
    public void visit(CreateTypeStmt createTypeStmt) {
        System.out.println("AST createTypeStmt");

        for(int i = 0;i<createTypeStmt.columnDefList.size();i++){
            if(createTypeStmt.columnDefList.get(i).isRepet()){
                Main.w.println("Error for duplicate column name LINE : " + createTypeStmt.columnDefList.get(i).getLine() + " COLUMNE : " + createTypeStmt.columnDefList.get(i).getCol());
                System.out.println("Error for duplicate column name LINE : " + createTypeStmt.columnDefList.get(i).getLine() + " COLUMNE : " + createTypeStmt.columnDefList.get(i).getCol());

            }
        }

    }




    @Override
    public void visit(CreateTableCompositionStmt createTableCompositionStmt) {
        System.out.println("AST createTableCompositionStmt");

        boolean isDecleard =false;
        String typeColumn ="";
        String typeTable_Type ="";
      //  if(createTableCompositionStmt.is)
        for(int i = 0;i<createTableCompositionStmt.columnDefList.size();i++){
            if(createTableCompositionStmt.columnDefList.get(i).isRepet()){
                Main.w.println("Error for duplicate column name LINE : " + createTableCompositionStmt.columnDefList.get(i).getLine() + " COLUMNE : " + createTableCompositionStmt.columnDefList.get(i).getCol());
                System.out.println("Error for duplicate column name LINE : " + createTableCompositionStmt.columnDefList.get(i).getLine() + " COLUMNE : " + createTableCompositionStmt.columnDefList.get(i).getCol());

            }
        }

        for(int i= 0 ;i<createTableCompositionStmt.columnDefList.size();i++){
            for(int j = 0;j<Main.symbolTable.declaredTypes.size();j++){
                  typeColumn=createTableCompositionStmt.columnDefList.get(i).getType().getName();

                  typeTable_Type =Main.symbolTable.declaredTypes.get(j).getName();
                if(typeColumn.equals(typeTable_Type)){
                         isDecleard=true;
                }

            }
            if(!isDecleard && !(typeColumn.equals(Type.NUMBER_CONST)) && !(typeColumn.equals(Type.STRING_CONST)) && !(typeColumn.equals(Type.BOOLEAN_CONST)) ){
                System.out.println("Type :" + typeColumn);
                Main.w.println("Error while using of undeclared type LINE : " + createTableCompositionStmt.columnDefList.get(i).getLine() + " COLUMNE : " + createTableCompositionStmt.columnDefList.get(i).getCol());
                System.out.println("Error while using of undeclared type LINE : " + createTableCompositionStmt.columnDefList.get(i).getLine() + " COLUMNE : " + createTableCompositionStmt.columnDefList.get(i).getCol());
            }
        }




        }



    @Override
    public void visit(CreateAggFunc createAggFunc) {
        System.out.println("AST createAggFunc");

    }

    @Override
    public void visit(Cal_Agg_Fun calAggFun) {
        System.out.println("AST calAggFun");

    }

    @Override
    public void visit(Parameter_List_For_CalAggFunc parameterListForCalAggFunc) {
        System.out.println("AST parameterListForCalAggFunc");

    }

    @Override
    public void visit(Result_Column resultColumn) {
        System.out.println("AST resultColumn");

    }

    @Override
    public void visit(AggregationFunction aggregationFunction) {
        System.out.println("AST aggregationFunction");

    }

    @Override
    public void visit(Array array) {
        System.out.println("AST array");
    }

    @Override
    public void visit(Array_Json_Object array_json_object) {
        System.out.println("AST array_json_object");
    }

    @Override
    public void visit(Assign_variable assignVariable) {
        System.out.println("AST assignVariable");
        Scope scopeParent = assignVariable.getScopeParent();
        System.out.println("Pareneeeet" +scopeParent.getId());

        boolean isdeclear= false;
        boolean difrentType= false;

        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--) {

            if(Main.symbolTable.getScopes().get(i)==scopeParent){
                scopeParent = Main.symbolTable.getScopes().get(i);
                System.out.println(Main.symbolTable.getScopes().get(i).getId());
//                System.out.println(scopeParent.symbolMap.get(assignVariable.getName()).isWithAssign());
                Symbol symbolDeclared=scopeParent.symbolMap.get(assignVariable.getName());
              //  System.out.println(symbolDeclared.getName());

                if(assignVariable.getCondition()!=null){
                    if(assignVariable.getCondition().getVariableName()!=null){
                        if(scopeParent.symbolMap.get(assignVariable.getCondition().getVariableName())!=null){
                            Symbol symbol =scopeParent.symbolMap.get(assignVariable.getCondition().getVariableName());

                            assignVariable.setType(symbol.getType());
                            Symbol currentSymbol = scopeParent.symbolMap.get(assignVariable.getName());

                            if(currentSymbol!=null){
                                currentSymbol.setType(symbol.getType());
                            }

                        }
                    }

                    Symbol symbolLeft =null;
                    String typeLeft="y";
                    Symbol symbolRight =null;
                    String typeRight ="x";
                    Symbol currentSymbol = scopeParent.symbolMap.get(assignVariable.getName());
                    if(assignVariable.getCondition().left != null && assignVariable.getCondition().right!=null) {
                        if (assignVariable.getCondition().left.getVariableName() != null) {
                            symbolLeft = scopeParent.symbolMap.get(assignVariable.getCondition().left.getVariableName());
                            if (symbolLeft != null && symbolLeft.getType()!=null) {
                                typeLeft = symbolLeft.getType().getName();
                                System.out.println("Left " + typeLeft);
                            }


                        }
                        if (assignVariable.getCondition().right.getVariableName() != null) {
                            symbolRight = scopeParent.symbolMap.get(assignVariable.getCondition().left.getVariableName());
                            if (symbolRight != null && symbolRight.getType()!=null ) {
                                typeRight = symbolRight.getType().getName();
                                System.out.println("Right" + typeRight);
                            }

                        }

                        if (currentSymbol != null){
                            if (typeRight.equals(typeLeft) && currentSymbol.getType() == null) {

                                assignVariable.setType(symbolLeft.getType());
                                currentSymbol.setType(symbolLeft.getType());

                            } else if (typeRight.equals(typeLeft) && currentSymbol.getType() != null) {
                                if (!typeLeft.equals(currentSymbol.getType().getName())) {
                                    difrentType = true;
                                }


                            }
                    }
                        }
                }

                if(symbolDeclared!=null  ){

                    System.out.println("inn");
                    isdeclear=true;

                }
                if(symbolDeclared!=null && symbolDeclared.isWithAssign() && assignVariable.getSqlStmt()==null){
                    if(assignVariable.getCondition().getLiteralValue()!=null) {
                        System.out.println(assignVariable.getType().getName());
                        if (symbolDeclared.getType().getName() != assignVariable.getType().getName()) {
                            difrentType = true;
                        }
                    }
                }


                scopeParent=scopeParent.getParent();
            }
        }

        if(!isdeclear) {
            Main.w.println("ERROR FOR USING UNDECLARED VARIABLE LINE : " + assignVariable.getLine() + " COLUMNE : " + assignVariable.getCol());
            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + assignVariable.getLine() + " COLUMNE : " + assignVariable.getCol());

        }

        else if(difrentType){
            Main.w.println("Error for assigning another type for declared variable LINE : " + assignVariable.getLine() + " COLUMNE : " + assignVariable.getCondition().getCol());
            System.out.print("Error for assigning another type for declared variable LINE : " + assignVariable.getLine() + " COLUMNE : " + assignVariable.getCondition().getCol());

        }




//        boolean isfound=false;
//        Scope currentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() -1);
//
//        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--) {
//
//            for (Map.Entry<String, Symbol> entry : Main.symbolTable.getScopes().get(i).getSymbolMap().entrySet()) {
//                // System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//                if (entry.getKey().equals(assignVariable.getName())) {
//                    isfound = true;
//                }
//
//            }
//        }
//        if(!isfound){
//            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + assignVariable.getLine() + " COLUMNE : " + assignVariable.getCol());
//
//        }
    }

    @Override
    public void visit(Assign_Variable_For_Loop assignVariableForLoop) {
        System.out.println("AST assignVariableForLoop");


        Scope scopeParent = assignVariableForLoop.getScopeParent();

        boolean isDeclear =false;
        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--) {
            System.out.println(scopeParent.getId());
            System.out.println(Main.symbolTable.getScopes().get(i).getId());
            if(Main.symbolTable.getScopes().get(i)==scopeParent){
                scopeParent = Main.symbolTable.getScopes().get(i);
                if(scopeParent.symbolMap.get(assignVariableForLoop.getName())!=null  ){
                    isDeclear=true;
                    //System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + assignVariableForLoop.getLine() + " COLUMNE : " + assignVariableForLoop.getCol());


                }

                scopeParent=scopeParent.getParent();
            }
        }
        if(!isDeclear){
            Main.w.println("ERROR FOR USING UNDECLARED VARIABLE LINE : " + assignVariableForLoop.getLine() + " COLUMNE : " + assignVariableForLoop.getCol());
            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + assignVariableForLoop.getLine() + " COLUMNE : " + assignVariableForLoop.getCol());

        }



    }

    @Override
    public void visit(Call_Json_Var callJsonVar) {
        System.out.println("AST callJsonVar");
    }

    @Override
    public void visit(Declare_Variable declareVariable) {
        System.out.println("AST Declare_Variable");

        Scope currentScope = declareVariable.getScopeParent();
        System.out.println(currentScope.getId());
        int count =0;
        if(declareVariable.getName()!=null){
            System.out.println("without assign");
            if(declareVariable.isIsrepet()){
                Main.w.println("Error in Multiple Declarations: a variable should be declared (in the\n" +
                        "same scope)  Line :" + declareVariable.getLine() + " COLUMNE : " + declareVariable.getCol());
                System.out.print("Error in Multiple Declarations: a variable should be declared (in the\n" +
                            "same scope)  Line :" + declareVariable.getLine() + " COLUMNE : " + declareVariable.getCol());
            }
//            for (Map.Entry<String, Symbol> entry : currentScope.getSymbolMap().entrySet()) {
//                // System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//
//                if (entry.getKey().equals(declareVariable.getName())) {
//                    System.out.println(entry.getKey());
//                    System.out.println("befor : " + count);
//
//                    count++;
//                    System.out.println("after : " + count);
////                    System.out.print("Error in Multiple Declarations: a variable should be declared (in the\n" +
////                            "same scope)  Line :" + declareVariable.getLine() + " COLUMNE : " + declareVariable.getCol());
//
//                }
//
//            }
//
//            if(count>1){
//                System.out.print("Error in Multiple Declarations: a variable should be declared (in the\n" +
//                        "same scope) Line :" + declareVariable.getLine() + " COLUMNE : " + declareVariable.getCol());
//
//            }

        }
        else if(declareVariable.getAssignVariable()!=null){

            System.out.println("with assign");

            if(declareVariable.isIsrepet()){
                Main.w.println("Error in Multiple Declarations: a variable should be declared (in the\n" +
                        "same scope)  Line :" + declareVariable.getLine() + " COLUMNE : " + declareVariable.getCol());
                System.out.print("Error in Multiple Declarations: a variable should be declared (in the\n" +
                        "same scope)  Line :" + declareVariable.getLine() + " COLUMNE : " + declareVariable.getCol());
            }


            if(declareVariable.getAssignVariable().getSqlStmt()!=null){
                Select_Core  selectCore = declareVariable.getAssignVariable().getSqlStmt().getFactoredSelectStmt().getSelectCore();

                if(selectCore!=null){
                    boolean tableIsDeclare = false;
                    boolean columnIsFound =false;
                    int sizeListTableInST = Main.symbolTable.declaredTypes.size() ;
                    System.out.println("size of type in symbol_table : " +sizeListTableInST );
                    if(selectCore.tableOrSubqueries.size()>0){
                        for(int i =0 ;i<selectCore.tableOrSubqueries.size();i++){
                            tableIsDeclare =false;
                            for(int j = 0 ;j<sizeListTableInST;j++){
                                System.out.println("hereeeee nametype: " +Main.symbolTable.declaredTypes.get(j).getName() );
                                System.out.println("Heeeeeeerw : "+ selectCore.tableOrSubqueries.get(i).getTableName());
                                if(Main.symbolTable.declaredTypes.get(j).getName().equals(selectCore.tableOrSubqueries.get(i).getTableName())){
                                    tableIsDeclare =true;
                                    Type type=Main.symbolTable.declaredTypes.get(j);
                                    declareVariable.getAssignVariable().setType(type);
                                    System.out.println("Assighn Type : " +declareVariable.getAssignVariable().getName());
                                    /////// for select id -column
                                    Type typeNewTable =new Type();
                                    typeNewTable.setName(declareVariable.getAssignVariable().getName());
                                    declareVariable.getSymbol().setType(typeNewTable);
                                    Main.symbolTable.addType(typeNewTable);

                                    if(selectCore.resultColumns.size()>0 ){
                                        for(int z =0 ;z<selectCore.resultColumns.size();z++) {
                                            System.out.println("incolumn haaaaaaaaaaaaa");
                                            columnIsFound = false;
                                            if (selectCore.resultColumns.get(z).getExpression() != null){
                                                if (Main.symbolTable.declaredTypes.get(j).getColumns().get(selectCore.resultColumns.get(z).getExpression().getColumnName()) != null) {
                                                    columnIsFound = true;
                                                    // typeNewTable.setName(declareVariable.getAssignVariable().getName());

                                                    //typeNewTable.addColumn(Main.symbolTable.declaredTypes.get(j).getColumns());
                                                    typeNewTable.setColumns(Main.symbolTable.declaredTypes.get(j).getColumns());
                                                    /////////////
//                                         for(int q= Main.symbolTable.declaredTypes.get(j).getColumns().size()-1 ;q>=0;q--){
//                                            for (Map.Entry<String, Type> entry : Main.symbolTable.declaredTypes.get(q).columns.entrySet()) {
//                                                // System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//                                                typeNewTable.addColumn(entry.getKey(),entry.getValue());
//
//                                            }}
                                                    /////////////

                                                }
                                        }
                                        }
                                        Main.symbolTable.addType(typeNewTable);
                                        if(!columnIsFound){
                                            Main.w.println("Error for using un-existed column of a type/table LINE : " + selectCore.resultColumns.get(i).getLine() + " COLUMNE : " + selectCore.resultColumns.get(i).getCol());
                                            System.out.println("Error for using un-existed column of a type/table LINE : " + selectCore.resultColumns.get(i).getLine() + " COLUMNE : " + selectCore.resultColumns.get(i).getCol());

                                        }
                                    }
                                    //////////// for WHERE (X=5)  -column
                                    if(selectCore.expression.size()>0 ){
                                        for(int z =0 ;z<selectCore.expression.size();z++){
                                            columnIsFound = false;
                                            if(Main.symbolTable.declaredTypes.get(j).getColumns().get(selectCore.expression.get(z).getColumnName())!=null){

                                                columnIsFound =true;
                                            }
                                        }
                                        if(!columnIsFound){
                                            Main.w.println("Error for using un-existed column of a type/table LINE : " + selectCore.getLine() + " COLUMNE : " + selectCore.getCol());
                                            System.out.println("Error for using un-existed column of a type/table LINE : " + selectCore.getLine() + " COLUMNE : " + selectCore.getCol());

                                        }
                                    }
                                }
                            }
                            if(!tableIsDeclare){
                                    Main.w.println("Error while using of undeclared type LINE : " + selectCore.tableOrSubqueries.get(i).getLine() + " COLUMNE : " + selectCore.tableOrSubqueries.get(i).getCol());
                                System.out.println("Error while using of undeclared type LINE : " + selectCore.tableOrSubqueries.get(i).getLine() + " COLUMNE : " + selectCore.tableOrSubqueries.get(i).getCol());
                            }


                        }
                    }


                }
            }
//            for (Map.Entry<String, Symbol> entry : currentScope.getSymbolMap().entrySet()) {
//                // System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//
//                if (entry.getKey().equals(declareVariable.getName())) {
//                    // count++;
//
//                    System.out.print("Error in Multiple Declarations: a variable should be declared (in the\n" +
//                            "same scope) Line :" + declareVariable.getLine() + " COLUMNE : " + declareVariable.getCol());
//                }
//
//            }

//            if(count>1){
//                System.out.print("Error in Multiple Declarations: a variable should be declared (in the\n" +
//                        "same scope) Line :" + declareVariable.getLine() + " COLUMNE : " + declareVariable.getCol());
//
//            }

        }
        /////////////////////////////var name = select


    }

    @Override
    public void visit(Decrease decrease) {
        System.out.println("AST decrease");

        boolean isDeclare = false;
        //   System.out.println(scopeParent.getId());
        Scope scopeParent = decrease.getScopeParent();

        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--) {

            if(Main.symbolTable.getScopes().get(i)==scopeParent){
                scopeParent = Main.symbolTable.getScopes().get(i);
                System.out.println(scopeParent.getId());
                if(scopeParent.symbolMap.get(decrease.getName())!=null  ){

                    isDeclare =true;
                    //                    System.out.println("innn 1");
//                    System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());


                }
                if(scopeParent.symbolMap.get(decrease.getName())!=null && !scopeParent.symbolMap.get(decrease.getName()).isWithAssign()){

                    Main.w.println("Warring for using unassigned variable LINE : " + decrease.getLine() + " COLUMNE : " + decrease.getCol());
                    System.out.print("Warring for using unassigned variable LINE : " + decrease.getLine() + " COLUMNE : " + decrease.getCol());

                }

                scopeParent=scopeParent.getParent();
            }
        }
        if(!isDeclare){
            Main.w.println("ERROR FOR USING UNDECLARED VARIABLE LINE : " + decrease.getLine() + " COLUMNE : " + decrease.getCol());
            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + decrease.getLine() + " COLUMNE : " + decrease.getCol());

        }

    }

    @Override
    public void visit(Do_While doWhile) {
        System.out.println("AST doWhile");
    }

    @Override
    public void visit(Else_If elseIf) {
        System.out.println("AST elseIf");
    }

    @Override
    public void visit(For_Each forEach) {
        System.out.println("AST forEach");
    }

    @Override
    public void visit(For_Simple forSimple) {
        System.out.println("AST forSimple");
    }

    @Override
    public void visit(If1 if1) {
        System.out.println("AST if1");






//            boolean isfoundLeft=false;
//            boolean isfoundRight=false;
//            boolean isfound=false;
//        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--){
//            for (Map.Entry<String, Symbol> entry : Main.symbolTable.getScopes().get(i).getSymbolMap().entrySet()) {
//                // System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//
//                System.out.println("in for");
//                if(if1.getCondition().left!=null || if1.getCondition().right!=null){
//                    if(if1.getCondition().left.getColumnName()!=null){
//                        if(entry.getKey().equals(if1.getCondition().left.getColumnName())){
//                            isfoundLeft=true;
//                            System.out.println("in for left");
//
//
//                        }
//                    }
//                     if(if1.getCondition().right.getColumnName()!=null){
//                        if(entry.getKey().equals(if1.getCondition().right.getColumnName())){
//                            isfoundRight=true;
//                            System.out.println("in for right");
//
//                        }
//                    }
//
//                }
//                else if(if1.getCondition().getVariableName()!=null){
//                    if(entry.getKey().equals(if1.getCondition().getVariableName())){
//                        isfound=true;
//                        System.out.println("in for column");
//
//
//                    }
//
//                }
//
//
//            }
//        }
//      if(if1.getCondition().left.getColumnName()!=null && if1.getCondition().right.getColumnName()!=null) {
//            if (!isfoundLeft && !isfoundRight) {
//                System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + if1.getCondition().left.getLine() + " COLUMNE : " + if1.getCondition().left.getCol() + " And Column : " + if1.getCondition().right.getCol());
//
//            }
//        }
//       else if(if1.getCondition().left.getColumnName()!=null) {
//            if (!isfoundLeft) {
//                System.out.println("in left");
//                System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + if1.getCondition().left.getLine() + " COLUMNE : " + if1.getCondition().left.getCol());
//
//            }
//        }
//        else if(if1.getCondition().right.getColumnName()!=null) {
//            if (!isfoundRight) {
//                System.out.println("in right");
//                System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + if1.getCondition().right.getLine() + " COLUMNE : " + if1.getCondition().right.getCol());
//
//            }
//        }
//
//        else if(if1.getCondition().getVariableName()!=null){
//            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + if1.getCondition().getLine() + " COLUMNE : " + if1.getCondition().getCol());
//            System.out.println("in column");
//        }
//

    }

    @Override
    public void visit(If_Stmt_Way1 ifStmt__way1) {
        System.out.println("AST ifStmt__way1");
    }

    @Override
    public void visit(If_Stmt_Way2 ifStmtWay2) {
        System.out.println("AST ifStmtWay2");
    }

    @Override
    public void visit(Increase increase) {
        System.out.println("AST increase");
                Scope scopeParent = increase.getScopeParent();
        boolean isDeclare = false;
        //   System.out.println(scopeParent.getId());

        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--) {

            if(Main.symbolTable.getScopes().get(i)==scopeParent){
                scopeParent = Main.symbolTable.getScopes().get(i);
                System.out.println(scopeParent.getId());
                if(scopeParent.symbolMap.get(increase.getName())!=null  ){

                    isDeclare =true;
                    //                    System.out.println("innn 1");
//                    System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());


                }
                if(scopeParent.symbolMap.get(increase.getName())!=null && !scopeParent.symbolMap.get(increase.getName()).isWithAssign()){

                    Main.w.println("Warring for using unassigned variable LINE : " + increase.getLine() + " COLUMNE : " + increase.getCol());
                    System.out.print("Warring for using unassigned variable LINE : " + increase.getLine() + " COLUMNE : " + increase.getCol());

                }

                scopeParent=scopeParent.getParent();
            }
        }
        if(!isDeclare){
            Main.w.println("ERROR FOR USING UNDECLARED VARIABLE LINE : " + increase.getLine() + " COLUMNE : " + increase.getCol());
            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + increase.getLine() + " COLUMNE : " + increase.getCol());

        }

    }

    @Override
    public void visit(Json_Object jsonObject) {
        System.out.println("AST jsonObject");
    }

    @Override
    public void visit(JumpStmt jumpStmt) {
        System.out.println("AST ReturnStmt");


    }

    @Override
    public void visit(Key_Value keyValue) {
        System.out.println("AST Key_Value");
    }

    @Override
    public void visit(Unary_Operator_For_Loop unaryOperatorForLoop) {
        System.out.println("AST UpdateExpression");


//        Scope scopeParent = unaryOperatorForLoop.getScopeParent();
//        boolean isDeclare = false;
//        //   System.out.println(scopeParent.getId());
//
//        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--) {
//
//            if(Main.symbolTable.getScopes().get(i)==scopeParent){
//                scopeParent = Main.symbolTable.getScopes().get(i);
//                System.out.println(scopeParent.getId());
//                if(scopeParent.symbolMap.get(unaryOperatorForLoop.getExpression().getColumnName())!=null  ){
//
//                    isDeclare =true;
//                    //                    System.out.println("innn 1");
////                    System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());
//
//
//                }
//                if(scopeParent.symbolMap.get(switchStmt.getExpression().getColumnName())!=null && !scopeParent.symbolMap.get(switchStmt.getExpression().getColumnName()).isWithAssign()){
//
//                    System.out.print("Warring for using unassigned variable LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());
//
//                }
//
//                scopeParent=scopeParent.getParent();
//            }
//        }
//        if(!isDeclare){
//            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());
//
//        }

    }

    @Override
    public void visit(Value_Json valueJson) {
        System.out.println("AST valueJson");
    }

    @Override
    public void visit(While_Simple whileSimple) {
        System.out.println("AST whileSimple");
    }

    @Override
    public void visit(FunctionDeclaration funcDec) {
        System.out.println("AST FunctionDeclaration ");
        System.out.println("heeeeeeeeeeeer func");
        System.out.println(funcDec.getLine());

//        if(funcDec.Body.getJavaStmt().get(0) instanceof SQLParser.JumpstatementContext){
//
//
//        }


    }

    @Override
    public void visit(ParameterDeclarationList parameterDeclarationList) {
        System.out.println("AST parameterDeclarationList ");


    }

    @Override
    public void visit(ParameterDeclaration parameterDeclaration) {
        System.out.println("AST parameterDeclaration ");
//
//        boolean isfound=false;
//        if(!parameterDeclaration.isDeclear()) {
//          Scope currentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() - 1);
//            System.out.println("type sympoljaksjas"+currentScope.symbolMap.get(parameterDeclaration.getParameterName()).getName());
//    // System.out.println(currentScope);
//    for (Map.Entry<String, Symbol> entry : currentScope.getSymbolMap().entrySet()) {
//        // System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//        System.out.println("innnnnn");
//        if (entry.getKey().equals(parameterDeclaration.getParameterName())) {
//            System.out.println("in true true ");
//            isfound = true;
//        }
//
//    }
//    if (!isfound) {
//        System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + parameterDeclaration.getLine() + " COLUMNE : " + parameterDeclaration.getCol());
//
//    }
//}

    }

    @Override
    public void visit(FunctionBody functionBody) {
        System.out.println("AST functionBody ");

    }

    @Override
    public void visit(Cal_Function calFunction) {
        System.out.println("AST calFunction ");


    }

    @Override
    public void visit(Cal_Function_Simple calFunctionSimple) {
        System.out.println("AST  Cal_Function_Simple");
        boolean isFound=false;
        int sizeFun = Main.symbolTable.functionDeclarations.size();
        for(int i = 0 ;i<sizeFun ; i++){

            if(Main.symbolTable.functionDeclarations.get(i).getFunName().endsWith(calFunctionSimple.getName())){

                isFound=true;
                break;
            }
        }

        if(!isFound){
            Main.w.println("ERROR FOR CALLING UNDECLARED METHOD LINE : " + calFunctionSimple.getLine() + " COLUMNE : " + calFunctionSimple.getCol());
            System.out.print("ERROR FOR CALLING UNDECLARED METHOD LINE : " + calFunctionSimple.getLine() + " COLUMNE : " + calFunctionSimple.getCol());


        }
    }

    @Override
    public void visit(Switch_Stmt switchStmt) {
        System.out.println("AST  switchStmt");


        Scope scopeParent = switchStmt.getScope().getParent();
        boolean isDeclare = false;
     //   System.out.println(scopeParent.getId());

        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--) {

            if(Main.symbolTable.getScopes().get(i)==scopeParent){
                scopeParent = Main.symbolTable.getScopes().get(i);
                System.out.println(scopeParent.getId());
                if(scopeParent.symbolMap.get(switchStmt.getExpression().getColumnName())!=null  ){

                    isDeclare =true;
                    //                    System.out.println("innn 1");
//                    System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());


                }
                 if(scopeParent.symbolMap.get(switchStmt.getExpression().getColumnName())!=null && !scopeParent.symbolMap.get(switchStmt.getExpression().getColumnName()).isWithAssign()){
                    Main.w.println("Warring for using unassigned variable LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());
                    System.out.print("Warring for using unassigned variable LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());

                }

                scopeParent=scopeParent.getParent();
            }
        }
        if(!isDeclare){
            Main.w.println("ERROR FOR USING UNDECLARED VARIABLE LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());
            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());

        }




//        boolean isfound=false;
//        //Scope currentScope = Main.symbolTable.getScopes().get(Main.symbolTable.getScopes().size() -1);
//        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--){
//        for (Map.Entry<String, Symbol> entry : Main.symbolTable.getScopes().get(i).getSymbolMap().entrySet()) {
//            // System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//
//            if(entry.getKey().equals(switchStmt.getExpression().getColumnName())){
//                isfound=true;
//            }
//
//        }}
//        if(!isfound){
//
//            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + switchStmt.getLine() + " COLUMNE : " + switchStmt.getCol());
//
//        }

    }

    @Override
    public void visit(Case aCase) {
        System.out.println("AST SwitchCase");

    }

    @Override
    public void visit(Default aDefault) {
        System.out.println("AST SwitchDefault ");

    }

    @Override
    public void visit(Print_Stmt printStmt) {
        System.out.println("AST Print_Stmt ");



    }

    @Override
    public void visit(Else anElse) {
        System.out.println("AST Else ");

    }

    @Override
    public void visit(ExpressionForAll expression) {
        System.out.println("AST expression ");



    }

    @Override
    public void visit(Condition condition) {
        System.out.println("AST condition ");

        boolean isDeclare = false;

        Scope scopeParent = condition.getScopeParent();
        System.out.println(scopeParent.getId());

        System.out.println(condition.getVariableName());

        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--) {

            if(Main.symbolTable.getScopes().get(i)==scopeParent){
                scopeParent = Main.symbolTable.getScopes().get(i);









               // System.out.println(scopeParent.symbolMap.get(condition.getVariableName()).getName());
                if(condition.getVariableName()!=null && scopeParent.symbolMap.get(condition.getVariableName())!=null  ){
                    isDeclare =true;
                   // System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + condition.getLine() + " COLUMNE : " + condition.getCol());

                }
                 if (condition.getVariableName()!=null && scopeParent.symbolMap.get(condition.getVariableName())!=null && !scopeParent.symbolMap.get(condition.getVariableName()).isWithAssign()){
                    Main.w.println("Warring for using uunassigned variable LINE : " + condition.getLine() + " COLUMNE : " + condition.getCol());
                     System.out.print("Warring for using uunassigned variable LINE : " + condition.getLine() + " COLUMNE : " + condition.getCol());

                }

                scopeParent=scopeParent.getParent();
            }
        }

        if(!isDeclare && condition.getVariableName()!=null){
            Main.w.println("ERROR FOR USING UNDECLARED VARIABLE LINE : " + condition.getLine() + " COLUMNE : " + condition.getCol());
            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + condition.getLine() + " COLUMNE : " + condition.getCol());

        }


//
//            boolean isfound=false;
//        for(int i= Main.symbolTable.getScopes().size()-1 ;i>=0;i--){
//
//            for (Map.Entry<String, Symbol> entry : Main.symbolTable.getScopes().get(i).getSymbolMap().entrySet()) {
//                // System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//
//                if(entry.getKey().equals(condition.getVariableName())){
//                    System.out.println("i : : :" + i);
//                    isfound=true;
//                }
//
//            }}
//        if(!isfound){
//
//            System.out.print("ERROR FOR USING UNDECLARED VARIABLE LINE : " + condition.getLine() + " COLUMNE : " + condition.getCol());
//
//        }
    }

    @Override
    public void visit(Parameter_List_For_CalFunc parameterListForCalFunc) {
        System.out.println("AST Parameter_List_For_CalFunc ");

    }

    @Override
    public void visit(Parameter_For_CalFunc parameterForCalFunc) {

    }

    @Override
    public void visit(Expression expression) {
        System.out.println("AST Expression ");

    }

    @Override
    public void visit(Json_Stmt jsonStmt) {
        System.out.println("AST Json_Stmt ");
    }

    @Override
    public void visit(Assign_Variable_Array assignVariableArray) {
        System.out.println("AST Assign_Variable_Array ");

    }

    @Override
    public void visit(Updateparameter_Forloop updateparameterForloop) {
        System.out.println("AST Updateparameter_Forloop ");

    }
}
