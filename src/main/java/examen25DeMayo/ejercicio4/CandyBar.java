package examen25DeMayo.ejercicio4;

public class CandyBar {
    private BuilderPaquetes builder;

    public Paquete getPaquete() {
        return builder.getProduct();
    }

    public void setBuilder(BuilderPaquetes builder) {
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createProduct();
        this.builder.buildPipocas();
        this.builder.buildVasoGaseosa();
        this.builder.buildChocolates();
    }
}
