package Controlador;


import java.util.*;

import modelo.Pelicula;
import modelo.Sucursal;
import modelo.TipoGenero;
import modelo.TipoProyeccion;
import view.SucursalesView;

/**
 * 
 */
public class SucursalController {

    /**
     * Default constructor
     */
	
	private List<Sucursal> sucursal;
    private static SucursalController instancia;
		
    public SucursalController() {
    	sucursal = new ArrayList<Sucursal>();
    	sucursal.add(new Sucursal(1, "Barracas", "Av Montes de Oca 1100", null));
        sucursal.add(new Sucursal(2, "Belgrano", "Monroe 1215", null));
        sucursal.add(new Sucursal(3, "Palermo", "Scalabrini 1254", null));
        sucursal.add(new Sucursal(4, "La Boca", "Brandsen 805", null));
        sucursal.add(new Sucursal(5, "Nuñez", "Av Descenso 2011", null));
    	
    }

    /**
     * @param id 
     * @param denom 
     * @param dir
     */

     public static SucursalController getInstancia(){
        if(instancia==null)
            instancia=new SucursalController();
        return instancia;
     }
    public void agregarSucursal(int id, String denom, String dir) {
        // TODO implement here
    }
    public ArrayList<SucursalesView> obtenerSucursales(){
        ArrayList<SucursalesView> resultado=new ArrayList<SucursalesView>();
        for(Sucursal s:sucursal){
            resultado.add(s.toView());
        }
        return resultado;
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