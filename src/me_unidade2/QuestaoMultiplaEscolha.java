package me_unidade2;

public class QuestaoMultiplaEscolha extends QuestaoObjetiva{
    // Atributos
    private char itemCorreto;
    private char itemSelecionado;

    // Construtor
    public QuestaoMultiplaEscolha(String enunciado, String itemA, String itemB, String itemC, double notaPadrao,
            char itemCorreto) {
        super(enunciado, itemA, itemB, itemC, notaPadrao);
        
    }

    // Demais Métodos
    public void responder(char letraItem) {
        if (this.itemCorreto == letraItem) {
            this.notaObtida += 1;
        }
    }
    
    @Override
    public double avaliar() {
        return 3;
    }

    @Override
    public String toString() {
        return "*** Questão de Múltipla Escolha ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
        "\nA - " + this.getItemA() + "\nB - " + this.getItemB() + "\nC - " + this.getItemC() + "\n\nNota da questão   : " + this.getNotaPadrao();
    }

    
    
}
