package TPO3.dto;

public class ClienteDTO {


    public ClienteDTO(String nombreCliente, String dniCliente) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
    }


    private String nombreCliente;
    private String dniCliente;


    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }


    @Override
    public String toString() {
        return "ClienteDTO{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", dniCliente='" + dniCliente + '\'' +
                '}';
    }


}
