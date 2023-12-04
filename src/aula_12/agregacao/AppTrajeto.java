package aula_12.agregacao;

public class AppTrajeto {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("RDA3L457", 1350);
        Viagem viagem = new Viagem("Alabama", null, null, veiculo);

        System.out.println(veiculo);
        viagem.iniciarViagem(veiculo);

        System.out.println();

        viagem.finalizarViagem(1650);
        System.out.println(viagem);

        System.out.println();

        System.out.println(veiculo);

        System.out.println();

        veiculo.revisar();

        System.out.println();
        
        System.out.println(veiculo);
    }
}
