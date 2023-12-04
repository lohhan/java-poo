package cursoemvideo_ex;

public class Aluno extends Pessoa {
    // Atributos 
    private String login;
    private int totAsssistido;

    // Construtor
    public Aluno(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAsssistido = 0;
    }

    // Getters
    public String getLogin() {
        return login;
    }

    public int getTotAssistido() {
        return totAsssistido;
    }

    // Setters
    public void setTotAsssistido(int totAsssistido) {
        this.totAsssistido = totAsssistido;
    }

    // Demais Métodos
    public void viuMaisUm() {
        this.totAsssistido++;
    }

    @Override
    public String toString() {
        return "Aluno [" + super.toString() + ", login = " + login + ", totAsssistido=" + totAsssistido + "]";
    }

    
}