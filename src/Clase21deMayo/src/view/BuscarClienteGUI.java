package Clase21deMayo.src.view;

import Clase21deMayo.src.controller.ClienteController;
import Clase21deMayo.src.dto.ClienteDto;

import java.util.List;

public class BuscarClienteGUI {

    private String dniText;

    private ClienteController clienteController;

    public BuscarClienteGUI(){
        clienteController = ClienteController.getInstance();
    }
    public String buscarCliente(String dniText){
        ClienteDto dto = clienteController.buscarCliente(dniText);
        return dto.toString();
    }

    public String buscarTodosLosClientes(){

        String msj = " ";
        List<ClienteDto> dtos = clienteController.buscarTodosCliente();
        for(int i = 0; i<dtos.size();i++){
            msj +=dtos.get(i).toString() + " ";
        }
        return msj;
    }
}
