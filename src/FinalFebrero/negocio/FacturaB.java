package FinalFebrero.negocio;

public class FacturaB extends Factura {

	private static int numerador;
	
	public FacturaB() {
		super("B", numerador++);
	}

	@Override
	public float totalBruto() {
		float total = 0;
		for(ItemFactura item : items)
			total += item.obtenerImporte();
		return (total * 1.21f);
	}

	@Override
	public float totalNeto() {
		float total = 0;
		for(ItemFactura item : items)
			total += item.obtenerImporteConDescuentos() * 1.21f;
		return total;
	}

}
