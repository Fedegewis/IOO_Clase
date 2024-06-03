package TPO3.controller;

import Clase28deMayo.src.uade.edu.ar.controller.Controller;
import TPO3.model.Cliente;
import TPO3.model.Consumo;
import TPO3.model.Tarjeta;
import TPO3.model.TarjetaDebito;

import java.util.*;


public class TarjetaController {

    private Collection <Cliente> clientes;


    private Collection<Tarjeta> tarjetas;


    private TarjetaController INSTANCE = null;

    private TarjetaController() {
        clientes = new ArrayList<>();
        tarjetas =new ArrayList<>();
    }






    public TarjetaController getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TarjetaController();
        }
        return INSTANCE;
    }


    public void agregarConsumo( String nroTarjeta,  int mes,  int año,  float monto,  String comercio) {

    }


    public float calcularConsumoReal( String nroTarjeta,  int mes,  int año,  float monto) {

        return 0.0f;
    }


    private Tarjeta buscarTarjeta( String nroTarjeta) {
        List<Tarjeta>tarjetas = new ArrayList<>();
        for (Tarjeta tarjeta: tarjetas){
            if (tarjeta.soyEsaTarjeta(nroTarjeta))
                return tarjeta;
        }
        return null;
    }




    private  Cliente buscarCliente(int dni) {
        Cliente cliente = null;
        for (int i =0; i<clientes.size();i++){
            if (dni != 0 && cliente.getCliente(dni)) {
                return  cliente;
            }
        }
        return null;

    }


    public void altaTarjetaDeCredito( Cliente cliente,  String nroTarjeta) {}

    public void altaTarjetaDeDebito( Cliente cliente,  String nroTarjeta) {}

    public float calcularDebitoFinDeMes(Consumo consumo, int iva) {return 0.0f;}

    public float calcularCreditoFinDeMes( Consumo consumo,  int interes) {return 0.0f;}

}