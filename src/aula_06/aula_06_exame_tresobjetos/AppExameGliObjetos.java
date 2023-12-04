package aula_06.aula_06_exame_tresobjetos;

import java.util.Scanner;

import aula_06.aula_06_exame.ExameGli;

public class AppExameGliObjetos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("-----------");
        System.out.println("PACIENTE 1");
        System.out.println("-----------");

        System.out.println("Informe o nome do paciente: ");
        String nome = input.nextLine();

        System.out.println("Informe o código de identificação do exame: ");
        int idExame = input.nextInt();

        System.out.println("Informe o nível de glicose do paciente: ");
        double glicose = input.nextDouble();

        ExameGli pac1 = new ExameGli(nome, idExame, glicose);

        System.out.println("Diagnóstico do paciente: " + pac1.diagnostico());


        System.out.println();
        System.out.println("-----------");
        System.out.println("PACIENTE 2");
        System.out.println("-----------");

        System.out.println("Informe o nome do paciente: ");
        nome = input.nextLine();
        input.nextLine();

        System.out.println("Informe o código de identificação do exame: ");
        idExame = input.nextInt();

        System.out.println("Informe o nível de glicose do paciente: ");
        glicose = input.nextDouble();

        ExameGli pac2 = new ExameGli(nome, idExame, glicose);

        System.out.println("Diagnóstico do paciente: " + pac2.diagnostico());

        System.out.println();
        System.out.println("-----------");
        System.out.println("PACIENTE 3");
        System.out.println("-----------");

        System.out.println("Informe o nome do paciente: ");
        nome = input.nextLine();
        input.nextLine();

        System.out.println("Informe o código de identificação do exame: ");
        idExame = input.nextInt();

        System.out.println("Informe o nível de glicose do paciente: ");
        glicose = input.nextDouble();

        ExameGli pac3 = new ExameGli(nome, idExame, glicose);

        System.out.println("Diagnóstico do paciente: " + pac3.diagnostico());


        input.close();

    }

}