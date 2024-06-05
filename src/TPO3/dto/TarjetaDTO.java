package TPO3.dto;

import TPO3.model.Consumo;

import java.util.Collection;

public class TarjetaDTO {


    private ClienteDTO clienteDTO;
    private String nroTarjeta;
    private String tipoTarjeta;
    private String cargo;


    public TarjetaDTO(ClienteDTO clienteDTO, String nroTarjeta,String tipoTarjeta,String cargo) {
        this.clienteDTO = clienteDTO;;
        this.nroTarjeta = nroTarjeta;
        this.tipoTarjeta=tipoTarjeta;
        this.cargo=cargo;
    }


    public ClienteDTO getClienteDTO() {return clienteDTO;}

    public void setClienteDTO(ClienteDTO clienteDTO) {this.clienteDTO = clienteDTO;}


    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public String getTipoTarjeta() {return tipoTarjeta;}

    public void setTipoTarjeta(String tipoTarjeta) {this.tipoTarjeta = tipoTarjeta;}

    public String getCargo() {return cargo;}

    public void setCargo(String cargo) {this.cargo = cargo;}

    @Override
    public String toString() {
        return "TarjetaDTO{" +
                "clienteDTO=" + clienteDTO +
                ", nroTarjeta='" + nroTarjeta + '\'' +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
