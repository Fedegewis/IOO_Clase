package TPO3.model;

import java.util.*;


public class Tarjeta {



    private Cliente cliente;
    private Collection<Consumo> consumos;
    private String numeroTarjeta;
    private String tipoTarjeta;
    private float cargo;

    public Tarjeta(Cliente cliente, Collection consumos, String numeroTarjeta,String tipoTarjeta,float cargo) {
        this.cliente = cliente;
        this.consumos = consumos;
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta=tipoTarjeta;
        this.cargo = cargo;
    }




    public void cargarConsumo(Consumo consumo) {
        List<Consumo> consumos=new ArrayList<>();
        consumos.add(new Consumo(consumo.getCodigo()
                ,consumo.getMes()
                ,consumo.getAño()
                ,consumo.getNombreEstablecimiento()
                ,consumo.getMonto()));
    }


    public Collection<Consumo> getConsumos() {return consumos; }

    public void setConsumos(Collection consumos) {this.consumos = consumos; }

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public String getNumeroTarjeta() {return numeroTarjeta; }

    public void setNumeroTarjeta(String numeroTarjeta) {this.numeroTarjeta = numeroTarjeta; }

    public String getTipoTarjeta() {return tipoTarjeta;}

    public void setTipoTarjeta(String tipoTarjeta) {this.tipoTarjeta = tipoTarjeta;}

    public float getCargo() {return cargo;}

    public void setCargo(float cargo) {this.cargo = cargo;}
}