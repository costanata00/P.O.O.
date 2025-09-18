package Ex04;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List <Livro> biblioteca = new ArrayList<>();
    
    
    public void AdicionarLivro(Livro livro){
        biblioteca.add(livro);
    }
    public void AdicionarNovoLivro(String titulo, String autor){
        Livro nLivro = new Livro(titulo, autor);
        biblioteca.add(nLivro);
    }

    public void EmprestarLivro(Livro livro){
        livro.setDisponivel(false);
    }
    public void DevolverLivro(Livro livro){
        livro.setDisponivel(true);
    }
    public void ListarLivros (){
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println(biblioteca.get(i));
        }
    }
    public List <Livro> getBiblioteca(){
        return biblioteca;
    }
}
