import com.antlr.GrammarBaseVisitor;
import com.antlr.GrammarParser;
import exception.FunctionException;
import exception.PrintException;
import exception.WrongExpressionException;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import Node.*;

import java.util.stream.Collectors;

//assignVar
public class Visitor extends GrammarBaseVisitor<Node> {
    //
//        private final String name;
////    private final StringParser stringParser;
//
//    public Visitor(GrammarParser stringParser, String name) {
//    //    this.stringParser = stringParser;
//        this.name = name;
//    }
    public ProgramNode main = new ProgramNode();
    public StringBuilder stringBuilder = new StringBuilder();

    @Override
    public Node visitProgram(GrammarParser.ProgramContext ctx) {
//

        GrammarParser.BlockContext sctx = ctx.block();
        ProgramNode programNode = new ProgramNode();
        programNode.statementNodes = visitBlock(sctx).statements;
        if (ctx.subprogram_return() != null) {

            programNode.subprogramNodes = ctx.subprogram_return()
                    .stream()
                    .map(this::visitSubprogram_return)
                    .collect(Collectors.toList());
        } //else

//        if (ctx.subprogram_non_return() != null) {
//            programNode.subprogramNodes = ctx.subprogram_non_return()
//                    .stream()
//                    .map(this::visitSubprogram_non_return)
//                    .collect(Collectors.toList());
//        }
        stringBuilder.append("main");
        stringBuilder.append(programNode);
        this.main = programNode;
        return this.main;
    }

    @Override
    public BlockNode visitBlock(GrammarParser.BlockContext ctx) {

        BlockNode blockNode = new BlockNode();
//        if (ctx.statement() == null) {
//            blockNode.statements=ctx.statement();
//        }
//            blockNode = visitFor_each(ctx.statement(0));
//        } else if (ctx.if_block() != null) {
//            blockNode = visitIf_else(ctx.if_block());
//        }

        // throw new FunctionException("The function must be void: "+ctx.getText());
//                System.out.println("Nooooooooo");
//            }else{

        blockNode.statements = ctx.statement()
                .stream()
                .map(this::visitStatement)
                .collect(Collectors.toList());
//        }
        stringBuilder.append(ctx.BEGIN().getText()+" "+blockNode.toString()+ctx.END().getText());
//        stringBuilder.append(blockNode);
//        stringBuilder.append(ctx.END().getText());
        return blockNode;
    }


    @Override
    public StatementNode visitStatement(GrammarParser.StatementContext ctx) {
        StatementNode statementNode = new StatementNode();
        if (ctx.assign_var() != null) {
            statementNode = visitAssign_var(ctx.assign_var());
        } else if (ctx.assign_string() != null) {
            statementNode = visitAssign_string(ctx.assign_string());
        } else if (ctx.assign_string_array() != null) {
            statementNode = visitAssign_string_array(ctx.assign_string_array());
        } else if (ctx.print() != null) {
            statementNode = visitPrint(ctx.print());
        } else if (ctx.operations() != null) {
            statementNode = visitOperations(ctx.operations());
        } else if (ctx.operarions_with_string_array() != null) {
            statementNode = visitOperarions_with_string_array(ctx.operarions_with_string_array());
        } else if (ctx.assign_var_method_invocation() != null) {
            statementNode = visitAssign_var_method_invocation(ctx.assign_var_method_invocation());
        } else if (ctx.while_cycle() != null) {
            statementNode = visitWhile_cycle(ctx.while_cycle());
        } else if (ctx.if_else() != null) {
            statementNode = visitIf_else(ctx.if_else());
        } else if (ctx.method_invocation() != null) {
            statementNode = visitMethod_invocation(ctx.method_invocation());
        } else if (ctx.for_each() != null) {
            statementNode = visitFor_each(ctx.for_each());
        }//else System.out.println("Empty");
        return statementNode;
    }

