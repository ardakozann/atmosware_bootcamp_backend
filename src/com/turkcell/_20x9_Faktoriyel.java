package com.turkcell;

import java.util.Scanner;

public class _20x9_Faktoriyel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		int number = scanner.nextInt();
		int total = 1;
		
		if (number <= 0) {
			System.out.println("Sayı 0 veya 0'dan kucuk olamaz.");
			return;
		}
		
		for (int i = 1; i <= number; i++) {
			total *= i;
		}
		
		System.out.println("Girilen sayinin faktoriyel degeri: " + total);
	}
}
