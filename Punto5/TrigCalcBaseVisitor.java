import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class TrigCalcBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements TrigCalcVisitor<T> {
    @Override
    public T visitExpr(TrigCalcParser.ExprContext ctx) {
        return visitChildren(ctx);
    }
}
