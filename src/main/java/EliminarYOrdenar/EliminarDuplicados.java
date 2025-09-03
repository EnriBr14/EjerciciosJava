package EliminarYOrdenar;

import java.util.*;


public class EliminarDuplicados {
    public static void main(String[] args) {

        List<String> luchadores = Arrays.asList("Mistico", "Cibernetico", "Mistico", "La parka", "La parka", "L.A Park", "Octagon");

        //Eliminar duplicados de la lista de luchadores con el uso de HashSet ya que no permite duplicados
        List<String> duplicados = new ArrayList<>(new HashSet<>(luchadores));

        System.out.println("Lista sin duplicados");
        System.out.println(duplicados);

        //Usando el metodo sort ordenaremos la lista de la A -> B
        Collections.sort(duplicados);
        System.out.println("Lista ordenada");
        System.out.println(duplicados);

        //Lista de numeros
        List<Integer> numero = Arrays.asList(1,2,4,3,5,6,4,3,2,5,6,7,5,4,6,7,3,1,2,3,4,4,3,2,4,5,6,6,7,11,12,12,12,13,14,55,44,33,63,535,23,12);
        List<Integer> duplicaEliminar = new ArrayList<>(new HashSet<>(numero));

        System.out.println("Lista sin duplicados");
        System.out.println(duplicaEliminar);

        Collections.sort(duplicaEliminar);
        System.out.println("Lista ordenada");
        System.out.println(duplicaEliminar);







    }
}
