package aula_07.aula_07_MinaMinerio;

public class Mina {
    private int idMina;
    private int estoque;
    private Minerio minerio;

    public Mina(int idMina, Minerio minerio) {
        this.idMina = idMina;
        this.minerio = minerio;
    }

    public int getIdMina() {
        return idMina;
    }

    // GET
    public int getEstoque() {
        return estoque;
    }

    public Minerio getMinerio() {
        return minerio;
    }

    // SET
    public void setMinerio(Minerio minerio){
        this.minerio = minerio;
        }

    // DEMAIS MÉTODOS   
    public void producao(int qtdProduzida) {
        this.estoque += qtdProduzida;
    }

    public void escoamento(int qtdEscoada) {
        this.estoque += qtdEscoada;
    }

}