    @Override
    public ExpressionNode visitExpression(GrammarParser.ExpressionContext ctx) {
        ExpressionNode expressionNode = new ExpressionNode();
        if (ctx.expression().size() > 1) {
            if (ctx.MINUS() != null) {
                expressionNode.op = ctx.MINUS().getText();
            } else if (ctx.PLUS() != null) {
                expressionNode.op = ctx.PLUS().getText();
            } else if (ctx.MULTIPLY() != null) {
                expressionNode.op = ctx.MULTIPLY().getText();
            } else if (ctx.AND() != null) {
                expressionNode.op = ctx.AND().getText();
            }
            expressionNode.expression = ctx.expression().stream().map(this::visitExpression).collect(Collectors.toList());


        } else {
//        if (ctx.expression() != null) {
//
//
//        }
            if (ctx.NUMBER() != null) {
                expressionNode.value = ctx.NUMBER().getText();
            } else if (ctx.ID() != null) {
                expressionNode.value = ctx.ID().getText();
            } else if (ctx.expression().size() == 0) {
                throw new WrongExpressionException("Empty expression!");
            }
        }
        return expressionNode;
    }

    @Override
    public InitializeCharNode visitIntialize_char(GrammarParser.Intialize_charContext ctx) {
        InitializeCharNode initializeCharNode = new InitializeCharNode();
        initializeCharNode.symbol = ctx.SYMBOL().getText();
        return initializeCharNode;
    }

    @Override
    public InitializeStringNode visitInitialize_string(GrammarParser.Initialize_stringContext ctx) {
        InitializeStringNode initializeStringNode = new InitializeStringNode();
        if (ctx.LINE() != null) {
            initializeStringNode.string = ctx.LINE().getText();
        } else {
            initializeStringNode.id_1 = ctx.ID(0).getText();

            initializeStringNode.id_2 = ctx.ID(1).getText();
            if (ctx.AND() != null) {
                initializeStringNode.op = ctx.AND().getText();
            } else if (ctx.MINUS() != null) {
                initializeStringNode.op = ctx.MINUS().getText();
            } else if (ctx.MULTIPLY() != null) {
                initializeStringNode.op = ctx.MULTIPLY().getText();
            } else if (ctx.PLUS() != null) {
                initializeStringNode.op = ctx.PLUS().getText();
            }
        }

        return initializeStringNode;
    }

    @Override//?
    public InitializeStringArrayNode visitInitialize_string_array(GrammarParser.Initialize_string_arrayContext ctx) {
        InitializeStringArrayNode initializeStringArrayNode = new InitializeStringArrayNode();
//
        for (int i = 0; i < ctx.ID().size(); i++) {
            initializeStringArrayNode.id.add(ctx.ID(i).toString());
        }

//        }// else ctx.ID()=null;

        return initializeStringArrayNode;

    }

    @Override
    public GlobalProgramNode visitGlobal_assign_var(GrammarParser.Global_assign_varContext ctx) {

        return null;
    }

    @Override
    public AssignStringNode visitGlobal_assign_string(GrammarParser.Global_assign_stringContext ctx) {
        AssignStringNode assignStringNode = new AssignStringNode();
        assignStringNode = visitAssign_string(ctx.assign_string());
        return assignStringNode;
    }

    @Override
    public AssignStringArrayNode visitGlobal_assign_string_array(GrammarParser.Global_assign_string_arrayContext ctx) {
        AssignStringArrayNode globalAssignVarNode = new AssignStringArrayNode();
        globalAssignVarNode = visitAssign_string_array(ctx.assign_string_array());
        return globalAssignVarNode;
    }

    @Override
    public PrintNode visitPrint(GrammarParser.PrintContext ctx) {
        PrintNode printNode = new PrintNode();
        printNode.print = ctx.PRINT().getText();
        if (ctx.ID() != null) {
            printNode.id = ctx.ID().getText();
        } else if (ctx.NUMBER() != null) {
            printNode.id = ctx.NUMBER().getText();
        } else if (ctx.LINE() != null) {
            printNode.id = ctx.LINE().getText();
        } else throw new PrintException("Cannot print this information:" + ctx.getText());
        return printNode;
    }

