package Simulacro.Controller;


import Simulacro.DTO.UsuarioDTO;
import Simulacro.DTO.UsuarioIndustrialDTO;
import Simulacro.DTO.UsuarioResidencialDTO;
import Simulacro.Model.*;
import java.util.Calendar;
import java.util.Vector;

public class EmpresaElectricaController {

	private Vector<Usuario> usuarios;
	private Vector<Tarifa> tarifas;
	private Vector<Factura> facturas;
	private int numeroUsuario;
	private static EmpresaElectricaController INSTANCE = null;

	/* constructor*/
	public EmpresaElectricaController(){
		usuarios 	= new Vector<Usuario>();
		tarifas		= new Vector<Tarifa>();
		facturas	= new Vector<Factura>();

	}
	public static EmpresaElectricaController getInstance(){
		if(INSTANCE == null){
				INSTANCE=new EmpresaElectricaController();
		}
		return INSTANCE;
	}
	
	/* getters && setters */
	public int getNumeroUsuario() {
		return numeroUsuario;
	}

	public void setNumeroUsuario(int numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}
	/*

	private void cargaInicial(){
		UsuarioIndustrial usI = new UsuarioIndustrial("La Pampa",1234,0,"0",1345,"CABA","CABA","Mi Empresa SA","33-45689876-9","33-45689876-9","IVA Inscripto");
		Medidor musI = new Medidor();
		usI.setMedidor(musI);
		Medicion m1 = new Medicion(Calendar.getInstance().getTime(),2015,10,1234);
		Medicion m2 = new Medicion(Calendar.getInstance().getTime(),2015,11,1534);
		musI.agregar(m1);
		musI.agregar(m2);
		TarifaIndustrial ti = new TarifaIndustrial(10,0.21,0.03);
		usI.setTarifa(ti);
		
		
		usuarios.addElement(usI);
	}
	*/
	/* alta usuarios */
	public int crearUsuarioResidencial(UsuarioResidencialDTO dto){
		if(!existeUSuarioResidencia(Integer.parseInt(dto.getDni()))){
			UsuarioResidencial usuarioResidencial = new UsuarioResidencial(dto.getCalle(),Integer.parseInt(dto.getAltura()),Integer.parseInt(dto.getPiso()),
					dto.getDpto(),Integer.parseInt(dto.getCodigoPostal()),dto.getLocalidad(),dto.getProvincia(),dto.getNombre(),Integer.parseInt(dto.getDni()));
			usuarios.add(usuarioResidencial);
			
			//genera nuevo numero de usuario
			this.setNumeroUsuario(this.getNumeroUsuario() + 1);
			
			//asigna el nuevo numero al usuario
			usuarioResidencial.setNroUsuario(this.getNumeroUsuario());
			System.out.println("Se creo el usuario");
			return usuarioResidencial.getNroUsuario();
		}else{
			System.out.println("No se creo el usuario");
			return 0;
		}
	}
	
	public int crearUsuarioInduntrial(UsuarioIndustrialDTO dto){
		if(!existeUsuarioIndustrial(dto.getCuit())){
			UsuarioIndustrial usuarioIndustrial = new UsuarioIndustrial(dto.getCalle(),Integer.parseInt (dto.getAltura()),Integer.parseInt(dto.getPiso()),
					dto.getDpto(),Integer.parseInt( dto.getDpto()),dto.getLocalidad(),dto.getProvincia(),dto.getRazonSocial(),dto.getCuit(), dto.getIIBB(),
					dto.getCondicionFiscal());
			usuarios.add(usuarioIndustrial);
			
			//genera nuevo numero de usuario
			this.setNumeroUsuario(this.getNumeroUsuario() + 1);
			
			//asigna el nuevo numero al usuario
			usuarioIndustrial.setNroUsuario(this.getNumeroUsuario());
			System.out.println("Se creo el usuario");
			return usuarioIndustrial.getNroUsuario();
		}else{
			System.out.println("No se creo el usuario");
			return 0;
		}
	}
	
	public Usuario buscarUsuario(int nroUsuario){
		for(int i= 0;i < usuarios.size();i++){
			if(usuarios.elementAt(i).sosUsuario(nroUsuario)){
				return usuarios.elementAt(i);
			}
		}
		return null;
	}
	
	
	public float consultaConsumo(int nroUsuario,int anio, int bimestre){
		Usuario usuario = buscarUsuario(nroUsuario);
		if(usuario != null){
			return usuario.obtenerUltimoConsumo(anio, bimestre);
		}else{
			return 0;
		}
	}
	
	public boolean existeUsuarioIndustrial(String cuit){
		Usuario usuario = buscarUsuarioPorCuit(cuit);
		if(usuario!= null){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean existeUSuarioResidencia(int dni){
		Usuario usuario = buscarUsuarioPorDni(dni);
		if(usuario!= null){
			return true;
		}else{
			return false;
		}
	}
	
	public Usuario buscarUsuarioPorDni(int dni){
		for(int i= 0;i < usuarios.size();i++){
			if(usuarios.elementAt(i).sosUsuarioPorDato(dni)){
				return usuarios.elementAt(i);
			}
		}
		return null;
	}
	
	public Usuario buscarUsuarioPorCuit(String cuit){
		for(int i= 0;i < usuarios.size();i++){
			if(usuarios.elementAt(i).sosUsuarioPorDato(Integer.parseInt(cuit))){
				return usuarios.elementAt(i);
			}
		}
		return null;
	}





}
