package Clase21deMayo.src.dto;

public class ClienteDto {

    private String apellidoCliente;
    private String dniCliente;
    private String calleDireccionCliente;
    private String nombreCliente;
    private  String numeroDireccionCliente;

    public ClienteDto(String apellidoCliente,
                      String dniCliente,
                      String calleDireccionCliente,
                      String nombreCliente,
                      String numeroDireccionCliente) {

        this.apellidoCliente =apellidoCliente;
        this.calleDireccionCliente = calleDireccionCliente;
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
        this.numeroDireccionCliente = numeroDireccionCliente;

    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getCalleDireccionCliente() {
        return calleDireccionCliente;
    }

    public void setCalleDireccionCliente(String calleDireccionCliente) {
        this.calleDireccionCliente = calleDireccionCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroDireccionCliente() {
        return numeroDireccionCliente;
    }

    public void setNumeroDireccionCliente(String numeroDireccionCliente) {
        this.numeroDireccionCliente = numeroDireccionCliente;
    }

    @Override
    public String toString() {
        return "ClienteDto{" +
                "apellidoCliente='" + apellidoCliente + '\'' +
                ", dniCliente='" + dniCliente + '\'' +
                ", calleDireccionCliente='" + calleDireccionCliente + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", numeroDireccionCliente='" + numeroDireccionCliente + '\'' +
                '}';
    }
}
