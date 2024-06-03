package TPO3.controller;

import TPO3.model.Cliente;
import TPO3.model.Consumo;
import TPO3.model.Tarjeta;
import TPO3.model.TarjetaDebito;

import java.util.*;


public class TarjetaController {


    public TarjetaController() {
    }


    private Collection <Cliente> clientes;


    private Collection<Tarjeta> tarjetas;


    private TarjetaController instance;





    public void agregarConsumo( String nroTarjeta,  int mes,  int año,  float monto,  String comercio) {

    }


    public float calcularConsumoReal( String nroTarjeta,  int mes,  int año,  float monto) {

        return 0.0f;
    }


    private Tarjeta buscarTarjeta( String nroTarjeta) {
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.soyEsaTarjeta(nroTarjeta);

        return tarjeta;
    }


    public void altaTarjetaDeCredito( Cliente cliente,  String nroTarjeta) {

    }


    public void altaTarjetaDeDebito( Cliente cliente,  String nroTarjeta) {

    }


    public TarjetaController getInstance() {

    }


    public float calcularDebitoFinDeMes(Consumo consumo, int iva) {

        return 0.0f;
    }


    public float calcularCreditoFinDeMes( Consumo consumo,  int interes) {

        return 0.0f;
    }


    private  Cliente buscarCliente(int dni) {

        return null;
    }

}