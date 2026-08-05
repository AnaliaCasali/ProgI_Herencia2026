import entities.Desarrollador;

import java.util.HashSet;
import java.util.Set;

public class mainSets {
    public static void main(String[] args) {

        Set<String> setAsistencia = new HashSet<String>();

        setAsistencia.add("Serena");
        setAsistencia.add("Ivo");
        setAsistencia.add("Serena");


    //     Set.of("Serena", "Jeremias", "Ivo", "Rodrigo","Serena", "Jeremias", "Ivo", "Rodrigo");

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

    }

}
