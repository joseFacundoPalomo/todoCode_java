package plantas;

public class Flor extends Planta{
   String colorPetalos;
   int cantPetalos;
   String colorPistillo;
   String estacion;

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy una Flor");
    }
}
