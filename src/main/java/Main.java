import Node.*;
import com.antlr.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String test = "src/main/resources/test_1.txt";
        GrammarLexer lexer = new GrammarLexer(new ANTLRFileStream(test));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.program();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
        visitor.file();
        System.out.println("\nOK");

    }

}
