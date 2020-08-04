package funcs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFunctions {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public static String retornaADataDeHoje() {
		return sdf.format(new Date());
	}
	
	public static String retornaADataNoPadraoBR(Date date) {
		return sdf.format(date);
	}
	
	public static Date retornaAStringEmData(String dateStr) {
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public static Date retornaDataComDiferencaDias(Date date, int dias) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, dias);
		return cal.getTime();
	}
}
