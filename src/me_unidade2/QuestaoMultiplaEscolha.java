package me_unidade2;

public class QuestaoMultiplaEscolha extends QuestaoObjetiva {
    // Atributos
    private char itemCorreto;
    private char itemSelecionado;

    // Construtor
    public QuestaoMultiplaEscolha(String enunciado, String itemA, String itemB, String itemC, double notaPadrao,
            char itemCorreto) {

        super(enunciado, itemA, itemB, itemC, notaPadrao);
        if (itemCorreto == 'A' || itemCorreto == 'B' || itemCorreto == 'C') {
            this.itemCorreto = itemCorreto;
        } else {
            throw new AnswerDoesNotExist("Resposta indicada não existe!!");
        }
        
    }

    // Demais Métodos
    public void responder(char letraItem) {
        this.itemSelecionado = letraItem;
        this.avaliar();

        if (this.avaliar() > 0) {
            System.out.println("Resposta correta!!");
        } else {
            System.out.println("Resposta incorreta!!");
        }
    }
    
    @Override
    public double avaliar() {
        if (this.itemSelecionado == this.itemCorreto) {
            return this.notaObtida += this.getNotaPadrao(); 
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        if (this.itemCorreto == 'A') {
            return "*** Questão de Múltipla Escolha ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
             "\nA - " + this.getItemA() + " (Correta)\nB - " + this.getItemB() + "\nC - " + this.getItemC() + "\n\nNota da questão   : " + this.getNotaPadrao();
        } else if (this.itemCorreto == 'B') {
            return "*** Questão de Múltipla Escolha ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
             "\nA - " + this.getItemA() + "\nB - " + this.getItemB() + " (Correta)\nC - " + this.getItemC() + "\n\nNota da questão   : " + this.getNotaPadrao();
        } else if (this.itemCorreto == 'C') {
            return "*** Questão de Múltipla Escolha ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
             "\nA - " + this.getItemA() + "\nB - " + this.getItemB() + ")\nC - " + this.getItemC() + " (Correta)\n\nNota da questão   : " + this.getNotaPadrao();
        } else {
            return null;
        }
        
    }
    
}
