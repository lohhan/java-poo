package cursoemvideo_ex;

public class Visualizacao {
    // Atributos
    private Aluno espectador;
    private Video filme;
    
    // Construtor
    public Visualizacao(Aluno aluno, Video video) {
        this.espectador = aluno;
        this.filme = video;
        this.espectador.setTotAsssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    // Getters
    public Aluno getEspectador() {
        return espectador;
    }

    public Video getFilme() {
        return filme;
    }
    
    // Demais Métodos
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porcentagem) {
        int tot = 0;

        if (porcentagem <= 20) {
            tot = 3;
        } else if (porcentagem <= 50) {
            tot = 5;
        } else if (porcentagem <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao[\nespectador = " + espectador + "\nfilme = " + filme + "\n]\n";
    }  

}
