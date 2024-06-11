package TPO3.test;

import TPO3.controller.ClienteController;
import TPO3.dto.ClienteDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteControllerTest {

    private ClienteController clienteController;
    private ClienteDTO dto;
    private ClienteDTO dto2;


    @Test
    void buscarClienteDNI() {
        clienteController=ClienteController.getInstance();
        dto=new ClienteDTO("Tomas","444");
        dto2=new ClienteDTO("Federico","489");
        clienteController.crearCliente(dto);
        clienteController.crearCliente(dto2);
        ClienteDTO dtobusqueda=clienteController.buscarClienteDNI(dto2.getDniCliente());
        assertEquals("489",dtobusqueda.getDniCliente());
    }

    @Test
    void buscarClienteDNInulo() {
        clienteController=ClienteController.getInstance();
        dto=new ClienteDTO("Tomas","444");
        dto2=new ClienteDTO("Federico","489");
        clienteController.crearCliente(dto);
        clienteController.crearCliente(dto2);
        ClienteDTO dtobusqueda=clienteController.buscarClienteDNI("1456");
        assertNull(dtobusqueda);
    }

    @Test
    void crearCliente() {
    }
}