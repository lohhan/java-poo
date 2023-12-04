package aula_12.agregacao;
import java.time.LocalDate;

public class Viagem {
    // Atributos 
    private static int countId=0;
    private int idViagem;
    private String destino;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private int kmPecorrido;
    private Veiculo veiculo;

    public Viagem (String destino, LocalDate dataInicial, LocalDate dataFinal, Veiculo veiculo) {
        countId++;
        this.destino = destino;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.veiculo = veiculo;
        this.kmPecorrido = 0;
        this.idViagem += countId;
    }

    // Getters
    public static int getCountId() {
        return countId;
    }

    public int getIdViagem() {
        return idViagem;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public int getKmPecorrido() {
        return kmPecorrido;
    }

    // Demais Métodos
    public boolean iniciarViagem(Veiculo veiculo) {
        if (this.veiculo.getStatus() == 'V') {
            return false;
        }
        this.veiculo = veiculo;
        this.dataInicial = LocalDate.now();
        this.veiculo.setStatus('V');
        return true;
    }

    public void finalizarViagem(int kmOdometro) {
        this.dataFinal = LocalDate.now();
        calcularKmPecorrido(kmOdometro);
        this.veiculo.registrarRetorno(kmPecorrido);
    }

    public void calcularKmPecorrido(int kmOdometro) {
        this.kmPecorrido = kmOdometro - this.veiculo.getKmOdometro();
    }

    @Override
    public String toString() {
        return "Viagem [\nidViagem=" + idViagem + "\ndestino=" + destino + "\ndataInicial=" + dataInicial + "\ndataFinal="
                + dataFinal + "\nkmPecorrido=" + kmPecorrido + "\nveiculo=" + veiculo.getPlaca() + "\n]";
    }

   
   

}

