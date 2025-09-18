package Ex04;

public class Livro {
    String titulo, autor;
    boolean disponivel = false;

    public Livro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[Titulo: "+titulo +"] [Autor: "+autor+"] [Disponibilidade: "+disponivel+"] \n";
    }
}
