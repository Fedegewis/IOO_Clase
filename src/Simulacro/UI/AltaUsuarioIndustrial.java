package Simulacro.UI;

import Simulacro.Controller.EmpresaElectricaController;
import Simulacro.DTO.UsuarioIndustrialDTO;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AltaUsuarioIndustrial extends JFrame {

    private JPanel contentPane;
    private JLabel lblRazonSocial,lblCuit,lblIIBB,lblCondiFisc,lblCalle,lblAltura,lblPiso,lblDpto,lblCP,lblLoca,lblProvincia;
    private JTextField txtRazonSocial,txtCuit,txtIIBB,txtCondiFisc,txtCalle,txtAltura,txtPiso,txtDpto,txtCP,txtLoca,txtProvincia;


    public static void main(String [] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    AltaUsuarioIndustrial frame=new AltaUsuarioIndustrial();
                    frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }







    public AltaUsuarioIndustrial(){
            setTitle("Alta Usuario Industrial");
            setBounds(100,100,550,400);
            contentPane=new JPanel();
            contentPane.setBorder(new EmptyBorder(5,5,5,5));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            lblRazonSocial=new JLabel("Razon Social");
            lblRazonSocial.setBounds(10,11,81,14);
            contentPane.add(lblRazonSocial);


            lblCuit=new JLabel("Cuit");
            lblCuit.setBounds(10,61,81,14);
            contentPane.add(lblCuit);

            lblIIBB=new JLabel("IIBB");
            lblIIBB.setBounds(10,101,81,14);
            contentPane.add(lblIIBB);

            lblCondiFisc=new JLabel("Condicion Fiscal");
            lblCondiFisc.setBounds(200,101,120,14);
            contentPane.add(lblCondiFisc);

            lblCalle=new JLabel("Direccion");
            lblCalle.setBounds(10,147,81,14);
            contentPane.add(lblCalle);

            lblAltura=new JLabel("Altura");
            lblAltura.setBounds(200,147,81,14);
            contentPane.add(lblAltura);

            lblPiso=new JLabel("Piso");
            lblPiso.setBounds(300,147,81,14);
            contentPane.add(lblPiso);

            lblDpto=new JLabel("Depto");
            lblDpto.setBounds(400,147,81,14);
            contentPane.add(lblDpto);

            lblCP=new JLabel("CP");
            lblCP.setBounds(10,200,81,14);
            contentPane.add(lblCP);

            lblLoca=new JLabel("Localidad");
            lblLoca.setBounds(180,200,81,14);
            contentPane.add(lblLoca);

            lblProvincia=new JLabel("Provincia");
            lblProvincia.setBounds(350,200,81,14);
            contentPane.add(lblProvincia);



            txtRazonSocial=new JTextField();
            txtRazonSocial.setBounds(112,8,305,20);
            contentPane.add(txtRazonSocial);

            txtCuit=new JTextField();
            txtCuit.setBounds(112,59,305,20);
            contentPane.add(txtCuit);


            txtIIBB=new JTextField();
            txtIIBB.setBounds(112,99,80,20);
            contentPane.add(txtIIBB);

            txtCondiFisc=new JTextField();
            txtCondiFisc.setBounds(300,99,120,20);
            contentPane.add(txtCondiFisc);

            txtCalle=new JTextField();
            txtCalle.setBounds(100,145,100,20);
            contentPane.add(txtCalle);


            txtAltura=new JTextField();
            txtAltura.setBounds(250,145,40,20);
            contentPane.add(txtAltura);


            txtPiso=new JTextField();
            txtPiso.setBounds(330,145,40,20);
            contentPane.add(txtPiso);

            txtDpto=new JTextField();
            txtDpto.setBounds(450,145,40,20);
            contentPane.add(txtDpto);

            txtCP=new JTextField();
            txtCP.setBounds(100,198,40,20);
            contentPane.add(txtCP);


            txtLoca=new JTextField();
            txtLoca.setBounds(250,198,100,20);
            contentPane.add(txtLoca);

            txtProvincia=new JTextField();
            txtProvincia.setBounds(420,198,100,20);
            contentPane.add(txtProvincia);

            JButton btnAceptar= new JButton("Aceptar");
            btnAceptar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String RazonSocial= txtRazonSocial.getText();
                    String Cuit=txtCuit.getText();
                    String IIBB= txtIIBB.getText();
                    String CondiFisc= txtCondiFisc.getText();
                    String Direccion=txtCalle.getText();
                    String Altura=txtAltura.getText();
                    String Piso=txtPiso.getText();
                    String Dpto=txtDpto.getText();
                    String CP=txtCP.getText();
                    String Localidad=txtLoca.getText();
                    String Provincia=txtProvincia.getText();

                    UsuarioIndustrialDTO dto=new UsuarioIndustrialDTO(Direccion,Altura,Piso,Dpto,CP,Localidad,Provincia,RazonSocial,Cuit,IIBB,CondiFisc);
                    EmpresaElectricaController empresa=EmpresaElectricaController.getInstance();

                    int salida= empresa.crearUsuarioInduntrial(dto);

                    if(salida!=0){
                        JOptionPane.showMessageDialog(null, "Usuario :"+ txtRazonSocial.getText()+ " fue creado correctamente");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Usuario :"+ txtRazonSocial.getText()+ " no fue creado correctamente");
                    }

                }
            });
            btnAceptar.setBounds(63,279,116,23);
            contentPane.add(btnAceptar);

            JButton btnLimpiar= new JButton("Limpiar");
            btnLimpiar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txtRazonSocial.setText("");
                    txtCuit.setText("");
                    txtIIBB.setText("");
                    txtCondiFisc.setText("");
                    txtCalle.setText("");
                    txtAltura.setText("");
                    txtPiso.setText("");
                    txtDpto.setText("");
                    txtCP.setText("");
                    txtLoca.setText("");
                    txtProvincia.setText("");
                }
            });
            btnLimpiar.setBounds(200,279,116,23);
            contentPane.add(btnLimpiar);

            JButton btnSalir= new JButton("Salir");
            btnSalir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            btnSalir.setBounds(340,279,116,23);
            contentPane.add(btnSalir);

    }
}
