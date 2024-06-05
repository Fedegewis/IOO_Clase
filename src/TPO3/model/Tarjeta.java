package TPO3.model;

import java.util.*;


public class Tarjeta {



    private Cliente cliente;
    private Collection<Consumo> consumos;
    private String numeroTarjeta;
    private String tipoTarjeta;
    private int

    public Tarjeta(Cliente cliente, Collection consumos, String numeroTarjeta,String tipoTarjeta) {
        this.cliente = cliente;
        this.consumos = consumos;
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta=tipoTarjeta;
    }




    public boolean soyEsaTarjeta( String numeroTarjeta) {
        return  true;
    }


    public void crearConsumo(float monto, String nombreEstablecimiento, int año,int mes, int codigo,String tipoTarjeta) {
        List<Consumo> consumos=new ArrayList<>();
        consumos.add(new Consumo(codigo,mes,año,nombreEstablecimiento,monto));
    }


    public float calcularConsumo( float monto) {

        //VER COMO HACER PARA DIFERENCIAR ENTRE TARJETA DE CREDITO Y DEBITO
        return 0;


    }



    public Collection<Consumo> getConsumos() {return consumos; }

    public void setConsumos(Collection consumos) {this.consumos = consumos; }

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public String getNumeroTarjeta() {return numeroTarjeta; }

    public void setNumeroTarjeta(String numeroTarjeta) {this.numeroTarjeta = numeroTarjeta; }

    public String getTipoTarjeta() {return tipoTarjeta;}

    public void setTipoTarjeta(String tipoTarjeta) {this.tipoTarjeta = tipoTarjeta;}
}