package FinalFebrero.negocio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class Factura {

	protected String tipoFactura;
	protected int numero;
	protected Date fecha;
	protected String tipoPago;
	protected List<ItemFactura> items;
	
	protected Factura(String tipoFactura, int numero) {
		this.tipoFactura = tipoFactura;
		this.numero = numero;
		this.fecha = Calendar.getInstance().getTime();
		this.tipoPago = "impaga";
		this.items = new ArrayList<ItemFactura>();
	}
	
	public boolean soyLaFactura(String tipoFactura, int numero) {
		return this.tipoFactura.equalsIgnoreCase(tipoFactura) && this.numero == numero;
	}
	
	public void crearItemFactura(Articulo articulo, int cantidad) {
		items.add(new ItemFactura(this, articulo, cantidad));
	}
	
	public boolean tuvoDescuentoProveedor() {
		for(ItemFactura item : items)
			if(item.tuvoDescuentoProveedor())
				return true;
		return false;
	}
	
	public boolean estaEnFecha(Date desde, Date hasta) {
		return fecha.after(desde) && fecha.before(hasta);
	}
	
	public Date getFecha() {
		return this.fecha;
	}
	
	public abstract float totalBruto();
	
	public abstract float totalNeto();

	
}
