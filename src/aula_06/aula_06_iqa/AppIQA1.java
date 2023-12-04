// METODO CONSTRUTOR

package aula_06.aula_06_iqa;

import java.util.Scanner;
public class AppIQA1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double indiceAnterior;

        // ÍNDICE ATUAL

        System.out.println("-------------------");
        System.out.println("INDICE ATUAL");
        System.out.println("-------------------");

        System.out.println("Digite o indice: ");
        double indice = input.nextDouble();
        IQA iqa = new IQA(indice);
        System.out.println("Classificação do ar: " + iqa.getClassificacao());
        System.out.println("Efeitos: " + iqa.getEfeitos());

        System.out.println();

        // ÍNDICE ANTERIOR

        System.out.println();
        System.out.println("---------------");
        System.out.println("ÍNDICE ANTERIOR");
        System.out.println("---------------");

        System.out.println("Qual o índice de qualidade de ar anterior: ");
        indiceAnterior = input.nextDouble();

        if (iqa.compararIndice(indiceAnterior) > 0){
            System.out.println("A qualidade do ar piorou");
        }
        else if (iqa.compararIndice(indiceAnterior) < 0){
            System.out.println("A qualidade do ar melhorou");
        }
        else{
            System.out.println("A qualidade do ar se manteve estável");
        }
        
        input.close();
    }
}
