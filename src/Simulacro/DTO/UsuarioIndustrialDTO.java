package Simulacro.DTO;

public class UsuarioIndustrialDTO {

    private String calle;
    private String altura;
    private String piso;
    private String dpto;
    private String codigoPostal;
    private String localidad;
    private String provincia;
    private String razonSocial;
    private String cuit;
    private String IIBB;
    private String condicionFiscal;

    public UsuarioIndustrialDTO(String calle, String altura, String piso, String dpto, String codigoPostal, String localidad, String provincia, String razonSocial, String cuit, String IIBB, String condicionFiscal) {
        this.calle = calle;
        this.altura = altura;
        this.piso = piso;
        this.dpto = dpto;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.IIBB = IIBB;
        this.condicionFiscal = condicionFiscal;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getIIBB() {
        return IIBB;
    }

    public void setIIBB(String IIBB) {
        this.IIBB = IIBB;
    }

    public String getCondicionFiscal() {
        return condicionFiscal;
    }

    public void setCondicionFiscal(String condicionFiscal) {
        this.condicionFiscal = condicionFiscal;
    }


    @Override
    public String toString() {
        return "UsuarioIndustrialDTO{" +
                "calle='" + calle + '\'' +
                ", altura='" + altura + '\'' +
                ", piso='" + piso + '\'' +
                ", dpto='" + dpto + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuit='" + cuit + '\'' +
                ", IIBB='" + IIBB + '\'' +
                ", condicionFiscal='" + condicionFiscal + '\'' +
                '}';
    }
}
