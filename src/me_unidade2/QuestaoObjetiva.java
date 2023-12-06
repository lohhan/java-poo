package me_unidade2;

public abstract class QuestaoObjetiva implements IQuestao {
    // Atributos
    private static int idCounter = 0;
    private int idQuestao;
    private String enunciado;
    private String itemA;
    private String itemB;
    private String itemC;
    private double notaPadrao;
    protected double notaObtida;

    // Construtor
    public QuestaoObjetiva(String enunciado, String itemA, String itemB, String itemC, double notaPadrao) {
        idCounter++;
        this.enunciado = enunciado;
        this.itemA = itemA;
        this.itemB = itemB;
        this.itemC = itemC;
        this.notaPadrao = notaPadrao;
        this.idQuestao = idCounter;
    }
    
    // Getters
    public int getIdQuestao() {
        return idQuestao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getItemA() {
        return itemA;
    }

    public String getItemB() {
        return itemB;
    }

    public String getItemC() {
        return itemC;
    }

    public double getNotaPadrao() {
        return notaPadrao;
    }

    public double getNotaObtida() {
        return notaObtida;
    }

    public void setNotaPadrao(double notaPadrao) {
        this.notaPadrao = notaPadrao;
    }
    
}
