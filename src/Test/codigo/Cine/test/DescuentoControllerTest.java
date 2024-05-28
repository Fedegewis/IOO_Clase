package Test.codigo.Cine.test;

import Controlador.DescuentoController;
import Ioo_Test.controller.view.DescuentoView;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class DescuentoControllerTest {

    @Test
    public void testReturnsDescuentoViewList() {
        DescuentoController controller = DescuentoController.getInstancia();
        ArrayList<DescuentoView> result = controller.obtenerDescuento();
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertTrue(result.get(0) instanceof DescuentoView);
    }


       @Test
    public void test_returns_empty_list_when_descuento_is_empty() {
        DescuentoController controller = DescuentoController.getInstancia();
        ArrayList<DescuentoView> result = controller.obtenerDescuento();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}