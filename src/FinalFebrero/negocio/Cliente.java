package FinalFebrero.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {

	private String cuit;
	private String nombre;
	private String tipo;
	private float saldo;
	private int descuento;
	private List<Factura> facturas;
	
	public Cliente(String cuit, String nombre, String tipo, float saldo, int descuento) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.tipo = tipo;
		this.saldo = saldo;
		this.descuento = descuento;
		facturas = new ArrayList<Factura>();
	}

	public void addFactura(Factura factura) {
		facturas.add(factura);
	}
	
	public float obtenerValorNeto(Date desde, Date hasta) {
		float valorNeto = 0;
		for(Factura factura : facturas) {
			if(factura.estaEnFecha(desde, hasta))
				valorNeto += factura.totalNeto();
		}
		return valorNeto * (1 - this.descuento);
	}

	public boolean tuvoDescuentoProveedor() {
		for(Factura factura : facturas)
			if(factura.tuvoDescuentoProveedor())
				return true;
		return false;
	}
	
	public boolean soyElCliente(String cuit) {
		return this.cuit.equalsIgnoreCase(cuit);
	}
	
	public String getCuit() {
		return cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public int getDescuento() {
		return descuento;
	}

}
