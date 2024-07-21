package uade.edu;
import java.util.*;

/**
 * 
 */
public class Cerveza {



    private String codigo;

    private Variedad variedad;

    private Presentacion presentacion;

    private float precio;

    private TipoCerveza tipoCerveza;

    private int cantidadCC;
    /**
     * Default constructor
     */
    public Cerveza() {
    }

    /**
     * @param unaVariedad 
     * @param unaPresentacion
     */
    public Cerveza(Variedad unaVariedad, Presentacion unaPresentacion) {
        // TODO implement here
        this.codigo = generarCodigo();
        this.presentacion = unaPresentacion;
        this.variedad = unaVariedad;
    }

    public Cerveza(Variedad variedad, Presentacion presentacion, float precio, TipoCerveza tipoCerveza, int cantidadCC) {
        this.codigo = generarCodigo();
        this.variedad = variedad;
        this.presentacion = presentacion;
        this.precio = precio;
        this.tipoCerveza = tipoCerveza;
        this.cantidadCC = cantidadCC;
    }

    public Variedad getVariedad() {
        return variedad;
    }

    public void setVariedad(Variedad variedad) {
        this.variedad = variedad;
    }

    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public TipoCerveza getTipoCerveza() {
        return tipoCerveza;
    }

    public void setTipoCerveza(TipoCerveza tipoCerveza) {
        this.tipoCerveza = tipoCerveza;
    }

    public int getCantidadCC() {
        return cantidadCC;
    }

    public void setCantidadCC(int cantidadCC) {
        this.cantidadCC = cantidadCC;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private String generarCodigo(){
        Random random = new Random();
        int randomInt = random.nextInt(11) + 10;
        return Integer.valueOf(randomInt).toString();
    }
}