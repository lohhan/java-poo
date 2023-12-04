package aula_10;
import java.util.Date;
public class Consumo {
    // Atributos
    private static int ultimoId=0;
    private int idConsumo;
    private Date data;
    private char tipoConsumo;
    private char tipoCliente;
    private double valorConsumo;
    private double valorConta;

    // Construtor
    public Consumo(char tipoConsumo, char tipoCliente, double valorConsumo) {
        ultimoId++;
        this.data = new Date();
        this.idConsumo = ultimoId;
        this.tipoConsumo = tipoConsumo;
        this.tipoCliente = tipoCliente;
        this.valorConsumo = valorConsumo;
        
    }

    // Getters
    public int getIdConsumo() {
        return idConsumo;
    }

    public Date getData() {
        return data;
    }

    public char getTipoConsumo() {
        return tipoConsumo;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public double getValorConsumo() {
        return valorConsumo;
    }

    public double getValorConta() {
        return valorConta;
    }

    // Demais Métodos
    public void fechaConta(double valorConsumo) {
        this.valorConta = valorConsumo * 1.1;
    }

    public void fechaConta(double valorConsumo, char tipoCliente) {
        if(tipoCliente == 'F') {
            this.valorConta = valorConsumo - 10;
        } else if(tipoCliente == 'A') {
            if(valorConsumo<=30) {
                this.valorConta = valorConsumo - 3;
            }
            else {
                this.valorConta = valorConsumo - 5;
            }
        } else {
            this.valorConta = valorConsumo;
        }
    }

    @Override
    public String toString() {
        return "Consumo [idConsumo=" + idConsumo + ", data=" + data + ", tipoConsumo=" + tipoConsumo + ", tipoCliente="
                + tipoCliente + ", valorConsumo=" + valorConsumo + ", valorConta=" + valorConta + "]";
    }

    

    

}