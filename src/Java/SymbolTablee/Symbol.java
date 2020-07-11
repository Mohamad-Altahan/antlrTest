package Java.SymbolTablee;

public class Symbol {

    private String name;
    private Type type;
    private Scope scope;
    private boolean isParam;
    private boolean withAssign;

    public boolean isWithAssign() {
        return withAssign;
    }

    public void setWithAssign(boolean withAssign) {
        this.withAssign = withAssign;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Scope getScope() {
        return scope;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean getIsParam() {
        return isParam;
    }

    public void setIsParam(boolean param) {
        isParam = param;
    }
}
