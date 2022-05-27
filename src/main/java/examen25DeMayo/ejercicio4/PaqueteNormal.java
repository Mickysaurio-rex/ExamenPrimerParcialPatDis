package examen25DeMayo.ejercicio4;

public class PaqueteNormal extends BuilderPaquetes{
    @Override
    public void buildPipocas() {
        this.paquetes.setPipocas("Pipocas normales");
    }

    @Override
    public void buildVasoGaseosa() {
        this.paquetes.setVasoRefresco("1 vaso");
    }

    @Override
    public void buildChocolates() {
        this.paquetes.setChocolates("No contiene");
    }
}
