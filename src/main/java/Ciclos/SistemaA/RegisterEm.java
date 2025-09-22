package Ciclos.SistemaA;

import java.util.ArrayList;
import java.util.List;

public class RegisterEm {
    private List<Empleado> empleados = new ArrayList<Empleado>();

    public void registrar(Empleado emp) {
        for(Empleado emple : empleados) {
            if(emple.equals(emp)) {
                throw new IllegalArgumentException("El empleado ya existe");
            }
            else{

            }
        }

    }
}
