package examen25DeMayo.ejercicio4;

public class Client {

    public static void main(String[]args){

        CandyBar candyBar = new CandyBar();
        BuilderPaquetes p1=new PaqueteGrande();
        BuilderPaquetes p2=new PaqueteMediano();
        BuilderPaquetes p3=new PaqueteNormal();

        candyBar.setBuilder(p1);
        candyBar.buildProduct();
        System.out.println("PAQUETE GRANDE");
        Paquete pq1=candyBar.getPaquete();
        pq1.showPaquetes();

        candyBar.setBuilder(p2);
        candyBar.buildProduct();
        System.out.println("PAQUETE MEDIANO");
        Paquete pq2=candyBar.getPaquete();
        pq2.showPaquetes();

        candyBar.setBuilder(p3);
        candyBar.buildProduct();
        Paquete pq3=candyBar.getPaquete();
        System.out.println("PAQUETE NORMAL");
        pq3.showPaquetes();
    }
}
