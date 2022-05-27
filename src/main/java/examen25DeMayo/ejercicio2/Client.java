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
        teleModelo.setUsb(4);
        teleModelo.setControl(true);
        teleModelo.setBluetooth(true);


        Tele tele1 = (Tele) teleModelo.clone();
        tele1.setSerial(1234567890);

        Tele tele2 = (Tele) teleModelo.clone();
        tele2.setSerial(1987654321);

        Tele tele3 = (Tele) teleModelo.clone();
        tele3.setSerial(1283761733);

        Tele tele4 = (Tele) teleModelo.clone();
        tele4.setSerial(1978348991);

        Tele tele5 = (Tele) teleModelo.clone();
        tele5.setSerial(1356774894);


        tele1.show();
        tele2.show();
        tele3.show();
        tele4.show();
        tele5.show();

    }
}
