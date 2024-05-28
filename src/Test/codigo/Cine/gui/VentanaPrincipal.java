package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {
    private JMenuBar barra;
    private JMenu Peliculas,VentaEntrada,Sucursales,Funciones,Descuentos; 
    private JMenuItem VerPeliculas,ComprarEntrada,VerSucursales,VerFunciones,VerDescuentos;
    private JDesktopPane ventanas;
    


    public VentanaPrincipal(){
        configurarVentana();
        configurarMenu();
        asignarEventos();
        this.setTitle("Cine Showcase");
        this.setSize(800,800);
        this.setVisible(true);
    }
    private void configurarVentana(){
        Container c=this.getContentPane();
        c.setLayout(null);
        ventanas=new JDesktopPane();
        this.setContentPane(ventanas);
    }
    private void configurarMenu(){
        barra=new JMenuBar();
        Peliculas=new JMenu("Peliculas");
        VentaEntrada=new JMenu("Venta de Entradas");
        Sucursales=new JMenu("Sucursales");
        Funciones=new JMenu("Funciones");
        Descuentos=new JMenu("Descuentos");

        VerPeliculas=new JMenuItem("Ver Peliculas Disponibles");
        ComprarEntrada=new JMenuItem("Comprar Entrada");
        VerSucursales=new JMenuItem("Ver Sucursales");
        VerFunciones=new JMenuItem("Ver Funciones Disponibles");
        VerDescuentos=new JMenuItem("Ver Descuentos Disponibles");

        Peliculas.add(VerPeliculas);
        VentaEntrada.add(ComprarEntrada);
        Sucursales.add(VerSucursales);
        Funciones.add(VerFunciones);
        Descuentos.add(VerDescuentos);

        barra.add(VentaEntrada);
        barra.add(Peliculas);
        barra.add(Sucursales);
        barra.add(Funciones);
        barra.add(Descuentos);

        this.setJMenuBar(barra);
    }

    private void asignarEventos(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        VerPeliculas.addActionListener(new ActionListener(){

            
            public void actionPerformed(ActionEvent e) {
                VerPeliculas aux = new VerPeliculas();
                ventanas.add(aux);
                
            }
            
        });
        ComprarEntrada.addActionListener(new ActionListener(){

           
            public void actionPerformed(ActionEvent e) {
                ComprarEntrada aux=new ComprarEntrada();
                ventanas.add(aux);
            }
            
        });
        VerFunciones.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                VerFunciones aux = new VerFunciones();
                ventanas.add(aux);
            }
        });
        VerSucursales.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                VerSucursales aux=new VerSucursales();
                ventanas.add(aux);
            }
        });
        VerDescuentos.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                VerDescuentos aux = new VerDescuentos();
                ventanas.add(aux);
            }
            
        });

        
    }

    
}
