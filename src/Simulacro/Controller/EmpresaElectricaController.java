package Simulacro.Controller;


import Simulacro.DTO.UsuarioDTO;
import Simulacro.DTO.UsuarioIndustrialDTO;
import Simulacro.DTO.UsuarioResidencialDTO;
import Simulacro.Model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Vector;

public class EmpresaElectricaController {

	private Vector<Usuario> usuarios;
	private Vector<Tarifa> tarifas;
	private Vector<Factura> facturas;
	private Collection<UsuarioIndustrial> usuariosIndustrial;
	private Collection<UsuarioResidencial> usuariosResidencial;
	private int numeroUsuario;
	private static EmpresaElectricaController INSTANCE = null;

	/* constructor*/
	public EmpresaElectricaController(){
		usuarios 	= new Vector<Usuario>();
		tarifas		= new Vector<Tarifa>();
		facturas	= new Vector<Factura>();
		usuariosResidencial= new ArrayList<>();
		usuariosIndustrial=new ArrayList<>();
		cargaInicial();

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
	public void cargaInicial(){
		UsuarioResidencialDTO dto = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "4447");
		UsuarioResidencialDTO dto2 = new UsuarioResidencialDTO("Cabildo", "1120", "2", "2", "1426", "CABA", "Bs As", "Federico", "44441");
		crearUsuarioResidencial(dto);
		crearUsuarioResidencial(dto2);
		UsuarioIndustrialDTO dtoi=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","114","4899","45","A");
		UsuarioIndustrialDTO dto2i=new UsuarioIndustrialDTO("Cabildo","44","4","20","1459","Caba","Buenos Aires","1144","4895","45","A");
		crearUsuarioInduntrial(dtoi);
		crearUsuarioInduntrial(dto2i);
	}

