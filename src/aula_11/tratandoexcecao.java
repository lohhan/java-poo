package aula_11;
import java.util.Scanner;

public class tratandoexcecao {

    public static final String SENHASECRETA = "123456";
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            try {
                System.out.println("Digite a senha: ");
                String senha = input.nextLine();
                if (!senha.equals(SENHASECRETA)) {
                    throw new Exception("Senha invalida.");
                } 
                
                System.out.println("Senha correta! Bem vindo!");
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
