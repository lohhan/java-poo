package cursoemvideo_ex;

public class Video implements AcoesVideo {
    // Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    // Construtor   
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public int getViews() {
        return views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao) / views;

        this.avaliacao = nova;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    // Demais Métodos
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video [titulo = " + titulo + ", avaliacao = " + avaliacao + ", views = " 
        + views + ", curtidas = " + curtidas + ", reproduzindo = " + reproduzindo + "]";
    }

}