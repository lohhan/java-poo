package aula_06.aula_06_exame;
import java.util.Scanner;

public class AppExameGli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome do paciente: ");
        String nome = input.nextLine();

        System.out.println("Informe o código de identificação do exame: ");
        int idExame = input.nextInt();

        System.out.println("Informe o nível de glicose do paciente: ");
        double glicose = input.nextDouble();

        ExameGli gli = new ExameGli(nome, idExame, glicose);

        System.out.println("Diagnóstico do paciente: " + gli.diagnostico());

        input.close();

    }

}