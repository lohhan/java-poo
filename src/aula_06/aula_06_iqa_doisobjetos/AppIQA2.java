// DOIS OBJETOS

package aula_06.aula_06_iqa_doisobjetos;

import java.util.Scanner;

import aula_06.aula_06_iqa.IQA;

public class AppIQA2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ÍNDICE ATUAL

        System.out.println("-------------");
        System.out.println("INDICE ATUAL");
        System.out.println("-------------");

        System.out.println("Digite o indice: ");
        double indice = input.nextDouble();
        IQA iqaAtual = new IQA(indice);
        System.out.println("Classificação do ar: " + iqaAtual.getClassificacao());
        System.out.println("Efeitos: " + iqaAtual.getEfeitos());

        System.out.println();

        // ÍNDICE ANTERIOR

        System.out.println();
        System.out.println("---------------");
        System.out.println("ÍNDICE ANTERIOR");
        System.out.println("---------------");

        System.out.println("Qual o índice de qualidade de ar anterior: ");
        indice = input.nextDouble();
        IQA iqaAnterior = new IQA(indice);
        System.out.println("Classificação do ar: " + iqaAnterior.getClassificacao());
        System.out.println("Efeitos: " + iqaAnterior.getEfeitos());

        System.out.println();
        if (iqaAtual.compararIndice(iqaAnterior.getIndice()) > 0){
            System.out.println("RESULTADO: A qualidade do ar piorou");
        }
        else if (iqaAtual.compararIndice(iqaAnterior.getIndice()) < 0){
            System.out.println("RESULTADO: A qualidade do ar melhorou");
        }
        else{
            System.out.println("RESULTADO: A qualidade do ar se manteve estável");
        }
        
        input.close();
    }
}
