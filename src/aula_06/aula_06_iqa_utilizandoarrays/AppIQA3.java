// ARRAYS

package aula_06.aula_06_iqa_utilizandoarrays;

import java.util.Scanner;

import aula_06.aula_06_iqa.IQA;

public class AppIQA3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IQA[] iqaArray = new IQA[3];

		for(int i=0; i<iqaArray.length; i++){
			System.out.println("Informe o valor do índice equivalente ao " + (i+1) + "° dia: ");
			double indice = input.nextDouble();
			IQA iqa = new IQA(indice);
			iqaArray[i] = iqa;
		}

		System.out.println();
		System.out.println("////");
		System.out.println();
		
		for(int i=0; i<iqaArray.length; i++){
			System.out.println("Índice: " + iqaArray[i].getIndice());
			System.out.println("Classificação: " + iqaArray[i].getClassificacao());
			System.out.println("Efeitos: " + iqaArray[i].getEfeitos());
			if(i>0){
				double diferenca = iqaArray[i].compararIndice((iqaArray[i-1].getIndice()));
				if(diferenca>0){
					System.out.println("Em comparação ao dia anterior: A qualidade do ar piorou.");
				}
				else if(diferenca<0){
					System.out.println("Em comparação ao dia anterior: A qualidade do ar melhorou.");
				}
				else{
					System.out.println("Em comparação ao dia anterior: A qualidade do ar se mantém estável.");
				}
			}
			System.out.println();

		}

        input.close();
    }
}
