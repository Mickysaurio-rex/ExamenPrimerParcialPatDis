package examen25DeMayo.ejercicio1;

public class Cabina {
    private Auto auto;

    public Cabina(Auto auto){
        this.auto = auto;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void cobrar(Auto auto){
        ManejoCobros.getManejoCobros().getInstance().cobrarPeaje(auto);

    }

    public void mostrar(){
        ManejoCobros.getManejoCobros().getInstance().consultarSaldo();
    }
}
