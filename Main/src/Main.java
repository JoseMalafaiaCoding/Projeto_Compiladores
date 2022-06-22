
import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;
import java.awt.Desktop;

public class Main {

    public static void main(String[] args) throws IOException {
        /*File rodar = new File("C:\\Users\\josem\\Desktop\\antlr\\Main\\src\\rodar.bat");
        Desktop abrir = Desktop.getDesktop();
        System.out.println(rodar.exists());
        abrir.open(rodar);
        */
        //fazer leitura do codigo
        CharStream input = CharStreams.fromStream(new FileInputStream(new File("C:\\Users\\jose\\Documents\\Anhembi\\Compiladores\\Projeto\\Main\\src\\entrada.txt")));
        //instancia o analisador lexico 
        GramaticaLexer lexer = new GramaticaLexer(input);
        //gerar os tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //instanciar o parser
        GramaticaParser parser = new GramaticaParser(tokens);

        ParseTree tree = parser.init();

        Tradutor tradutor = new Tradutor();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(tradutor, tree);
        
    }

}
