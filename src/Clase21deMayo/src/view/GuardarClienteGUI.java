package Clase21deMayo.src.view;

import Clase21deMayo.src.controller.ClienteController;
import Clase21deMayo.src.dto.ClienteDto;

public class GuardarClienteGUI {

    private String nombreTxt;

    private String apellidoTxt;

    private String dniTxt;

    private String calleTxt;

    private String numeroTxt;

    private ClienteController clienteController;

    public GuardarClienteGUI(String nombreTxt, String apellidoTxt,
                             String dniTxt, String calleTxt, String numeroTxt) {
        this.nombreTxt = nombreTxt;
        this.apellidoTxt = apellidoTxt;
        this.dniTxt = dniTxt;
        this.calleTxt = calleTxt;
        this.numeroTxt = numeroTxt;
        this.clienteController = ClienteController.getInstance();
    }

    public String guardarCliente(){

        ClienteDto dto = new ClienteDto(apellidoTxt,dniTxt,calleTxt,nombreTxt,numeroTxt);
        clienteController.crearCliente(dto);
        return "El cliente de creo con exito\n" + dto.toString();
    }
}

