package EliminarYOrdenar;

import java.util.*;

public class EliminaDuplicado {
    public static void main(String[] args) {
        List<String> duplicados = new ArrayList<String>();



        duplicados.add("Socrates");
        duplicados.add("Socrates");
        duplicados.add("Parmenides");
        duplicados.add("Parmenides");
        duplicados.add("Socrates");
        duplicados.add("Aristoteles");
        duplicados.add("Aristoteles");
        duplicados.add("Platon");
        duplicados.add("Platon");
        duplicados.add("Platon");
        duplicados.add("Aristoteles");

        Set<String> duplicadoSet = new HashSet<>(duplicados);
        List<String> nuevo = new ArrayList<>(duplicadoSet);

        Collections.sort(nuevo);
        System.out.println("Lista sin repetidos:");
        System.out.println(duplicadoSet);
        System.out.println("Lista sin repetidos ordenada");
        System.out.println(nuevo);

        List<Integer> numeros = Arrays.asList(2,1,2,3,4,5,6,7,8,9,1,2,3,5,4,5,6);
        Set<Integer> sinDuplicado = new HashSet<>(numeros);

        System.out.println("Lista ordenada");
        System.out.println(sinDuplicado);



    }
}
