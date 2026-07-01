import genericos.Ubicacion;

public class mainGenericos {

    public static void main(String[] args) {

        long latitud=6546987l;
        long longitud=987456l;

        Ubicacion ubicacion = new Ubicacion<Long,Long>(latitud,longitud);

        double latitudDouble=6541235;
        double longitudDouble=98745635;

        Ubicacion ubicacionDouble=new Ubicacion<Double,Double>(latitudDouble,longitudDouble);



        double latitudDouble2=6541235;
        long longitudDouble2=98745635l;

        Ubicacion ubicacionMix=new Ubicacion<Double,Long>(latitudDouble2,longitudDouble2);

        System.out.println(ubicacionMix.toString());

    }
}
