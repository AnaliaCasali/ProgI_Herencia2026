import entities.Desarrollador;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

public class mainQueue {

    public static void main(String[] args) {
        /*METODOS offer , offerFirst, offerLast*/

        Desarrollador dev1=new Desarrollador("Juan", "Lopez",654987,"Java");
        Desarrollador dev2=new Desarrollador("Jose", "Gonzalez",6549872,"Java");
        Desarrollador dev3=new Desarrollador("Maria", "Gomez",6549872,"Java");
        Desarrollador dev4=new Desarrollador("Teresa", "Luque",6549872,"Java");
        // pila de desarrollares
        ArrayDeque<Desarrollador> desarrolladores=new ArrayDeque<>();

        // agrega al final cada desarrollador
        desarrolladores.offer(dev1);
        desarrolladores.offer(dev2);
        desarrolladores.offer(dev3);
        desarrolladores.offer(dev4);
        // arrayDeque maneja ambos extremos

        // agregar principio
        desarrolladores.offerFirst(
                new Desarrollador("Juana", "Manso",5546846,"PHP")
        );

        // agregar final
        desarrolladores.offerLast(
            new Desarrollador("Maria", "Becerra", 987654651, "HTML")
        );
        mostrarCollection(desarrolladores);

        // ESTE TIPO DE COLLECTION NO ACEPTA NULOS  java.lang.NullPointerException--
        // desarrolladores.offerFirst(null); //-> NO SE PUEDE
        System.out.println("Desarrolladores con ELEMENT");
        System.out.println(  desarrolladores.element().toString());

        // QUITAR ELEMENTO: ES EL PRIMER
        desarrolladores.poll(); // a modo de cola
        mostrarCollection(desarrolladores);

        // desarrolladores.pollFirst(); // quita o remueve el primero de la collection
        // desarrolladores.removeFirst();

        // desarrolladores.pollLast(); // quita o remueve el ultimo de la collection
        // desarrolladores.removeFirst()


        // peek toma el primer elemento   (CONSULTA)
        System.out.println("---------Desarrolladores con PEEK ----------");
        System.out.println( desarrolladores.peek().toString());

        System.out.println("---------Desarrolladores con PEEKFIRST ----------");
        System.out.println(desarrolladores.peekFirst().toString());

        System.out.println("---------Desarrolladores con PEEKLAST ----------");
        System.out.println(desarrolladores.peekLast().toString());


    }// cierra el main

    public static void mostrarCollection(Collection miCollection){
        Iterator it = miCollection.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

}



