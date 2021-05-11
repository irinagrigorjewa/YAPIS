package Node;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ExpressionNode extends Node{
    public String op;
    public String value;
    public List<ExpressionNode> expression = new ArrayList<>();
}
