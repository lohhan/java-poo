package aula_09.caminhao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppCaminhao {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int escolha, qtdeLitros;
            double qtdeQuilos;

            List<CaminhaoBau> cbauLista = new ArrayList<CaminhaoBau>();
            List<CaminhaoTanque> ctanqLista = new ArrayList<CaminhaoTanque>();

            System.out.println("--------------------------");
            System.out.println("ARMAZENAMENTO DE CAMINHÕES");
            System.out.println("--------------------------");

            do {

                System.out.println("Escolha uma opção\n[1] Caminhão Baú\n[2] Caminhão Tanque\n[3] Encerrar\n:");
                escolha = input.nextInt();

                if (escolha < 1 || escolha > 3) {
                    do {
                        System.out.println("Escolha inválida! Digite novamente: ");
                        escolha = input.nextInt();
                    } while (escolha < 1 || escolha > 3);
                } 

                else if (escolha == 1) {
                    System.out.println("-------------");
                    System.out.println("CAMINHÃO BAÚ");
                    System.out.println("-------------");

                    System.out.println("Informe o número de identificação do caminhão: ");
                    int nrCaminhao = input.nextInt();

                    input.nextLine();
                    System.out.println("Informe o modelo do caminhão: ");
                    String modelo = input.nextLine();

                    System.out.println("Informe o ano de fabricação do caminhão: ");
                    int anoFabricacao = input.nextInt();

                    System.out.println("Informe a capacidade total do caminhão: (em T)");
                    int capacidadeTotal = input.nextInt();

                    System.out.println("Informe o comprimento do caminhão: ");
                    double comprimento = input.nextDouble();    

                    System.out.println("Informe a largura do caminhão: ");
                    double largura = input.nextDouble();

                    System.out.println("Informe a altura do caminhão: ");
                    double altura = input.nextDouble();

                    CaminhaoBau cbau = new CaminhaoBau(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, 'T', comprimento, largura, altura);
                    cbauLista.add(cbau);

                    do {
                        System.out.println();
                        System.out.println("----- Painel de Controle ----\nO que você deseja fazer?\n[1] Carregar o baú\n[2] Descarregar o baú\n[3] Calcular volume\n[4] Sair: ");
                        escolha = input.nextInt();
                        switch(escolha){
                            case 1:
                                System.out.println("Qual o peso da carga a ser carregada? (em kg): ");
                                qtdeQuilos = input.nextDouble();
                                cbau.carregaBau(qtdeQuilos);
                                break;
                            case 2:
                                System.out.println("Qual o peso da carga a ser descarregada? (em kg): ");
                                qtdeQuilos = input.nextDouble();
                                cbau.descarregaBau(qtdeQuilos);
                                break;
                            case 3:
                                cbau.calculaVolume();
                                System.out.println("Volume do caminhão: " + cbau.getVolume());
                                break;
                            case 4:
                                System.out.println("Encerrando...");
                                break;
                        }
   
                        System.out.println();

                    } while(escolha!=4);
                } 

                else if(escolha == 2){
                    System.out.println("---------------");
                    System.out.println("CAMINHÃO TANQUE");
                    System.out.println("---------------");

                    System.out.println("Informe o número de identificação do caminhão: ");
                    int nrCaminhao = input.nextInt();

                    System.out.println("Informe o modelo do caminhão: ");
                    String modelo = input.nextLine();
                    input.nextLine();

                    System.out.println("Informe o ano de fabricação do caminhão: ");
                    int anoFabricacao = input.nextInt();

                    System.out.println("Informe a capacidade total do caminhão: (em L): ");
                    int capacidadeTotal = input.nextInt();

                    input.nextLine();
                    System.out.println("Informe o tipo do caminhão: ");
                    String tipo = input.nextLine();

                    CaminhaoTanque ctanq = new CaminhaoTanque(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, 'L', tipo);
                    ctanqLista.add(ctanq);

                    do {
                        System.out.println();
                        System.out.println("----- Painel de Controle ----\nO que você deseja fazer?\n[1] Encher o tanque\n[2] Esvaziar o tanque\n[3] Abastecer o tanque\n[4] Descarregar o tanque\n[5] Sair: ");
                        escolha = input.nextInt();
                        switch(escolha){
                            case 1:
                                ctanq.encheTanque();
                                break;
                            case 2:
                                ctanq.esvaziaTanque();
                                break;
                            case 3:
                                System.out.println("Pretende-se abastecer o tanque com quantos litros?: ");
                                qtdeLitros = input.nextInt();
                                ctanq.abasteceTanque(qtdeLitros);
                                break;
                            case 4:
                                System.out.println("Pretende-se descarregar o tanque com quantos litros?: ");
                                qtdeLitros = input.nextInt();
                                ctanq.descarregaTanque(qtdeLitros);
                                break;
                            case 5:
                                System.out.println("Encerrando...");
                                break;
                        }
   
                        System.out.println();

                    } while(escolha!=5);
                }
                
                else {

                    System.out.println("CAMINNHÃO BAÚ: ");
                    for ( CaminhaoBau elemento :  cbauLista ) {
                        System.out.println("\n==============================================================");
            	        System.out.printf("\nNrCaminhão: %d\nModelo: %s\nAno de Fabricação: %d\nCapacidade Total: %d\nUnidade: %c\nComprimento: %.1f\nLargura: %.1f\nAltura: %.1f", elemento.getNrCaminhao(), 
                                                                                                                                                                    elemento.getModelo(),
                                                                                                                                                                    elemento.getAnoFabricacao(),
            										                                                                                                                elemento.getCapacidadeTotal(),
                                                                                                                                                                    elemento.getUnidade(),
                                                                                                                                                                    elemento.getComprimento(),
                                                                                                                                                                    elemento.getLargura(),
                                                                                                                                                                    elemento.getAltura());
                    }

                    System.out.println();

                    System.out.println("CAMINHÃO TANQUE");
                    for ( CaminhaoTanque elemento : ctanqLista ) {
                        System.out.println("\n==============================================================");
            	        System.out.printf("\nNrCaminhão: %d\nModelo: %s\nAno de Fabricação: %d\nCapacidade Total: %d\nUnidade: %c\nTipo: %s", elemento.getNrCaminhao(), 
                                                                                                                                                                    elemento.getModelo(),
            										                                                                                                                elemento.getCapacidadeTotal(),
                                                                                                                                                                    elemento.getAnoFabricacao(),
                                                                                                                                                                    elemento.getCapacidadeTotal(),
                                                                                                                                                                    elemento.getUnidade(),
                                                                                                                                                                    elemento.getTipo());
                    }
                }

            } while (true);
        }

    }
}
