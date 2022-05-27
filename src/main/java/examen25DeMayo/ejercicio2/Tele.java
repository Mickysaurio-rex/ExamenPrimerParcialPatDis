package examen25DeMayo.ejercicio2;

public class Tele implements ITele{

    private String sistemaOp;
    private Double version;
    private int pulgadas;
    private int resolucion;
    private boolean puertoHdmi;
    private int serial;

    private int usb;

    private boolean control;

    private boolean bluetooth;
    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public boolean isPuertoHdmi() {
        return puertoHdmi;
    }

    public void setPuertoHdmi(boolean puertoHdmi) {
        this.puertoHdmi = puertoHdmi;
    }

    public int getUsb() {
        return usb;
    }

    public void setUsb(int usb) {
        this.usb = usb;
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public Object clone() {
        Tele clone = new Tele();
        clone.setSistemaOp(this.getSistemaOp());
        clone.setVersion(this.getVersion());
        clone.setPulgadas(this.getPulgadas());
        clone.setResolucion(this.getResolucion());
        clone.setPuertoHdmi(this.isPuertoHdmi());
        clone.setUsb(this.getUsb());
        clone.setControl(this.isControl());
        clone.setBluetooth(this.isBluetooth());
        clone.setSerial(this.getSerial());

        return clone;
    }


    public void show(){
        System.out.println("******* INFO TELE *******");
        System.out.println();
        System.out.println("Sistema Operativo del televisor: " + sistemaOp);
        System.out.println("Version del sistema: " + version);
        System.out.println("Tamano del televisor: " + pulgadas + " pulgadas");
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Tiene puerto HDMI: " + puertoHdmi);
        System.out.println("Puerto serial: " + serial);
        System.out.println("Puertos USB: " + usb);
        System.out.println("Tiene control: " + control);
        System.out.println();
    }
}
