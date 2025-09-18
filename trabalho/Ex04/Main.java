package Ex04;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Livro aleatorio","João");
        Livro livro2 = new Livro("Livro aleatorio 2: Electric boogaloo","João");
        Livro livro3 = new Livro("Livro aleatorio 3: O retorno","João");
        biblioteca.AdicionarLivro(livro1);
        biblioteca.AdicionarLivro(livro2);
        biblioteca.AdicionarLivro(livro3);
        biblioteca.AdicionarNovoLivro("Livro aleatorio 4: A volta dos que nunca foram", "João");
        biblioteca.ListarLivros();

        // System.out.println(biblioteca.getBiblioteca());
    }
}
