package FinalFebrero.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Proveedor {

	private int codigo;
	private String nombre;
	private int descuento;
	private int cantDescuento;
	private List<Articulo> articulos;
	
	public Proveedor(int codigo, String nombre, int descuento, int cantDescuento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descuento = descuento;
		this.cantDescuento = cantDescuento;
		articulos = new ArrayList<Articulo>();
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDescuento(int cantidad) {
		if(this.cantDescuento <= cantidad)
			return descuento;
		return 0;
	}

	public boolean tuvoFacturasDescuento(Date desde, Date hasta) {
		for(Articulo articulo : articulos)
			if(articulo.tuvoFacturasDescuento(desde, hasta))
				return true;
		return false;
	}
	
	public int getCantDescuento() {
		return cantDescuento;
	}
	
	public void addArticulo(Articulo articulo) {
		articulos.add(articulo);
	}


}
