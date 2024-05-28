package Controlador;


import java.util.*;

import modelo.TipoTarjeta;
import modelo.Venta;

/**
 * 
 */
public class VentasController {

    /**
     * Default constructor
     */
    private List<Venta> ventas;
    private VentasController instancia;
	
    public VentasController(){
        ventas = new ArrayList<Venta>();
        ventas.add(new Venta(1,new Date(), null, null));
        ventas.add(new Venta(2,new Date(), null, null));
        ventas.add(new Venta(3,new Date(), null, null));
        ventas.add(new Venta(4,new Date(), null, null));
        ventas.add(new Venta(5,new Date(), null, null));
        ventas.add(new Venta(5,new Date(), null, null));
        ventas.add(new Venta(6,new Date(), null, null));
    }


    /**
     * @param funcionID 
     * @return
     */
    public VentasController getInstancia(){
        if(instancia==null)
            instancia=new VentasController();
        return instancia;

    }
    public float recaudacionPorFuncion(int funcionID) {
        // TODO implement here
        return 0.0f;
    }

    /**
     * 
     */
    public float recaudacionPorPelicula(int peliculaID) {
		return 0.0f;
        // TODO implement here
    }

    /**
     * @param tipoTarjeta 
     * @return
     */
    public float recaudacionPorTarjetaDescuento(TipoTarjeta tipoTarjeta) {
        // TODO implement here
        return 0.0f;
    }

    /**
     * 
     */
    public void comboMasVendido() {
        // TODO implement here
    }

}