package TPO3.model;


public class Cliente {


    private String nombre;
    private int dni;


    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }



    public int getDni() {return dni;}

    public void setDni(int dni) {this.dni = dni;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}


}