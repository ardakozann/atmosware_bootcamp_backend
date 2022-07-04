package com.turkcell;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _36_Socket_Programming_twoway_Write {
	public static void toWrite(String str) {
		String path = "C:\\turkcell\\log.txt";
		File file = new File(path);
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.append(" " + createdDate());
		
		try {
			file.createNewFile();
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getPath(), true));
			bufferedWriter.write(stringBuilder.toString());
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
		} catch (IOException e) {
			System.out.println("Dosya olusturulamadi.");
			e.printStackTrace();
		}
	}
	
	private static String createdDate() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
		return dateFormat.format(new Date());
	}
}
