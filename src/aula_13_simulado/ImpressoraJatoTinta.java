package aula_13_simulado;

public class ImpressoraJatoTinta extends Impressora{
    // Atributos
    private int numCartuchos;
    private boolean cartuchosAlinhados;

    // Construtor
    public ImpressoraJatoTinta(String modelo, int numCartuchos) {
        super(modelo);
        this.numCartuchos = numCartuchos;
    }

    // Métodos
    public String alinharCartuchos() throws ExceptionPrinterTurnedOff {
        if(!this.ligada) {
            throw new ExceptionPrinterTurnedOff();
        }
        this.cartuchosAlinhados = true;
        return  "Cartuchos alinhados";

    }

    @Override
    public void ligaDesliga() {
        this.ligada = !this.ligada;
    }
}
