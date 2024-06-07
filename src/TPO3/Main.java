package TPO3;

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

        // Ejemplo 1: Consumo en un restaurante en enero de 2022
        Consumo consumo1 = new Consumo(1, 1, 2023, "Restaurante El Fogoncito", 250.0f);

        // Ejemplo 2: Consumo en una tienda de ropa en febrero de 2022
        Consumo consumo2 = new Consumo(2, 2, 2023, "Tienda de Ropa Fashion", 500.0f);

        // Ejemplo 3: Consumo en un cine en marzo de 2022
        Consumo consumo3 = new Consumo(3, 3, 2023, "Cineplex", 150.0f);

        // Ejemplo 4: Consumo en un supermercado en abril de 2022
        Consumo consumo4 = new Consumo(4, 4, 2023, "Supermercado La Estrella", 800.0f);

        // Ejemplo 5: Consumo en un hotel en mayo de 2022
        Consumo consumo5 = new Consumo(5, 5, 2023, "Hotel 5 Estrellas", 2000.0f);


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
