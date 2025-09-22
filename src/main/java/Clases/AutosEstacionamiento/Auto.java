package Clases.AutosEstacionamiento;

public class Auto {
    private Long idAuto;
    private String modelo;
    private String marca;
    private Long uduarioId;

    public Auto (Long idAuto, String modelo, String marca, Long uduarioId) {
        this.idAuto = idAuto;
        this.modelo = modelo;
        this.marca = marca;
        this.uduarioId = uduarioId;
    }

    public Long getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(Long idAuto) {
        this.idAuto = idAuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getUduarioId() {
        return uduarioId;
    }

    public void setUduarioId(Long uduarioId) {
        this.uduarioId = uduarioId;
    }

    public String toString() {
        return idAuto + " " + modelo + " " + marca + " " + uduarioId;
    }
}
