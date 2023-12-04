package cursoemvideo_ex;

public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;

    // Construtor 
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    

    // Demais Métodos
    protected void ganharExp() {
        
    }


    @Override
    public String toString() {
        return "Pessoa [nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + ", experiencia = " + experiencia + "]";
    }

    

}