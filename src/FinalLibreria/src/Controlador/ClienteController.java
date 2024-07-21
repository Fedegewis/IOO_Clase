package src.Controlador;

import src.Extras.ClienteDTO;
import src.Extras.TipoCliente;
import src.Negocio.Cliente;
import src.Negocio.ListaPrecio;

import java.util.*;

/**
 * 
 */
public class ClienteController {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<ListaPrecio> listaprecios = new ArrayList<ListaPrecio>();

    /**
     * Default constructor
     */
    public ClienteController() {
        listaprecios.add(new ListaPrecio(1, "Lista precios general"));
        listaprecios.add(new ListaPrecio(2, "Lista clientes 2 años permanencia"));
        listaprecios.add(new ListaPrecio(3, "LP Sector público"));

        clientes.add(new Cliente(listaprecios.get(0), "cuit1", "Razon Social Cliente 1", TipoCliente.ConsumidorFinal));
        clientes.add(new Cliente(listaprecios.get(0), "cuit2", "Razon Social Cliente 2", TipoCliente.ConsumidorFinal));
        clientes.add(new Cliente(listaprecios.get(0), "cuit3", "Razon Social Cliente 3", TipoCliente.ConsumidorFinal));
        clientes.add(new Cliente(listaprecios.get(1), "cuit4", "Razon Social Cliente 4", TipoCliente.ResponsableInscripto));
        clientes.add(new Cliente(listaprecios.get(2), "cuit5", "Ministerio de educación", TipoCliente.Exento));
    }

    /**
     * @param lpID
     */
    public List<ClienteDTO> getClientesPorListaPrecio(int lpID) {
        ArrayList<ClienteDTO> result = null;
        for (ListaPrecio lp: listaprecios) {
            if (lp.getListaPrecioID() == lpID)
            {
                result = lp.getClientes();
                break;
            }
        }
        return result;
    }

    /**
     * @param cantFacturas
     */
    public List<ClienteDTO>  getClienteConFacturasAdeudadas(int cantFacturas) {
        ArrayList<ClienteDTO> result = new ArrayList<ClienteDTO>();
        for (Cliente c: this.clientes) {
            if (c.tieneFacturasImpagas(cantFacturas))
                result.add(c.toDTO());
        }

        return result;
    }

}