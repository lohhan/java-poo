package aula_09.Pagamento;

public class PagamentoPix extends Pagamento{
    
    private char tipoChave;
    private String chave;
    
    public PagamentoPix(int idPagamento, double valor, char tipoChave, String chave) {
        super(idPagamento, valor);
        this.tipoChave = tipoChave;
        this.chave = chave;
    }

    public char getTipoChave() {
        return tipoChave;
    }

    public String getChave() {
        return chave;
    }

}