    @Override//const
    public AssignVarMethodInvocationNode visitAssign_var_method_invocation(GrammarParser.Assign_var_method_invocationContext ctx) {
        AssignVarMethodInvocationNode assignVarMethodInvocationNode = new AssignVarMethodInvocationNode();
        assignVarMethodInvocationNode.type = visitType(ctx.type());
        assignVarMethodInvocationNode.id = ctx.ID().getText();
        assignVarMethodInvocationNode.methodInvocation = visitMethod_invocation(ctx.method_invocation());
        return assignVarMethodInvocationNode;
    }

    @Override//
    public AssignStringNode visitAssign_string(GrammarParser.Assign_stringContext ctx) {
        AssignStringNode assignStringNode = new AssignStringNode();
        assignStringNode.id = ctx.ID().getText();
        assignStringNode.initializeString = visitInitialize_string(ctx.initialize_string());

        return assignStringNode;
    }

    @Override//
    public AssignStringArrayNode visitAssign_string_array(GrammarParser.Assign_string_arrayContext ctx) {

        AssignStringArrayNode assignStringArrayNode = new AssignStringArrayNode();
        assignStringArrayNode.stringArray = visitInitialize_string_array(ctx.initialize_string_array());
        assignStringArrayNode.id = ctx.ID().getText();
        return assignStringArrayNode;
    }

    @Override//
    public StatementNode visitAssign_var(GrammarParser.Assign_varContext ctx) {

        AssignVarNode assignVarNode = new AssignVarNode();
        assignVarNode.simpleType = visitSimple_type(ctx.simple_type());
        if (ctx.expression() != null) {
            assignVarNode.expression = visitExpression(ctx.expression());
        } else if (ctx.intialize_char() != null) {
            assignVarNode.initializeChar = visitIntialize_char(ctx.intialize_char());
        }
        assignVarNode.id = ctx.ID().getText();
        return assignVarNode;
    }

    @Override//
    public OperarionsWithStringArrayNode visitOperarions_with_string_array(GrammarParser.Operarions_with_string_arrayContext ctx) {
        OperarionsWithStringArrayNode operations = new OperarionsWithStringArrayNode();
        operations.id = ctx.ID(0).getText();

        if (ctx.ADD() != null) {
            operations.op = ctx.ADD().getText();
        } else operations.op = ctx.REMOVE().getText();
        operations.arg = ctx.ID(1).getText();
        return operations;
    }

    //pretty printer   gson

//    }

    @Override//
    public OperationsNode visitOperations(GrammarParser.OperationsContext ctx) {
        OperationsNode operationsNode = new OperationsNode();
        operationsNode.id = ctx.ID().getText();
//        if(ctx.expression()==null){
//            throw  new WrongExpressionException("Empty expression!");
//        }
        operationsNode.expressionNode = visitExpression(ctx.expression());
        return operationsNode;
    }

    @Override//
    public SimpleCompareNode visitSimple_compare(GrammarParser.Simple_compareContext ctx) {
        SimpleCompareNode simpleCompareNode = new SimpleCompareNode();
        if (ctx.expression(0) != null) {
            simpleCompareNode.expression[0] = visitExpression(ctx.expression(0));
        }
        if (ctx.expression(1) != null) {
            simpleCompareNode.expression[1] = visitExpression(ctx.expression(1));
        }
        if (ctx.EQUAL() != null) {
            simpleCompareNode.operation = ctx.EQUAL().getText();
        } else if (ctx.NON_EQUAL() != null) {
            simpleCompareNode.operation = ctx.NON_EQUAL().getText();
        } else if (ctx.LESS() != null) {
            simpleCompareNode.operation = ctx.LESS().getText();
        } else if (ctx.GREATER() != null) {
            simpleCompareNode.operation = ctx.GREATER().getText();
        } else if (ctx.LESS_OR_EQUALS() != null) {
            simpleCompareNode.operation = ctx.LESS_OR_EQUALS().getText();
        } else if (ctx.GREATER_OR_EQUALS() != null) {
            simpleCompareNode.operation = ctx.GREATER_OR_EQUALS().getText();
        }
        return simpleCompareNode;
    }

