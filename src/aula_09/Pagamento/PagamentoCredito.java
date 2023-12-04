package aula_09.Pagamento;

public class PagamentoCredito extends Pagamento {

    private String bandeira;
    private String numero;
    private int qtdParcelas;

    public PagamentoCredito(int idPagamento, double valor, String bandeira, String numero, int qtdParcelas){
        super(idPagamento, valor);
        this.bandeira = bandeira;
        this.numero = numero;
        this.qtdParcelas = qtdParcelas;  
    }

    public String getBandeira() {
        return bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    
}
