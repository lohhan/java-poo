package aula_02;

public class Salario {
    
    private double valorSalario;
    private double descontoSalario;
    private double percentualDesconto;
    private String tipo;

    // GET
    public double getDescontoSalario(){
        return this.descontoSalario;
    }

    public String getTipo(){
        return this.tipo;
    }

    // SET
    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    // DEMAIS MÉTODOS
    public void percentual() {
        if (this.valorSalario <= 2000) {
            this.percentualDesconto = 0;
        } 

        else if (this.valorSalario > 2000 && this.valorSalario <= 4000) {
            this.percentualDesconto = 2;
        }

        else if (this.valorSalario > 4000) {
            this.percentualDesconto = 4;
        }
    }

    public void desconto() {
        this.descontoSalario = (this.valorSalario * this.percentualDesconto/100);
        this.descontoSalario = (this.valorSalario - this.descontoSalario);
        if (valorSalario>10000) {
            this.descontoSalario = (this.valorSalario - 400);
        }
    }

    public void tipoDesconto() {
        if (this.valorSalario <= 2000) {
            this.tipo = "Isento";
        }
        
        else if (valorSalario > 2000 && valorSalario <= 4000) {
            this.tipo = "Mínimo";
        }

        else if (valorSalario >= 10000) {
            this.tipo = "Máximo";
        }

        else if (valorSalario > 4000) {
            this.tipo = "Médio";
        }
    }
}
