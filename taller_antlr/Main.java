import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Leer la entrada del usuario
        System.out.print("Ingrese una expresión: ");
        String input = new java.util.Scanner(System.in).nextLine();

        // Crear el lexer y el parser
        CharStream charStream = CharStreams.fromString(input);
        calculadoraLexer lexer = new calculadoraLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        calculadoraParser parser = new calculadoraParser(tokens);

        // Obtener el árbol de análisis sintáctico
        ParseTree tree = parser.expresion();

        // Evaluar la expresión usando el Visitor
        CalculadoraVisitor visitor = new CalculadoraVisitor();
        double resultado = visitor.visit(tree);

        // Mostrar el resultado
        System.out.println("Resultado: " + resultado);
    }
}
