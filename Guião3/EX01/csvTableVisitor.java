// Generated from csvTable.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link csvTableParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface csvTableVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link csvTableParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(csvTableParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link csvTableParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(csvTableParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRec}
	 * labeled alternative in {@link csvTableParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRec(csvTableParser.ExprRecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link csvTableParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(csvTableParser.ExprStrContext ctx);
}