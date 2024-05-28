package Ioo_Test.controller;

import Ioo_Test.dto.ClienteDto;
import Ioo_Test.model.Cliente;
import Ioo_Test.model.Direccion;

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

    public void crearCliente(ClienteDto dto) {

        Direccion direccion = new Direccion(dto.getCalleDireccionCliente(),
                Integer.valueOf(dto.getNumeroDireccionCliente()));

        Cliente cliente = new Cliente(dto.getNombreCliente(),
                dto.getApellidoCliente(),Integer.valueOf(dto.getDniCliente()));
        cliente.setDireccion(direccion);

        clientes.add(cliente);
    }
}
