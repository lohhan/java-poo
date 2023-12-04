package aula_07.aula_07_livraria;

public class AppLivraria {
    public static void main(String[] args) {  

        Editora editora1 = new Editora(1, "Editora A", "contato@editoraA.com", "CidadeA", "UF1");
        Editora editora2 = new Editora(2, "Editora B", "contato@editoraB.com", "CidadeB", "UF2");

        Genero genero1 = new Genero(1, "Ficção Científica");
        Genero genero2 = new Genero(2, "Romance");
        Genero genero3 = new Genero(3, "Comédia");

        Livro livro1 = new Livro(1, "Livro 1", "ISBN123", 200, editora1, genero1);
        Livro livro2 = new Livro(2, "Livro 2", "ISBN456", 300, editora2, genero2);
        Livro livro3 = new Livro(3, "Livro 3", "ISBN789", 250, editora1, genero3);
        Livro livro4 = new Livro(4, "Livro 4", "ISBN101", 350, editora2, genero1);
        Livro livro5 = new Livro(5, "Livro 5", "ISBN112", 180, editora1, genero2);

        System.out.println("Dados dos livros:");
        System.out.println();
        livro1.mostrarDadosLivro(livro1);
        livro2.mostrarDadosLivro(livro2);
        livro3.mostrarDadosLivro(livro3);
        livro4.mostrarDadosLivro(livro4);
        livro5.mostrarDadosLivro(livro5);
    }
}

