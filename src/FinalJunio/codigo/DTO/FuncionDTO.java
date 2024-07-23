package FinalJunio.codigo.DTO;

import FinalJunio.codigo.Modelo.Funcion;

public class FuncionDTO {

    private String pelicula;
    private String genero;


    public FuncionDTO(Funcion funcion) {
        pelicula=funcion.getPelicula().getNombrePelicula();
        genero=funcion.getPelicula().getGeneroID().name();
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "FuncionDTO{" +
                "pelicula='" + pelicula + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
