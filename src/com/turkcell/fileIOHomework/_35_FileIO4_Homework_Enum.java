package com.turkcell.fileIOHomework;

public enum _35_FileIO4_Homework_Enum {
	
	ADMIN(1, "admin"), WRITER(2, "writer"), USER(3, "user");
	
	private final int key;
	private final String value;
	
	// constructur final olmalıdır
	private _35_FileIO4_Homework_Enum(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
}
