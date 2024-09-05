import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public interface TrigCalcVisitor<T> extends ParseTreeVisitor<T> {
    T visitExpr(TrigCalcParser.ExprContext ctx);
}
