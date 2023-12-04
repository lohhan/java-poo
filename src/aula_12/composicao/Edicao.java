package aula_12.composicao;

import java.time.LocalDate;

public class Edicao {
    // Atributos
    private int numero;
    private LocalDate data;
    private int tiragem;
    private int qtdVendida;
    private boolean reciclou;

    // Construtor
    public Edicao(int numero, int tiragem) {
        this.numero = numero;
        this.tiragem = tiragem;
        this.data = LocalDate.now();
        this.qtdVendida = 0;
        this.reciclou = false;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public int getTiragem() {
        return tiragem;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public boolean isReciclou() {
        return reciclou;
    }

    // Demais Métodos
    public void informaVenda(int qtdVendida) {
        this.qtdVendida += qtdVendida;
    }

    public int obtemReciclagem() {
        return tiragem - qtdVendida;
    }

    public void reciclaExemplares() {
        this.reciclou = true;   
    }

    @Override
    public String toString() {
        return "Edicao [\nnumero=" + numero + "\ndata=" + data + "\ntiragem=" + tiragem + "\nqtdVendida=" + qtdVendida
                + "\nreciclou=" + reciclou + "\n]\n\n";
    }

    
    
}
