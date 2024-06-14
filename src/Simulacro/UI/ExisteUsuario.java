package Simulacro.UI;

import Simulacro.Controller.EmpresaElectricaController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExisteUsuario extends JFrame {

    private JPanel contenPane;
    private JLabel lblCuit, lblDni;
    private JTextField  txtCuit, txtDni;
    private JButton btnBuscarCuit, btnBuscarDni;


    public static void main(String [] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    ExisteUsuario frame = new ExisteUsuario();
                    frame.setVisible(true);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }


    public ExisteUsuario(){
        setTitle("Buscar Usuario");
        setBounds(50,50,400,400);
        contenPane=new JPanel();
        contenPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contenPane);
        contenPane.setLayout(null);

        lblCuit=new JLabel("Cuit");
        lblCuit.setBounds(10,61,81,14);
        contenPane.add(lblCuit);

        lblDni=new JLabel("DNI");
        lblDni.setBounds(10,200,81,14);
        contenPane.add(lblDni);

        txtCuit=new JTextField();
        txtCuit.setBounds(150 ,61,150,20);
        contenPane.add(txtCuit);

        txtDni=new JTextField();
        txtDni.setBounds(150,200,150,20);
        contenPane.add(txtDni);

        btnBuscarCuit=new JButton("Buscar Cuit");
        btnBuscarCuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmpresaElectricaController empresa=EmpresaElectricaController.getInstance();
                boolean cuitExiste=empresa.existeUsuarioIndustrial(txtCuit.getText());
                if(cuitExiste){
                    JOptionPane.showMessageDialog(null,"Existe el usuario"+txtCuit.getText()+" y es un usuario Industrial");
                }else {
                    JOptionPane.showMessageDialog(null,"No existe el usuario");
                }
            }
        });
        btnBuscarCuit.setBounds(100,125,116,23);
        contenPane.add(btnBuscarCuit);


        btnBuscarDni=new JButton("Buscar DNI");
        btnBuscarDni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmpresaElectricaController empresa=EmpresaElectricaController.getInstance();
                boolean dniExiste=empresa.existeUSuarioResidencia(Integer.parseInt(txtDni.getText()));
                if(dniExiste){
                    JOptionPane.showMessageDialog(null,"Existe el usuario"+txtDni.getText()+" y es un usuario Residencial");
                }else {
                    JOptionPane.showMessageDialog(null,"No existe el usuario");
                }
            }
        });
        btnBuscarDni.setBounds(100,300,116,23);
        contenPane.add(btnBuscarDni);
    }
}