    @Override
    public MultiCompareNode visitMulti_compare(GrammarParser.Multi_compareContext ctx) {
        MultiCompareNode multiCompareNode = new MultiCompareNode();
        multiCompareNode.simpleCompare = visitSimple_compare(ctx.simple_compare());
        ctx.NEGATION().getText();
        ctx.O_BRACKET().getText();
        ctx.C_BRACKET().getText();
        return multiCompareNode;
    }

    @Override//
    public WhileCycleNode visitWhile_cycle(GrammarParser.While_cycleContext ctx) {
        //   return null;
        WhileCycleNode whileCycleNode = new WhileCycleNode();
        if (ctx.simple_compare() != null) {
            whileCycleNode.compare = visitSimple_compare(ctx.simple_compare());
        } else if (ctx.multi_compare() != null) {
            whileCycleNode.compare = visitMulti_compare(ctx.multi_compare());
        }
        whileCycleNode.blockNode = visitBlock(ctx.block());
        return whileCycleNode;
    }

    @Override//
    public IfElseNode visitIf_else(GrammarParser.If_elseContext ctx) {
        IfElseNode ifElseNode = new IfElseNode();
        ifElseNode.if_block = visitBlock(ctx.block(0));
        ifElseNode.else_block = visitBlock(ctx.block(1));
        if (ctx.simple_compare() != null) {
            ifElseNode.compare = visitSimple_compare(ctx.simple_compare());
        } else ifElseNode.compare = visitMulti_compare(ctx.multi_compare());
        return ifElseNode;
    }

    @Override//
    public StatementNode visitFor_each(GrammarParser.For_eachContext ctx) {
        ForEachNode forEachNode = new ForEachNode();
        if (ctx.block() == null) throw new WrongExpressionException("Wrong!!!!!!!!!!!!!!!!!");
        forEachNode.fromParam = ctx.ID(0).getText();
        forEachNode.toParam = ctx.ID(1).getText();
        forEachNode.block = visitBlock(ctx.block());
        return forEachNode;
    }


    @Override//
    public TypeNode visitType(GrammarParser.TypeContext ctx) {
        TypeNode typeNode = new TypeNode();
        if (ctx.INT() != null) {
            typeNode.type = ctx.INT().getText();
        } else if (ctx.CHAR() != null) {
            typeNode.type = ctx.CHAR().getText();
        } else if (ctx.STRING() != null) {
            typeNode.type = ctx.STRING().getText();
        } else if (ctx.STRING_ARRAY() != null) {
            typeNode.type = ctx.STRING_ARRAY().getText();
        } else throw new FunctionException("Wrong type!");
        return typeNode;
    }

    @Override
    public SimpleTypeNode visitSimple_type(GrammarParser.Simple_typeContext ctx) {
        SimpleTypeNode simpleTypeNode = new SimpleTypeNode();
        if (ctx.INT() != null) {
            simpleTypeNode.type = ctx.INT().getText();
        } else if (ctx.CHAR() != null) {
            simpleTypeNode.type = ctx.CHAR().getText();
        } else if (ctx == null) throw new FunctionException("Wrong type!");
        return simpleTypeNode;
    }

    @Override///????
    public SignatureNode visitSignature(GrammarParser.SignatureContext ctx) {
        SignatureNode signatureNode = new SignatureNode();

        //  while (ctx.type() != null) {
        for (int i = 0; i < ctx.type().size(); i++) {
            signatureNode.typeNodeList.add(visitType(ctx.type(i)));
        }
        //   }
        //   while (ctx.ID() != null) {
        for (int i = 0; i < ctx.type().size(); i++) {
            signatureNode.id.add(ctx.ID(i).getText());
        }
        // }

        return signatureNode;

    }

