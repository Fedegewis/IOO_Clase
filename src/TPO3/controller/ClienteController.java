package TPO3.controller;


import TPO3.dto.ClienteDTO;
import TPO3.model.Cliente;

import java.util.ArrayList;
import java.util.Collection;

public class ClienteController {

    private Collection<Cliente> clientes;
    private static ClienteController INSTANCE = null;

    private ClienteController(){
        clientes=new ArrayList<>();
    }

    public ClienteController getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClienteController();
        }
        return INSTANCE;
    }


    private ClienteDTO buscarClienteDNI(String dni) {
        for (Cliente cliente : clientes){
            if(dni!=null && !dni.equals(String.valueOf(cliente.getDni()))){
                return toDTO(cliente);
            }
        }
        return null;
    }



    public boolean crearCliente(ClienteDTO clienteDTO) {
        if (clienteDTO!=null && clienteDTO.getDniCliente()!=null){
            for (Cliente cliente : clientes){
                if (cliente.getDni() == Integer.parseInt(clienteDTO.getDniCliente())){
                    return false;
                    //Ver si quiero probarlo poner aca el SOP
                }
            }
            clientes.add(toModel(clienteDTO));
            return true;
        }
        return false;
    }





    public static ClienteDTO toDTO (Cliente cliente){
        return  new ClienteDTO(cliente.getNombre()
                ,String.valueOf(cliente.getDni()));
    }


    public static Cliente toModel(ClienteDTO clienteDTO){
        return new Cliente(clienteDTO.getNombreCliente()
                ,Integer.parseInt(clienteDTO.getDniCliente()));
    }

}
