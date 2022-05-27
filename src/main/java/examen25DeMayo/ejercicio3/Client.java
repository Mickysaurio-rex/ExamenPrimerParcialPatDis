package examen25DeMayo.ejercicio3;

public class Client {
    public static void main (String []args){
        FactoryArtefacto.make(ArtefactosType.TELEVISION).showInfo(100);
        FactoryArtefacto.make(ArtefactosType.RADIO).showInfo(200);
        FactoryArtefacto.make(ArtefactosType.REFRIGERADOR).showInfo(300);
        FactoryArtefacto.make(ArtefactosType.MICROONDAS).showInfo(400);
        FactoryArtefacto.make(ArtefactosType.BATIDORA).showInfo(500);

    }
}
