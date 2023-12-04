package aula_07.aula_07_MinaMinerio;

public class App01_MinaMinerio {
    public static void main(String[] args) {

        Minerio minerio = new Minerio(1, "Ferro");
        Mina mina = new Mina(10, minerio);

        mina.producao(1000);
        mina.escoamento(800);
        
        System.out.println("Id mina: " + mina.getIdMina());
        System.out.println("Minério: " + mina.getMinerio().getDescricao());
        System.out.println("Estoque: " + mina.getEstoque());
    }
}
