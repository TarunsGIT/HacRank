package in.co.dateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayofDate {
	
	public static void main(String[] args) {
		
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        String input=day+"/"+month+"/"+year;
	        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
	        Date d=null;
			try {
				d = sdf.parse(input);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        DateFormat df=new SimpleDateFormat("EEEE");
	        String finalday=df.format(d);
	        System.out.println(finalday.toUpperCase());
	        
	    }
	
	}


