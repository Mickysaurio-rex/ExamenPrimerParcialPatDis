package examen25DeMayo.ejercicio3;

public class Radio implements IArtefacto{

    @Override
    public void showInfo(int precio) {
        System.out.println("******* RADIO *******");
        System.out.println("Nombre: Radio");
        System.out.println("Precio: " + precio);
    }
}
