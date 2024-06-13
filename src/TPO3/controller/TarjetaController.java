package TPO3.controller;

import TPO3.dto.ClienteDTO;
import TPO3.dto.ConsumoDTO;
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



    public float calcularConsumoReal(TarjetaDTO tarjetaDTO,int mesI, int añoI, int mesF,int añoF) {
        float TotalConsumo=0;
        boolean isTC = tarjetaDTO.getTipoTarjeta().equals("TC");
        boolean isTD = tarjetaDTO.getTipoTarjeta().equals("TD");
        float cargo =  Float.parseFloat(tarjetaDTO.getCargo()) ;
        Tarjeta tarjeta=toModelTarjeta(tarjetaDTO);
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

    private boolean clienteNoTieneTarjeta(ClienteDTO clienteDTO,String tipoTarjeta){
        for (Tarjeta tarjeta: tarjetas){
            if(tipoTarjeta.equals("TC")&& tarjeta.getCliente().getDni() == Integer.parseInt(clienteDTO.getDniCliente()) && tarjeta.getTipoTarjeta().equals("TC")){
                return false;
            }
            else if (tipoTarjeta.equals("TD") && tarjeta.getCliente().getDni() == Integer.parseInt(clienteDTO.getDniCliente()) && tarjeta.getTipoTarjeta().equals("TD")) {
                return false;
            }
        }
        return true;
    }

    public boolean altaTarjetaDeCredito(ClienteDTO clienteDTO, String nroTarjeta, float interes) {
        if(clienteNoTieneTarjeta(clienteDTO,"TC")){
           TarjetaDTO tarjetaDTO = new TarjetaDTO(clienteDTO,new ArrayList<>(),nroTarjeta,"TC",String.valueOf(interes));
           tarjetas.add(toModelTarjeta(tarjetaDTO));
            System.out.println("Tarjeta de credito creada para DNI: "+ clienteDTO.getDniCliente());
            return true;
        }
        else {
            System.out.println("El cliente ya tiene tarjeta de credito");
            return false;
        }
    }

    public boolean altaTarjetaDeDebito( ClienteDTO clienteDTO,  String nroTarjeta,float iva) {
        if(clienteNoTieneTarjeta(clienteDTO,"TD")){
            TarjetaDTO tarjetaDTO = new TarjetaDTO(clienteDTO,new ArrayList<>(),nroTarjeta,"TD",String.valueOf(iva));
            tarjetas.add(toModelTarjeta(tarjetaDTO));
            System.out.println("Tarjeta de debito creada para DNI: "+ clienteDTO.getDniCliente());
            return true;
        }
        else {
            System.out.println("El cliente ya tiene tarjeta de debito");
            return false;
        }
    }

    public Collection<TarjetaDTO> buscarTodasLasTarjetas(){
        Collection<TarjetaDTO> dtos= new ArrayList<>();
        for(Tarjeta tarjeta:tarjetas){
            dtos.add(toDTOTarjeta(tarjeta));
        }
        return dtos;
    }

    public float calcularDebitoFinDeMes(Consumo consumo, int iva) {return 0.0f;}

    public float calcularCreditoFinDeMes( Consumo consumo,  int interes) {return 0.0f;}



    public static TarjetaDTO toDTOTarjeta(Tarjeta tarjeta){
        return new TarjetaDTO(ClienteController.toDTO(tarjeta.getCliente()),
                new ArrayList<>(),
                tarjeta.getNumeroTarjeta(),
                tarjeta.getTipoTarjeta(),
                String.valueOf(tarjeta.getCargo()));
    }


    public static  Tarjeta toModelTarjeta(TarjetaDTO tarjetaDTO){
        return new Tarjeta(ClienteController.toModel(tarjetaDTO.getClienteDTO()),
                new ArrayList<>(),
                tarjetaDTO.getNroTarjeta(),
                tarjetaDTO.getTipoTarjeta(),
                Float.parseFloat(tarjetaDTO.getCargo()));
    }



    public static ConsumoDTO toDTOConsumo (Consumo consumo){
        return new ConsumoDTO( String.valueOf(consumo.getCodigo()),
                String.valueOf(consumo.getMes()),
                String.valueOf(consumo.getAño())
                , String.valueOf(consumo.getNombreEstablecimiento()),
                String.valueOf(consumo.getMonto()));
    }


    public static Consumo toModelConsumo(ConsumoDTO consumoDTO){
        return new Consumo(Integer.parseInt(consumoDTO.getCodigoConsumo())
                      , Integer.parseInt(consumoDTO.getMesConsumo())
                      ,Integer.parseInt(consumoDTO.getAñoConsumo())
                     , consumoDTO.getNombreEstablecimientoConsumo()
                     ,Integer.parseInt(consumoDTO.getMontoConsumo()));
    }
}