package aula_05;

import java.util.Scanner;
public class AppIQA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IndiceQualidadeAr iqa = new IndiceQualidadeAr(50);
        
        double indiceAnterior;

        System.out.println("-------------------");
        System.out.println("INÍCIO DO PROGRAMA");
        System.out.println("-------------------");

        System.out.println("Índice: " + iqa.getIndice());
        System.out.println("Classificação do ar: " + iqa.getClassificacao());
        System.out.println("Efeitos: " + iqa.getEfeitos());

        System.out.println();

        // ÍNDICE ATUAL

        System.out.println("---------------");
        System.out.println("ÍNDICE ATUAL");
        System.out.println("---------------");
        

        System.out.println("Qual o índice de qualidade de ar na sua região?: ");
        double indice = input.nextDouble();

        iqa.setIndice(indice);

        iqa.defineClassificacao();
        System.out.println("Classificação do ar: " + iqa.getClassificacao());

        iqa.defineEfeitos();
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
