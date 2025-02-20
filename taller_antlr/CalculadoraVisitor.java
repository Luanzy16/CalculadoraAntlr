public class CalculadoraVisitor extends calculadoraBaseVisitor<Double> {
    @Override
    public Double visitMultiplicacionDivision(calculadoraParser.MultiplicacionDivisionContext ctx) {
        double izq = visit(ctx.expresion(0));
        double der = visit(ctx.expresion(1));
        return ctx.op.getText().equals("*") ? izq * der : izq / der;
    }

    @Override
    public Double visitSumaResta(calculadoraParser.SumaRestaContext ctx) {
        double izq = visit(ctx.expresion(0));
        double der = visit(ctx.expresion(1));
        return ctx.op.getText().equals("+") ? izq + der : izq - der;
    }

    @Override
    public Double visitParentesis(calculadoraParser.ParentesisContext ctx) {
        return visit(ctx.expresion());
    }

    @Override
    public Double visitNumero(calculadoraParser.NumeroContext ctx) {
        return Double.parseDouble(ctx.NUMERO().getText());
    }
}
