package exception.Financiamento;

public class Financiamento {
    // Atributos
    private double valorTotal;
    private double entrada;
    private int parcelas;
    
    // Construtor
    public Financiamento(double valorTotal, double entrada, int parcelas) {
        if (entrada < (valorTotal * 0.2)) {
            throw new RuntimeException("O valor de entrada não pode ser menor que: " + valorTotal * 0.2 + ".");
        } else if (parcelas < 6) {
            throw new RuntimeException("O número de parcelas não pode ser menor que 6.");
        } else {
            this.valorTotal = valorTotal;
            this.entrada = entrada;
            this.parcelas = parcelas;
        }
    }
    
    // Getters
    public double getValorTotal() {
        return valorTotal;
    }

    public double getEntrada() {
        return entrada;
    }

    public int getParcelas() {
        return parcelas;
    }
    
    // Demais Métodos
    public float prestacao() {
        return (((float) valorTotal - (float)entrada) / parcelas);
    }

}