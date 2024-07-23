package FinalFebrero.UI;

import FinalFebrero.utiles.Fechas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;


public class Menu extends JFrame {
    private JPanel contentPane;


    public static void main(String [] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Menu menu=new Menu();
                    menu.setVisible(true);
                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        });
    }

    public Menu(){
        setTitle("Valor neto por cliente");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,400,400);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUsuario=new JLabel("Usuario");
        lblUsuario.setBounds(10,11,81,14);
        contentPane.add(lblUsuario);

        JTextField txtUsuario=new JTextField();
        txtUsuario.setBounds(112,11,200,20);
        contentPane.add(txtUsuario);

        JLabel lblFechaDesde=new JLabel("Fecha desde");
        lblFechaDesde.setBounds(10,60,81,14);
        contentPane.add(lblFechaDesde);

        JTextField txtFechaDesde=new JTextField();
        txtFechaDesde.setBounds(112,60,200,20);
        contentPane.add(txtFechaDesde);

        JLabel lblFechaHasta=new JLabel("Fecha hasta");
        lblFechaHasta.setBounds(10,90,81,14);
        contentPane.add(lblFechaHasta);

        JTextField txtFechaHasta=new JTextField();
        txtFechaHasta.setBounds(112,90,200,20);
        contentPane.add(txtFechaHasta);


        JButton btnAceptar =new JButton("Aceptar");
        btnAceptar.setBounds(30,140,100,20);
        contentPane.add(btnAceptar);


        JButton btnlimpiar =new JButton("limpiar");
        btnlimpiar.setBounds(140,140,100,20);
        contentPane.add(btnlimpiar);

        JButton btnSalir =new JButton("Salir");
        btnSalir.setBounds(260,140,100,20);
        contentPane.add(btnSalir);


        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String desde=txtFechaDesde.getText();
                String hasta=txtFechaHasta.getText();
                String usuario=txtUsuario.getText();

                if(usuario.isEmpty() ||  desde.isEmpty() || hasta.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Faltan  datos por llenar correctamente");
                    }else if (!desde.isEmpty() || !hasta.isEmpty()){
                    Fechas fechas = new Fechas();
                    try {
                        Date desdedate = fechas.string2Fecha(desde);
                        Date hastadate = fechas.string2Fecha(hasta);
                        if (desdedate.after(hastadate)) {
                            JOptionPane.showMessageDialog(null, "La fecha de inicio es mayor a la de fin");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente");
                        }
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex);

                    }
                }


            }
        });

        btnlimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText("");
                txtFechaHasta.setText("");
                txtFechaDesde.setText("");
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
