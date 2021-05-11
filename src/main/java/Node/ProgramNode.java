package Node;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends Node {
    public BlockNode block ;
    public List<SubprogramReturnNode> subprogramNodes = new ArrayList<>();
    public List<StatementNode> statementNodes = new ArrayList<>();
}
