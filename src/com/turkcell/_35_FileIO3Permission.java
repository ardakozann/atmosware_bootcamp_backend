package com.turkcell;

import java.io.File;

enum permission {
	ADMIN, WRITER, USER;
}

public class _35_FileIO3Permission {
	public static void main(String[] args) {
		File file = new File(_35_FileIO.MY_PATH);
		
		// String[] permissionRoles = { "ADMIN", "WRITER", "USER" };
		// if(dizileye permissionRoles[1] == "ADMIN")
		
		if (permission.ADMIN.toString() == "ADMIN") {
			boolean data = file.canExecute();
			// data = file.setExecutable(false);
			if (data) {
				System.out.println("Calisma izni verilmistir");
			} else {
				System.out.println("Calisma izni verilmemistir !!!!");
			}
		} else {
			System.out.println("Writer veya user dosya degistirme izini yoktur.");
		}
	}
}
