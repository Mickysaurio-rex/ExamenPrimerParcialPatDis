package examen25DeMayo.ejercicio1;

public class ManejoCobros {
    private static ManejoCobros manejoCobros;
    private int saldo;

    private ManejoCobros(){
        saldo = 0;
    }

    public synchronized ManejoCobros getInstance(){
        // garantiza que la instancia es unica
        if (manejoCobros== null)
            manejoCobros= new ManejoCobros();
        return manejoCobros;
    }

    public synchronized void cobrarPeaje(Auto auto){
        if(auto.getModelo().equals("fi")){
            saldo = saldo + 5;
        }else if(auto.getModelo().equals("fo")){
            saldo = saldo + 7;
        }else if(auto.getModelo().equals("fu")){
            saldo = saldo + 8;
        }else{
            System.out.println("No se tiene el registro de este vehiculo");
        }
    }

    public synchronized void consultarSaldo(){
        System.out.println("El saldo es " + saldo);
    }

    public static ManejoCobros getManejoCobros() {
        return manejoCobros;
    }

    public static void setManejoCobros(ManejoCobros manejoCobros) {
        ManejoCobros.manejoCobros = manejoCobros;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
