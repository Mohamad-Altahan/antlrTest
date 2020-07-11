package Java.SymbolTablee;

import Java.AST.Function.ParameterDeclaration;
import Java.AST.Function.ParameterDeclarationList;
import Java.AST.JavaStmt.Array;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class AggregationFunction extends Type {
    private String AggregationFunctionName;
    private String JarPath;
    private String ClassName;
    private String MethodName;
    private String returnType;
    public ArrayList<Object> params = new ArrayList<Object>();
    private Array array;
    private Scope scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public String getAggregationFunctionName() {
        return AggregationFunctionName;
    }

    public void setAggregationFunctionName(String aggregationFunctionName) {
        AggregationFunctionName = aggregationFunctionName;
    }

    public String getJarPath() {
        return JarPath;
    }

    public void setJarPath(String jarPath) {
        JarPath = jarPath;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getMethodName() {
        return MethodName;
    }

    public void setMethodName(String methodName) {
        MethodName = methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public ArrayList<Object> getParams() {
        return params;
    }

    public void setParams(ArrayList<Object> params) {
        this.params = params;
    }

    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}