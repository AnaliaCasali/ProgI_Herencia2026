import entities.Desarrollador;
import entities.Gerente;

import java.util.*;
import java.util.Map.Entry;

public class mainMaps {

    public static void main(String[] args) {


        // creo tabla de doble entrada
        // clave key: es Integer
        // valor value es String
        Map<Integer,String> listaEquipos=new TreeMap<>();

        // con metodo put agrego elementos al map
        listaEquipos.put(1,"Boca");
        listaEquipos.put(2,"River");
        listaEquipos.put(3,"Independiente");
        listaEquipos.put(4,"Belgrano");
        listaEquipos.put(5,"Racing");

        // get: obtener por la clave
        System.out.println(listaEquipos.get(1).toString());
        //Contains Value : obtener por el valor  devuelve Vo F
        System.out.println("contiene a boca?"+ listaEquipos.containsValue("Boca"));
        //Contains Key: devuelve Vo F
        System.out.println("contiene a 16?"+ listaEquipos.containsKey(16));

        // PARA RECORRER
        //m entrySet devuelve una lista de filas del mapa
        for(Entry<Integer,String> fila: listaEquipos.entrySet() ){
                    Integer key = fila.getKey();
                    String value = fila.getValue();
            System.out.println("La key es "  +  key + " y el valor  asociado es " + value);
        }

        /// mapa tiene como key (clave) gerente que no se van a repetir
        // y cada key tiene asociado como valor  una lista sin duplicados
        // de desarrolladores a su cargo
        // entonces la lista de doble entrada dice para cada gerente
        // quienes son los desarrolladores a su cargo
        HashMap<Gerente, Set<Desarrollador>> desarrolladoresPorGerente=new HashMap<>();

        Gerente gerente1 = new Gerente("Miguel", "Cane",65432154, 654987);
        Gerente gerente2 = new Gerente("Dibu", "Martinez",95432154, 954987);

        Desarrollador dev1=new Desarrollador("Juan", "Lopez",654987,"Java");
        Desarrollador dev2=new Desarrollador("Jose", "Gonzalez",6549872,"Java");
        Desarrollador dev3=new Desarrollador("Maria", "Gomez",6549872,"Java");
        Desarrollador dev4=new Desarrollador("Teresa", "Luque",6549872,"Java");
        Desarrollador dev5=new Desarrollador("Maria", "Becerra",3549872,"Java");
        Desarrollador dev6=new Desarrollador("Lionel", "Messi",9549872,"Java");
        // creo las listas sin duplicados y le agrego los elementos
        Set<Desarrollador> desarrolladores1=new HashSet<>();
        desarrolladores1= Set.of(dev1,dev2,dev3);

        Set<Desarrollador> desarrolladores2=new HashSet<>();
        desarrolladores2= Set.of(dev4,dev5,dev6);

        // agrego al maps
        desarrolladoresPorGerente.put(gerente1,desarrolladores1);
        desarrolladoresPorGerente.put(gerente2,desarrolladores2);
        // las claves no pueden ser nulas
        // desarrolladoresPorGerente.put(null, desarrolladores2);
        for (Entry<Gerente,Set<Desarrollador>> entrada : desarrolladoresPorGerente.entrySet()) {

            Gerente gerente=entrada.getKey();
            Set<Desarrollador> desarrolladores=entrada.getValue();
            System.out.println("El gerente: " + gerente.toString());
            System.out.println("tiene a su cargo los siguientes desarrolladores:\n");
                for (Desarrollador desarrollador : desarrolladores) {
                    System.out.println(desarrollador.toString());
                }
        }
        // ITERAR CON ITERATOR
/*        System.out.println("MAPA DE DESARROLLADORES POR GERENTE MOSTRADO CON ITERATOR");
        Iterator it=desarrolladoresPorGerente.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println( it.next());

        }

*/
// el size de los maps solo indica cantidad e keys
        System.out.println("tamaño " +  desarrolladoresPorGerente.size());



    }
}
