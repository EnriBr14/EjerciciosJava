package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {
        List<String> bandas = new ArrayList<>();

        bandas.add("Metallica");
        bandas.add("Megadeth");
        bandas.add("Salyer");
        bandas.add("Anthrax");
        bandas.add("Slayer");
        bandas.add("Iron Maiden");
        bandas.add("Black Sabbath");

        System.out.println(bandas);

        bandas.add(0, "Cannibal Corpse");
        System.out.println(bandas);
        System.out.println("");
         //Acceder a elementos
         //Acceder al elemento 4
        System.out.println("Elemento 4");
        System.out.println(bandas.get(4));
        System.out.println("");

        //Cambiar el elemento 4
        System.out.println("Cambiando el elemento 5 por  Carcass");
        bandas.set(4,"Carcass");
        System.out.println(bandas);
        System.out.println("");

    }
}
