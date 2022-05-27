package examen25DeMayo.ejercicio3;

public class Microondas implements IArtefacto{

    @Override
    public void showInfo(int precio) {
        System.out.println("******* MICROONDAS *******");
        System.out.println("Nombre: Microondas");
        System.out.println("Precio: " + precio);
    }
}
