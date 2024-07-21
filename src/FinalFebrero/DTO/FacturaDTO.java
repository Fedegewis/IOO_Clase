package FinalFebrero.DTO;

import FinalFebrero.negocio.ItemFactura;

import java.util.Date;
import java.util.List;

public class FacturaDTO {
    private String tipoFactura;
    private String numero;
    private String fecha;
    private String tipoPago;
    private List<ItemFacturaDTO> items;

    public FacturaDTO(String tipoFactura, String numero, String fecha, String tipoPago, List<ItemFacturaDTO> items) {
        this.tipoFactura = tipoFactura;
        this.numero = numero;
        this.fecha = fecha;
        this.tipoPago = tipoPago;
        this.items = items;
    }


    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public List<ItemFacturaDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemFacturaDTO> items) {
        this.items = items;
    }


    @Override
    public String toString() {
        return "FacturaDTO{" +
                "tipoFactura='" + tipoFactura + '\'' +
                ", numero='" + numero + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tipoPago='" + tipoPago + '\'' +
                ", items=" + items +
                '}';
    }
}
