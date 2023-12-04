package aula_10;

import java.util.Scanner;
public class AppConsumo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Consumo[] consArray = new Consumo[4];

        System.out.println("---------------------");
        System.out.println("CONTA DO RESTAURANTE");
        System.out.println("---------------------");
        System.out.println();

        for(int i=0; i<consArray.length; i++) {
            System.out.println("Tipo de Cliente\n[A] Associado\n[F] Funcionário\n[P] Público\n: ");
            char tipoCliente = input.next().charAt(0);
            if(tipoCliente != 'A' && tipoCliente != 'F' && tipoCliente != 'P'){
                do{
                    System.out.println("Tipo Inválido! Digite novamente: ");
                    tipoCliente = input.next().charAt(0);
                }while(tipoCliente != 'A' && tipoCliente != 'F' && tipoCliente != 'P');
            }
    
            System.out.println("Tipo de Consumo\n[P] no Peso\n[C] a la Carte\n: ");
            char tipoConsumo = input.next().charAt(0);
            if(tipoConsumo != 'P' && tipoConsumo != 'C'){
                do{
                    System.out.println("Tipo Inválido! Digite novamente: ");
                    tipoConsumo = input.next().charAt(0);
                }while(tipoConsumo != 'P' && tipoConsumo != 'C');
            }
    
            System.out.println("Insira o valor do consumo: ");
            double valorConsumo = input.nextDouble();
            if(valorConsumo<=0) {
                do{
                    System.out.println("Valor Inválido! Digite novamente: ");
                    valorConsumo = input.nextDouble();
                }while(valorConsumo<=0);
            }
    
            Consumo consumo = new Consumo(tipoConsumo, tipoCliente, valorConsumo);
            consArray[i] = consumo;
        }
        
        for(int i=0; i<consArray.length; i++) {
            System.out.println(consArray[i]);
        }
        input.close();
    }
}
