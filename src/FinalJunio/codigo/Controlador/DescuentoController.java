package FinalJunio.codigo.Controlador;

import FinalJunio.codigo.Modelo.CondicionesDescuento;
import FinalJunio.codigo.Modelo.TarjetaDescuento;
import FinalJunio.codigo.Enum.TipoTarjeta;

import java.util.*;


/**
 * 
 */
public class DescuentoController {
	
	
	private static DescuentoController INSTANCE=null;
	
	private List<CondicionesDescuento> Descuento;
	
    private DescuentoController() {
    	Descuento = new ArrayList<CondicionesDescuento>();
    	CondicionesDescuento CondicionesDescuento = new CondicionesDescuento(new Date(), new Date(), 5, 50, TipoTarjeta.PAMI, new ArrayList<TarjetaDescuento>());
    	Descuento.add(CondicionesDescuento);

    }

	public DescuentoController getInstance(){
		if(INSTANCE==null){
			INSTANCE=new DescuentoController();
		}
		return INSTANCE;
	}


    /**
     * 
     */
    public void ABM() {
	}


}