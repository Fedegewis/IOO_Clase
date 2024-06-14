package Simulacro.DTO;

public class UsuarioDTO {


    private String nroUsuario;
    private String calle;
    private String altura;
    private String piso;
    private String dpto;
    private String codigoPostal;
    private String localidad;
    private String provincia;

    public UsuarioDTO(String nroUsuario, String calle, String altura, String piso, String dpto, String codigoPostal, String localidad, String provincia) {
        this.nroUsuario = nroUsuario;
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.dpto = dpto;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
    }


    public String getNroUsuario() {
        return nroUsuario;
    }

    public void setNroUsuario(String nroUsuario) {
        this.nroUsuario = nroUsuario;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "nroUsuario='" + nroUsuario + '\'' +
                ", calle='" + calle + '\'' +
                ", altura='" + altura + '\'' +
                ", piso='" + piso + '\'' +
                ", dpto='" + dpto + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}
