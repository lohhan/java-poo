package me_unidade2;

public class QuestaoRespostaProporcional extends QuestaoObjetiva {
    // Atributos
    private int percentualA;
    private int percentualB;
    private int percentualC;
    private char itemSelecionado;

    // Construtor
    public QuestaoRespostaProporcional(String enunciado, String itemA, String itemB, String itemC, double notaPadrao,
            int percentualA, int percentualB, int percentualC) {
        super(enunciado, itemA, itemB, itemC, notaPadrao);

        if (percentualA == 25 || percentualA == 50 || percentualA == 100) {
            this.percentualA = percentualA;
        } else {
            throw new AnswerDoesNotExist("Resposta indicada não existe!!");
        }
    
        if (percentualB == 25 || percentualB == 50 || percentualB == 100) {
            this.percentualB = percentualB;
        } else {
            throw new AnswerDoesNotExist("Resposta indicada não existe!!");
        }
    
        if (percentualC == 25 || percentualC == 50 || percentualC == 100) {
            this.percentualC = percentualC;
        } else {
            throw new AnswerDoesNotExist("Resposta indicada não existe!!");
        }
    }

    // Getetrs
    public int getPercentualA() {
        return percentualA;
    }

    public int getPercentualB() {
        return percentualB;
    }

    public int getPercentualC() {
        return percentualC;
    }

    public char getItemSelecionado() {
        return itemSelecionado;
    }

    // Demais Métodos
    public void responder(char letraItem) {
        this.itemSelecionado = letraItem;
        this.avaliar();

        System.out.println("Nota obtida: " + this.notaObtida);
    }

    @Override
    public double avaliar() {
        if (this.itemSelecionado == 'A' || this.itemSelecionado == 'a') {
            return this.notaObtida += this.getNotaPadrao() * (this.percentualA/100);
        } else if (this.itemSelecionado == 'B' || this.itemSelecionado == 'b'){
            return this.notaObtida += this.getNotaPadrao() * (this.percentualB/100);
        } else if (this.itemSelecionado == 'C' || this.itemSelecionado == 'c'){
            return this.notaObtida += this.getNotaPadrao() * (this.percentualC/100);
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        if (this.percentualA == 100 && this.percentualB == 50 && this.percentualC == 25) {
            return "*** Questão de Resposta Proporcional ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
             "\nA - " + this.getItemA() + " (100%)\nB - " + this.getItemB() + " (50%)\nC - " + this.getItemC() + " (25%)\n\nNota da questão   : " + this.getNotaPadrao();
        } else if (this.percentualA == 50 && this.percentualB == 25 && this.percentualC == 100) {
            return "*** Questão de Resposta Proporcional ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
             "\nA - " + this.getItemA() + " (50%)\nB - " + this.getItemB() + " (25%)\nC - " + this.getItemC() + " (100%)\n\nNota da questão   : " + this.getNotaPadrao();
        } else if (this.percentualA == 25 && this.percentualB == 100 && this.percentualC == 50) {
            return "*** Questão de Resposta Proporcional ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
             "\nA - " + this.getItemA() + " (25%)\nB - " + this.getItemB() + " (100%)\nC - " + this.getItemC() + " (50%)\n\nNota da questão   : " + this.getNotaPadrao();
        } else {
            return null; 
        }
        
    }

}
