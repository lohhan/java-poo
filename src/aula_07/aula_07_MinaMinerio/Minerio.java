package aula_07.aula_07_MinaMinerio;

public class Minerio {
    private int idMinerio;
    private String descricao;

    public Minerio(int idMineiro, String descricao) {
        this.idMinerio = idMineiro;
        this.descricao = descricao;
    }

    // GET
    public int getIdMinerio() {
        return idMinerio;
    }

    public String getDescricao() {
        return descricao;
    }

    // SET
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
