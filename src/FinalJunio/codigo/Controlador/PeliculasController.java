package FinalJunio.codigo.Controlador;

import FinalJunio.codigo.Modelo.Pelicula;
import FinalJunio.codigo.Enum.TipoGenero;
import FinalJunio.codigo.Enum.TipoProyeccion;

import java.util.*;


/**
 * 
 */
    	
public class PeliculasController {

    /**
     * Default constructor
     */
	private static PeliculasController INSTANCE=null;
	private List<Pelicula> peliculas;
	
    private PeliculasController() {
    	
    	peliculas= new ArrayList<Pelicula>();
    	peliculas.add(new Pelicula(TipoGenero.Suspenso, "Pelicula1", 180 , "Director X", TipoProyeccion.DosD, Arrays.asList("Actriz Principal", "Actor Secundario"),null));

    }

    public PeliculasController getInstance(){
        if(INSTANCE==null){
            INSTANCE=new PeliculasController();
        }
        return INSTANCE;
    }
    /**
     * 
     */
    public void ABM() {
        // TODO implement here
    }

}