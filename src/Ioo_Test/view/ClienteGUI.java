package Ioo_Test.view;

import Ioo_Test.controller.ClienteController;
import Ioo_Test.dto.ClienteDto;

public class ClienteGUI {

    private String nombreClienteTxt;

    private String apellidoClienteTxt;
    private String dniClienteTxt;
    private String calleDireccionClienteTxt;
    private String numeroDireccionClienteTxt;

    private ClienteController clienteController;

    public ClienteGUI(String nombreClienteTxt, String apellidoClienteTxt,
                      String dniClienteTxt, String calleDireccionClienteTxt,
                      String numeroDireccionClienteTxt) {
        this.nombreClienteTxt = nombreClienteTxt;
        this.apellidoClienteTxt = apellidoClienteTxt;
        this.dniClienteTxt = dniClienteTxt;
        this.calleDireccionClienteTxt = calleDireccionClienteTxt;
        this.numeroDireccionClienteTxt = numeroDireccionClienteTxt;
        this.clienteController = ClienteController.getInstance();
    }


    public void guardarCliente(){

        ClienteDto dto = new ClienteDto(this.apellidoClienteTxt,this.dniClienteTxt,
                this.calleDireccionClienteTxt,this.nombreClienteTxt,this.numeroDireccionClienteTxt);
        clienteController.crearCliente(dto);
    };
}
