// Generated from calculadora.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculadoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculadoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Numero}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(calculadoraParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(calculadoraParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicacionDivision}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacionDivision(calculadoraParser.MultiplicacionDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link calculadoraParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumaResta(calculadoraParser.SumaRestaContext ctx);
}