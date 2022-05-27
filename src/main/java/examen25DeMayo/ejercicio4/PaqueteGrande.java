package examen25DeMayo.ejercicio4;

public class PaqueteGrande extends BuilderPaquetes{
    @Override
    public void buildPipocas() {
        this.paquetes.setPipocas("Pipocas extragrandes");
    }

    @Override
    public void buildVasoGaseosa() {
        this.paquetes.setVasoRefresco("3 vasos grandes");
    }

    @Override
    public void buildChocolates() {
        this.paquetes.setChocolates("2 chocolates grandes");
    }
}