	/* alta usuarios */
	public int crearUsuarioResidencial(UsuarioResidencialDTO dto){
		if(!existeUSuarioResidencia(Integer.parseInt(dto.getDni()))){
			UsuarioResidencial usuarioResidencial = new UsuarioResidencial(dto.getCalle(),Integer.parseInt(dto.getAltura()),Integer.parseInt(dto.getPiso()),
					dto.getDpto(),Integer.parseInt(dto.getCodigoPostal()),dto.getLocalidad(),dto.getProvincia(),dto.getNombre(),Integer.parseInt(dto.getDni()));
			UsuarioResidencial usuarioResidencial1=toModelResidencial(dto);
			usuarios.add(usuarioResidencial);

			usuariosResidencial.add(usuarioResidencial);
			
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
			UsuarioIndustrial usuarioIndustrial2 = toModelIndustrial(dto);
			usuarios.add(usuarioIndustrial);
			usuariosIndustrial.add(usuarioIndustrial);

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




	public Collection<UsuarioDTO> buscarUsuarios(){
		Collection<UsuarioDTO> dto=new ArrayList<>();
		for(Usuario usuario:usuarios){
			dto.add(toDTO(usuario));
		}
		return dto;
	}

	public Collection<UsuarioIndustrialDTO> buscarUsuariosIndustrial(){
		Collection<UsuarioIndustrialDTO> dto= new ArrayList<>();
		for (UsuarioIndustrial usuario: usuariosIndustrial){
			dto.add(toDtoIndustrial(usuario));
		}
		return dto;
	}

	public Collection<UsuarioResidencialDTO> buscarUsuariosResidencial(){
		Collection<UsuarioResidencialDTO> dto=new ArrayList<>();
		for(UsuarioResidencial usuario:usuariosResidencial){
			dto.add(toDtoResidencial(usuario));
		}
		return dto;
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
		UsuarioDTO usuario = buscarUsuarioPorCuit(cuit);
		if(usuario!= null){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean existeUSuarioResidencia(int dni){
		UsuarioDTO usuario = buscarUsuarioPorDni(dni);
		if(usuario!= null){
			return true;
		}else{
			return false;
		}
	}
	
	public UsuarioDTO buscarUsuarioPorDni(int dni){
		for(int i= 0;i < usuarios.size();i++){
			if(usuarios.elementAt(i).sosUsuarioPorDato(dni)){
				return toDTO(usuarios.elementAt(i));
			}
		}
		return null;
	}
	
	public UsuarioDTO buscarUsuarioPorCuit(String cuit){
		for(int i= 0;i < usuarios.size();i++){
			if(usuarios.elementAt(i).sosUsuarioPorDato(Integer.parseInt(cuit))){
				return toDTO(usuarios.elementAt(i));
			}
		}
		return null;
	}


	public static UsuarioDTO toDTO(Usuario usuario){
		return new UsuarioDTO(String.valueOf(usuario.getNroUsuario()), usuario.getCalle(),String.valueOf(usuario.getAltura()),String.valueOf(usuario.getPiso()),
				usuario.getDpto(),String.valueOf(usuario.getCodigoPostal()), usuario.getLocalidad(), usuario.getProvincia());
	}


	public static Usuario toModel(UsuarioDTO dto){
		return new Usuario(dto.getCalle(), Integer.parseInt(dto.getAltura()), Integer.parseInt(dto.getPiso()), dto.getDpto(),
				Integer.parseInt(dto.getCodigoPostal()), dto.getLocalidad(), dto.getProvincia()) {
			@Override
			public int obtenerUltimoConsumo(int anio, int bimestre) {
				return 0;
			}

			@Override
			public boolean sosUsuarioPorDato(int dato) {
				return false;
			}
		};
		}


	public static UsuarioIndustrial toModelIndustrial(UsuarioIndustrialDTO dto){
		return new UsuarioIndustrial(dto.getCalle(),Integer.parseInt(dto.getAltura()
        ), Integer.parseInt(dto.getPiso()), dto.getDpto(), Integer.parseInt(dto.getCodigoPostal()), dto.getLocalidad(),
				dto.getProvincia(), dto.getRazonSocial(), dto.getCuit(), dto.getIIBB(), dto.getCondicionFiscal());
	}

	public static UsuarioIndustrialDTO toDtoIndustrial(UsuarioIndustrial usuarioIndustrial){
		return new UsuarioIndustrialDTO(usuarioIndustrial.getCalle(),String.valueOf(usuarioIndustrial.getAltura())
				,String.valueOf(usuarioIndustrial.getPiso()), usuarioIndustrial.getDpto()
				, String.valueOf(usuarioIndustrial.getCodigoPostal()), usuarioIndustrial.getLocalidad()
				, usuarioIndustrial.getProvincia(), usuarioIndustrial.getRazonSocial(),
				usuarioIndustrial.getCuit(), usuarioIndustrial.getIIBB(), usuarioIndustrial.getCondicionFiscal());
	}


	public static UsuarioResidencial toModelResidencial(UsuarioResidencialDTO dto){
		return new UsuarioResidencial(dto.getCalle(),Integer.parseInt(dto.getAltura()),Integer.parseInt(dto.getPiso()),dto.getDpto()
		,Integer.parseInt(dto.getCodigoPostal()),dto.getLocalidad(),dto.getProvincia(),dto.getNombre(),Integer.parseInt(dto.getDni()));
	}

	public static UsuarioResidencialDTO toDtoResidencial(UsuarioResidencial usuarioResidencial){
		return new UsuarioResidencialDTO(usuarioResidencial.getCalle(),String.valueOf(usuarioResidencial.getAltura())
				,String.valueOf(usuarioResidencial.getPiso()),usuarioResidencial.getDpto(),String.valueOf(usuarioResidencial.getCodigoPostal()),
				usuarioResidencial.getLocalidad(),usuarioResidencial.getProvincia()
				,usuarioResidencial.getNombre(),String.valueOf(usuarioResidencial.getDni()));
	}

}
