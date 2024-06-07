package TPO3.controller;

import TPO3.dto.TarjetaDTO;
import TPO3.model.*;

import java.util.*;


public class TarjetaController {

    private static Collection<Tarjeta> tarjetas;
    private static Collection<Consumo> consumos;
    private static TarjetaController INSTANCE = null;

    private TarjetaController() {
        tarjetas =new ArrayList<>();
        consumos=new ArrayList<>();
    }

    public static TarjetaController getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new TarjetaController();
        }
        return INSTANCE;
    }



    public void agregarConsumo( Tarjeta tarjeta, Consumo consumo) {
            tarjeta.cargarConsumo(consumo);
            consumos.add(consumo);
    }



    public float calcularConsumoReal(Tarjeta tarjeta,int mesI, int añoI, int mesF,int añoF) {
        float TotalConsumo=0;
        boolean isTC = tarjeta.getTipoTarjeta().equals("TC");
        boolean isTD = tarjeta.getTipoTarjeta().equals("TD");
        float cargo = tarjeta.getCargo();

        for (Consumo consumo : tarjeta.getConsumos()) {
            if(consumo.getMes() >= mesI && consumo.getAño() >=  añoI && consumo.getMes() <= mesF && consumo.getAño() <=  añoF){
                if (isTC) {
                    TotalConsumo += consumo.getMonto() * (1 + (cargo / 100));
                } else if (isTD) {
                    TotalConsumo += consumo.getMonto() - ((cargo / 100) * consumo.getMonto());
                }
            }
        }
        return TotalConsumo;
    }

    private boolean clienteNoTieneTarjeta(Cliente cliente,String tipoTarjeta){
        for (Tarjeta tarjeta: tarjetas){
            if(tipoTarjeta.equals("TC")&& tarjeta.getCliente().getDni() == cliente.getDni() && tarjeta.getTipoTarjeta().equals("TC")){
                return false;
            }
            else if (tipoTarjeta.equals("TD") && tarjeta.getCliente().getDni() == cliente.getDni() && tarjeta.getTipoTarjeta().equals("TD")) {
                return false;
            }
        }
        return true;
    }

    public void altaTarjetaDeCredito( Cliente cliente,  String nroTarjeta,float interes) {
        if(clienteNoTieneTarjeta(cliente,"TC")){
           Tarjeta tarjeta = new Tarjeta(cliente,new ArrayList<>(),nroTarjeta,"TC",interes);
           tarjetas.add(tarjeta);
            System.out.println("Tarjeta de credito creada para DNI: "+ cliente.getDni());
        }
        else {
            System.out.println("El cliente ya tiene tarjeta de credito");
        }
    }

    public void altaTarjetaDeDebito( Cliente cliente,  String nroTarjeta,float iva) {
        if(clienteNoTieneTarjeta(cliente,"TD")){
            Tarjeta tarjeta = new Tarjeta(cliente,new ArrayList<>(),nroTarjeta,"TD",iva);
            tarjetas.add(tarjeta);
            System.out.println("Tarjeta de debito creada para DNI: "+ cliente.getDni());
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