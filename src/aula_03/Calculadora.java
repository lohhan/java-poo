package aula_03;

public class Calculadora {
    
    private int operando1;
    private int operando2;

    // GET

    // SET
    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }

    // DEMAIS MÉTODOS 
    public int adicao() {
        return operando1 + operando2;
    }

    public int subtracao() {
        return operando1 - operando2;
    }

    public int multiplicacao() {
        return operando1 * operando2;
    }

    public int divisao() {
        return operando1/operando2;
    }
}
