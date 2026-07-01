import entities.Desarrollador;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class mainList {
    public static void main(String[] args) {

        // creando una lista
        List<String> asistencia=new ArrayList<String>();
        // add para agregar
        asistencia.add("Serena");
        asistencia.add("Ivo");
        asistencia.add("jeremias");
        asistencia.add("Ivan");
        asistencia.add("Rodrigo");
        System.out.println("------RECORRO LISTA ASISTENCIA CON FOREACH-----------");
        for(String nombre: asistencia){
            System.out.println(nombre);
        }

        // size cantidad de elementos de la coleccion
        System.out.println("El tamaño de la coleccion es " + asistencia.size());

        // indica si la coleccion tiene elementos devuelve V o F
        System.out.println("Esta Vacia?" + asistencia.isEmpty());

        asistencia.remove("Serena");

        System.out.println("------RECORRO LISTA ASISTENCIA CON ITERATOR-----------");

        // iterator: PARA recorrer la coleccion
        ListIterator<String> it =asistencia.listIterator();
        // hashNext: existeUnSiguiente
        while (it.hasNext()) {
            // next() tomar el elemento
            System.out.println(it.next());
        }

        System.out.println( "asistio Ivo?" +  asistencia.contains("Ivo"));
        System.out.println( "asistio Serena?" +  asistencia.contains("Serena"));

        System.out.println( "Quien esta en posición 2?" +  asistencia.get(2));

        System.out.println("--------LISTA PARCIAL---- ");
        List<String> parcial=asistencia.subList(1,3);
        parcial.add("Serena");
        parcial.add("Serena");

        for(String nombre: parcial){
            System.out.println(nombre);
        }


        // CLEAR
        parcial.clear();
        System.out.println("Esta vacia lista parcial?" + parcial.isEmpty());


        // coleccion de  Desarrollador

        ArrayList<Desarrollador> listDesarrolladores=new ArrayList<>();

        Desarrollador dev1= new Desarrollador("Maria","Lopez", 1200000,"Java");
        Desarrollador dev2= new Desarrollador("Juan","Lopez", 1200000,"Java");

        ArrayList<Desarrollador> desarrolladores= (ArrayList<Desarrollador>)
                List.of( dev1,
                        dev2,
                        new Desarrollador("Pedro","Gomez", 1100000,"PHP")
                        );


    }

}
