package com.turkcell;

import java.util.Scanner;

public class _09_Scanner {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = klavye.nextLine();
		System.out.println(kelime);
		
		char harf = kelime.charAt(0);
		System.out.println(harf);
		klavye.close(); // nedir ?
	}
}
