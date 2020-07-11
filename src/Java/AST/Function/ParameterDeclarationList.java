package Java.AST.Function;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ParameterDeclarationList extends Node {
    public List<ParameterDeclaration> parameters= new ArrayList<ParameterDeclaration>();
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.parameters.size()>0) {
            for (int i = 0; i < this.parameters.size(); i++) {

                this.parameters.get(i).accept(astVisitor);

            }
        }
    }

}
