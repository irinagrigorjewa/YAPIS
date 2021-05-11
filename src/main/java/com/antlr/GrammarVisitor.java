// Generated from /home/irina/BSUIR/IdeaProjects/compiler/grammar/Grammar.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#intialize_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntialize_char(GrammarParser.Intialize_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#initialize_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialize_string(GrammarParser.Initialize_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#initialize_string_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialize_string_array(GrammarParser.Initialize_string_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#global_assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_var(GrammarParser.Global_assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#global_assign_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_string(GrammarParser.Global_assign_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#global_assign_string_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_string_array(GrammarParser.Global_assign_string_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var_method_invocation(GrammarParser.Assign_var_method_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_string(GrammarParser.Assign_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign_string_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_string_array(GrammarParser.Assign_string_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(GrammarParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#operarions_with_string_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperarions_with_string_array(GrammarParser.Operarions_with_string_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(GrammarParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#simple_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_compare(GrammarParser.Simple_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multi_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_compare(GrammarParser.Multi_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#while_cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cycle(GrammarParser.While_cycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(GrammarParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(GrammarParser.For_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(GrammarParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(GrammarParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#subprogram_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_return(GrammarParser.Subprogram_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_non_return(GrammarParser.Subprogram_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_return(GrammarParser.Block_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_non_return(GrammarParser.Block_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#signature_method_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_method_invocation(GrammarParser.Signature_method_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#method_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invocation(GrammarParser.Method_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#global_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_program(GrammarParser.Global_programContext ctx);
}