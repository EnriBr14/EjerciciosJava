package ContadorDePalabras;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContarPalabras {
    public static void main(String[] args) {
        List<String> filosofos = Arrays.asList("Aristoteles", "Aristoteles", "Platon", "Platon", "Socrates", "Socrates", "Parmedines");

        Map<String, Integer> contador = new HashMap<>();
        Integer i = 0;

        for (String f : filosofos) {

            contador.put(f,contador.getOrDefault(f,0) + 1);
        }

        System.out.println("Frecuencia de palabras: " + contador);

        int suma = 0;
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        for(Integer n : numeros){
            suma += n;
        }
        System.out.println(suma);



    }

}
