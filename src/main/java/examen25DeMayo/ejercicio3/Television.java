package examen25DeMayo.ejercicio3;

public class Television implements IArtefacto{

    @Override
    public void showInfo(int precio) {
        System.out.println("******* TELEVISOR *******");
        System.out.println("Nombre: Televisor");
        System.out.println("Precio: " + precio);
    }
}
