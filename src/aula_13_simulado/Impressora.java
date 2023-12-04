package aula_13_simulado;

public abstract class Impressora implements IEquipamento{
    // Atributos
    private static int idCount=0;
    private int id;
    private String modelo;
    protected boolean ligada;

    public Impressora(String modelo) {
        idCount++;
        this.modelo = modelo;
        this.id = idCount;
    }

}
