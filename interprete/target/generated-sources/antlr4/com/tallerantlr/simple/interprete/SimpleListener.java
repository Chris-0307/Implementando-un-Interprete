// Generated from Simple.g4 by ANTLR 4.4
package com.tallerantlr.simple.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.tallerantlr.simple.interprete.ast.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull SimpleParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull SimpleParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(@NotNull SimpleParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(@NotNull SimpleParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SimpleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull SimpleParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull SimpleParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull SimpleParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull SimpleParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull SimpleParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull SimpleParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull SimpleParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull SimpleParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull SimpleParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull SimpleParser.FactorContext ctx);
}