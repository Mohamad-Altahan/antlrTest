package Java;

import Java.AST.Parse;
import Java.AST.Visitor.BaseASTVisitor;
import Java.Base.BaseVisitor;
import Java.SymbolTablee.SymbolTable;
import generated.SQLLexer;
import generated.SQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicLong;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static AtomicLong atomicCounter = new AtomicLong();
    public static SymbolTable symbolTable = new SymbolTable();


    public static PrintWriter w;

    static {
        try {
            w = new PrintWriter("D:/Error.txt","UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    ;









    public static void main(String[] args) {
        try {

            String source = "samples//samples.txt";
            CharStream cs = fromFileName(source);
            SQLLexer lexer = new SQLLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            SQLParser parser = new SQLParser(token);
            ParseTree tree = parser.parse();

            Parse p = (Parse) new BaseVisitor().visit(tree);p.accept(new BaseASTVisitor());

            System.out.println(p.toString());
            w.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
