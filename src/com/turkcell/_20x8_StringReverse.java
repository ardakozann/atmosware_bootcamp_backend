package com.turkcell;

import java.util.Scanner;

public class _20x8_StringReverse {
	
	public static void main(String[] args) {
		// kullanıcı tarafından girilen bir parolayı için ilk ve son harfi haricinde *
		// eklensin
		// kelime kaç harfli ?
		stringReverse();
	}
	
	public static void stringReverse() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime giriniz:");
		String enterString = scanner.next();
		String reverseString = "";
		for (int i = enterString.length() - 1; i >= 0; i--) {
			reverseString += enterString.charAt(i);
		}
		System.out.println(enterString);
		System.out.println(reverseString);
		System.out.println("Kelime " + reverseString.length() + " harfli");
	}
}
