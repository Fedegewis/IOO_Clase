package SegundoExamen.ioo.parcial.src.main.java.uade.edu;
import java.util.*;

/**
 * 
 */
public class Ticket {

    private List<Cerveza> cervezas = new ArrayList<>();
    /**
     * Default constructor
     */
    public Ticket() {
    }

    /**
     * 
     */
    private int ventaID;

    /**
     * 
     */
    private Date fchVenta;

    /**
     * @return
     */
    public int getCervezaMasTomada() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getTipoMasTomada() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getMesaID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public float getTotalPorCerveza() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public float getTotal() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public Date getFecha() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getCatidadVariedades() {
        // TODO implement here
        return 0;
    }

    /**
     * @param unaVariedad 
     * @param unaPresentacion
     */
    public void agregarCerveza(Variedad unaVariedad, Presentacion unaPresentacion) {
        // TODO implement here
        this.cervezas.add(new Cerveza(unaVariedad,unaPresentacion));
    }

    public List<Cerveza> getCervezas() {
        return cervezas;
    }

    public void setCervezas(List<Cerveza> cervezas) {
        this.cervezas = cervezas;
    }

    public int getVentaID() {
        return ventaID;
    }

    public void setVentaID(int ventaID) {
        this.ventaID = ventaID;
    }

    public Date getFchVenta() {
        return fchVenta;
    }

    public void setFchVenta(Date fchVenta) {
        this.fchVenta = fchVenta;
    }
}