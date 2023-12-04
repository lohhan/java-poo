package aula_13_simulado;

public class ExceptionPrinterTurnedOff extends Exception{

    @Override
    public String toString() {
        return "Impressora desligada.";
    }
}
