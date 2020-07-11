package Java.AST.Function;

import Java.AST.Node;

public class AggFuncBody extends Node {
    private  String jarPath;
    private  String className;
    private  String methodName;
    private  ParameterDeclarationList parameterDeclarationList;

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

    public ParameterDeclarationList getParameterDeclarationList() {
        return parameterDeclarationList;
    }

    public void setParameterDeclarationList(ParameterDeclarationList parameterDeclarationList) {
        this.parameterDeclarationList = parameterDeclarationList;
    }
}
