package examen25DeMayo.ejercicio3;

public class Batidora implements IArtefacto{

    @Override
    public void showInfo(int precio) {
        System.out.println("******* BATIDORA *******");
        System.out.println("Nombre: Batidora");
        System.out.println("Precio: " + precio);
    }
}
