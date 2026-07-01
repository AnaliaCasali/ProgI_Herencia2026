import entities.Desarrollador;
import entities.Empleado;
import entities.Gerente;
import enums.Provincia;
import interfaces.Versionado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


     Empleado[] empleados = new Empleado[3];

     Provincia miProvincia = Provincia.SANTA_FE;

    Gerente gerente = new Gerente("Jose","Gonzalez",1954789.22,100000);
    Desarrollador dev1= new Desarrollador("Maria","Lopez", 1200000,"Java");
    Desarrollador dev2= new Desarrollador("Pedro","Gomez", 1100000,"PHP");

    // los tres objetos instancias de clases que heredan de EMPLEADO
    // RELACION ES-UN ej Desarrollador es un Empleado

        // hace al polimorfirmo: le asigno a array de tipo padre objetos hijo
        empleados[0]=dev1;
        empleados[1]=dev2;
        empleados[2]=gerente;
/*
        for (int i=0; i<empleados.length; i++){
                empleados[i].mostrarInformacion();
        }
*/
            // FOREACH por cada empleado en la lista de empleados muestro la info
        for(Empleado e: empleados){
            e.mostrarInformacion();
        }


        // metodo estatico se llama con el nombre de la clase y no desde un objeto
        Versionado.mostrarVersionStatic();
        dev1.mostrarversion();
        System.out.println( dev2.mostrarVersionDefault());

            // obtengo todos los valores del ENUM con VALUES()
        Provincia[] provincias = Provincia.values();

        // POR CADA PROCINCIA EN EL ARRAY DE PROVINCIAS
        for(Provincia p: provincias){
            //
            System.out.println(p.toString());
            // ORDINAL
            System.out.println("Ordinal " + p.ordinal());
            //NAME
            System.out.println("Provincia " + p.name());


        }


    }


}

/*
* Sistema de Gestión de Empleados
Una empresa de tecnología necesita un sistema básico para gestionar a su personal.
Todos los miembros de la empresa comparten ciertas características, pero dependiendo de su rol, tienen responsabilidades y formas de calcular su salario diferentes.
Implementar un diseño de clases en Java utilizando herencia para modelar esta situación.
Requisitos del programa:

Clase Base : Empleado
Atributos (protegidos o privados con getters/setters):
nombre (String), id (int) , salarioBase (double)
Constructor: Que inicialice estos tres atributos.
Métodos:
mostrarInformacion(): Imprime en consola el ID, el nombre y el salario base del empleado.
calcularSalario(): Devuelve el salarioBase (tipo double).

Clase Hija: Gerente
Atributos propios: bono (double)
Constructor: Debe recibir el nombre, id, salario base y el bono. Debe invocar al constructor de la superclase usando super.
Sobrescritura de métodos (Override):
calcularSalario(): Un gerente gana su salarioBase más el bono.
mostrarInformacion(): Debe mostrar la información básica del empleado y añadir el campo del bono y el salario total.

* Clase Hija (Subclase): Desarrollador
Atributos propios: lenguajePrincipal (String)
Constructor: Debe recibir el nombre, id, salario base y el lenguaje principal. Debe invocar al constructor de la superclase usando super.
Sobrescritura de métodos (Override):
mostrarInformacion(): Debe mostrar la información básica e incluir el lenguaje de programación principal en el que trabaja.

* Clase Principal: Main
En el método main, crea una lista o un arreglo de tipo Empleado[].
Añade al menos un Gerente y un Desarrollador a la lista (demostrando polimorfismo).
Recorre la lista con un bucle y, para cada empleado, llama a los métodos mostrarInformacion() y calcularSalario().*/

