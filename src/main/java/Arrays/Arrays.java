package Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arrays {
    public static void main(String[] args) {
        Long idUsuario = 8L;
        String name = "Segio";



        Map<Long,String> map = new HashMap<>();

        map.put(1L,"Carlos");
        map.put(2L,"Jorge");
        map.put(3L,"Benito");
        map.put(4L,"Sergio");

        for(Long ids : map.keySet()) {
            if(ids.equals(idUsuario)) {

                System.out.println("Id ya registrado: " + map.get(ids) + " Asi que no puedes registrar a: "+ name);
                System.out.println(map.getOrDefault(idUsuario,"Repetido"));
            }
            else{
                System.out.println("Usuario registrado");
                map.put(idUsuario,name);

                map.values();
            }

        }


    }
}
