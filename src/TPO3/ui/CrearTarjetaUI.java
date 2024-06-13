package TPO3.ui;

import TPO3.controller.ClienteController;
import TPO3.controller.TarjetaController;
import TPO3.dto.ClienteDTO;
import TPO3.dto.TarjetaDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CrearTarjetaUI extends JFrame {
    private JComboBox<ClienteDTO> Clientes;
    private JLabel lblClientes,lblNroTarjeta,lblCargo,lblTipoTarjeta;
    private JTextField txtNroTarjeta, txtCargo,txtTipoTarjeta;
    private JButton btnAgregar, btnLimpiar;
    private TarjetaController tarjetaController=null;
    private ClienteController clienteController=null;
    private TarjetaDTO dto;




    public CrearTarjetaUI() {
        setSize(500, 500);
        setVisible(true);

        Container c = this.getContentPane();
        c.setLayout(new GridLayout(5, 2));
        lblClientes = new JLabel("Clientes registrados");
        lblNroTarjeta = new JLabel("Numero Tarjeta");
        lblCargo = new JLabel("Cargo");
        lblTipoTarjeta = new JLabel("Tipo de Tarjeta");

        Clientes = new JComboBox<ClienteDTO>();
        clienteController = ClienteController.getInstance();
        Collection<ClienteDTO> dtos = clienteController.buscarTodosLosClientes();
        List<ClienteDTO> clienteDTOList = new ArrayList<>(dtos);
        for (ClienteDTO clienteDTO : clienteDTOList) {
            Clientes.addItem(clienteDTO);
        }

        txtNroTarjeta = new JTextField();
        txtCargo = new JTextField();
        txtTipoTarjeta = new JTextField();

        btnAgregar = new JButton("Agregar");
        btnLimpiar = new JButton("Limpiar");


        c.add(lblClientes);
        c.add(Clientes);
        c.add(lblNroTarjeta);
        c.add(txtNroTarjeta);
        c.add(lblTipoTarjeta);
        c.add(txtTipoTarjeta);
        c.add(lblCargo);
        c.add(txtCargo);
        c.add(btnAgregar);
        c.add(btnLimpiar);

        btnLimpiar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Clientes.setSelectedIndex(-1);
                        txtNroTarjeta.setText("");
                        txtCargo.setText("");
                        txtTipoTarjeta.setText("");
                    }
                }
        );
        //SACARLE EL JCOMBOBOX

        btnAgregar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tarjetaController = TarjetaController.getInstance();
                        clienteController = ClienteController.getInstance();
                        ClienteDTO clienteDTO = (ClienteDTO) Clientes.getSelectedItem();
                        if (txtTipoTarjeta.getText().equals("TC")) {
                            boolean creacion = tarjetaController.altaTarjetaDeCredito(clienteDTO, txtNroTarjeta.getText(), Float.parseFloat(txtCargo.getText()));
                            if (creacion) {
                                JOptionPane.showMessageDialog(null, "Usuario :" + clienteDTO.getNombreCliente() + " obtuvo su tarjeta de credito correctamente");
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario :" + clienteDTO.getNombreCliente() + " no obtuvo su tarjeta de credito porque ya tiene una a su nombre");
                            }
                        } else {
                            boolean creacion = tarjetaController.altaTarjetaDeDebito(clienteDTO, txtNroTarjeta.getText(), Float.parseFloat(txtCargo.getText()));
                            if (creacion) {
                                JOptionPane.showMessageDialog(null, "Usuario :" + clienteDTO.getNombreCliente() + " obtuvo su tarjeta de debito correctamente");
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario :" + clienteDTO.getNombreCliente() + " no obtuvo su tarjeta de debito porque ya tiene una a su nombre");
                            }
                        }

                    }

                }
        );


    }

    public static  void main(String [] args){
        CrearTarjetaUI crearTarjetaUI =new CrearTarjetaUI();
        crearTarjetaUI.setVisible(true);
    }

}
