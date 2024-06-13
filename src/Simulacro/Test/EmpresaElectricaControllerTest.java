package Simulacro.Test;

import Simulacro.Controller.EmpresaElectricaController;
import Simulacro.DTO.UsuarioIndustrialDTO;
import Simulacro.DTO.UsuarioResidencialDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaElectricaControllerTest {
    private EmpresaElectricaController empresaElectricaController;

    @Test
    void crearUsuarioResidencial() {
        empresaElectricaController= EmpresaElectricaController.getInstance();
        UsuarioResidencialDTO dto = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "444");
        UsuarioResidencialDTO dto2 = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "444");
        int resueltoDTO=empresaElectricaController.crearUsuarioResidencial(dto);
        int resueltoDTO2=empresaElectricaController.crearUsuarioResidencial(dto2);
        assertNotEquals(resueltoDTO,0);
        assertEquals(resueltoDTO2,0);
        // como puse el usuario dos veces la primera da distinto de cero y la segunda da cero
    }

    @Test
    void crearUsuarioInduntrial() {
        empresaElectricaController=EmpresaElectricaController.getInstance();
        UsuarioIndustrialDTO dto=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","489","45","A");
        UsuarioIndustrialDTO dto2=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","489","45","A");
        int resueltoDTO=empresaElectricaController.crearUsuarioInduntrial(dto);
        int resueltoDTO2=empresaElectricaController.crearUsuarioInduntrial(dto2);
        assertNotEquals(resueltoDTO,0);
        assertEquals(resueltoDTO2,0);
        // como puse el usuario dos veces la primera da distinto de cero y la segunda da cero
    }

    @Test
    void buscarUsuario() {
    }

    @Test
    void existeUsuarioIndustrial() {
    }

    @Test
    void existeUSuarioResidencia() {
    }

    @Test
    void buscarUsuarioPorDni() {
    }

    @Test
    void buscarUsuarioPorCuit() {
    }
}