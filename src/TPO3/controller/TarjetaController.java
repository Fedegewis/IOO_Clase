package TPO3.controller;

import TPO3.dto.TarjetaDTO;
import TPO3.model.Cliente;
import TPO3.model.Consumo;
import TPO3.model.Tarjeta;

import java.util.*;


public class TarjetaController {

    private static Collection<Cliente> clientes;

    private static Collection<Tarjeta> tarjetas;

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
/*
    private static Collection<Cliente> clientesNuevos(){
        clientes =new ArrayList<Cliente>();
        clientes.add(new Cliente("Pedro",1234));
        return  clientes;

    }
    private static Collection<Tarjeta> tarjetasNuevas(){
        List<Consumo> consumos=new ArrayList<>();
        consumos.add(new Consumo(1,12,2023,"UADE",46000));
        tarjetas =new ArrayList<>();
        tarjetas.add(new Tarjeta(1234,consumos,"1569"));
        return  tarjetas;
    }
    */

    //CREAR UN CLIENTE CONTROLLER PELOTUDO EN EL DIAGRAMA TAMBIEN Y QUE SEA ASOCIASION

    public void agregarConsumo( String nroTarjeta,  int mes,  int año,  float monto,  String comercio,int dni,int codigo) {
        for (Tarjeta tarjeta: tarjetas){
            if(tarjeta.soyEsaTarjeta(nroTarjeta)){
                tarjeta.crearConsumo(monto,comercio,año,mes,codigo);
            }
        }

    }


    public float calcularConsumoReal( String nroTarjeta,  int mes,  int año,  float monto,int dni,String comercio,int codigo) {
            if(buscarCliente(dni)!= null){
               if(buscarTarjeta(nroTarjeta)!=null){
                   for (Tarjeta tarjeta: tarjetas){
                       tarjeta.crearConsumo(monto,comercio,año,mes,codigo);
                       return tarjeta.calcularConsumo(monto);
                   }
               }
            }
        return 0;
    }


    private Tarjeta buscarTarjeta (String nroTarjeta) {
        Collection<TarjetaDTO>dtos=new ArrayList<>();
        for(Tarjeta tarjeta:tarjetas){
            for (int i =0; i<tarjetas.size();i++){
                if(nroTarjeta !=null && tarjeta.soyEsaTarjeta(nroTarjeta)){
                    return tarjeta;
                }
            }
        }

        return null;
    }


//PREGUNTAR ARRIBA Y ABAJO COMO HACER PARA QUE SEA DE LA CLASE TARJETAS Y CLIENTES

    private  Cliente buscarCliente(int dni) {
        for (Cliente cliente : clientes){
            for (int i =0; i<clientes.size();i++){
                if (dni != 0 && cliente.getCliente(dni)) {
                    return  cliente;
                }
            }
        }
        return null;
    }


    public void altaTarjetaDeCredito( Cliente cliente,  String nroTarjeta) {}

    public void altaTarjetaDeDebito( Cliente cliente,  String nroTarjeta) {}

    public float calcularDebitoFinDeMes(Consumo consumo, int iva) {return 0.0f;}

    public float calcularCreditoFinDeMes( Consumo consumo,  int interes) {return 0.0f;}

}