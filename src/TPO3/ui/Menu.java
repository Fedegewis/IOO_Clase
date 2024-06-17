package TPO3.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    public Menu(){
       setBounds(50,50,600,600);
       JMenuBar menuBar = new JMenuBar();
       setJMenuBar(menuBar);
       JMenu cliente = new JMenu("Cliente");
       menuBar.add(cliente);
       JMenuItem crearCliente= new JMenuItem("Crear Cliente");
       crearCliente.addActionListener(this);
       cliente.add(crearCliente);
       JMenuItem verCliente= new JMenuItem("Ver Clientes");
       verCliente.addActionListener(this);
       cliente.add(verCliente);

       JMenu tarjeta= new JMenu("Tarjeta");
       menuBar.add(tarjeta);

       JMenuItem crearTarjeta= new JMenuItem("Crear Tarjeta");
        crearTarjeta.addActionListener(this);
       tarjeta.add(crearTarjeta);

       JMenuItem verTarjeta= new JMenuItem("Ver Tarjetas");
        verTarjeta.addActionListener(this);
       tarjeta.add(verTarjeta);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choice =e.getActionCommand();
        if(choice.equals("Crear Cliente")){
            CrearClienteUI crearCliente;
            try{
                crearCliente = new CrearClienteUI();
            }catch (Exception ex){
                throw new RuntimeException(ex);
            }
            crearCliente.setVisible(true);
        } else if (choice.equals("Ver Clientes")) {
            VerClienteUI verCliente;
            try{
                verCliente=new VerClienteUI();
            }catch (Exception ex){
                throw new RuntimeException(ex);
            }
            verCliente.setVisible(true);
        } else if (choice.equals("Crear Tarjeta")) {
                CrearTarjetaUI crearTarjeta;
        try{
            crearTarjeta=new CrearTarjetaUI();
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
            crearTarjeta.setVisible(true);
        }   else if (choice.equals("Ver Tarjetas")) {
            VerTarjetasUI verTarjetas;
            try{
                verTarjetas=new VerTarjetasUI();
            }catch (Exception ex){
                throw new RuntimeException(ex);
            }
            verTarjetas.setVisible(true);
        }

    }


    public static  void main(String [] args){
        Menu menu =new Menu();
        menu.setVisible(true);

    }
}
