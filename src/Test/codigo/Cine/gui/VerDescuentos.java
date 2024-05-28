package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import Controlador.DescuentoController;
import view.DescuentoView;

public class VerDescuentos extends JInternalFrame {
    private JLabel lblDescuentos;
    private JComboBox<DescuentoView> Descuento;
    private JButton btnBuscar,btnLimpiar,btnSalir;

    public VerDescuentos(){
        configurarVentana();
        asignarEventos();
        this.setTitle("Ver Descuentos");
        this.setSize(800,350);
        this.setVisible(true);
    }
    private void configurarVentana(){
        Container c=this.getContentPane();
        c.setLayout(null);

        lblDescuentos=new JLabel("Descuentos");
        Descuento=new JComboBox<DescuentoView>();
        btnBuscar=new JButton("Buscar Descuentos");
        btnLimpiar=new JButton("Limpiar");
        btnSalir=new JButton("Salir");

        c.add(lblDescuentos);
        c.add(Descuento);
        lblDescuentos.setBounds(50, 100, 150, 50);
        Descuento.setBounds(250, 100, 500, 50);

        c.add(btnBuscar);
        c.add(btnLimpiar);
        c.add(btnSalir);

        btnBuscar.setBounds(50, 250, 150, 50);
        btnLimpiar.setBounds(250, 250, 150, 50);
        btnSalir.setBounds(450, 250, 150, 50);
    }
    private void asignarEventos(){
        btnBuscar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Descuento.removeAllItems();
                ArrayList<DescuentoView> listadoDescuentos=DescuentoController.getInstancia().obtenerDescuento();
                for(DescuentoView a:listadoDescuentos){
                    Descuento.addItem(a);
                }
            } 
        });
        btnLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Descuento.removeAllItems();
                Descuento.setSelectedIndex(-1);
            }
            
        });
        btnSalir.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                dispose();
                
            }
            
        });
    }
    
}
