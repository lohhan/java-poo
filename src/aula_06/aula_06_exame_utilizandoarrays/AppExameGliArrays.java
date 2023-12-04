package aula_06.aula_06_exame_utilizandoarrays;

import java.util.Scanner;

import aula_06.aula_06_exame.ExameGli;

public class AppExameGliArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ExameGli[] gliArray = new ExameGli[3];

        System.out.println();
        System.out.println("---------------------");
        System.out.println("CADASTRO DE PACIENTES");
        System.out.println("---------------------");
        System.out.println();
        

        for (int i = 0; i < gliArray.length; i++) {
            System.out.println("Informe o nome do " + (i+1) + "° paciente:" );
            String nome = input.nextLine();

            System.out.println("Informe o código de identificação do exame: ");
            int idExame = input.nextInt();

            System.out.println("Informe o nível de glicose do paciente: ");
            double glicose = input.nextDouble();

            input.nextLine();

            ExameGli gli = new ExameGli(nome, idExame, glicose);

            gliArray[i] = gli;

            System.out.println();

        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println("RESULTADOS DOS EXAMES");
        System.out.println("---------------------");
        System.out.println();

        for(int i=0; i<gliArray.length; i++){
            System.out.println("Paciente: " + gliArray[i].getNome());
            System.out.println("ID Exame: " + gliArray[i].getIdExame());
            System.out.println("Nível de Glicose: " + gliArray[i].getGlicose());
            System.out.println("Diagnóstico: " + gliArray[i].diagnostico());

            System.out.println();
        }

        input.close();

    }

}
