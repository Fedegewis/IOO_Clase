package FinalFebrero.negocio;

public class FacturaA extends Factura {

	private static int numerador;
	
	protected FacturaA() {
		super("A", numerador++);
	}

	@Override
	public float totalBruto() {
		float total = 0;
		for(ItemFactura item : items)
			total += item.obtenerImporte();
		return total;
	}

	@Override
	public float totalNeto() {
		float total = 0;
		for(ItemFactura item : items)
			total += item.obtenerImporteConDescuentos();
		return (total * 1.21f);
	}

}
