package exception.Financiamento;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        try {
            Financiamento f = new Financiamento(1000, 300, 6);
            System.out.printf("Valor das prestações: %.2f.", f.prestacao());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
