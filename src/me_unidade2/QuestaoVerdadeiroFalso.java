package me_unidade2;

public class QuestaoVerdadeiroFalso extends QuestaoObjetiva {
    
    // Atributos
    private char itemCorretoA;
    private char itemCorretoB;
    private char itemCorretoC;
    private char itemSelecionadoA;
    private char itemSelecionadoB;
    private char itemSelecionadoC;
    
    // Construtor
    public QuestaoVerdadeiroFalso(String enunciado, String itemA, String itemB, String itemC, double notaPadrao,
            char itemCorretoA, char itemCorretoB, char itemCorretoC) {
        super(enunciado, itemA, itemB, itemC, notaPadrao);

        if (itemCorretoA == 'V' || itemCorretoA == 'F') {
            this.itemCorretoA = itemCorretoA;
        } else {
            throw new AnswerDoesNotExist("Resposta indicada não existe!!");
        }
    
        if (itemCorretoB == 'V' || itemCorretoB == 'F') {
            this.itemCorretoB = itemCorretoB;
        } else {
            throw new AnswerDoesNotExist("Resposta indicada não existe!!");
        }
    
        if (itemCorretoC == 'V' || itemCorretoC == 'F') {
            this.itemCorretoC = itemCorretoC;
        } else {
            throw new AnswerDoesNotExist("Resposta indicada não existe!!");
        }
        
    }

    // Getters
    public char getItemCorretoA() {
        return itemCorretoA;
    }

    public char getItemCorretoB() {
        return itemCorretoB;
    }

    public char getItemCorretoC() {
        return itemCorretoC;
    }

    public char getItemSelecionadoA() {
        return itemSelecionadoA;
    }

    public char getItemSelecionadoB() {
        return itemSelecionadoB;
    }

    public char getItemSelecionadoC() {
        return itemSelecionadoC;
    }
    
    // Demais Métodos
    public void responder(char letraItem, char respostaSelecionada) {
        if (letraItem == 'A') {
            this.itemSelecionadoA = respostaSelecionada;
            if (this.itemSelecionadoA == this.itemCorretoA) {
                this.avaliar();
            }
        } else if (letraItem == 'B') {
            this.itemSelecionadoB = respostaSelecionada;
            if (this.itemSelecionadoB == this.itemCorretoB) {
                this.avaliar();
            }
        } else if (letraItem == 'C') {
            this.itemSelecionadoC = respostaSelecionada;
            if (this.itemSelecionadoC == this.itemCorretoC) {
                this.avaliar();
            }
        }
        System.out.printf("Nota obtida: %.2f\n", (float)this.notaObtida);
    }

    @Override
    public double avaliar() {
        return this.notaObtida += this.getNotaPadrao()/3;
    }

    @Override
    public String toString() {
        if ((this.itemCorretoA == 'V') && (this.itemCorretoB == 'V') && (this.itemCorretoC == 'V')) {
            return "*** Questão Verdadeiro ou Falso ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
            "\nA - " + this.getItemA() + " (V)\nB - " + this.getItemB() + " (V)\nC - " + this.getItemC() + " (V)\n\nNota da questão   : " + this.getNotaPadrao();
        } else if ((this.itemCorretoA == 'V') && (this.itemCorretoB == 'V') && (this.itemCorretoC == 'F')) {
             return "*** Questão Verdadeiro ou Falso ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
            "\nA - " + this.getItemA() + " (V)\nB - " + this.getItemB() + " (V)\nC - " + this.getItemC() + " (F)\n\nNota da questão   : " + this.getNotaPadrao();
        } else if ((this.itemCorretoA == 'V') && (this.itemCorretoB == 'F') && (this.itemCorretoC == 'V')) {
             return "*** Questão Verdadeiro ou Falso ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
            "\nA - " + this.getItemA() + " (V)\nB - " + this.getItemB() + " (F)\nC - " + this.getItemC() + " (V)\n\nNota da questão   : " + this.getNotaPadrao();
        } else if ((this.itemCorretoA == 'V') && (this.itemCorretoB == 'F') && (this.itemCorretoC == 'F')) {
             return "*** Questão Verdadeiro ou Falso ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
            "\nA - " + this.getItemA() + " (V)\nB - " + this.getItemB() + " (F)\nC - " + this.getItemC() + " (F)\n\nNota da questão   : " + this.getNotaPadrao();
        } else if ((this.itemCorretoA == 'F') && (this.itemCorretoB == 'V') && (this.itemCorretoC == 'F')) {
             return "*** Questão Verdadeiro ou Falso ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
            "\nA - " + this.getItemA() + " (F)\nB - " + this.getItemB() + " (V)\nC - " + this.getItemC() + " (F)\n\nNota da questão   : " + this.getNotaPadrao();
        } else if ((this.itemCorretoA == 'F') && (this.itemCorretoB == 'F') && (this.itemCorretoC == 'V')) {
             return "*** Questão Verdadeiro ou Falso ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
            "\nA - " + this.getItemA() + " (F)\nB - " + this.getItemB() + " (F)\nC - " + this.getItemC() + " (V)\n\nNota da questão   : " + this.getNotaPadrao();
        } else if ((this.itemCorretoA == 'F') && (this.itemCorretoB == 'F') && (this.itemCorretoC == 'F')) {
             return "*** Questão Verdadeiro ou Falso ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
            "\nA - " + this.getItemA() + " (F)\nB - " + this.getItemB() + " (F)\nC - " + this.getItemC() + " (F)\n\nNota da questão   : " + this.getNotaPadrao();
        } else if ((this.itemCorretoA == 'F') && (this.itemCorretoB == 'V') && (this.itemCorretoC == 'V')) {
             return "*** Questão Verdadeiro ou Falso ***\n\nNúmero   : " + this.getIdQuestao() + "\n\nEnunciado   : " + this.getEnunciado() + 
            "\nA - " + this.getItemA() + " (F)\nB - " + this.getItemB() + " (V)\nC - " + this.getItemC() + " (V)\n\nNota da questão   : " + this.getNotaPadrao();
        } else {
            return null;
        }

    }

    

}