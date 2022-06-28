package com.turkcell;

import java.util.Scanner;

public class _11_Math {
	public static void main(String[] args) {
		// Math statictir
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		System.out.println(Math.sqrt(16));
		System.out.println(Math.pow(2, 5));
		System.out.println(Math.abs(-16));
		
		System.out.println(Math.max(2, 99));
		System.out.println(Math.min(2, 99));
		
		System.out.println(Math.floor(14.9));
		System.out.println(Math.ceil(14.1));
		System.out.println(Math.round(14.5));
		
		System.out.println(Math.round(Math.random() * 10 + 2));
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("2 Adet sayi giriniz.");
		
		double b, c;
		b = klavye.nextDouble();
		c = klavye.nextDouble();
		
		double a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
		System.out.println(a);
	}
}
