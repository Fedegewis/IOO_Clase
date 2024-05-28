package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import Controlador.PeliculasController;

import view.PeliculaView;

public class VerPeliculas extends JInternalFrame{
    private JLabel lblPeliculas;
    private JComboBox<PeliculaView> Pelicula;
    private JButton btnBuscar,btnLimpiar,btnSalir;


    public VerPeliculas(){
        configurarVentana();
        asignarEventos();
        this.setTitle("Ver Peliculas");
        this.setSize(800,400);
        this.setVisible(true);
    }
    private void configurarVentana(){
        Container c=this.getContentPane();
        c.setLayout(null);

        lblPeliculas=new JLabel("Peliculas Disponibles");
        Pelicula=new JComboBox<PeliculaView>();
        
        btnBuscar=new JButton("Buscar Peliculas");
        btnLimpiar=new JButton("Limpiar");
        btnSalir=new JButton("Salir");
        c.add(lblPeliculas);
        c.add(Pelicula);
        lblPeliculas.setBounds(50, 100, 150, 50);
        Pelicula.setBounds(250, 120, 500, 40);
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
                Pelicula.removeAllItems();
                ArrayList<PeliculaView> listadoPeliculas=PeliculasController.getInstancia().obtenerPeliculas();
                     for(PeliculaView a: listadoPeliculas){
                        Pelicula.addItem(a);
                }   
            }
        });
        btnLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Pelicula.setSelectedIndex(-1);
                Pelicula.removeAllItems();
            }
        });
        btnSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
            
        });
    }

    
}
