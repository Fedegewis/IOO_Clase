package TPO3.main;

import TPO3.controller.ClienteController;
import TPO3.controller.TarjetaController;
import TPO3.dto.ClienteDTO;
import TPO3.dto.ConsumoDTO;
import TPO3.dto.TarjetaDTO;
import TPO3.model.Cliente;
import TPO3.model.Consumo;
import TPO3.model.Tarjeta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClienteController clienteController = ClienteController.getInstance();
        ClienteDTO clienteNuevo=new ClienteDTO("Federico", "4459");

        clienteController.crearCliente(clienteNuevo);
        clienteController.crearCliente(clienteNuevo);


        // En este main mi idea es poder demostrar como primero al crear un cliente repetido en la misma instancia primero lo crea y luego lo rechaza

        TarjetaController tarjetaController = TarjetaController.getInstance();

        tarjetaController.altaTarjetaDeDebito(clienteNuevo, "1234", 4.45F);
        tarjetaController.altaTarjetaDeDebito(clienteNuevo, "1234", 4.45F);

        tarjetaController.altaTarjetaDeCredito(clienteNuevo, "1234", 4.45F);
        tarjetaController.altaTarjetaDeCredito(clienteNuevo, "1234", 4.45F);
        // En este main mi idea es poder demostrar como primero al crear una tarjeta de ambos casps repetida en la misma instancia primero lo crea y luego lo rechaza

        ConsumoDTO consumo1 = new ConsumoDTO("1", "1", "2023", "UADE", "250.0f");
        ConsumoDTO consumo2 = new ConsumoDTO("2", "2", "2023", "Adidas", "500.0f");


        ConsumoDTO consumo3 = new ConsumoDTO("3", "3", "2023", "Disco", "150.0f");
        ConsumoDTO consumo4 = new ConsumoDTO("4", "4", "2023", "Coto", "800.0f");
        ConsumoDTO consumo5 = new ConsumoDTO("5", "5", "2023", "UADE", "2000.0f");


        List<ConsumoDTO> consumosDebito = new ArrayList<ConsumoDTO>();
        consumosDebito.add(consumo1);
        consumosDebito.add(consumo2);

        List<ConsumoDTO> consumosCredito = new ArrayList<ConsumoDTO>();
        consumosCredito.add(consumo3);
        consumosCredito.add(consumo4);
        consumosCredito.add(consumo5);



        float totalD= tarjetaController.calcularConsumoReal(new TarjetaDTO(clienteNuevo,consumosDebito,"1234","TD","21"),2,2023,4,2023);
        float totalC=tarjetaController.calcularConsumoReal(new TarjetaDTO(clienteNuevo,consumosCredito,"1234","TC","30"),4,2023,5,2023);

        System.out.println("El total de debito es: "+ totalD);
        System.out.println("El total de credito es: "+ totalC);

        // En este main mi idea es poder demostrar como puede calcular tanto Consumo real para Tarjeta de debito y de credito y el funcionamiento correcto


    }
}
