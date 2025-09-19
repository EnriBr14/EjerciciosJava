package ContadorDePalabras;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContarPalabras {
    public static void main(String[] args) {
        List<String> filosofos = Arrays.asList("Aristoteles", "Aristoteles", "Platon", "Platon", "Socrates", "Socrates", "Parmedines");

        Map<String, Integer> votos = new HashMap<>();
        Integer i = 0;

        for (String f : filosofos) {

            votos.put(f,votos.getOrDefault(f,0) + 1);
        }



        System.out.println("Votos por filósofo: " + votos);

        int suma = 1;
        List<Integer> numeros = Arrays.asList(2,2,3);
        for(Integer n : numeros){
            suma *= n;
        }
        System.out.println(suma);



    }

}
