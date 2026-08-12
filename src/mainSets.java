import entities.Desarrollador;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class mainSets {
    public static void main(String[] args) {

        Set<String> setAsistencia = new HashSet<String>();

        setAsistencia.add("Serena");
        setAsistencia.add("Ivo");
        setAsistencia.add("Serena");

        //Set.of("Serena", "Jeremias", "Ivo", "Rodrigo","Serena", "Jeremias", "Ivo", "Rodrigo");
        //recorro el set: por cada elemento en el set de asistencia

        for(String elemento: setAsistencia ){
            System.out.println(elemento);
        }

        Desarrollador dev1= new Desarrollador("Maria","Lopez", 1200000,"Java");
        Desarrollador dev2= new Desarrollador("Juan","Lopez", 1200000,"Java");
        Desarrollador dev3= new Desarrollador("Maria","Lopez", 15600000,"Java");

        Set<Desarrollador> desarrolladores= new HashSet<Desarrollador>();

        desarrolladores.add(dev1);
        desarrolladores.add(dev2);
        desarrolladores.add(dev3);
            // para que funcionen los set de objetos
        // // la clase del objeto debe tener implementado el metodo equals
        for(Desarrollador unDesarrollador: desarrolladores){
            System.out.println(unDesarrollador.toString());

        }

        Desarrollador dev4= new Desarrollador("test","Lopez", 15600000,"Java");

        // existe?
        System.out.println("Esta el dev3?" + desarrolladores.contains(dev3));
        System.out.println("Esta el dev4?" + desarrolladores.contains(dev4));

        System.out.println("COLLECCIONES SETS: SIN DUPLICADOS Y ORDENADOS: TREESET ");

        TreeSet<String> listaAsistenciaOrdenada=new TreeSet<>();
        listaAsistenciaOrdenada.add("Serena");
        listaAsistenciaOrdenada.add("Ivo");
        listaAsistenciaOrdenada.add("Jeremias");
        listaAsistenciaOrdenada.add("Rodrigo");

        System.out.println("-------LISTA ASISTENCIA ORDENADA-------");
        for(String elemento: listaAsistenciaOrdenada ){
            System.out.println(elemento);
        }

        TreeSet<Desarrollador> desarrolladoresOrdenados=new TreeSet<>();
        Desarrollador dev5= new Desarrollador("Serena","Fisch", 1200000,"Java");
        Desarrollador dev6= new Desarrollador("Jeremias","Escobar", 1200000,"Java");
        Desarrollador dev7= new Desarrollador("Ivo","De Guisto", 1200000,"Java");
        Desarrollador dev8= new Desarrollador("Rodrigo","Acevedo", 1200000,"Java");
        Desarrollador dev9= new Desarrollador("Rodrigo","Acevedo", 1200000,"HTML");

        desarrolladoresOrdenados.add(dev5);
        desarrolladoresOrdenados.add(dev6);
        desarrolladoresOrdenados.add(dev7);
        desarrolladoresOrdenados.add(dev8);
        desarrolladoresOrdenados.add(dev9);
        desarrolladoresOrdenados.add(dev9);
        System.out.println("-------LISTA  ORDENADA DESARROLLADORES sin duplicados-------");
        for(Desarrollador unDesarrollador: desarrolladoresOrdenados){
            System.out.println(unDesarrollador.toString());
        }

    }

}
