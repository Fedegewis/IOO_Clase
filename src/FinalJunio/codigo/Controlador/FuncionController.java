package FinalJunio.codigo.Controlador;

import FinalJunio.codigo.DTO.FuncionDTO;
import FinalJunio.codigo.Enum.TipoGenero;
import FinalJunio.codigo.Enum.TipoProyeccion;
import FinalJunio.codigo.Modelo.Entrada;
import FinalJunio.codigo.Modelo.Funcion;
import FinalJunio.codigo.Modelo.Pelicula;
import FinalJunio.codigo.Modelo.Sala;

import java.util.*;

/**
 * 
 */
public class FuncionController {
	
	private List<Funcion> funciones;

	private static FuncionController INSTANCE= null;
	
	private FuncionController() {
    	funciones = new ArrayList<Funcion>();
    	funciones.add(new Funcion(new Date(), 1, "11:00", new ArrayList<Entrada>(), new Sala(0, null, 0),
                new Pelicula(TipoGenero.Terror,"steven spielberg",120,"Tiburon", TipoProyeccion.DosD,new ArrayList<>(),null)));

    }

    public FuncionController getInstance(){
        if(INSTANCE==null){
            INSTANCE=new FuncionController();
        }
        return INSTANCE;
    }


    /**
     * 
     */
    public void ABM() {
        // TODO implement here
    }

    /**
     * @param funcionID 
     * @return
     */
    public int obtenerAsientosDisponiblePorFuncion(int funcionID) {
    	int asientos = -1;
		return asientos;
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

    public List<Funcion> buscarPeliculaPorFuncion(int peliculaID) {
        List<Funcion> funcionesDeLaPelicula = new ArrayList<>();
        for (Funcion funcion : funciones) {
            if (funcion.getPeliculaID() == peliculaID){
                funcionesDeLaPelicula.add(funcion);
            }
        }
        return funcionesDeLaPelicula;
    }

    public List<Funcion> buscarPeliculaPorGenerosFuncion(TipoGenero genero) {
        List<Funcion> funcionesDeLaPelicula = new ArrayList<>();
        for (Funcion funcion : funciones) {
            if (funcion.getPelicula().getGeneroID() == genero){
                funcionesDeLaPelicula.add(funcion);
            }
        }
        return funcionesDeLaPelicula;
    }
}