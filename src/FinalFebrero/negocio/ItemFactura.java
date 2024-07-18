package FinalFebrero.negocio;

public class ItemFactura {

	private Factura factura;
	private Articulo articulo;
	private float precio;
	private int cantidad;
	private int descuentoArticulo;
	private int descuentoProveedor;
	
	public ItemFactura(Factura factura, Articulo articulo, int cantidad) {
		this.articulo = articulo;
		this.factura = factura;
		this.precio = articulo.getPrecio(); //Este precio es sin IVA
		this.cantidad = cantidad;
		this.descuentoArticulo = articulo.getDecuentoCant(cantidad);
		this.descuentoProveedor = articulo.getDescuentoProv(cantidad);
	}
	
	/** Importe sin IVA y sin descuentos*/
	public float obtenerImporte() {
		return precio * cantidad;
	}
	/** Importe sin IVA y con descuentos*/
	public float obtenerImporteConDescuentos() {
		return this.obtenerImporte() * (1 - descuentoArticulo) * (1 - descuentoProveedor);
	}
	
	public boolean tuvoDescuentoProveedor() {
		return this.descuentoProveedor > 0;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public int getDescuentoArticulo() {
		return descuentoArticulo;
	}

	public int getDescuentoProveedor() {
		return descuentoProveedor;
	}

	public float getPrecio() {
		return this.precio;
	}
	
	public Articulo getArticulo() {
		return this.articulo;
	}
	
	public Factura getfaFactura() {
		return this.factura;
	}

}
