package TPO3.controller;


import TPO3.dto.ClienteDTO;
import TPO3.model.Cliente;

import java.util.ArrayList;
import java.util.Collection;

public class ClienteController {

    private final Collection<Cliente> clientes;
    private static ClienteController INSTANCE = null;

    private ClienteController(){

        clientes=new ArrayList<>();
        cargaInicial();
    }

    public static ClienteController getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClienteController();
        }
        return INSTANCE;
    }

    public void cargaInicial(){
        ClienteDTO dto1=new ClienteDTO("Federico","454");
        ClienteDTO dto2=new ClienteDTO("Marcelo","4548");
        ClienteDTO dto3=new ClienteDTO("Jose","4574");
        clientes.add(toModel(dto1));
        clientes.add(toModel(dto2));
        clientes.add(toModel(dto3));
    }
    public ClienteDTO buscarClienteDNI(String dni) {
        for (Cliente cliente : clientes){
            if(dni != null && dni.equals(String.valueOf(cliente.getDni()))){
                return toDTO(cliente);
            }
        }
        return null;
    }

    public Collection<ClienteDTO> buscarTodosLosClientes(){
       Collection<ClienteDTO> dtos=new ArrayList<>();
       for(Cliente cliente : clientes){
           dtos.add(toDTO(cliente));
       }
       return dtos;
    }

    public boolean crearCliente(ClienteDTO clienteDTO) {
        if (clienteDTO != null && clienteDTO.getDniCliente() != null ){
            if (buscarClienteDNI(clienteDTO.getDniCliente()) == null){
                Cliente cliente = toModel(clienteDTO);
                clientes.add(cliente);
                //System.out.println("Cliente " + clienteDTO.getDniCliente() + " guardado con éxito");
                return true;
            }
            //System.out.println("Cliente "+ clienteDTO.getDniCliente() +" ya registrado");
            return false;
        }
        return false;
    }




    public static ClienteDTO toDTO(Cliente cliente){
        return  new ClienteDTO(cliente.getNombre()
                ,String.valueOf(cliente.getDni()));
    }


    public static Cliente toModel(ClienteDTO clienteDTO){
        return new Cliente(clienteDTO.getNombreCliente()
                ,Integer.parseInt(clienteDTO.getDniCliente()));
    }

}
