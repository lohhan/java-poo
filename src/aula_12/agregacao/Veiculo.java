package aula_12.agregacao;

public class Veiculo {
    // Atributos
    private static int countId=0;
    private int idVeiculo;
    private String placa;
    private char status; // D - Disponível ; V - Viajando ; M - em Manutenção
    private int kmOdometro;

    // Construtor
    public Veiculo(String placa, int kmOdometro) {
        countId++;
        this.placa = placa;
        this.kmOdometro = kmOdometro;
        this.status = 'D';
        this.idVeiculo += countId;
    }

    // Getters
    public int getIdVeiculo() {
        return idVeiculo;
    }
    public String getPlaca() {
        return placa;
    }
    public char getStatus() {
        return status;
    }
    public int getKmOdometro() {
        return kmOdometro;
    }

    // Setters
    public void setStatus(char status) {
        this.status = status;
    }

    public void setKmOdometro(int kmOdometro) {
        this.kmOdometro = kmOdometro;
    }
    
    // Demais Métodos
    public void registrarViagem() {
        this.status = 'V';
    }

    public void registrarRetorno(int kmOdometro) {
        this.status = 'D';
        this.kmOdometro += kmOdometro;
    }

    public void revisar() {
        this.status = 'M';
    }

    @Override
    public String toString() {
        return "Veiculo [idVeiculo=" + idVeiculo + "\nplaca=" + placa + "\nstatus=" + status + "\nkmOdometro="
                + kmOdometro + "\n]";
    }

    

}