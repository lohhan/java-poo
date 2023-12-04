package aula_04;

public class Produto {
    
    int codigo;
    String descricao;
    double preco;
    int estoque=0;

    void registraProducao(int qtdProduzida) {
        estoque += qtdProduzida; 
    }

    boolean registraSaida(int qtdSaida) {
        if(estoque>qtdSaida) {
            estoque -= qtdSaida;
            return true;
        }
        else {
            return false;
        }
    }



}
