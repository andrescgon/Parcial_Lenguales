import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class TrigCalcApp {
    public static void main(String[] args) throws Exception {
        // Lee el archivo de entrada
        InputStream is = new FileInputStream("expr.in");
        CharStream input = CharStreams.fromStream(is);

        // Inicializa el analizador léxico y el parser
        TrigCalcLexer lexer = new TrigCalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrigCalcParser parser = new TrigCalcParser(tokens);

        // Analiza el archivo
        ParseTree tree = parser.calculation();

        // Crea una instancia del visitante
        TrigCalcVisitorImpl visitor = new TrigCalcVisitorImpl();

        // Visita cada nodo del árbol y obtiene el resultado
        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree child = tree.getChild(i);
            Double result = visitor.visit(child);
            System.out.println(result);
        }
    }
}
