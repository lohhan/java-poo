package me_unidade1;
import java.util.Scanner;
public class AppTermostato{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha, desejo=0, count=0;

        Termostato term = new Termostato(0, false);


        do{
            ++count;
            System.out.println("AÇÃO "+ count);
            System.out.print("O que você deseja fazer? \n\n[1] Ligar Termostato\n[2] Desligar Termostato\n[3] Aumentar Temperatura\n[4] Diminuir Temperatura\n[5] Mostrar Temperatura\n:");
            escolha = input.nextInt();
    
            switch(escolha){
                case 1:
                    if(term.getEstado()==true){
                        System.out.print("Termostato já está ligado!");
                        System.out.println();
                    }
                    else{
                        term.ligarTermostato();
                        break;
                    }

                case 2:
                    if(term.getEstado()==false){
                        System.out.print("Termostato já está desligado!");
                        System.out.println();
                    }
                    else{
                        term.desligarTermostato();
                        break;
                    }

                case 3:
                    term.aumentarTemperatura();
                    break;

                case 4:
                    term.diminuirTemperatura();
                    break;
                
                case 5:
                    if(term.getEstado()==false){
                        System.out.println("O termostato está desligado!");
                        System.out.println();
                    }
                    else{
                        System.out.println("Temperatura atual: " + term.getTemperatura());
                        break;
                    }
            }

            System.out.println();

            System.out.print("Você deseja continuar?: [1] Sim - [2] Não\n:");
            desejo = input.nextInt();

            System.out.println();

        } while(desejo == 1);

        input.close();
    }
}
