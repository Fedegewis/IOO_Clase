package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import Controlador.SucursalController;
import view.SucursalesView;

public class VerSucursales extends JInternalFrame {
    private JLabel lblSucursales;
    private JComboBox<SucursalesView> Sucursal;
    private JButton btnBuscar,btnLimpiar,btnSalir;

    public VerSucursales(){
        configurarVentana();
        asignarEventos();
        this.setTitle("Ver Sucursales");
        this.setSize(700,400);
        this.setVisible(true);
    }
    private void configurarVentana(){
        Container c=this.getContentPane();
        c.setLayout(null);

        lblSucursales=new JLabel("Sucursales");
        Sucursal=new JComboBox<SucursalesView>();

        btnBuscar=new JButton("Buscar Sucursales");
        btnLimpiar=new JButton("Limpiar");
        btnSalir=new JButton("Salir");

        c.add(lblSucursales);
        c.add(Sucursal);
        lblSucursales.setBounds(50, 100, 150, 40);
        Sucursal.setBounds( 250, 100, 400, 50);

        c.add(btnBuscar);
        c.add(btnLimpiar);
        c.add(btnSalir);
        btnBuscar.setBounds(50, 300, 150, 40);
        btnLimpiar.setBounds(250, 300, 150, 40);
        btnSalir.setBounds(450, 300, 150, 40);
    }
    private void asignarEventos(){
        btnBuscar.addActionListener(new ActionListener(){

          
            public void actionPerformed(ActionEvent e) {
                Sucursal.removeAllItems();
                ArrayList<SucursalesView> listadoSucursales=SucursalController.getInstancia().obtenerSucursales();
                for(SucursalesView a:listadoSucursales){
                    Sucursal.addItem(a);
                }
            }
        });
        btnLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Sucursal.setSelectedIndex(-1);
                Sucursal.removeAllItems();
            }
        });
        btnSalir.addActionListener(new ActionListener(){

          
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
            
        });
    }
    
    
}
