package Java.AST.Function;

import Java.AST.Node;
import Java.SymbolTablee.Type;

public class CreateAggFunc extends Node {
    private String funcName;
    private String jarPath;
    private String className;
    private String methodName;
    private Type type;
    private ParameterDeclarationList parameterDeclarationList;

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ParameterDeclarationList getParameterDeclarationList() {
        return parameterDeclarationList;
    }

    public void setParameterDeclarationList(ParameterDeclarationList parameterDeclarationList) {
        this.parameterDeclarationList = parameterDeclarationList;
    }
}
