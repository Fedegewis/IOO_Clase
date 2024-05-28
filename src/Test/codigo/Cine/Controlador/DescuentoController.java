package Test.codigo.Cine.Controlador;


import java.util.*;

import modelo.*;
import view.DescuentoView;

/**
 * 
 */
public class DescuentoController {
	
	
	private static DescuentoController instancia;
	
	private List<CondicionesDescuento> Descuento;
	
    public DescuentoController() {
    	Descuento = new ArrayList<CondicionesDescuento>();
    	Descuento.add(new CondicionesDescuento(new Date(), new Date(), 5, 50, TipoTarjeta.PAMI, new ArrayList<TarjetaDescuento>()));
        Descuento.add(new CondicionesDescuento(new Date(), new Date(), 1, 20, TipoTarjeta.UADE, new ArrayList<TarjetaDescuento>()));
        Descuento.add(new CondicionesDescuento(new Date(), new Date(), 6, 20, TipoTarjeta.LaNacion, new ArrayList<TarjetaDescuento>()));
        Descuento.add(new CondicionesDescuento(new Date(), new Date(), 4, 60, TipoTarjeta.Clarin365, new ArrayList<TarjetaDescuento>()));
        Descuento.add(new CondicionesDescuento(new Date(), new Date(), 2, 80, TipoTarjeta.MovieClub, new ArrayList<TarjetaDescuento>()));
    	
    	
    }
    public static DescuentoController getInstancia(){
        if(instancia==null)
            instancia=new DescuentoController();
        return instancia;
    }

    /**
     * 
     */
    public void ABM() {
	}

    public ArrayList<DescuentoView> obtenerDescuento(){
        ArrayList<DescuentoView> resultado=new ArrayList<DescuentoView>();
        for(CondicionesDescuento descuento:Descuento){
            resultado.add(descuento.toView());
        }
        return resultado;
    }

}