package aula_13_simulado;

public class AppImpressora {
    public static void main(String[] args) throws ExceptionPrinterTurnedOff {

        ImpressoraJatoTinta ijt = new ImpressoraJatoTinta("Epson", 4);

        //ijt.ligaDesliga();
        try {
            System.out.println(ijt.alinharCartuchos());

        } catch (ExceptionPrinterTurnedOff erro) {
            System.out.println(erro.toString());
        }
    }
}
