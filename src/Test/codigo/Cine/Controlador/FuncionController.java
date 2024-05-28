package Test.codigo.Cine.Controlador;

import dto.FuncionDTO;
import modelo.Entrada;
import modelo.Funcion;
import modelo.Pelicula;
import modelo.Sala;
import modelo.TipoGenero;
import modelo.TipoProyeccion;
import view.FuncionView;

import java.util.*;

/**
 * 
 */
public class FuncionController {

    private List<Funcion> funcion;
    private Funcion funciones;

    public static FuncionController instancia;

    FuncionController() {
        funcion = new ArrayList<Funcion>();
        funcion.add(new Funcion(new Date(), 1, "11:00", new ArrayList<Entrada>(), new Sala(2, null, 40)));
        funcion.add(new Funcion(new Date(), 2, "12:00", new ArrayList<Entrada>(), new Sala(1, "¨Programacion", 40)));
        funcion.add(new Funcion(new Date(), 1, "16:00", new ArrayList<Entrada>(), new Sala(5, "Pruebas", 50)));
    }

    public static FuncionController getInstancia() {
        if (instancia == null) {
            instancia = new FuncionController();
        }
        return instancia;
    }

    public void ABM() {
        // TODO implement here
    }

    /**
     * @param funcionID
     * @return
     */
    public int obtenerAsientosDisponiblePorFuncion(int funcionID) {
        for (Funcion f : funcion) {
            int funcioniD = f.getFuncionID();
        }
        int cantidad=funciones.getCantidadAsientosDisponibles();
        return cantidad;
    }
    

    public ArrayList<FuncionView> obtenerFuncion() {
        ArrayList<FuncionView> resultado = new ArrayList<FuncionView>();
        for (Funcion funcion : funcion) {
            resultado.add(funcion.toView());
        }
        return resultado;
    }

    /**
     * @param fchFuncion
     * @return
     */
    public List<FuncionDTO> getListaFunciones(Date fchFuncion) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int peliculaMasVista() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int diaDeLaSemanaConMenorVentas() {
        // TODO implement here
        return 0;
    }

}