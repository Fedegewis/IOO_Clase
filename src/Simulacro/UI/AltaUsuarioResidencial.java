package Simulacro.UI;

import Simulacro.Controller.EmpresaElectricaController;
import Simulacro.DTO.UsuarioResidencialDTO;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaUsuarioResidencial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;



	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaUsuarioResidencial frame = new AltaUsuarioResidencial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public static void main(String [] args){
		AltaUsuarioResidencial altaUsuarioResidencial=new AltaUsuarioResidencial();
		altaUsuarioResidencial.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public AltaUsuarioResidencial() {
		setTitle("Alta Usuario Residencial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 396);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 81, 14);
		contentPane.add(lblNombre);
		
		JLabel lblCalle = new JLabel("Calle: ");
		lblCalle.setBounds(10, 61, 81, 14);
		contentPane.add(lblCalle);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(10, 101, 81, 14);
		contentPane.add(lblAltura);
		
		JLabel lblPiso = new JLabel("Piso:");
		lblPiso.setBounds(169, 101, 46, 14);
		contentPane.add(lblPiso);
		
		JLabel lblDpto = new JLabel("Dpto:");
		lblDpto.setBounds(299, 101, 46, 14);
		contentPane.add(lblDpto);
		
		JLabel lblCp = new JLabel("CP:");
		lblCp.setBounds(10, 147, 46, 14);
		contentPane.add(lblCp);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(140, 147, 75, 14);
		contentPane.add(lblLocalidad);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(10, 195, 81, 14);
		contentPane.add(lblProvincia);
		
		JLabel lblDni = new JLabel("DNi:");
		lblDni.setBounds(10, 36, 61, 14);
		contentPane.add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(112, 8, 305, 20);
		contentPane.add(textField);
//		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 33, 86, 20);
		contentPane.add(textField_1);
		//textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 58, 307, 20);
		contentPane.add(textField_2);
		//textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 98, 86, 20);
		contentPane.add(textField_3);
		//textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(203, 98, 86, 20);
		contentPane.add(textField_4);
		//textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(355, 98, 86, 20);
		contentPane.add(textField_5);
		//textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(39, 144, 86, 20);
		contentPane.add(textField_6);
		//textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(203, 144, 238, 20);
		contentPane.add(textField_7);
		//textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(104, 192, 337, 20);
		contentPane.add(textField_8);
		//textField_8.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom 		= textField.getText();
				String dni 		= textField_1.getText();
				String calle	= textField_2.getText();
				String altura	= textField_3.getText();
				String piso		= textField_4.getText();
				String dpto		= textField_5.getText();
				String cp		= textField_6.getText();
				String loca		= textField_7.getText();
				String pcia		= textField_8.getText();


				UsuarioResidencialDTO dto=new UsuarioResidencialDTO(calle,altura,piso,dpto,cp,loca,pcia,nom,dni);
				EmpresaElectricaController empresa = EmpresaElectricaController.getInstance();

				int salida = empresa.crearUsuarioResidencial(dto);
				if(salida!=0){
					JOptionPane.showMessageDialog(null, "Usuario :"+ textField.getText()+ " fue creado correctamente");
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario :"+ textField.getText()+ " no fue creado correctamente");
				}
			}
		});
		btnAceptar.setBounds(63, 279, 116, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(303, 279, 114, 23);
		contentPane.add(btnCancelar);
	}
}
