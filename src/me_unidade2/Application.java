package me_unidade2;

import java.util.Scanner;

public class Application {
	static Scanner input = new Scanner(System.in);

	static QuestaoMultiplaEscolha questaoME = null;
	static QuestaoVerdadeiroFalso questaoVF = null;
  	static QuestaoRespostaProporcional questaoRP = null;


	public static void main(String[] args) {
		
		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***\n");
			System.out.println("1 - Criar questão de múltipla escolha");
			System.out.println("2 - Criar questão de verdadeiro ou falso");
			System.out.println("3 - Criar questão de resposta proporcional");
			System.out.println("4 - Responder a questão de múltipla escolha");
			System.out.println("5 - Responder a questão de verdadeiro ou falso");
			System.out.println("6 - Responder a questão de resposta proporcional");			
			System.out.println("0 - Finalizar");
			System.out.print("\nOpção: ");
			opcao = input.nextInt();
			switch (opcao) {
			case 1: 
				criarQuestaoME();
				break;
			case 2: 
				criarQuestaoVF();
				break;
			case 3: 
				criarQuestaoRP();
				break;
			case 4: 
				responderQuestaoME();
				break;
			case 5: 
				responderQuestaoVF();
				break;
			case 6: 
				responderQuestaoRP();
				break;
			case 0: 
				break;
			default:
				System.out.println("Opção inválida");
			}
			if (opcao == 0) {
				break;
			}
		} while (true);
		System.out.println("Programa finalizado");
		input.close();
	}
	
	

	public static void criarQuestaoME() {
		
		try {
			if (questaoME == null) {

			input.nextLine();
			System.out.print("Texto do Enunciado: ");
			String enunciado = input.nextLine();

			System.out.print("Insira o Item A: ");
			String itemA = input.nextLine();

			System.out.print("Insira o Item B: ");
			String itemB = input.nextLine();

			System.out.print("Insira o Item C: ");
			String itemC = input.nextLine();

			System.out.print("Insira o valor da nota padrão: ");
			double notaPadrao = input.nextDouble();

			System.out.print("Qual a alternativa correta?: ");
			char alternativaCorreta = input.next().charAt(0);
			
			System.out.println();

			questaoME = new QuestaoMultiplaEscolha(enunciado, itemA, itemB, itemC, notaPadrao, alternativaCorreta);
			System.out.println(questaoME.toString());

			} else {
				System.out.println("Questão já criada!");
			}
		} catch (AnswerDoesNotExist e) {
			System.out.println(e.getMessage());
		}
		
        
	}
	
	public static void criarQuestaoVF() {
	
		try {
			if (questaoVF == null) {

			input.nextLine();
			System.out.print("Texto do Enunciado: ");
			String enunciado = input.nextLine();

			System.out.print("Insira o Item A: ");
			String itemA = input.nextLine();

			System.out.print("Valor correto do item A: ");
			char alternativaCorretaA = input.next().charAt(0);

			input.nextLine();
			System.out.print("Insira o Item B: ");
			String itemB = input.nextLine();

			System.out.print("Valor correto do item B: ");
			char alternativaCorretaB = input.next().charAt(0);

			input.nextLine();
			System.out.print("Insira o Item C: ");
			String itemC = input.nextLine();
			
			System.out.print("Valor correto do item C: ");
			char alternativaCorretaC = input.next().charAt(0);

			System.out.print("Insira o valor da nota padrão: ");
			double notaPadrao = input.nextDouble();
			
			System.out.println();

			questaoVF = new QuestaoVerdadeiroFalso(enunciado, itemA, itemB, itemC, notaPadrao, alternativaCorretaA, alternativaCorretaB, alternativaCorretaC);
			System.out.println(questaoVF.toString());

			} else {
				System.out.println("Questão já criada!");
			}
		} catch (AnswerDoesNotExist e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	public static void criarQuestaoRP() {
	
		try {
			if (questaoRP == null) {

			input.nextLine();
			System.out.print("Texto do Enunciado: ");
			String enunciado = input.nextLine();

			System.out.print("Insira o Item A: ");
			String itemA = input.nextLine();

			System.out.print("Percentual do item A: ");
			int percentualA = input.nextInt();

			input.nextLine();
			System.out.print("Insira o Item B: ");
			String itemB = input.nextLine();

			System.out.print("Valor correto do item B: ");
			int percentualB = input.nextInt();

			input.nextLine();
			System.out.print("Insira o Item C: ");
			String itemC = input.nextLine();
			
			System.out.print("Valor correto do item C: ");
			int percentualC = input.nextInt();

			System.out.print("\nInsira o valor da nota padrão: ");
			double notaPadrao = input.nextDouble();
			
			System.out.println();

			questaoRP = new QuestaoRespostaProporcional(enunciado, itemA, itemB, itemC, notaPadrao, percentualA, percentualB, percentualC);
			System.out.println(questaoRP.toString());

			} else {
				System.out.println("Questão já criada!");
			}
		} catch (AnswerDoesNotExist e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void responderQuestaoME() {
	
		if (questaoME != null) {
			System.out.println("Escolha uma alternativa para responder a questão: ");
			char letraItem = input.next().charAt(0);
			questaoME.responder(letraItem);
		} else {
			System.out.println("Questão não criada!!");
		}
		
		
	}	

	public static void responderQuestaoVF() {

		if (questaoVF != null) {
			System.out.print("Alternativa A (V ou F): ");
			char respostaSelecionada = input.next().charAt(0);
			questaoVF.responder('A', respostaSelecionada);

			System.out.print("Alternativa B (V ou F): ");
			respostaSelecionada = input.next().charAt(0);
			questaoVF.responder('B', respostaSelecionada);

			System.out.print("Alternativa C (V ou F): ");
			respostaSelecionada = input.next().charAt(0);
			questaoVF.responder('C', respostaSelecionada);
		} else {
			System.out.println("Questão não criada!!");
		}

			
		
	}	

	public static void responderQuestaoRP() {

		if (questaoRP != null) {
			System.out.println("Escolha uma alternativa para responder a questão: ");
			char letraItem = input.next().charAt(0);
			questaoRP.responder(letraItem);
		} else {
			System.out.println("Questão não criada!!");
		}

	}	
	
}