package examen25DeMayo.ejercicio3;

public class FactoryArtefacto {
    public static IArtefacto make(ArtefactosType typeProduct){
        IArtefacto product;
        switch (typeProduct){
            case TELEVISION:
                product = new Television();
                break;
            case REFRIGERADOR:
                product = new Refrigerador();
                break;
            case RADIO:
                product = new Radio();
                break;
            case MICROONDAS:
                product = new Microondas();
                break;
            default:
                product = new Batidora();
                break;
        }
        return product;
    }
}
