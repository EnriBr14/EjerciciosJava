package EstacionamientoServicio;

public class Principal {
    public static void main(String[] args) {
        RegList reg = new RegList();

        Empleado e1 = new Empleado(1L, "Socrates", "socrates@gmail.com");
        reg.Registrar(e1);
        Empleado e2 = new Empleado(2L, "Planton", "platon@gmail.com");
        reg.Registrar(e2);
        Empleado e3 = new Empleado(3L, "Parmenides", "parmenides@gmail.com");
        reg.Registrar(e3);
        Empleado e4 = new Empleado(4L, "Tales", "tales@gmail.com");
        reg.Registrar(e4);
        Empleado e5 = new Empleado(5L, "Aristoteles", "aristoteles@gmail.com");
        reg.Registrar(e5);

        Auto a1 = new Auto(1l, "Cavalier", "Chevrolet", 1L);
        reg.RegistrarAuto(a1);
        Auto a2 = new Auto(2l, "Spark", "Chevrolet", 2L);
        reg.RegistrarAuto(a2);
        Auto a3 = new Auto(3L, "March", "Nissan", 3L);
        reg.RegistrarAuto(a3);
        Auto a4 = new Auto(4L, "Explorer", "Nissan", 4L);
        reg.RegistrarAuto(a4);
        Auto a5 = new Auto(5L, "Taoe", "Nissan", 5L);
        reg.RegistrarAuto(a5);
        Auto a6 = new Auto(6L, "Virtus", "Nissan", 1L);
        reg.RegistrarAuto(a6);
        Auto a7 = new Auto(7L, "Sam", "Nissan", 1L);

        System.out.println(reg.ListarAutos(a1.getIdUsuario()));


    }
}
