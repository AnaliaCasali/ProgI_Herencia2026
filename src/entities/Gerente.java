package entities;

public class Gerente extends Empleado {

    /*Atributos propios: bono (double)
    Constructor:
     Debe recibir el nombre,apellido, id, salario base y el bono. Debe invocar al constructor de la superclase usando super.
    Sobrescritura de métodos (Override):
    calcularSalario(): Un gerente gana su salarioBase más el bono.
    mostrarInformacion(): Debe mostrar la información básica del empleado y añadir el campo del bono y el salario total.
    */
    private double bono;

    // el contructor de la clase padre NO SE HEREDA-> SE LLAMA CON SUPER
    public Gerente(String nombre, String apellido, double salarioBase, double bono) {
        // llamo al constructor de la clase padre
        super(nombre, apellido, salarioBase);//-> llama al constructor con parametros de la clase padre
        this.bono = bono;
    }

    public Gerente(){
        super(); // -> llama al constructor sin parametros de la clase padre
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    // la sobreescritura aplica en HERENCIA -> la clase hija redefine el metodo de la clase padre
    @Override
    public double calcularSalario() {
        // accedo al atributo salarioBase de la clase padre por el metodo publico get
        return this.getSalarioBase()+ this.bono;
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.print( " Bono:" +  this.bono + " \n " +
                          " Salario Total:" + this.calcularSalario() + "\n" );

    }
    //NO SE PUEDE SOBREESCRIBIR METODOS FINAL DE LA CLASE PADRE
    //public void mostrarMsg(String msg){}

    @Override
    public String toString(){
        return super.toString() + " Bono:" +  this.bono + " \n " +
                " Salario Total:" + this.calcularSalario();
    }

}
