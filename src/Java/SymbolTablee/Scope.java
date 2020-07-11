package Java.SymbolTablee;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private String id;
    private Scope parent;
    private boolean isParent;
    public Map<String, Symbol> symbolMap = new LinkedHashMap<String, Symbol>();
    private Type returnType;

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setIsParent(boolean parent) {
        isParent = parent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Map<String, Symbol> getSymbolMap() {
        return symbolMap;
    }

    public void setSymbolMap(Map<String, Symbol> symbolMap) {
        this.symbolMap = symbolMap;
    }
    public void addSymbol(String name, Symbol symbol) {
        this.symbolMap.put(name,symbol);
    }


}
