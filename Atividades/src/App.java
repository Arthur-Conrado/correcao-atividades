import livroJava.*;
import livroJava.Livro.Livro;
public class App {
    public static void main(String[] args) {
        
        Livro livro = new Livro("Java para Leigos", "Barry A. Burd", 2006, 500);

        
        livro.exibirInformacoes();
    }
}
