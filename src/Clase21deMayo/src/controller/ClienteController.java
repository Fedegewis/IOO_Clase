package Clase21deMayo.src.controller;

import Clase21deMayo.src.dto.ClienteDto;
import Clase21deMayo.src.model.Cliente;
import Clase21deMayo.src.model.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    private List<Cliente> clientes;

    private static ClienteController INSTANCE = null;

    private ClienteController(){
        clientes = new ArrayList<>();
    }

    public static ClienteController getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ClienteController();
        }
        return INSTANCE;

    }

    public List<ClienteDto> buscarTodosCliente(){

        List<ClienteDto> dtos = new ArrayList<ClienteDto>();
        for (int i = 0;i< clientes.size();i++){
            dtos.add(toDto(clientes.get(i)));
        }

        return dtos;
    }

    public ClienteDto buscarCliente(String dni){
        ClienteDto clienteDto = null;
        for (int i = 0; i< clientes.size(); i++){
            if( dni != null && !dni.isEmpty()
                    && Integer.valueOf(dni) == clientes.get(i).getDni()){
                clienteDto = toDto(clientes.get(i));
            }
        }
        return clienteDto;
    }

    public void crearCliente(ClienteDto dto) {
        if(dto != null &&
                buscarCliente(dto.getDniCliente()) == null){
            clientes.add(toModel(dto));
        }
    }

    private static ClienteDto toDto(Cliente cliente){
        return    new ClienteDto(cliente.getApellido()
                ,String.valueOf(cliente.getDni()),cliente.getDireccion().getCalle(),cliente.getNombre()
                ,String.valueOf(cliente.getDireccion().getNumero()));
    }

    private static Cliente toModel(ClienteDto dto){
        Direccion direccion = new Direccion(dto.getCalleDireccionCliente(),
                Integer.valueOf(dto.getNumeroDireccionCliente()));

        Cliente cliente = new Cliente(dto.getNombreCliente(),
                dto.getApellidoCliente(),Integer.valueOf(dto.getDniCliente()));
        cliente.setDireccion(direccion);
        return cliente;
    }
}
