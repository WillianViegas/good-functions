package funcs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctions {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public static String retornaADataDeHoje(Date date) {
		return sdf.format(date);
	}
}
