package TPO3.dto;

import TPO3.model.Consumo;

import java.util.Collection;

public class TarjetaDTO {


    private ClienteDTO clienteDTO;
    private String consumosTarjeta;
    private String nroTarjeta;


    public TarjetaDTO(ClienteDTO clienteDTO, String consumosTarjeta, String nroTarjeta) {
        this.clienteDTO = clienteDTO;
        this.consumosTarjeta = consumosTarjeta;
        this.nroTarjeta = nroTarjeta;
    }


    public ClienteDTO getClienteDTO() {return clienteDTO;}

    public void setClienteDTO(ClienteDTO clienteDTO) {this.clienteDTO = clienteDTO;}

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
                "cliente='" + clienteDTO + '\'' +
                ", consumosTarjeta='" + consumosTarjeta + '\'' +
                ", nroTarjeta='" + nroTarjeta + '\'' +
                '}';
    }


}
