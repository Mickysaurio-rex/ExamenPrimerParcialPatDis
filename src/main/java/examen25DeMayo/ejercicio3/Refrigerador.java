package examen25DeMayo.ejercicio3;

public class Refrigerador implements IArtefacto{

    @Override
    public void showInfo(int precio) {
        System.out.println("******* REFRIGERADOR *******");
        System.out.println("Nombre: Refrigerador");
        System.out.println("Precio: " + precio);
    }
}