    @Override//
    public SubprogramReturnNode visitSubprogram_return(GrammarParser.Subprogram_returnContext ctx) {

        SubprogramReturnNode subprogramReturnNode = new SubprogramReturnNode();
        if (ctx.type() == null) {
             throw new FunctionException("The function must be void: "+ctx.getText());
//            System.out.println("Nooooooooo");
        } else {
            subprogramReturnNode.type = visitType(ctx.type());
        }
        subprogramReturnNode.id = ctx.ID().getText();
        if (ctx.signature() != null) {
            subprogramReturnNode.signature = visitSignature(ctx.signature());
        }
        subprogramReturnNode.block = visitBlock_return(ctx.block_return());
        stringBuilder.append("func");
        return subprogramReturnNode;

    }

    @Override//
    public SubprogramNonReturnNode visitSubprogram_non_return(GrammarParser.Subprogram_non_returnContext ctx) {
        SubprogramNonReturnNode subprogramNonReturnNode = new SubprogramNonReturnNode();
        subprogramNonReturnNode.id = ctx.ID().getText();

        if (ctx.VOID() == null) {
            // throw new FunctionException("The function must be void: "+ctx.getText());
            System.out.println("Nooooooooo");
        } else
            subprogramNonReturnNode.voidNode = ctx.VOID().getText();

        if (ctx.block_non_return() != null) {
            subprogramNonReturnNode.block = visitBlock_non_return(ctx.block_non_return());
        } else
            subprogramNonReturnNode.block = visitBlock(ctx.block());
        if (ctx.signature() != null) {
            subprogramNonReturnNode.signature = visitSignature(ctx.signature());
        }
        stringBuilder.append("func "+subprogramNonReturnNode.voidNode);
        stringBuilder.append(subprogramNonReturnNode);
        return subprogramNonReturnNode;
    }


    @Override//
    public BlockReturnNode visitBlock_return(GrammarParser.Block_returnContext ctx) {
        BlockReturnNode blockNode = new BlockReturnNode();
        blockNode.return_id = ctx.ID().getText();
        blockNode.statements = ctx.statement()
                .stream()
                .map(this::visitStatement)
                .collect(Collectors.toList());

        return blockNode;
    }

    @Override
    public BlockNode visitBlock_non_return(GrammarParser.Block_non_returnContext ctx) {

        BlockNode blockNode = new BlockNode();

        while (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                blockNode.statements.add(visitStatement(ctx.statement(i)));
            }
        }
        return blockNode;
    }

    @Override//
    public SignatureMethodInvocationNode visitSignature_method_invocation(GrammarParser.Signature_method_invocationContext ctx) {
        SignatureMethodInvocationNode signatureMethodInvocationNode = new SignatureMethodInvocationNode();
        for (int i = 0; i < ctx.ID().size(); i++) {
            signatureMethodInvocationNode.id.add(ctx.ID(i).getText());
        }
        return signatureMethodInvocationNode;
    }

    @Override//
    public MethodInvocationNode visitMethod_invocation(GrammarParser.Method_invocationContext ctx) {
        MethodInvocationNode methodInvocationNode = new MethodInvocationNode();
        methodInvocationNode.id = ctx.ID().getText();
        if (ctx.signature_method_invocation() != null) {
            methodInvocationNode.signature = visitSignature_method_invocation(ctx.signature_method_invocation());
        }
        return methodInvocationNode;
    }

    @Override
    public GlobalProgramNode visitGlobal_program(GrammarParser.Global_programContext ctx) {
        GlobalProgramNode globalProgramNode = new GlobalProgramNode();
        // globalProgramNode.print = ctx.PRINT().getText();
//        if (ctx.global_assign_string() != null) {
//            globalProgramNode = visitGlobal_assign_string(ctx.global_assign_string(0));
        // } else
        if (ctx.global_assign_var() != null) {
            globalProgramNode = visitGlobal_assign_var(ctx.global_assign_var(0));
        }
//        } else if (ctx.global_assign_string_array() != null) {
//            globalProgramNode = visitGlobal_assign_string_array(ctx.global_assign_string_array(0));
//        }
        return globalProgramNode;
    }

//    @Override
//    public Node visit(ParseTree parseTree) {
////        String out = parseTree.accept(this);
//////        return String.format(CompilerFields.STATIC_CONTENT, name, out);
////        return out;
//    }

    @Override
    public Node visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Node visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Node visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
