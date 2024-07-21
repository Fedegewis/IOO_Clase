package TPO3.test;

import Ioo_Test.model.Cliente;
import TPO3.controller.ClienteController;
import TPO3.dto.ClienteDTO;
import org.junit.jupiter.api.Test;

import java.util.Collection;

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
    void buscarTodosLosClientes(){
        clienteController=ClienteController.getInstance();
        dto=new ClienteDTO("Tomas","444");
        dto2=new ClienteDTO("Federico","489");
        ClienteDTO dto3=new ClienteDTO("Federico","48974");
        clienteController.crearCliente(dto);
        clienteController.crearCliente(dto2);
        clienteController.crearCliente(dto3);
        Collection<ClienteDTO> dtoCollection=clienteController.buscarTodosLosClientes();
        assertEquals(3,dtoCollection.size());
    }
    @Test
    void crearCliente() {
        clienteController=ClienteController.getInstance();
        dto=new ClienteDTO("Tomas","444");
        dto2=new ClienteDTO("Federico","489");
        boolean dto1Boolean=clienteController.crearCliente(dto);
        boolean dto2Boolean =clienteController.crearCliente(dto2);
        assertTrue(dto1Boolean);
        assertTrue(dto2Boolean);
    }
}