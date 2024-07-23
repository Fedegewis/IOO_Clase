package TPO3.ui;

import TPO3.controller.ClienteController;
import TPO3.dto.ClienteDTO;
import TPO3.model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearClienteUI extends JFrame {
    private JLabel lblNombre, lblDni;
    private JTextField txtNombre,txtDni;
    private JButton btnAgregar, btnLimpiar;
    private ClienteController clienteController = null;
    private ClienteDTO dto;


    public CrearClienteUI(){
        this.setSize(500,500);

        this.setVisible(true);

        Container c= this.getContentPane();
        c.setLayout(new GridLayout(3,2));
        lblNombre=new JLabel("Nombre");
        lblDni=new JLabel("Dni");
        txtNombre=new JTextField();
        txtDni=new JTextField();

        btnAgregar=new JButton("Agregar");
        btnLimpiar=new JButton("Limpiar");

        c.add(lblNombre);
        c.add(txtNombre);
        c.add(lblDni);
        c.add(txtDni);
        c.add(btnAgregar);
        c.add(btnLimpiar);


        btnLimpiar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtNombre.setText("");
                        txtDni.setText("");
                    }
                }
        );

        btnAgregar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clienteController=ClienteController.getInstance();
                        boolean creacion =clienteController.crearCliente(new ClienteDTO(txtNombre.getText(),txtDni.getText()));
                        if (creacion){
                            JOptionPane.showMessageDialog(null, "Usuario :"+ txtNombre.getText()+ " fue creado correctamente");
                            txtNombre.setText("");
                            txtDni.setText("");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Usuario :"+ txtNombre.getText()+ " no fue creado correctamente");
                        }
                    }
                }
        );
    }

    public static  void main(String [] args){
        CrearClienteUI crearCliente =new CrearClienteUI();
        crearCliente.setVisible(true);
    }
}
