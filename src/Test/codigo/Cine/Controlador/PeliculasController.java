package Controlador;


import java.util.*;

import modelo.Pelicula;
import modelo.TipoGenero;
import modelo.TipoProyeccion;
import view.PeliculaView;

/**
 * 
 */
    	
public class PeliculasController {

    /**
     * Default constructor
     */
	
	private List<Pelicula> peliculas;
    private static PeliculasController instancia;
	
    public PeliculasController() {
    	
    	peliculas= new ArrayList<Pelicula>();
    	peliculas.add(new Pelicula(TipoGenero.Suspenso, "Fritz Lang", 180 , "La llorona", TipoProyeccion.DosD, Arrays.asList(" Principal", " Secundario")));
        peliculas.add(new Pelicula(TipoGenero.Drama, "Quentin Tarantino", 240 , "El drama del Pais", TipoProyeccion.TresD, Arrays.asList("Robert Downey", "Madonna")));
        peliculas.add(new Pelicula(TipoGenero.Terror, "Steven Spielberg", 240 , "El ultimo Dia", TipoProyeccion.CuatroD, Arrays.asList("Robert ", "Madonna")));
    }

    public static PeliculasController getInstancia(){
        if(instancia==null)
            instancia=new PeliculasController();
        return instancia;
    }
    public void ABM() {
        // TODO implement here
    }
    public ArrayList<PeliculaView> obtenerPeliculas(){
        ArrayList<PeliculaView> resultado=new ArrayList<PeliculaView>();
        for(Pelicula pelicula:peliculas){
            resultado.add(pelicula.toView());
        }
        return resultado;
    } 

}