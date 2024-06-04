package TPO3.dto;

public class ConsumoDTO {


    private String codigoConsumo;
    private String mesConsumo;
    private String añoConsumo;
    private String nombreEstablecimientoConsumo;
    private String montoConsumo;

    public ConsumoDTO(String codigoConsumo, String mesConsumo, String añoConsumo, String nombreEstablecimientoConsumo, String montoConsumo) {
        this.codigoConsumo = codigoConsumo;
        this.mesConsumo = mesConsumo;
        this.añoConsumo = añoConsumo;
        this.nombreEstablecimientoConsumo = nombreEstablecimientoConsumo;
        this.montoConsumo = montoConsumo;
    }

    public String getCodigoConsumo() {
        return codigoConsumo;
    }

    public void setCodigoConsumo(String codigoConsumo) {
        this.codigoConsumo = codigoConsumo;
    }

    public String getMesConsumo() {
        return mesConsumo;
    }

    public void setMesConsumo(String mesConsumo) {
        this.mesConsumo = mesConsumo;
    }

    public String getAñoConsumo() {
        return añoConsumo;
    }

    public void setAñoConsumo(String añoConsumo) {
        this.añoConsumo = añoConsumo;
    }

    public String getNombreEstablecimientoConsumo() {
        return nombreEstablecimientoConsumo;
    }

    public void setNombreEstablecimientoConsumo(String nombreEstablecimientoConsumo) {
        this.nombreEstablecimientoConsumo = nombreEstablecimientoConsumo;
    }

    public String getMontoConsumo() {
        return montoConsumo;
    }

    public void setMontoConsumo(String montoConsumo) {
        this.montoConsumo = montoConsumo;
    }



    @Override
    public String toString() {
        return "ConsumoDTO{" +
                "codigoConsumo='" + codigoConsumo + '\'' +
                ", mesConsumo='" + mesConsumo + '\'' +
                ", añoConsumo='" + añoConsumo + '\'' +
                ", nombreEstablecimientoConsumo='" + nombreEstablecimientoConsumo + '\'' +
                ", montoConsumo='" + montoConsumo + '\'' +
                '}';
    }

}
