package aula_07.aula_07_livraria;

public class Editora {
    private int idEditora; 
    private String razaoSocial;
    private String contato;
    private String cidade;
    private String uf;

    public Editora(int idEditora, String razaoSocial, String contato, String cidade, String uf){
        this.idEditora = idEditora;
        this.razaoSocial = razaoSocial;
        this.contato = contato;
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getIdEditora(){
        return idEditora;
    }

    public String getContato(){
        return contato;
    }

    public String getRazaoSocial(){
        return razaoSocial;
    }

    public String getCidade(){
        return cidade;
    }

    public String getUf(){
        return uf;
    }

}
