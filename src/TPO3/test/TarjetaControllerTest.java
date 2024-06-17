package TPO3.test;

import TPO3.controller.TarjetaController;
import TPO3.dto.ClienteDTO;
import TPO3.dto.TarjetaDTO;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class TarjetaControllerTest {

    ClienteDTO dto1= new ClienteDTO("Federico","112");
    ClienteDTO dto2= new ClienteDTO("Federico","1128");


    @Test
    void altaTarjetaDeCredito() {
        TarjetaController tarjeta= TarjetaController.getInstance();
        boolean res1=tarjeta.altaTarjetaDeCredito(dto1,"11254",40f);
        boolean res2=tarjeta.altaTarjetaDeCredito(dto2,"458",10f);
        assertTrue(res1);
        assertTrue(res2);
    }

    @Test
    void altaTarjetaDeDebito() {
        TarjetaController tarjeta= TarjetaController.getInstance();
        boolean res1=tarjeta.altaTarjetaDeDebito(dto1,"45",40f);
        boolean res2=tarjeta.altaTarjetaDeDebito(dto2,"79",30f);
        assertTrue(res1);
        assertTrue(res2);
    }

    @Test
    void buscarTodasLasTarjetas() {
        TarjetaController tarjeta=TarjetaController.getInstance();
        tarjeta.altaTarjetaDeCredito(dto1,"11254",40f);
        tarjeta.altaTarjetaDeCredito(dto2,"458",10f);
        tarjeta.altaTarjetaDeDebito(dto1,"45",40f);
        tarjeta.altaTarjetaDeDebito(dto2,"79",30f);
        Collection<TarjetaDTO> dtos=tarjeta.buscarTodasLasTarjetas();
        assertEquals(4,dtos.size());
    }
    @Test
    void clienteNoTieneTarjeta(){
        TarjetaController tarjeta=TarjetaController.getInstance();
        tarjeta.altaTarjetaDeCredito(dto1,"11254",40f);
        tarjeta.altaTarjetaDeCredito(dto2,"458",10f);
        tarjeta.altaTarjetaDeDebito(dto1,"45",40f);
        tarjeta.altaTarjetaDeDebito(dto2,"79",30f);
        boolean tc1=tarjeta.clienteNoTieneTarjeta(dto1,"TC");
        boolean td1=tarjeta.clienteNoTieneTarjeta(dto1,"TD");
        assertFalse(tc1);
        assertFalse(td1);
    }
}