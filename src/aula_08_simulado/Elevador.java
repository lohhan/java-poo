package aula_08_simulado;

public class Elevador {
    private int idElevador;
    private int limitePessoas;
    private int vagasDisponiveis;
    private double limiteCarga;
    private double cargaAtual;
    private boolean bloqueio;

    public Elevador(int idElevador, int limitePessoas, int vagasDisponiveis, double limiteCarga, double cargaAtual, boolean bloqueio){
        this.idElevador = idElevador;
        this.limitePessoas = limitePessoas;
        this.vagasDisponiveis = vagasDisponiveis;
        this.limiteCarga = limiteCarga;
        this.cargaAtual = cargaAtual;
        this.bloqueio = bloqueio;
    }

    // GET
    public int getIdElevador(){
        return idElevador;
    }

    public int getLimitePessoas(){
        return limitePessoas;
    }

    public int getVagasDisponiveis(){
        return vagasDisponiveis;
    }   

    public double getLimiteCarga(){
        return limiteCarga;
    }

    public double getCargaAtual(){
        return cargaAtual;
    }

    public boolean getBloqueio(){
        return bloqueio;
    }

    // SET

    public void setVagasDisponiveis(int vagasDisponiveis){
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public void setCargaAtual(double cargaAtual){
        this.cargaAtual = cargaAtual;
    }

    public void setBloqueio(boolean bloqueio){
        this.bloqueio = bloqueio;
    }

    // DEMAIS MÉTODOS
    public boolean registrarPessoa(int pesoPessoa){
        if(bloqueio == false){
            this.vagasDisponiveis--;
            this.cargaAtual += pesoPessoa;
            if(this.vagasDisponiveis == 0){
                this.setBloqueio(true);
            }
            else if(this.cargaAtual >= this.limiteCarga){
                this.setBloqueio(true);
            }
            return true;

        } 
        else{
            return false;
        }
    }
}
