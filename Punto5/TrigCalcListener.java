// Generated from TrigCalc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrigCalcParser}.
 */
public interface TrigCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrigCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TrigCalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TrigCalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalcParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterCalculation(TrigCalcParser.CalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalcParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitCalculation(TrigCalcParser.CalculationContext ctx);
}