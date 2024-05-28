package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Controlador.FuncionController;
import Controlador.PeliculasController;
import view.FuncionView;
import view.PeliculaView;


public class ComprarEntrada extends JInternalFrame {
    private static final long serialVersionUID = 5245634L;
    private JLabel lblPeliculas, lblFunciones;
    private JComboBox<PeliculaView> Pelicula;
    private JComboBox<FuncionView> Funcion;

    private JButton btnComprar, btnLimpiar, btnSalir;

    public ComprarEntrada() {
        configurarVentana();
        asignarEventos();
        this.setSize(800, 600);
        this.setVisible(true);
        this.setTitle("Venta de funciones de Cine");
    }

    private void configurarVentana() {
        Container c = this.getContentPane();
        c.setLayout(null);

        lblPeliculas = new JLabel("Peliculas Disponibles");
        lblFunciones = new JLabel("Funciones Disponibles");

        Pelicula = new JComboBox<PeliculaView>();
        ArrayList<PeliculaView> listadoPeliculas = PeliculasController.getInstancia().obtenerPeliculas();
        for (PeliculaView a : listadoPeliculas) {
            Pelicula.addItem(a);
        }
        Funcion = new JComboBox<FuncionView>();
        ArrayList<FuncionView> listadoFunciones = FuncionController.getInstancia().obtenerFuncion();
        for (FuncionView a : listadoFunciones) {
            Funcion.addItem(a);
        }

        btnComprar = new JButton("Comprar Entrada");
        btnLimpiar = new JButton("Limpiar");
        btnSalir = new JButton("Salir");

        c.add(lblPeliculas);
        c.add(Pelicula);
        lblPeliculas.setBounds(50, 100, 150, 80);
        Pelicula.setBounds(250, 120, 500, 40);

        c.add(lblFunciones);
        c.add(Funcion);
        lblFunciones.setBounds(50, 200, 150, 80);
        Funcion.setBounds(250, 220, 500, 40);

        c.add(btnComprar);
        c.add(btnLimpiar);
        c.add(btnSalir);
        btnComprar.setBounds(50, 500, 150, 40);
        btnLimpiar.setBounds(250, 500, 150, 40);
        btnSalir.setBounds(450, 500, 150, 40);

    }

    private void asignarEventos() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnComprar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                PeliculaView Peli =  (PeliculaView) Pelicula.getSelectedItem();
                String pelicula = Peli.getNombrePelicula();
                FuncionView Fun = (FuncionView) Funcion.getSelectedItem();
                String funcion = Fun.getHorario();
                JOptionPane
                        .showMessageDialog(null,
                                "Usted ha comprado la entrada para: " + pelicula + ", En el horario: " + funcion
                                        + " en la sucursal de Caballito",
                                "Entrada Comprada", JOptionPane.INFORMATION_MESSAGE);
                Pelicula.setSelectedIndex(-1);
                Funcion.setSelectedIndex(-1);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Pelicula.setSelectedIndex(-1);
                Funcion.setSelectedIndex(-1);
            }
        });
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();

            }

        });
    }
}