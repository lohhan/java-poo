package aula_09.caminhao;

public class CaminhaoBau extends Caminhao {

    // ATRIBUTOS
    private int volume;
    private double comprimento;
    private double largura;
    private double altura;

    // CONSTRUTOR
    public CaminhaoBau(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade, double comprimento, double largura, double altura) {
        super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
        this.setComprimento(comprimento);
        this.setLargura(largura);
        this.setAltura(altura);
        this.calculaVolume();
    }

    // GETTERS
    public int getVolume() {
        return volume;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    // SETTERS
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // DEMAIS MÉTODOS

    public void carregaBau(double qtdeQuilos) {
        if(this.getCargaAtual() + qtdeQuilos < this.getCapacidadeTotal()){
            this.cargaAtual += qtdeQuilos/1000;
            System.out.println("Carga atualizada! Carga Atual: " + this.getCargaAtual());
        }
        else {
            System.out.println("O caminhão não suporta mais carregamento! Capacidade no limite.");
        }
    }

    public void descarregaBau(double qtdeQuilos) {
        if(this.getCargaAtual() - qtdeQuilos > 0){
            this.cargaAtual -= qtdeQuilos/1000;
            System.out.println("Carga atualizada! Carga Atual: " + this.getCargaAtual());
        }
        else {
            System.out.println("Valor inválido! A carga inserida é maior do que o valor que o caminhão possui.");
        }
    }   

    public void calculaVolume() {
        this.volume = ((int) this.getComprimento()) * ((int) this.getAltura()) * ((int) this.getLargura());
    }

}
