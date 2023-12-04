package aula_07.aula_07_livraria;

public class Genero {
    private int idGenero; 
    private String nomeGenero;

    public Genero(int idGenero, String nomeGenero){
        this.idGenero = idGenero;
        this.nomeGenero = nomeGenero;
    }

    public int getIdGenero(){
        return idGenero;
    }

    public String getNomeGenero(){
        return nomeGenero;
    }
}
