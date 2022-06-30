package com.turkcell;

import java.io.File;
import java.util.Date;

public class _35_FileIO2 {
	
	public static void main(String[] args) {
		try {
			File file = new File(_35_FileIO.MY_PATH);
			
			// isFile => dosya mı ?
			if (file.isFile()) {
				System.out.println("Dosya");
				
				// can : return ==> boolean Linux izinler ==> 755 777 4+2+1 araştır
				System.out.println("Calisabilen dosya mi : " + file.canExecute());
				System.out.println("Okunabilen dosya mi : " + file.canRead());
				System.out.println("Yazilabilen dosya mi : " + file.canWrite());
				
				// is
				System.out.println("Dizin mi : " + file.isDirectory());
				System.out.println("Dosya mi : " + file.isFile());
				System.out.println("Gizli dosya mi : " + file.isHidden());
				
				// get
				System.out.println("class: " + file.getClass());
				System.out.println("absolute path " + file.getAbsolutePath());
				System.out.println("normal path " + file.getPath());
				System.out.println("Canonical path " + file.getCanonicalPath());
				System.out.println("parent: " + file.getParent());
				System.out.println("name : " + file.getName());
				
				// set
				System.out.println("Calisma iznini kapatmak: " + file.setExecutable(false));
				System.out.println("Yazilma iznini kapatmak: " + file.setWritable(false));
				System.out.println("Okuma iznini kapatmak  : " + file.setReadable(false));
				
				// file information
				System.out.println("toplam karakter sayisi : " + file.length());
				System.out.println("Degisiklik Tarihi: " + new Date(file.lastModified()));
				System.out.println("absolute path " + file.getAbsolutePath());
				System.out.println("normal path " + file.getPath());
				System.out.println("Canonical path " + file.getCanonicalPath());
				System.out.println("toplam GB : " + file.getTotalSpace());
				System.out.println("Kullanabilecegin GB : " + file.getUsableSpace());
				
			} else {
				System.out.println("Dosya degil");
			}
			
		} catch (Exception e) {
			
		} finally {
			System.out.println("Bu kesim her durumda calisir");
		}
	}
}
