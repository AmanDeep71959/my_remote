package com.flp.ems.util;


public class Validate {
	public static boolean validateDate(String date)
	{
		boolean format;
		if (date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
		    format=true;
		else
		   format=false;
		
		
		return format;
		}

}
