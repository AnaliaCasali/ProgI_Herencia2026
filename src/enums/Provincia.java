package enums;
public enum Provincia {

    SANTA_FE("Santa Fe", "Santa Fe"),
    BUENOS_AIRES ("La Plata", "Buenos Aires" ),
    LA_PAMPA ("Santa Rosa", "La Pampa"),
    CORDOBA ("Cordoba", "Cordoba");

    private String capital;
    private String nombreProvincia;

    Provincia(String capital, String nombreProvincia) {
        this.capital = capital;
        this.nombreProvincia = nombreProvincia;}

    public String getCapital() {
        return capital;    }

    public String getNombreProvincia() {
        return nombreProvincia;    }

    @Override
    public String toString() {
        return  this.name() +
                " {" +
                " capital='" + capital + '\'' +
                ", nombreProvincia='" + nombreProvincia + '\'' +
                '}';
    }
}
