package me_unidade1;
public class Pneu{
    // Atributos
    private int idPneu;
    private String modelo; 
    private double indiceDeVida;
    private char estado;
    private int horasDeUso;

    // Construtor
    public Pneu(int idPneu, String modelo, double indiceDeVida, char estado, int horasDeUso){
        this.idPneu = idPneu;
        this.modelo = modelo;
        this.indiceDeVida = indiceDeVida;
        this.estado = estado;
        this.horasDeUso = horasDeUso;
    }
    
    // Getters
    public int getIdPneu() {
        return idPneu;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public double getIndiceDeVida() {
        return indiceDeVida;
    }
    
    public char getEstado() {
        return estado;
    }

    public int getHorasDeUso() {
        return horasDeUso;
    }

    // Demais Métodos
    public boolean desgastar(int horaInicial, int horaFinal){
        if(estado == 'N' || estado == 'U'){
            if(estado == 'N'){
                estado ='U';
            }
            indiceDeVida -= (((horaFinal - horaInicial) * 60)*0.12345);
            if(indiceDeVida <= 0){
                estado = 'F';
            }
            horasDeUso += (horaFinal-horaInicial);
            return true;
        }
        else{
            return false;
        }
    }
}