package examen25DeMayo.ejercicio4;

public class Paquete {

    private String pipocas;
    private String vasoRefresco;
    private String chocolates;

    public Paquete(){}

    public String getPipocas() {
        return pipocas;
    }

    public void setPipocas(String pipocas) {
        this.pipocas = pipocas;
    }

    public String getVasoRefresco() {
        return vasoRefresco;
    }

    public void setVasoRefresco(String vasoRefresco) {
        this.vasoRefresco = vasoRefresco;
    }

    public String getChocolates() {
        return chocolates;
    }

    public void setChocolates(String chocolates) {
        this.chocolates = chocolates;
    }

    public void showPaquetes(){
        System.out.println("Pipocas: " + pipocas);
        System.out.println("Vaso de Refresco: " + vasoRefresco);
        System.out.println("Chocolates: " + chocolates);
    }
}
