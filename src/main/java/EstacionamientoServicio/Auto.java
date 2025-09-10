package EstacionamientoServicio;

public class Auto {
    private Long id;
    private String modelo;
    private String marca;
    private Long idUsuario;

    public Auto(Long id, String modelo, String marca, Long idUsuario) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.idUsuario = idUsuario;
    }
    public String toString() {
        return idUsuario + " " + modelo + " " + marca;
    }
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    public Long getIdUsuario() {return idUsuario;}

    public void setIdUsuario(Long idUsuario) {this.idUsuario = idUsuario;}
}
