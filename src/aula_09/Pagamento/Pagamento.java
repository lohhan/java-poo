package aula_09.Pagamento;

import java.util.Date;

public class Pagamento {
    
    private int idPagamento;
    private Date data;
    private double valor;

    public Pagamento(int idPagamento, double valor){
        this.idPagamento = idPagamento;
        this.data = new Date();
        this.valor = valor;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    

}
