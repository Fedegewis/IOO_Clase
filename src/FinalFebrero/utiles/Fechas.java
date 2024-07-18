package FinalFebrero.utiles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {

	private static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public Date string2Fecha(String fecha) throws ParseException {
		Date date = null; 
		if(fecha != null && !fecha.isEmpty() && !fecha.isBlank())
			date = formato.parse(fecha);
		return date;
	}
	
	public String date2String(Date date) {
		return formato.format(date);
	}
	
}
