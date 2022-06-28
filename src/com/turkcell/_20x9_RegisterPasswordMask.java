package com.turkcell;

import java.util.Scanner;

public class _20x9_RegisterPasswordMask {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mask();
	}
	
	public static void mask() {
		Scanner scanner = new Scanner(System.in);
		String password, passwordMask = "";
		System.out.println("Sifre giriniz: (3 karakterden az olamaz)");
		password = scanner.next();
		scanner.close();
		if (password.length() <= 3) {
			System.out.println("Sifre 3 karakterden az olamaz");
			return;
		}
		for (int i = 0; i < password.length(); i++) {
			if (i != 0 && i != password.length() - 1)
				passwordMask += "*";
			else {
				passwordMask += password.charAt(i);
			}
		}
		System.out.println("Maskeli sifre: " + passwordMask);
		
	}
}
