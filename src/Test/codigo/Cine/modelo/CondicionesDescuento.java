package modelo;


import java.util.*;

import view.DescuentoView;

/**
 * 
 */
public class CondicionesDescuento {

    /**
     * Default constructor
     */
    public CondicionesDescuento(Date fchDesde, Date fchHasta, int diaSemana, float porcentaje, TipoTarjeta tipoTarjeta, ArrayList<TarjetaDescuento> TarjetaDescuento ) {
    	
    	this.diaSemana = diaSemana;
    	this.fchDesde = fchDesde;
    	this.fchHasta = fchHasta;
    	this.porcentaje = porcentaje;
    	this.tipoTarjeta = tipoTarjeta;
    	this.TarjetaDescuento = TarjetaDescuento;
    
    }

    /**
     * 
     */
    private Date fchDesde;

    /**
     * 
     */
    private Date fchHasta;

    /**
     * 
     */
    private int diaSemana;

    /**
     * 
     */
    private float porcentaje;

    /**
     * 
     */
    private TipoTarjeta tipoTarjeta;
    
    private List<TarjetaDescuento> TarjetaDescuento;

    public DescuentoView toView(){
        return new DescuentoView(diaSemana, tipoTarjeta, porcentaje);
    }





}