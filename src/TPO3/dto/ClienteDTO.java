package TPO3.dto;

public class ClienteDTO {



    private String nombreCliente;
    private String dniCliente;

    public ClienteDTO(String nombreCliente, String dniCliente) {

        if(nombreCliente == null || nombreCliente.isEmpty()){
            throw new IllegalArgumentException("El Nombre no puede estar vacio ");
        }

        if(dniCliente == null || dniCliente.isEmpty()){
            throw new IllegalArgumentException("El Dni no puede estar vacio ");
        }

        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
    }



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
