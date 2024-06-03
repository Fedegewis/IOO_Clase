package TPO3.model;

import java.util.*;


public class Tarjeta {


    public Tarjeta(Cliente cliente, Collection consumos, String numeroTarjeta) {
        this.cliente = cliente;
        this.consumos = consumos;
        this.numeroTarjeta = numeroTarjeta;
    }


    private Cliente cliente;
    private Collection<Consumo> consumos;
    private String numeroTarjeta;



    public boolean soyEsaTarjeta( String numeroTarjeta) {
        return  true;

    }


    public void buscarConsumo() {
        
    }


    public void calcularConsumo( Consumo consumo) {

        //COMPLETAR PARA HACER POR DIAGRAMA DE SECUENCIA


    }

    public Collection<Consumo> getConsumos() {return consumos; }

    public void setConsumos(Collection consumos) {this.consumos = consumos; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) {this.cliente = cliente; }

    public String getNumeroTarjeta() {return numeroTarjeta; }

    public void setNumeroTarjeta(String numeroTarjeta) {this.numeroTarjeta = numeroTarjeta; }

}