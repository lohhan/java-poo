package aula_04;

import java.util.Scanner;
public class AppProduto {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Produto pt = new Produto();

        int qtdProduzida;
        int qtdSaida;


        System.out.println("Informe o código do produto: ");
        pt.codigo = input.nextInt();

        System.out.println("Informe a descrição do produto: ");
        pt.descricao = input.nextLine();
        input.nextLine();
        
        System.out.println("Informe o preço do produto: ");
        pt.preco = input.nextDouble();

        for (int i=0; i<2; i++){
            System.out.println("Informe a quantidade produzida desse produto: ");
            qtdProduzida = input.nextInt();
            pt.registraProducao(qtdProduzida);
            System.out.println("Estoque: " + pt.estoque);
        }

        for (int i=0; i<2; i++) {
            System.out.println("Informe a quantidade de produtos que sairam do estoque: ");
            qtdSaida = input.nextInt();
            if (pt.registraSaida(qtdSaida)==false){
                System.out.println("Estoque insuficiente!");
            }
            System.out.println("Estoque: " + pt.estoque);
        }

        input.close();
    }
}
