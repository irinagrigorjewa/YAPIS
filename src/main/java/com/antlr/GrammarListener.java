// Generated from /home/irina/BSUIR/IdeaProjects/compiler/grammar/Grammar.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#intialize_char}.
	 * @param ctx the parse tree
	 */
	void enterIntialize_char(GrammarParser.Intialize_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#intialize_char}.
	 * @param ctx the parse tree
	 */
	void exitIntialize_char(GrammarParser.Intialize_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initialize_string}.
	 * @param ctx the parse tree
	 */
	void enterInitialize_string(GrammarParser.Initialize_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initialize_string}.
	 * @param ctx the parse tree
	 */
	void exitInitialize_string(GrammarParser.Initialize_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initialize_string_array}.
	 * @param ctx the parse tree
	 */
	void enterInitialize_string_array(GrammarParser.Initialize_string_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initialize_string_array}.
	 * @param ctx the parse tree
	 */
	void exitInitialize_string_array(GrammarParser.Initialize_string_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#global_assign_var}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_var(GrammarParser.Global_assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#global_assign_var}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_var(GrammarParser.Global_assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#global_assign_string}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_string(GrammarParser.Global_assign_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#global_assign_string}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_string(GrammarParser.Global_assign_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#global_assign_string_array}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_assign_string_array(GrammarParser.Global_assign_string_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#global_assign_string_array}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_assign_string_array(GrammarParser.Global_assign_string_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var_method_invocation(GrammarParser.Assign_var_method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var_method_invocation(GrammarParser.Assign_var_method_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign_string}.
	 * @param ctx the parse tree
	 */
	void enterAssign_string(GrammarParser.Assign_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign_string}.
	 * @param ctx the parse tree
	 */
	void exitAssign_string(GrammarParser.Assign_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign_string_array}.
	 * @param ctx the parse tree
	 */
	void enterAssign_string_array(GrammarParser.Assign_string_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign_string_array}.
	 * @param ctx the parse tree
	 */
	void exitAssign_string_array(GrammarParser.Assign_string_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(GrammarParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(GrammarParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operarions_with_string_array}.
	 * @param ctx the parse tree
	 */
	void enterOperarions_with_string_array(GrammarParser.Operarions_with_string_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operarions_with_string_array}.
	 * @param ctx the parse tree
	 */
	void exitOperarions_with_string_array(GrammarParser.Operarions_with_string_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(GrammarParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(GrammarParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void enterSimple_compare(GrammarParser.Simple_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void exitSimple_compare(GrammarParser.Simple_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multi_compare}.
	 * @param ctx the parse tree
	 */
	void enterMulti_compare(GrammarParser.Multi_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multi_compare}.
	 * @param ctx the parse tree
	 */
	void exitMulti_compare(GrammarParser.Multi_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#while_cycle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cycle(GrammarParser.While_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#while_cycle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cycle(GrammarParser.While_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(GrammarParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(GrammarParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#for_each}.
	 * @param ctx the parse tree
	 */
	void enterFor_each(GrammarParser.For_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#for_each}.
	 * @param ctx the parse tree
	 */
	void exitFor_each(GrammarParser.For_eachContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(GrammarParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(GrammarParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(GrammarParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(GrammarParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_return(GrammarParser.Subprogram_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_return(GrammarParser.Subprogram_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_non_return(GrammarParser.Subprogram_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_non_return(GrammarParser.Subprogram_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_return(GrammarParser.Block_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_return(GrammarParser.Block_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_non_return(GrammarParser.Block_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_non_return(GrammarParser.Block_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#signature_method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterSignature_method_invocation(GrammarParser.Signature_method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#signature_method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitSignature_method_invocation(GrammarParser.Signature_method_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#method_invocation}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invocation(GrammarParser.Method_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#method_invocation}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invocation(GrammarParser.Method_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#global_program}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_program(GrammarParser.Global_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#global_program}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_program(GrammarParser.Global_programContext ctx);
}