package entities;

public class Desarrollador extends Empleado {

    /** Clase Hija (Subclase): Desarrollador
     Atributos propios: lenguajePrincipal (String)
     Constructor: Debe recibir el nombre, id, salario base y el lenguaje principal. Debe invocar al constructor de la superclase usando super.
     Sobrescritura de métodos (Override):
     mostrarInformacion(): Debe mostrar la información básica e incluir el lenguaje de programación principal en el que trabaja.
     */

    private String lenguajePrincipal;

    /* CONSTRUCTORES  */
    public Desarrollador() {
        super();
    }
    public Desarrollador(String nombre,String Apellido,double salarioBase,  String lenguajePrincipal) {
        super(nombre,Apellido,salarioBase);
        this.lenguajePrincipal=lenguajePrincipal;
    }

    public Desarrollador(String lenguajePrincipal) {
        super();
        this.lenguajePrincipal=lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.print("Lenguaje principal: " + this.lenguajePrincipal + "\n" );
    }

    @Override
    public String toString(){
        return super.toString() +  " Lenguaje principal: " + this.lenguajePrincipal + "\n" ;
    }

}
