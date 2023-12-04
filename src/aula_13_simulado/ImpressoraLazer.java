package aula_13_simulado;

public class ImpressoraLazer extends Impressora{
    // Atributos
    private char tipo;
    private int temperatura;

    // Construtor

    public ImpressoraLazer(String modelo, char tipo) {
        super(modelo);
        this.tipo = tipo;
    }

    // Métodos
    public void ajustarTemperatura(int temp) {
        this.temperatura = temp;
    }

    @Override
    public void ligaDesliga() {
        this.ligada = !this.ligada;
        if (this.ligada) {
            this.ajustarTemperatura(30);
        } else {
            this.ajustarTemperatura(0);
        }
    }
}
