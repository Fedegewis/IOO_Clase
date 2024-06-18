package Simulacro.UI;



import Simulacro.Controller.EmpresaElectricaController;
import Simulacro.DTO.UsuarioResidencialDTO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	/* alta usuario residencial */
	JTextField nombre_txt;
	JTextField dni_txt;
	JTextField calle_txt;
	JTextField altura_txt;
	JTextField piso_txt;
	JTextField dpto_txt;
	JTextField cp_txt;
	JTextField loca_txt;
	JTextField pcia_txt;

	JLabel nombre_lbl;
	JLabel dni_lbl;
	JLabel calle_lbl;
	JLabel altura_lbl;
	JLabel piso_lbl;
	JLabel dpto_lbl;
	JLabel cp_lbl;
	JLabel loca_lbl;
	JLabel pcia_lbl;
	JLabel salidaAltaUsuarioResi;
	JButton guardarUsuario_btn;

	/* botones */
	JButton btnCrearUsuarioResidencial;
	JButton btnCrearUsuarioIndustrial;
	JButton btnConsultarUsuarios;
	JButton btnUsuarios;
	JButton btnUsuariosResidencial;
	JButton btnUsuariosIndustrial;


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	public static void main(String [] args){
		MenuPrincipal menu=new MenuPrincipal();
		menu.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
/*
		
		nombre_txt 	= new JTextField();
		dni_txt 	= new JTextField();
		calle_txt 	= new JTextField();
		altura_txt 	= new JTextField();
		piso_txt 	= new JTextField();
		dpto_txt 	= new JTextField();
		cp_txt 		= new JTextField();
		loca_txt 	= new JTextField();
		pcia_txt 	= new JTextField();
		
		nombre_lbl 					= new JLabel("Nombre: ");
		dni_lbl		 				= new JLabel("Dni: ");
		calle_lbl	 				= new JLabel("Calle: ");
		altura_lbl	 				= new JLabel("Altura: ");
		piso_lbl		 			= new JLabel("Piso: ");
		dpto_lbl		 			= new JLabel("Dpto: ");
		cp_lbl		 				= new JLabel("CP: ");
		loca_lbl		 			= new JLabel("Loca: ");
		pcia_lbl		 			= new JLabel("Pcia: ");
		salidaAltaUsuarioResi	 	= new JLabel("Salida: ");
		guardarUsuario_btn			= new JButton("Guardar");
		*/

		btnCrearUsuarioIndustrial = new JButton("Crear Usuario Industrial");
		btnConsultarUsuarios = new JButton("Consultar usuarios");
		btnUsuarios = new JButton("Usuarios Totales");
		btnUsuariosIndustrial =new JButton("Usurios Industriales");
		btnUsuariosResidencial=new JButton("Usuarios Residenciales");



		btnCrearUsuarioResidencial = new JButton("Crear Usuario Residencial");
		btnCrearUsuarioResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				AltaUsuarioResidencial altaUsuarioResidencial;
				try {
					altaUsuarioResidencial = new AltaUsuarioResidencial();
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
				altaUsuarioResidencial.setVisible(true);

			}
		});
		btnCrearUsuarioResidencial.setBounds(107, 79, 210, 23);
		contentPane.add(btnCrearUsuarioResidencial);


		btnCrearUsuarioIndustrial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AltaUsuarioIndustrial usuarioIndustrial;
				try {
					usuarioIndustrial = new AltaUsuarioIndustrial();
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
				usuarioIndustrial.setVisible(true);
			}
		});
		btnCrearUsuarioIndustrial.setBounds(107, 131, 210, 23);
		contentPane.add(btnCrearUsuarioIndustrial);


		btnConsultarUsuarios.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ExisteUsuario busquedaDeUsuarios;
				try {
					busquedaDeUsuarios = new ExisteUsuario();
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
				busquedaDeUsuarios.setVisible(true);
			}
		});
		btnConsultarUsuarios.setBounds(107, 182, 210, 23);
		contentPane.add(btnConsultarUsuarios);

		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TablaUsuarios usuarios;
				try{
					usuarios=new TablaUsuarios();
				}catch (Exception ex){
					throw new RuntimeException(ex);
				}
				usuarios.setVisible(true);
			}
		});

		btnUsuarios.setBounds(107, 234, 210, 23);
		contentPane.add(btnUsuarios);


		btnUsuariosResidencial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TablaUsuariosResidencial usuarios;
				try{
					usuarios=new TablaUsuariosResidencial();
				}catch (Exception ex){
					throw new RuntimeException(ex);
				}
				usuarios.setVisible(true);
			}
		});
		btnUsuariosResidencial.setBounds(107,286,210,23);
		contentPane.add(btnUsuariosResidencial);

		btnUsuariosIndustrial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TablaUsuariosIndustrial usuarios;
				try{
					usuarios=new TablaUsuariosIndustrial();
				}catch (Exception ex){
					throw new RuntimeException(ex);
				}
				usuarios.setVisible(true);
			}
		});
		btnUsuariosIndustrial.setBounds(107,338,210,23);
		contentPane.add(btnUsuariosIndustrial);



		/*
		//guarda alta usuario
		guardarUsuario_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom 		= nombre_txt.getText();
				String dni 		= dni_txt.getText();
				String calle	= calle_txt.getText();
				String altura		= altura_txt.getText();
				String piso		= piso_txt.getText();
				String dpto		= dpto_txt.getText();
				String cp		= cp_txt.getText();
				String loca		= loca_txt.getText();
				String pcia		= pcia_txt.getText();

				UsuarioResidencialDTO dto=new UsuarioResidencialDTO(calle,altura,piso,dpto,cp,loca,pcia,nom,dni);
				EmpresaElectricaController empresa = EmpresaElectricaController.getInstance();

				int salida = empresa.crearUsuarioResidencial(dto);
				salidaAltaUsuarioResi.setText(Integer.toString(salida));
			}
		});
		

	}
	
	public void mostrarCamposAltaUsuarioResi(){
		nombre_txt.setVisible(true);
		dni_txt.setVisible(true);
		calle_txt.setVisible(true);
		altura_txt.setVisible(true);
		piso_txt.setVisible(true);
		dpto_txt.setVisible(true);
		cp_txt.setVisible(true);
		loca_txt.setVisible(true);
		pcia_txt.setVisible(true);
		nombre_lbl.setVisible(true);
		dni_lbl.setVisible(true);
		calle_lbl.setVisible(true);
		altura_lbl.setVisible(true);
		piso_lbl.setVisible(true);
		dpto_lbl.setVisible(true);
		cp_lbl.setVisible(true);
		loca_lbl.setVisible(true);
		pcia_lbl.setVisible(true);
		salidaAltaUsuarioResi.setVisible(true);
	}
	
	public void ocultarCamposAltaUsuarioResi(){
		nombre_txt.setVisible(false);
		dni_txt.setVisible(false);
		calle_txt.setVisible(false);
		altura_txt.setVisible(false);
		piso_txt.setVisible(false);
		dpto_txt.setVisible(false);
		cp_txt.setVisible(false);
		loca_txt.setVisible(false);
		pcia_txt.setVisible(false);
		
		nombre_lbl.setVisible(false);
		dni_lbl.setVisible(false);
		calle_lbl.setVisible(false);
		altura_lbl.setVisible(false);
		piso_lbl.setVisible(false);
		dpto_lbl.setVisible(false);
		cp_lbl.setVisible(false);
		loca_lbl.setVisible(false);
		pcia_lbl.setVisible(false);
		salidaAltaUsuarioResi.setVisible(false);
	}*/

	}

}