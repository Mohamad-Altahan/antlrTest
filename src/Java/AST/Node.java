package Java.AST;

import Java.AST.Visitor.ASTVisitor;
import Java.Main;
import Java.SymbolTablee.Scope;

public class Node {

    private int line;
    private int col;

    public void setLine(int line) {
        this.line = line;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }

    public void accept(ASTVisitor astVisitor){}

    public Scope getParentToNode(){

        for(int i = Main.symbolTable.getScopes().size()-1; i>=0 ; i--){
            if(Main.symbolTable.getScopes().get(i).isParent()){
                Scope parentScope = Main.symbolTable.getScopes().get(i);

               return parentScope;
            }
        }
        return null;
    }


}
