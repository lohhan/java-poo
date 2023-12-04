package aula_07.aula_07_livraria;

public class Livro {
    private int idLivro; 
    private String titulo;
    private String isbn;
    private int numeroPaginas;
    private Editora editora;
    private Genero genero;

    public Livro(int idLivro, String titulo, String isbn, int numeroPaginas, Editora editora, Genero genero){
        this.idLivro = idLivro;
        this.titulo= titulo;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
        this.genero = genero;
    }

    public int getIdLivro(){
        return idLivro;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void mostrarDadosLivro(Livro livro){
        System.out.println("Título: " + livro.titulo);
        System.out.println("Gênero: " + livro.genero.getNomeGenero());
        System.out.println("Editora: " + livro.editora.getRazaoSocial());
        System.out.println("Cidade da Editora: " + livro.editora.getCidade());
        System.out.println("------------------------------");
    }
}
