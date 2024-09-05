import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class TrigCalcVisitorImpl extends TrigCalcBaseVisitor<Double> {
    @Override
    public Double visitExpr(TrigCalcParser.ExprContext ctx) {
        String func = ctx.getChild(0).getText();
        double angle = Double.parseDouble(ctx.getChild(2).getText());

        // Convierte el ángulo a radianes
        double radians = Math.toRadians(angle);

        switch (func) {
            case "Sin":
                return Math.sin(radians);
            case "Cos":
                return Math.cos(radians);
            case "Tan":
                return Math.tan(radians);
            default:
                throw new IllegalArgumentException("Función desconocida: " + func);
        }
    }
}
