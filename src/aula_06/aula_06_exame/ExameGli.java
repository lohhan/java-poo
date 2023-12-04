package aula_06.aula_06_exame;

public class ExameGli {

    // Atributos
    private int idExame;
    private String nome;
    private double glicose;

    // Construtor
    public ExameGli(String nome, int idExame, double glicose){
        this.idExame = idExame;
        this.nome = nome;
        this.glicose = glicose;
        this.diagnostico();
    }

    // Get
    public int getIdExame(){
        return this.idExame;
    }

    public String getNome(){
        return this.nome;   
    }

    public double getGlicose(){
        return this.glicose;
    }

    // Demais métodos
    public String diagnostico(){
        if(this.glicose<=99){
            return "Normal";
        }
        else if(this.glicose<=125){
            return "Pré-diabetes";
        }
        else{
            return "Diabetes";
        }
    }


}