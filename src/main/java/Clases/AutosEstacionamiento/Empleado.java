package Clases.AutosEstacionamiento;

public class Empleado {
    private Long id;
    private String nombre;
    private String apellido;
    private String planta;

    public Empleado(Long id, String nombre, String apellido, String planta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.planta = planta;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getnombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getapellido() {return apellido;}
    public void setapellido(String apellido) {this.apellido = apellido;}

    public String getplanta() {return planta;}
    public void setplanta(String planta) {this.planta = planta;}

    public String toString() {
        return nombre + " " + apellido + " " + planta;
    }
}
