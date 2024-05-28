package view;

import modelo.TipoTarjeta;

public class DescuentoView {
    private int diaSemana;
    private TipoTarjeta tipoTarjeta;
    private float porcentaje;

    public DescuentoView(int diaSemana,TipoTarjeta tipoTarjeta ,float porcentaje){
        this.diaSemana=diaSemana;
        this.tipoTarjeta=tipoTarjeta;
        this.porcentaje=porcentaje;
    }
    public int getDiaSemana(){
        return diaSemana;
    }
    public TipoTarjeta getTipoTarjeta(){
        return tipoTarjeta;
    }
    public float getPorcentaje(){
        return porcentaje;
    }
    public void setDiaSemana(int diaSemana){
        this.diaSemana=diaSemana;
    }
    public void setTipoTarjeta(TipoTarjeta tipoTarjeta){
        this.tipoTarjeta=tipoTarjeta;
    }
    public void setPorcentaje(float porcentaje){
        this.porcentaje=porcentaje;
    }
    public String toString(){
        return("Tarjeta: "+tipoTarjeta+", Descuento del: "+porcentaje+"%, Dia: "+diaSemana);
    }
    
}


