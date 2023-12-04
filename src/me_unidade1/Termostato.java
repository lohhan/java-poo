package me_unidade1;
public class Termostato{

    // Atributos

    private int temperatura;
    private boolean estado;

    // Construtor

    public Termostato(int temperatura, boolean estado){
        this.temperatura = temperatura;
        this.estado = estado;
    }

    // Getters
    public int getTemperatura() {
        return temperatura;
    }

    public boolean getEstado() {
        return estado;
    }

    // Setters
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Demais Métodos

    public void ligarTermostato(){
        this.estado = true;
        this.temperatura = 80;
    }

    public void desligarTermostato(){
        this.estado = false;
    }

    public void aumentarTemperatura(){
        if(estado == true && temperatura<85){
            this.temperatura += 1;
        }
    }

    public void diminuirTemperatura(){
        if(estado == true && temperatura>80){
            this.temperatura -= 1;
        }
    }
}