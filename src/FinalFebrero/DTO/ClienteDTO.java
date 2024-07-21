package FinalFebrero.DTO;

import FinalFebrero.negocio.Factura;

import java.util.List;

public class ClienteDTO {
    private String cuit;
    private String nombre;
    private String tipo;
    private String saldo;
    private String descuento;
    private List<FacturaDTO> facturas;


    public ClienteDTO(String cuit, String nombre, String tipo, String saldo, String descuento, List<FacturaDTO> facturas) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.tipo = tipo;
        this.saldo = saldo;
        this.descuento = descuento;
        this.facturas = facturas;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public List<FacturaDTO> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<FacturaDTO> facturas) {
        this.facturas = facturas;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" +
                "cuit='" + cuit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldo='" + saldo + '\'' +
                ", descuento='" + descuento + '\'' +
                ", facturas=" + facturas +
                '}';
    }
}
