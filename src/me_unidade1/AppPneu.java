package me_unidade1;

import java.util.Scanner;

public class AppPneu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horaInicial, horaFinal;

        Pneu pneu = new Pneu(45, "BMW", 110, 'N', 0);

        System.out.println("ID Pneu: " + pneu.getIdPneu());
        System.out.println("Modelo: " + pneu.getModelo());
        System.out.println("Índice de vida: " + pneu.getIndiceDeVida());
        System.out.println("Estado: " + pneu.getEstado());
        System.out.println("Horas de uso: " + pneu.getHorasDeUso());

        if (pneu.getEstado() == 'N' || pneu.getEstado() == 'U') {
            do {
                System.out.println("Registrar hora inicial do uso: ");
                horaInicial = input.nextInt();
                System.out.println("Registrar hora final do uso: ");
                horaFinal = input.nextInt();

                pneu.desgastar(horaInicial, horaFinal);

                System.out.printf("Índice de vida: %.2f\n", pneu.getIndiceDeVida());
                System.out.println("Horas de uso: " + pneu.getHorasDeUso());
                System.out.println("Estado: " + pneu.getEstado());

            } while (pneu.getEstado() != 'F');

            System.out.println("Pneu fora de uso");
        } 
        else {
            System.out.println("Pneu fora de uso");
        }

        input.close();
    }

}