package examen25DeMayo.ejercicio1;

public class Client {
    public static void main (String []args){
        Auto auto1 = new Auto();
        auto1.setColor("Rojo");
        auto1.setModelo("fi");
        auto1.setPlaca("3242");
        Cabina cabina = new Cabina(auto1);
        System.out.println("INFO AUTO");
        System.out.println(auto1.getColor());
        System.out.println(auto1.getModelo());
        System.out.println(auto1.getPlaca());
        cabina.cobrar(auto1);
        cabina.mostrar();
    }
}
