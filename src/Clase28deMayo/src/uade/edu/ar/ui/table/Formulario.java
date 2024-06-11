package Clase28deMayo.src.uade.edu.ar.ui.table;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Formulario extends JFrame   {
        private JLabel lblNombre,lblDni;
        private JTextField txtNombre,txtDni;
        private JButton btnAceptar,btnLimpiar;


    public Formulario(String title){
            super(title);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(400,400);
            this.setVisible(true);
            this.setTitle("Formulario");

            Container c=this.getContentPane();
            c.setLayout(new GridLayout(3,2));

            lblNombre=new JLabel("Nombre ");
            lblDni=new JLabel("Dni ");


            txtNombre=new JTextField();
            txtDni=new JTextField();


            btnLimpiar= new JButton("Limpiar");
            btnAceptar=new JButton("Aceptar");

            c.add(lblNombre);
            c.add(txtNombre);
            c.add(lblDni);
            c.add(txtDni);
            c.add(btnLimpiar);
            c.add(btnAceptar);


            btnLimpiar.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            txtNombre.setText("");
                            txtDni.setText("");
                        }
                    }
            );

            btnAceptar.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(null, "Usuario :"+ txtNombre.getText()+ " fue creado correctamente");
                        }
                    }
            );
        }
    public static void main(String[] args) throws Exception {
        Formulario form = new Formulario("Formulario");
        form.setVisible(true);
    }



}
