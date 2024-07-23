package FinalFebrero.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import FinalFebrero.DTO.ClienteDTO;
import FinalFebrero.exception.ClienteException;
import FinalFebrero.exception.FacturaException;
import FinalFebrero.negocio.Cliente;
import FinalFebrero.negocio.Factura;
import FinalFebrero.negocio.Proveedor;

public class Controlador {
	
	private static Controlador 	INSTANCE = null;
	private List<Cliente> clientes;
	private List<Factura> facturas;
	private List<Proveedor> proveedores;
	private List<ClienteDTO> clientesDTO;
	
	private Controlador() {
		clientes = new ArrayList<Cliente>();
		facturas = new ArrayList<Factura>();
		proveedores = new ArrayList<Proveedor>();
		clientesDTO=new ArrayList<ClienteDTO>();
		cargarDatos();
	}

	public static Controlador getInstance(){
		if(INSTANCE == null){
			INSTANCE=new Controlador();
		}
		return INSTANCE;
	}


	/*Obtener el valor neto de las facturas de un cliente determinado en un lapso de tiempo*/
	
	public float valorNetoPorCliente(String cuit, Date desde, Date hasta) throws ClienteException {
		Cliente cliente = this.buscarCliente(cuit);
		return cliente.obtenerValorNeto(desde, hasta);
	}

	/*Los nombres de los clientes que compraron un artículo que tenía descuento del proveedor*/

	public String[] clientesConDescuentoProveedor() {
		ArrayList<String> nombre = new ArrayList<String>();
		for(Cliente cliente : clientes)
			if(cliente.tuvoDescuentoProveedor())
				nombre.add(cliente.getNombre());
		return (String[]) nombre.toArray();
	}
	
	/*Obtener el total bruto y neto de una factura determinada*/ 

	public float[] brutoNetoPorFactura(String tipoFactura, int numero) throws FacturaException {
		float[] resultado = new float[2];
		Factura factura = this.buscarFactura(tipoFactura, numero);
		resultado[0] = factura.totalBruto();
		resultado[1] = factura.totalNeto();
		return resultado;
	}
	/*Nombre de los proveedores que bonificaron al menos una factura en un rango de fecha*/
	
	public String[] proveedoresBonificaronFactura(Date desde, Date hasta) {
		ArrayList<String> nombre = new ArrayList<String>();
		for(Proveedor proveedor : proveedores)
			if(proveedor.tuvoFacturasDescuento(desde, hasta))
				nombre.add(proveedor.getNombre());
		return (String[]) nombre.toArray();
	}
	
	private Cliente buscarCliente(String cuit) throws ClienteException {
		for(Cliente cliente : clientes)
			if(cliente.soyElCliente(cuit))
				return cliente;
		throw new ClienteException("No Existe el Cliente");
	}
	
	private Factura buscarFactura(String tipoFactura, int numero) throws FacturaException {
		for(Factura factura : facturas) 
			if(factura.soyLaFactura(tipoFactura, numero))
				return factura;
			throw new FacturaException("No existe la factura ");
	}
	
	// No es parte del diagrama
	private void cargarDatos() {

		ClienteDTO dto1=new ClienteDTO("112","Federico","A","15000","0");
		ClienteDTO dto2=new ClienteDTO("1124","Jose","A","1500","0");
		ClienteDTO dto3=new ClienteDTO("4112","Marcelo","A","155000","0");
		clientesDTO.add(dto1);
		clientesDTO.add(dto2);
		clientesDTO.add(dto3);

	}
}
