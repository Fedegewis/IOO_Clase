package Simulacro.Test;

import Simulacro.Controller.EmpresaElectricaController;
import Simulacro.DTO.UsuarioDTO;
import Simulacro.DTO.UsuarioIndustrialDTO;
import Simulacro.DTO.UsuarioResidencialDTO;
import org.junit.jupiter.api.Test;

import java.util.Collection;

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
        UsuarioIndustrialDTO dto=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","4899","45","A");
        UsuarioIndustrialDTO dto2=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","1144","4895","45","A");
        empresaElectricaController.crearUsuarioInduntrial(dto);
        empresaElectricaController.crearUsuarioInduntrial(dto2);
        boolean res1=empresaElectricaController.existeUsuarioIndustrial(dto.getCuit());
        boolean res2= empresaElectricaController.existeUsuarioIndustrial(dto2.getCuit());
        boolean res3=empresaElectricaController.existeUsuarioIndustrial("112");
        assertTrue(res1);
        assertTrue(res2);
        assertFalse(res3);
    }

    @Test
    void existeUSuarioResidencia() {
        empresaElectricaController= EmpresaElectricaController.getInstance();
        UsuarioResidencialDTO dto = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "4448");
        UsuarioResidencialDTO dto2 = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "4444");
        empresaElectricaController.crearUsuarioResidencial(dto);
        empresaElectricaController.crearUsuarioResidencial(dto2);
        boolean res1=empresaElectricaController.existeUSuarioResidencia(Integer.parseInt(dto.getDni()));
        boolean res2= empresaElectricaController.existeUSuarioResidencia(Integer.parseInt(dto2.getDni()));
        boolean res3= empresaElectricaController.existeUSuarioResidencia(1245);
        assertTrue(res1);
        assertTrue(res2);
        assertFalse(res3);
    }

    @Test
    void buscarUsuarioPorDni() {
        empresaElectricaController= EmpresaElectricaController.getInstance();
        UsuarioResidencialDTO dto = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "4447");
        UsuarioResidencialDTO dto2 = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "44441");
        empresaElectricaController.crearUsuarioResidencial(dto);
        empresaElectricaController.crearUsuarioResidencial(dto2);
        UsuarioDTO dtobuscar1=empresaElectricaController.buscarUsuarioPorDni(Integer.parseInt(dto.getDni()));
        UsuarioDTO dtobuscar2 =empresaElectricaController.buscarUsuarioPorDni(Integer.parseInt(dto2.getDni()));
        UsuarioDTO dtobuscar3 =empresaElectricaController.buscarUsuarioPorDni(112);
        assertNotEquals(null,dtobuscar1);
        assertNotEquals(null,dtobuscar2);
        assertNull(dtobuscar3);
    }

    @Test
    void buscarUsuarioPorCuit() {
        empresaElectricaController=EmpresaElectricaController.getInstance();
        UsuarioIndustrialDTO dto=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","4892","45","A");
        UsuarioIndustrialDTO dto2=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","1144","48951","45","A");
        empresaElectricaController.crearUsuarioInduntrial(dto);
        empresaElectricaController.crearUsuarioInduntrial(dto2);
        UsuarioDTO dtobuscar1=empresaElectricaController.buscarUsuarioPorCuit(dto.getCuit());
        UsuarioDTO dtoBuscar2=empresaElectricaController.buscarUsuarioPorCuit(dto2.getCuit());
        UsuarioDTO dtoBuscar3=empresaElectricaController.buscarUsuarioPorCuit("125");
        assertNotEquals(null,dtobuscar1);
        assertNotEquals(null,dtoBuscar2);
        assertNull(dtoBuscar3);
    }

    @Test
    void buscarUsuariosIndustrial(){
        empresaElectricaController=EmpresaElectricaController.getInstance();
        UsuarioIndustrialDTO dto=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","4892","45","A");
        UsuarioIndustrialDTO dto1=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","48942","45","A");
        UsuarioIndustrialDTO dto2=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","48792","45","A");
        UsuarioIndustrialDTO dto3=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","489442","45","A");
        empresaElectricaController.crearUsuarioInduntrial(dto);
        empresaElectricaController.crearUsuarioInduntrial(dto1);
        empresaElectricaController.crearUsuarioInduntrial(dto2);
        empresaElectricaController.crearUsuarioInduntrial(dto3);
        Collection<UsuarioIndustrialDTO> List=empresaElectricaController.buscarUsuariosIndustrial();
        assertEquals(4,List.size());
    }

    @Test
    void buscarUsuariosResidencial(){
        empresaElectricaController=EmpresaElectricaController.getInstance();
        UsuarioResidencialDTO dto=new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "4447");
        UsuarioResidencialDTO dto1=new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "444447");
        UsuarioResidencialDTO dto2=new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "44446877");
        UsuarioResidencialDTO dto3=new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "44445647");
        empresaElectricaController.crearUsuarioResidencial(dto);
        empresaElectricaController.crearUsuarioResidencial(dto1);
        empresaElectricaController.crearUsuarioResidencial(dto2);
        empresaElectricaController.crearUsuarioResidencial(dto3);
        Collection<UsuarioResidencialDTO> dtoList=empresaElectricaController.buscarUsuariosResidencial();
        assertEquals(4,dtoList.size());
    }
}