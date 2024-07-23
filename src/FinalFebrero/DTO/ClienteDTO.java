package FinalFebrero.DTO;

import FinalFebrero.negocio.Factura;

import java.util.List;

public class ClienteDTO {
    private String cuit;
    private String nombre;
    private String tipo;
    private String saldo;
    private String descuento;



    public ClienteDTO(String cuit, String nombre, String tipo, String saldo, String descuento) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.tipo = tipo;
        this.saldo = saldo;
        this.descuento = descuento;

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



    @Override
    public String toString() {
        return "ClienteDTO{" +
                "cuit='" + cuit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldo='" + saldo + '\'' +
                ", descuento='" + descuento + '\'' +
                '}';
    }
}
