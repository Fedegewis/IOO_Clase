package FinalFebrero.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Articulo {

	private Proveedor proveedor;
	private String codigo;
	private String descripcion;
	private float precio;
	private int descuento;
	private int cantDescuento;
	private int stock;
	private List<ItemFactura> items;
	
	public Articulo(Proveedor proveedor, String codigo, String descripcion, float precio) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.descuento = 0;
		this.cantDescuento = 0;
		this.stock = 0;
		this.proveedor = proveedor;
		items = new ArrayList<ItemFactura>();
	}

	public float getPrecio() {
		return precio;
	}

	public int getDecuentoCant(int cantidad) {
		if(this.cantDescuento <= cantidad)
			return this.descuento;
		return 0;
	}
	
	public int getDescuentoProv(int cantidad) {
		return this.proveedor.getDescuento(cantidad);
	}

	public void addItemFactura(ItemFactura item) {
		items.add(item);
	}
	
	public boolean tuvoFacturasDescuento(Date desde, Date hasta) {
		for(ItemFactura item : items)
			if(item.tuvoDescuentoProveedor() && item.getfaFactura().estaEnFecha(desde, hasta))
				return  true;
		return false;
	}
	
	public Proveedor getProveedor() {
		return proveedor;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCantDescuento() {
		return cantDescuento;
	}

	public int getStock() {
		return stock;
	}
}
