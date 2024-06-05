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

    public void agregarConsumo( Tarjeta tarjeta, Consumo consumo) {
            tarjeta.crearConsumo(consumo);
    }


    public float calcularConsumoReal( float monto,Tarjeta tarjeta) {
        float TotalConsumo=0;
        boolean isTC = tarjeta.getTipoTarjeta().equals("TC");
        boolean isTD = tarjeta.getTipoTarjeta().equals("TD");
        float cargo = tarjeta.getCargo();

        for (Consumo consumo : tarjeta.getConsumos()) {
            if (isTC) {
                TotalConsumo += consumo.getMonto() * (1 + (cargo / 100));
            } else if (isTD) {
                TotalConsumo += consumo.getMonto() - ((cargo / 100) * TotalConsumo);
            }
        }
        return TotalConsumo;
    }

    public boolean clienteNoTieneTarjeta(Cliente cliente){
        for (Tarjeta tarjeta: tarjetas){
            if(tarjeta.getTipoTarjeta().equals("TC") && tarjeta.getCliente().getDni() == cliente.getDni()){
                return false;
            }
            if (tarjeta.getTipoTarjeta().equals("TD") && tarjeta.getCliente().getDni() == cliente.getDni()) {
                return false;
            }
        }
        return true;
    }

    public void altaTarjetaDeCredito( Cliente cliente,  String nroTarjeta,float interes) {
        if(clienteNoTieneTarjeta(cliente)){
           Tarjeta tarjeta = new Tarjeta(cliente,new ArrayList<>(),nroTarjeta,"TC",interes);
           tarjetas.add(tarjeta);
        }
        else {
            System.out.println("El cliente ya tiene tarjeta de credito");
        }
    }

    public void altaTarjetaDeDebito( Cliente cliente,  String nroTarjeta,float iva) {
        if(clienteNoTieneTarjeta(cliente)){
            Tarjeta tarjeta = new Tarjeta(cliente,new ArrayList<>(),nroTarjeta,"TD",iva);
            tarjetas.add(tarjeta);
        }
        else {
            System.out.println("El cliente ya tiene tarjeta de debito");
        }
    }

    public float calcularDebitoFinDeMes(Consumo consumo, int iva) {return 0.0f;}

    public float calcularCreditoFinDeMes( Consumo consumo,  int interes) {return 0.0f;}



    public static TarjetaDTO toDTO(Tarjeta tarjeta){
        return new TarjetaDTO(ClienteController.toDTO(tarjeta.getCliente()),
                tarjeta.getNumeroTarjeta(),
                tarjeta.getTipoTarjeta(),
                String.valueOf(tarjeta.getCargo()));
    }


    public static  Tarjeta toModel(TarjetaDTO tarjetaDTO){
        return new Tarjeta(ClienteController.toModel(tarjetaDTO.getClienteDTO()),
                new ArrayList<>(),
                tarjetaDTO.getNroTarjeta(),
                tarjetaDTO.getTipoTarjeta(),
                Float.parseFloat(tarjetaDTO.getCargo()));
    }
}