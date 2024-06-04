package TPO3.dto;

import TPO3.model.Consumo;

import java.util.Collection;

public class TarjetaDTO {


    private String dniCliente;
    private String consumosTarjeta;
    private String nroTarjeta;


    public TarjetaDTO(String dniCliente, String consumosTarjeta, String nroTarjeta) {
        this.dniCliente = dniCliente;
        this.consumosTarjeta = consumosTarjeta;
        this.nroTarjeta = nroTarjeta;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getConsumosTarjeta() {
        return consumosTarjeta;
    }

    public void setConsumosTarjeta(String consumosTarjeta) {
        this.consumosTarjeta = consumosTarjeta;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    @Override
    public String toString() {
        return "TarjetaDTO{" +
                "dniCliente='" + dniCliente + '\'' +
                ", consumosTarjeta='" + consumosTarjeta + '\'' +
                ", nroTarjeta='" + nroTarjeta + '\'' +
                '}';
    }


}
