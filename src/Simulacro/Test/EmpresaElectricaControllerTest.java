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
    void existeUsuarioIndustrial() {
        empresaElectricaController=EmpresaElectricaController.getInstance();
        UsuarioIndustrialDTO dto=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","489","45","A");
        UsuarioIndustrialDTO dto2=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","1144","4895","45","A");
        empresaElectricaController.crearUsuarioInduntrial(dto);
        empresaElectricaController.crearUsuarioInduntrial(dto2);
        boolean res1=empresaElectricaController.existeUsuarioIndustrial(dto.getCuit());
        boolean res2= empresaElectricaController.existeUsuarioIndustrial(dto2.getCuit());
        boolean res3=empresaElectricaController.existeUsuarioIndustrial("112");
        assertEquals(true,res1);
        assertEquals(true,res2);
        assertEquals(false,res3);
    }

    @Test
    void existeUSuarioResidencia() {
        empresaElectricaController= EmpresaElectricaController.getInstance();
        UsuarioResidencialDTO dto = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "444");
        UsuarioResidencialDTO dto2 = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "4444");
        empresaElectricaController.crearUsuarioResidencial(dto);
        empresaElectricaController.crearUsuarioResidencial(dto2);
        boolean res1=empresaElectricaController.existeUSuarioResidencia(Integer.parseInt(dto.getDni()));
        boolean res2= empresaElectricaController.existeUSuarioResidencia(Integer.parseInt(dto2.getDni()));
        boolean res3= empresaElectricaController.existeUSuarioResidencia(1245);
        assertEquals(true,res1);
        assertEquals(true,res2);
        assertEquals(false,res3);
    }

    @Test
    void buscarUsuarioPorDni() {
    }

    @Test
    void buscarUsuarioPorCuit() {
    }
}