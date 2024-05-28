package test;

import Controlador.FuncionController;
import gui.VentanaPrincipal;
import modelo.Funcion;

public class TestVentana {
    public static void main(String[] args) {
        new VentanaPrincipal();
        FuncionController.getInstancia().obtenerAsientosDisponiblePorFuncion(2);
    }
}
