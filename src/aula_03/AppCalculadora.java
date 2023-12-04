package aula_03;

public class AppCalculadora {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();

        int operando1 = 9;
        int operando2 = 3;

        calc.setOperando1(operando1);
        calc.setOperando2(operando2);

        //
        System.out.println("Adição: " + calc.adicao());
        System.out.println("Subtração: " + calc.subtracao());
        System.out.println("Multiplicação:: " + calc.multiplicacao());
        System.out.println("Divisão: " + calc.divisao());


    }
}
