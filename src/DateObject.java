import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateObject {
	
	public static void main(String[] args)
	{
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		try{
		Date date = DateFor.parse("08/07/2019");
		System.out.println("Date : "+date);
		}catch (ParseException e) {e.printStackTrace();}
		
	}

}
