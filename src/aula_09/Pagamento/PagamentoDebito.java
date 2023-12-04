package aula_09.Pagamento;

public class PagamentoDebito extends Pagamento{

    private String banco;
    private String agencia;
    private String conta;

    public PagamentoDebito(int idPagamento, double valor, String banco, String agencia, String conta){
        super(idPagamento, valor);
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getBanco() {
        return banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }
 
    
}
