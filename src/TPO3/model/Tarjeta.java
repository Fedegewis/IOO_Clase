package TPO3.model;

import java.util.*;


public class Tarjeta {


    public Tarjeta(int dni, Collection consumos, String numeroTarjeta) {
        this.dni = dni;
        this.consumos = consumos;
        this.numeroTarjeta = numeroTarjeta;
    }



    private int dni;
    private Collection<Consumo> consumos;
    private String numeroTarjeta;



    public boolean soyEsaTarjeta( String numeroTarjeta) {
        return  true;

    }


    public void crearConsumo(float monto, String nombreEstablecimiento, int año,int mes, int codigo) {
        List<Consumo> consumos=new ArrayList<>();
        consumos.add(new Consumo(codigo,mes,año,nombreEstablecimiento,monto));
    }


    public float calcularConsumo( float monto) {
        //VER COMO HACER PARA DIFERENCIAR ENTRE TARJETA DE CREDITO Y DEBITO
        return 0;


    }

    public Collection<Consumo> getConsumos() {return consumos; }

    public void setConsumos(Collection consumos) {this.consumos = consumos; }


    public int getDni() {return dni;}

    public void setDni(int dni) {this.dni = dni;}

    public String getNumeroTarjeta() {return numeroTarjeta; }

    public void setNumeroTarjeta(String numeroTarjeta) {this.numeroTarjeta = numeroTarjeta; }

}