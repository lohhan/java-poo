package aula_09.caminhao;

public class CaminhaoTanque extends Caminhao {
    
    // ATRIBUTOS
    private String tipo;

    public CaminhaoTanque(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade, String tipo) {
        super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
        this.tipo = tipo;
    }

    //  GETTER
    public String getTipo() {
        return tipo;
    }

    // SETTER
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // DEMAIS MÉTODOS
    public void encheTanque() {
        if(this.getCargaAtual() == this.getCapacidadeTotal()){
            System.out.println("A Carga já está cheia.");
        }
        else {
            this.cargaAtual = this.getCapacidadeTotal();
            System.out.println("Carga atualizada! Carga atual: " + this.getCargaAtual());
        }
    }

    public void esvaziaTanque() {
        this.cargaAtual = 0;    
        System.out.println("Carga atualizada! Carga atual: " + this.getCargaAtual());
    }

    public void abasteceTanque(int qtdeLitros) {
        this.cargaAtual += qtdeLitros;
    }

    public void descarregaTanque(int qtdeLitros) {
        this.cargaAtual -= qtdeLitros;
    }
    
}
