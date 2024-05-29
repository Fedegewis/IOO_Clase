package Clase21deMayo.src.main;

import Clase21deMayo.src.view.BuscarClienteGUI;
import Clase21deMayo.src.view.GuardarClienteGUI;

public class Main {

    public static void main(String[] args){
        GuardarClienteGUI guardarClienteGUI = new GuardarClienteGUI("Alejandro",
                "Foglino","29999","Almagro","12");
        System.out.println("Mostar Datos del cliente: " + guardarClienteGUI.guardarCliente());

         guardarClienteGUI = new GuardarClienteGUI("Norma",
                "Perez","39999","Caballito","13");
        System.out.println("Mostar Datos del cliente: " + guardarClienteGUI.guardarCliente());


        BuscarClienteGUI buscarClienteGUI = new BuscarClienteGUI();

        System.out.println( buscarClienteGUI.buscarCliente("39999"));

        System.out.println(buscarClienteGUI.buscarTodosLosClientes());
    }
}
