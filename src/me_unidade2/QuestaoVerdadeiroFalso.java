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
    public QuestaoVerdadeiroFalso(String enunciado, String itemA, String itemB, String itemC, double notaPadrao) {
        super(enunciado, itemA, itemB, itemC, notaPadrao);
        
    }
    // Demais Métodos
    public void responder(char letraItem, char respostaSelecionada) {
        
    }

    @Override
    public double avaliar() {
        return 3;
    }
}