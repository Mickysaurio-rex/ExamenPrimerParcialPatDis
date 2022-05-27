package examen25DeMayo.ejercicio4;

public abstract class BuilderPaquetes {
    protected Paquete paquetes;

    public Paquete getProduct() {
        return paquetes;
    }

    public void createProduct() {
        this.paquetes = new Paquete();
    }

    public abstract void buildPipocas();
    public abstract void buildVasoGaseosa();
    public abstract void buildChocolates();

}
