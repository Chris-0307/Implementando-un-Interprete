// Generated from com\tallerantlr\simple\interprete\Simple.g4 by ANTLR 4.9.2
package com.tallerantlr.simple.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.tallerantlr.simple.interprete.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(SimpleParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(SimpleParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(SimpleParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SimpleParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SimpleParser.TermContext ctx);
}