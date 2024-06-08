package TPO3.main;

import TPO3.controller.ClienteController;
import TPO3.controller.TarjetaController;
import TPO3.dto.ClienteDTO;
import TPO3.model.Cliente;
import TPO3.model.Consumo;
import TPO3.model.Tarjeta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClienteController clienteController = ClienteController.getInstance();
        ClienteDTO clienteNuevoDTO=new ClienteDTO("Federico", "4459");

       clienteController.crearCliente(clienteNuevoDTO);
       clienteController.crearCliente(clienteNuevoDTO);

        Cliente clienteNuevo= ClienteController.toModel(clienteNuevoDTO);

        TarjetaController tarjetaController = TarjetaController.getInstance();

        tarjetaController.altaTarjetaDeDebito(clienteNuevo, "1234", 4.45F);
        tarjetaController.altaTarjetaDeDebito(clienteNuevo, "1234", 4.45F);

        tarjetaController.altaTarjetaDeCredito(clienteNuevo, "1234", 4.45F);
        tarjetaController.altaTarjetaDeCredito(clienteNuevo, "1234", 4.45F);


        Consumo consumo1 = new Consumo(1, 1, 2023, "UADE", 250.0f);
        Consumo consumo2 = new Consumo(2, 2, 2023, "Adidas", 500.0f);
        Consumo consumo3 = new Consumo(3, 3, 2023, "Disco", 150.0f);
        Consumo consumo4 = new Consumo(4, 4, 2023, "Coto", 800.0f);
        Consumo consumo5 = new Consumo(5, 5, 2023, "UADE", 2000.0f);


        List<Consumo> consumosDebito = new ArrayList<Consumo>();
        consumosDebito.add(consumo1);
        consumosDebito.add(consumo2);

        List<Consumo> consumosCredito = new ArrayList<Consumo>();
        consumosCredito.add(consumo3);
        consumosCredito.add(consumo4);
        consumosCredito.add(consumo5);


        float totalD= tarjetaController.calcularConsumoReal(new Tarjeta(clienteNuevo,consumosDebito,"1234","TD",21),2,2023,4,2023);
        float totalC=tarjetaController.calcularConsumoReal(new Tarjeta(clienteNuevo,consumosCredito,"1234","TC",30),4,2023,5,2023);

        System.out.println("El total de debito es: "+ totalD);
        System.out.println("El total de credito es: "+ totalC);





    }
}
