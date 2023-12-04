package aula_12.composicao;

public class AppBanca {
    public static void main(String[] args) {
        Revista revista = new Revista(1000, "Veja");
        revista.adicionaEdicao(52, 1000);
        revista.adicionaEdicao(53, 900);
        revista.adicionaEdicao(54, 1200);    

        for (Edicao edicao : revista.getListaEdicoes()) {
            if (edicao.getNumero() == 52) {
                edicao.informaVenda(800);
            } else if (edicao.getNumero() == 53) {
                edicao.informaVenda(900);
            } else if (edicao.getNumero() == 54) {
                edicao.informaVenda(1000);
            }
        }

        revista.removeEdicao(53);

        for (Edicao edicao : revista.getListaEdicoes()) {
            System.out.println(edicao);
        }
    }
}
