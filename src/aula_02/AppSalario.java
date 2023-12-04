package aula_02;

import java.util.Scanner;
public class AppSalario {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Salario sl = new Salario();
        
        System.out.println("Digite o valor do seu salário bruto: ");
        double valorSalario = input.nextDouble();

        sl.setValorSalario(valorSalario);

        sl.percentual();
        sl.desconto();
        
        System.out.println("Seu salário líquido é: " + sl.getDescontoSalario());

        sl.tipoDesconto();

        System.out.println("O tipo de desconto do seu salário é: " + sl.getTipo());

        input.close();

    }
}
