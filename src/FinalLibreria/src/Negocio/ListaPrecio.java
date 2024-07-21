
package src.Negocio;

import src.Extras.ClienteDTO;

import java.util.*;

/**
 * 
 */
public class ListaPrecio {
    List<Cliente> clientes = new ArrayList<Cliente>();

    /**
     * Default constructor
     */
    public ListaPrecio(int listaPreciosID, String descripcion ) {
        this.listaPreciosID = listaPreciosID;
        this.descripcion = descripcion;
    }

    public int addCliente(Cliente c){
        clientes.add(c);
        return clientes.size();
    }

    /**
     * 
     */
    private int listaPreciosID;

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    public int getListaPrecioID() {
        // TODO implement here
        return listaPreciosID;
    }

    /**
     * 
     */
    public ArrayList<ClienteDTO> getClientes() {
        ArrayList<ClienteDTO> result = new ArrayList<ClienteDTO>();
        for (Cliente c: clientes) {
            result.add(c.toDTO());
        }
        return result;
    }

}