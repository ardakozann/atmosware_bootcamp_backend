package com.turkcell;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _35_FileIO4_FileClass {
	
	// Nesne değişkenleri
	private String path;
	private final String date = createdDate();
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getDate() {
		return date;
	}
	
	// parametresiz constructor
	public _35_FileIO4_FileClass() throws Exception {
		throw new Exception("Dosya adresi yazilmali.");
	}
	
	// parametreli constructor
	public _35_FileIO4_FileClass(String path) {
		this.path = path;
	}
	
	private String createdDate() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
		return dateFormat.format(new Date());
	}
}
