package aula_08_simulado;

public class AppElevador {
    public static void main(String[] args) {
        int pesoPessoa = 60;
        Elevador elevador = new Elevador(3, 8, 1, 600, 530, false);

        System.out.println("Bloqueio: "+ elevador.getBloqueio());
        System.out.println("A pessoa entrou?: "+ elevador.registrarPessoa(pesoPessoa));
        System.out.println("Novo bloqueio: "+ elevador.getBloqueio());
    }

}
