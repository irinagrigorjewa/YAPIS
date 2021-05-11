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
        GrammarLexer lexer = new GrammarLexer(new ANTLRFileStream(test));//new ANTLRFileStream("test.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new ParserString(tokens);//new CommonTokenStream(lexer)
        ParseTree tree = parser.program();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
//        FileWriter fileWriter = new FileWriter("Program.java");
//        fileWriter.write(out);
//        fileWriter.close();
        System.out.println("OK");

    }

}
