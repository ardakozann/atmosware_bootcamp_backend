package com.turkcell;

import java.util.Scanner;

public class _20x8_AsalSayi {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		int number = scanner.nextInt();
		int quotient = 0;
		
		if (number <= 0) {
			System.out.println("Sayı 0 veya 0'dan kucuk olamaz.");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				quotient++;
		}
		
		if (quotient == 0)
			System.out.println(number + " asal sayidir.");
		else
			System.out.println(number + " asal sayi degildir.");
	}
}
