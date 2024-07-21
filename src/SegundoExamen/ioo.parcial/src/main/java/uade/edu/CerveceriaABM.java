package uade.edu;
import java.util.*;

/**
 * 
 */
public class CerveceriaABM {


    private List<Ticket> tickets = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    /**
     * Default constructor
     */
    public CerveceriaABM() {
    }

    /**
     * @return
     */
    public CerverzaDTO cervezaMasTomada() {
        // TODO implement here
        return null;
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
    public float getRecaudacionPorCerveza() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param fchDesde 
     * @param fchHasta 
     * @return
     */
    public float getRecaudacionPorMesa(Date fchDesde, Date fchHasta) {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public int getVariedadesPromedioPorVenta() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int agregarVenta() {
        // TODO implement here
        return 0;
    }

    /**
     * @param ventaID 
     * @param variedadID 
     * @param presentacionID
     */
    public void agregarCervezaVenta(int ventaID, int variedadID, int presentacionID) {
        // TODO implement here
    }

    /**
     * @param clienteID 
     * @param tarjetaID
     */
    public void asignarTarjetaCliente(int clienteID, TipoTarjeta tarjetaID) {
        // TODO implement here
    }

}