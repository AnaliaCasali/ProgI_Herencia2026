package genericos;

public class Ubicacion<T,U> {
        // K KEY
        // V VALUE
        // T TIPO

    private T  latitud;
    private U  longitud;

    public Ubicacion(T  latitud,U  longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }
//  LOS ATRIBUTOS NO TIENEN UN TIPO DEFINIDO , SINO QUE EL  EL TIPO SE DEFINE
//   TOMANDO LAS VARIABLES QUE RECIBE <T,U>

    public T getLatitud() {
        return latitud;
    }

    public void setLatitud(T latitud) {
        this.latitud = latitud;
    }

    public U getLongitud() {
        return longitud;
    }

    public void setLongitud(U longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Ubicacion{" +
                "latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
