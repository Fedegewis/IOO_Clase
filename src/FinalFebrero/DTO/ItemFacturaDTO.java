package FinalFebrero.DTO;

import FinalFebrero.negocio.Factura;

public class ItemFacturaDTO {
    private String precio;
    private String cantidad;
    private String descuentoArticulo;
    private String descuentoProveedor;

    public ItemFacturaDTO( String precio, String cantidad, String descuentoArticulo, String descuentoProveedor) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuentoArticulo = descuentoArticulo;
        this.descuentoProveedor = descuentoProveedor;
    }



    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescuentoArticulo() {
        return descuentoArticulo;
    }

    public void setDescuentoArticulo(String descuentoArticulo) {
        this.descuentoArticulo = descuentoArticulo;
    }

    public String getDescuentoProveedor() {
        return descuentoProveedor;
    }

    public void setDescuentoProveedor(String descuentoProveedor) {
        this.descuentoProveedor = descuentoProveedor;
    }

    @Override
    public String toString() {
        return "ItemFacturaDTO{" +
                ", precio='" + precio + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", descuentoArticulo='" + descuentoArticulo + '\'' +
                ", descuentoProveedor='" + descuentoProveedor + '\'' +
                '}';
    }
}
