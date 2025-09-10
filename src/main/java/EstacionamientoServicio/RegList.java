package EstacionamientoServicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegList {
    private Map<Long, Empleado> usuarios = new HashMap<>();
    private Map<Long, List<Auto>> AutosUsuario = new HashMap<>();

    public void Registrar(Empleado empleado) {
        for(Empleado emp : usuarios.values()){
            if(emp.getCorreo().equals(empleado.getCorreo())){
                throw new IllegalArgumentException("Ya existe un empleado con ese correo");
            }
        }
        usuarios.put(empleado.getId(), empleado);
    }

    public void RegistrarAuto(Auto auto) {
        if(!usuarios.containsKey(auto.getIdUsuario())){
            throw new IllegalArgumentException("Usuario no existe");
        }
        AutosUsuario.computeIfAbsent(auto.getId(), f -> new ArrayList<>()).add(auto);
    }

    public List<Auto> ListarAutos(Long idU) {
        return new ArrayList<>(AutosUsuario.getOrDefault(idU, new ArrayList<>()));
    }
}
