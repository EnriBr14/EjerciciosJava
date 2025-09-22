package Clases.AutosEstacionamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroYListado {
    private Map<Long, Empleado> usuarios = new HashMap<Long, Empleado>();
    private Map<Long, List<Auto>> autosPorUsuario = new HashMap<>();

    public void registrarUsuario(Empleado employer) {
        //Verificar que el usuario exista
        for(Empleado emp : usuarios.values()){
            if(emp.getId().equals(employer.getId())){
                System.out.println("Empleado ya esta registrado");
            }
        }
        usuarios.put(employer.getId(), employer);
    }

    //Primero verificar que exista el usuario para registrar el auto
    public void registrarAuto(Auto auto) {
        if(!usuarios.containsKey(auto.getUduarioId())){
            throw new IllegalArgumentException("Usuario no existe");
        }

        autosPorUsuario.computeIfAbsent(auto.getIdAuto(), k -> new ArrayList<>()).add(auto);
    }

    public List<Auto> listarAutos(Long idUsuario) {
        return new ArrayList<>(autosPorUsuario.getOrDefault(idUsuario, new ArrayList<>()));
    }
}
