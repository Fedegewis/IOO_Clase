package Clase21deMayo.src.test;

import Clase21deMayo.src.controller.ClienteController;
import Clase21deMayo.src.dto.ClienteDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class ClienteControllerTest {

    private ClienteController clienteController;

    private ClienteDto dto;

    @BeforeEach
    public void init(){
        dto = new ClienteDto("Perez",
                "2333","amarillo","Ale","12");
    }

    @Test
    public void buscarTodosCliente() {
        clienteController = ClienteController.getInstance();
        dto = new ClienteDto("Perez",
                "2333","amarillo","Ale","12");
        clienteController.crearCliente(dto);
        List<ClienteDto> dtos =  clienteController.buscarTodosCliente();
        assertEquals(1,dtos.size());
    }

    @Test
    public void buscarClienteNulo() {
        clienteController = ClienteController.getInstance();
        dto = new ClienteDto("Perez",
                "2333","amarillo","Ale","12");
        clienteController.crearCliente(dto);
        ClienteDto dto1 = clienteController.buscarCliente("233");
        assertNull(dto1);
    }

    @Test
    public void buscarCliente() {
        clienteController = ClienteController.getInstance();
        dto = new ClienteDto("Perez",
                "2333","amarillo","Ale","12");
        clienteController.crearCliente(dto);
        ClienteDto dto1 = clienteController.buscarCliente("2333");
        assertEquals("Perez",dto1.getApellidoCliente());
    }

    @Test
    public void crearCliente() {
    }
}