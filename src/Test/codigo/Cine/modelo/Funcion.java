package modelo;

import java.util.*;

import view.FuncionView;

/**
 * 
 */
public class Funcion {

    /**
     * Default constructor
     */
    public Funcion(Date fecha, int funcionID, String horario, List<Entrada> entradas, Sala sala) {
    	
    	this.entradas = entradas;
    	this.fecha = fecha;
    	this.funcionID = funcionID;
    	this.horario = horario;    	
    	this.sala = sala;
    	
    }

    /**
     * 
     */
    private int funcionID;

    /**
     * 
     */
    private String horario;

    /**
     * 
     */
    private Date fecha;

    /**
     * 
     */
    private List<Entrada> entradas;

    private Sala sala;



    /**
     * @return
     */
    public int getSalaID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getSucursalID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getPeliculaID() {
        // TODO implement here
        return 0;
    }

    /**
     * 
     */
    public int getCantidadAsientosDisponibles() {
    	int asientos=this.sala.getAsientos();

		return asientos-entradas.size();
        
    }

    /**
     * @return
     */
    public int getFuncionID() { 
        return this.funcionID;
    }

    /**
     * 	
     */
    public Date getFecha() {
		return fecha;
        // TODO implement here
    }
    public FuncionView toView(){
        return new FuncionView(fecha, funcionID, horario);
    }
}