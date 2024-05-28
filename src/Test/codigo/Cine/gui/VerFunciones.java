package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import Controlador.FuncionController;

import view.FuncionView;

public class VerFunciones extends JInternalFrame {
    private JLabel lblFunciones;
    private JComboBox<FuncionView> Funciones;
    private JButton btnBuscar,btnLimpiar,btnSalir;


    public VerFunciones(){
        configurarVentana();
        asignarEventos();
        this.setTitle("Ver Funciones");
        this.setSize(800,400);
        this.setVisible(true);
    }

    private void configurarVentana(){
        Container c=this.getContentPane();
        c.setLayout(null);

        lblFunciones=new JLabel("Funciones Disponibles");
        Funciones=new JComboBox<FuncionView>();
        btnBuscar=new JButton("Buscar Funciones");
        btnLimpiar=new JButton("Limpiar");
        btnSalir=new JButton("Salir");
    
    
    c.add(lblFunciones);
    c.add(Funciones);
    lblFunciones.setBounds(50, 100, 150, 80);
    Funciones.setBounds(250, 100, 500, 40);

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
                Funciones.removeAllItems();
                ArrayList<FuncionView> listadoFunciones=FuncionController.getInstancia().obtenerFuncion();
                for(FuncionView a:listadoFunciones){
                    Funciones.addItem(a);
                }
            }
        });
        btnLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Funciones.setSelectedIndex(-1);
                Funciones.removeAllItems();
            }
            
        });
        btnSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
              dispose();  
            }
        });
    }
    
}
