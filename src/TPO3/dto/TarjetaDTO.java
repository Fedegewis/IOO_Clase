package TPO3.dto;

import TPO3.model.Consumo;

import java.util.Collection;

public class TarjetaDTO {


    private ClienteDTO clienteDTO;
    private Collection<ConsumoDTO> consumoDTO;
    private String nroTarjeta;
    private String tipoTarjeta;
    private String cargo;


    public TarjetaDTO(ClienteDTO clienteDTO,Collection<ConsumoDTO> consumoDTO, String nroTarjeta,String tipoTarjeta,String cargo) {
        this.clienteDTO = clienteDTO;
        this.consumoDTO=consumoDTO;
        this.nroTarjeta = nroTarjeta;
        this.tipoTarjeta=tipoTarjeta;
        this.cargo=cargo;
    }


    public ClienteDTO getClienteDTO() {return clienteDTO;}

    public void setClienteDTO(ClienteDTO clienteDTO) {this.clienteDTO = clienteDTO;}

    public Collection<ConsumoDTO> getConsumoDTO() {return consumoDTO;}

    public void setConsumoDTO(Collection<ConsumoDTO> consumoDTO) {this.consumoDTO = consumoDTO;}

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
                ", consumoDTO=" + consumoDTO +
                ", nroTarjeta='" + nroTarjeta + '\'' +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

}
