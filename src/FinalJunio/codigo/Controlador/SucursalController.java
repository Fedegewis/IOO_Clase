package FinalJunio.codigo.Controlador;

import FinalJunio.codigo.Modelo.Sucursal;

import java.util.*;


/**
 * 
 */
public class SucursalController {

    /**
     * Default constructor
     */
	private static SucursalController INSTANCE=null;
	private List<Sucursal> sucursal;
		
    private SucursalController() {
    	sucursal = new ArrayList<Sucursal>();
    	sucursal.add(new Sucursal(1, "Barracas", "Av Montes de Oca 1100", null));

    	
    }

    public SucursalController getInstance(){
        if(INSTANCE==null){
            INSTANCE=new SucursalController();
        }
        return INSTANCE;
    }

    /**
     * @param id 
     * @param denom 
     * @param dir
     */
    public void agregarSucursal(int id, String denom, String dir) {
        // TODO implement here
    }

    /**
     * @param idSucursal 
     * @param salaID 
     * @param denom 
     * @param nroasientos
     */
    public void agregarSala(int idSucursal, int salaID, String denom, int nroasientos) {
        // TODO implement here
    }

}