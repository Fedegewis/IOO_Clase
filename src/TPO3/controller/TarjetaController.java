package TPO3.controller;

import TPO3.dto.TarjetaDTO;
import TPO3.model.Cliente;
import TPO3.model.Consumo;
import TPO3.model.Tarjeta;

import java.util.*;


public class TarjetaController {

    private static Collection<Tarjeta> tarjetas;

    private static TarjetaController INSTANCE = null;

    private TarjetaController() {
        tarjetas =new ArrayList<>();
    }

    public TarjetaController getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TarjetaController();
        }
        return INSTANCE;
    }

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


    public boolean clienteNoTieneTarjeta(Cliente cliente){
        for (Tarjeta tarjeta: tarjetas){
            if(tarjeta.getTipoTarjeta() =="TC" && tarjeta.getCliente().getDni() == cliente.getDni()){
                return false;
            }
            if (tarjeta.getTipoTarjeta() =="TD" && tarjeta.getCliente().getDni() == cliente.getDni()) {
                return false;
            }
        }
        return true;
    }




    public void altaTarjetaDeCredito( Cliente cliente,  String nroTarjeta,float interes) {
        if(clienteNoTieneTarjeta(cliente)){
           Tarjeta tarjeta = new Tarjeta(cliente,new ArrayList<>(),nroTarjeta,"TC",interes);
        }
        else {
            System.out.println("El cliente ya existe");
        }
    }

    public void altaTarjetaDeDebito( Cliente cliente,  String nroTarjeta,float iva) {}

    public float calcularDebitoFinDeMes(Consumo consumo, int iva) {return 0.0f;}

    public float calcularCreditoFinDeMes( Consumo consumo,  int interes) {return 0.0f;}

}