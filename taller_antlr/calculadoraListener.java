// Generated from calculadora.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculadoraParser}.
 */
public interface calculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Numero}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterNumero(calculadoraParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Numero}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitNumero(calculadoraParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(calculadoraParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(calculadoraParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicacionDivision}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacionDivision(calculadoraParser.MultiplicacionDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicacionDivision}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacionDivision(calculadoraParser.MultiplicacionDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterSumaResta(calculadoraParser.SumaRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitSumaResta(calculadoraParser.SumaRestaContext ctx);
}