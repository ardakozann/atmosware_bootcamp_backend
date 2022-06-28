package com.turkcell;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class _25_Date {
	
	public static void dateTutorialLocale() {
		
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss", locale);
		
		Date date = new Date();
		System.out.println(date);
		String turkishTime = dateFormat.format(date);
		System.out.println(turkishTime);
	}
	
	public static void calendarTutorials() {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTime().getHours());
		
	}
	
	public static void main(String[] args) {
		dateTutorialLocale();
	}
}
