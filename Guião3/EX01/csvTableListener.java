// Generated from csvTable.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link csvTableParser}.
 */
public interface csvTableListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link csvTableParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(csvTableParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvTableParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(csvTableParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link csvTableParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(csvTableParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link csvTableParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(csvTableParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRec}
	 * labeled alternative in {@link csvTableParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRec(csvTableParser.ExprRecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRec}
	 * labeled alternative in {@link csvTableParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRec(csvTableParser.ExprRecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link csvTableParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStr(csvTableParser.ExprStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link csvTableParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStr(csvTableParser.ExprStrContext ctx);
}