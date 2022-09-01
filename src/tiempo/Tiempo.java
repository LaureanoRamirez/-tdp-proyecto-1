package tiempo;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Tiempo {
	private String fecha;
	private String momento;
	
    public Tiempo() {
	Calendar calendario = new GregorianCalendar();
	String anio= Integer.toString(calendario.get(Calendar.YEAR));
	String mes= Integer.toString(calendario.get(Calendar.MONTH));
	String dia= Integer.toString(calendario.get(Calendar.DATE));
	
	String fechaActual= anio+"/"+mes+"/"+dia;
	fecha= fechaActual;
	
	String hora= Integer.toString(calendario.get(Calendar.HOUR_OF_DAY));
	String minutos= Integer.toString(calendario.get(Calendar.MINUTE));
	String segundos= Integer.toString(calendario.get(Calendar.SECOND));
	
	String horaActual= hora+":"+minutos+":"+segundos;
	momento= horaActual;
    }
    public String getFecha() { return fecha;}
    public String getMomento() { return momento;}
    
}
