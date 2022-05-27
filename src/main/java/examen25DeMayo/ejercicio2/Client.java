package examen25DeMayo.ejercicio2;

import Prototype.ConcretePrototype1;

public class Client {
    public static void main(String[] args) {

        Tele teleModelo = new Tele();
        teleModelo.setSistemaOp("Android");
        teleModelo.setVersion(11.0);
        teleModelo.setPulgadas(80);
        teleModelo.setResolucion(50);
        teleModelo.setPuertoHdmi(true);

    }
}
