package Java.SymbolTablee;

import Java.AST.Function.FunctionDeclaration;
import Java.AST.JavaStmt.Cal_Function_Simple;

import java.util.ArrayList;


public class SymbolTable {


    private ArrayList<Scope> scopes = new ArrayList<Scope>();

    public ArrayList<Type> declaredTypes = new ArrayList<Type>();
    public ArrayList<AggregationFunction> declaredAggregationFunction = new ArrayList<AggregationFunction>();
    public ArrayList<FunctionDeclaration> functionDeclarations = new ArrayList<FunctionDeclaration>();



    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public ArrayList<Type> getDeclaredTypes() {
        return declaredTypes;
    }

    public void setDeclaredTypes(ArrayList<Type> declaredTypes) {
        this.declaredTypes = declaredTypes;
    }


    public void addScope(Scope scope){
        this.scopes.add(scope);
    }
    public void addType(Type type){
        this.declaredTypes.add(type);
    }
}
