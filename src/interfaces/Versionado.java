package interfaces;

public interface Versionado {

    // firma de método
    public void mostrarversion() ;

    // metodo static
    static  void mostrarVersionStatic(){
        System.out.printf("Version sin definir");
    }
    // metodo por defecto
    default String  mostrarVersionDefault(){
        return "Version sin definir";
    }

}
