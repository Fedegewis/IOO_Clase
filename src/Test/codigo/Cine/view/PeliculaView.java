package view;

import java.util.List;

import modelo.TipoGenero;
import modelo.TipoProyeccion;

public class PeliculaView {
    private TipoGenero generoID;
    private String director;
    private int duracionEnMinutos;
    private String nombrePelicula;
    private TipoProyeccion tipo;
    private List<String> actores;

    public PeliculaView(TipoGenero generoID, String director, int duracionEnMinutos, String nombrePelicula, TipoProyeccion tipo, List<String> actores){
        this.actores = actores;
        this.director = director;
        this.duracionEnMinutos = duracionEnMinutos;
        this.generoID = generoID;
        this.nombrePelicula = nombrePelicula;
        this.tipo = tipo;
    }
    public TipoGenero getGeneroID(){
        return generoID;
    }
    public void setGeneroID(TipoGenero generoID){
        this.generoID=generoID;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public int getDuracionEnMinutos(){
        return duracionEnMinutos;
    }
    public void setDuraionEnMinutos(int duracionEnMinutos){
        this.duracionEnMinutos = duracionEnMinutos;
    }
    public String getNombrePelicula(){
        return nombrePelicula;
    }
    public void setNombrePelicula(String nombrePelicula){
        this.nombrePelicula = nombrePelicula;
    }
    public TipoProyeccion getTipo(){
        return tipo;
    }
    public void setTipo(TipoProyeccion tipo){
        this.tipo = tipo;
    }
    public List<String> getActores(){
        return actores;
    }
    public void setActores(List<String> actores){
        this.actores = actores;
    } 
    public String toString(){
        return(nombrePelicula+" - "+generoID+" - "+director+" - "+duracionEnMinutos+" - "+tipo+" - "+actores);
    }

}