package EliminarYOrdenar;

import java.util.HashSet;
import java.util.Set;

public class SetUso {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Jhon Cena");
        set.add("Rey Misterio");
        set.add("Rey Misterio");
        set.add("Randy Orton");
        set.add("Randy Orton");
        set.add("Jhon Cena");

        System.out.println(set);

    }
}
