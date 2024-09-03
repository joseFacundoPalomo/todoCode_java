package plantas;

public class Arbusto extends Planta {
    double anchoArbusto;
    boolean esDomestico;
    String arbusto;
    String colorHojas;
    boolean sePodaONo;

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy un Arbusto");
    }
}
