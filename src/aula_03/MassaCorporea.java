package aula_03;

public class MassaCorporea {

    double peso;
    double altura;
    double imc;
    String situacao;

    public void calcularImc() {
        imc = (peso / (altura * altura));
    }

    public void definirSituacao() {
        if (imc < 17) {
            situacao = "Muito abaixo do peso";
        } else if (imc < 18.5) {
            situacao = "Abaixo do peso";
        } else if (imc < 25) {
            situacao = "Peso normal";
        } else if (imc < 30) {
            situacao = "Acima do peso";
        } else if (imc < 35) {
            situacao = "Obesidade grau 1";
        } else if (imc <= 40) {
            situacao = "Obesidade grau 2";
        } else {
            situacao = "Obesidade grau 3";
        }
    }
}
