package examen25DeMayo.ejercicio4;

public class PaqueteMediano extends BuilderPaquetes{
    @Override
    public void buildPipocas() {
        this.paquetes.setPipocas("Pipocas grandes");
    }

    @Override
    public void buildVasoGaseosa() {
        this.paquetes.setVasoRefresco("2 vasos");
    }

    @Override
    public void buildChocolates() {
        this.paquetes.setChocolates("1 chocolate");
    }
}
