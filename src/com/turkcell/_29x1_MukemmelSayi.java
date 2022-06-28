package com.turkcell;

import java.util.Scanner;

public class _29x1_MukemmelSayi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mukemmelSayi();
	}
	
	// Mükemmel sayı : Mükemmel sayı,sayılar teorisinde, kendisi hariç pozitif tam
	// bölenlerinin toplamı kendisine eşit olan sayı.
	// Diğer bir ifadeyle, bir mükemmel sayı, bütün pozitif tam bölenlerinin
	// toplamının yarısına eşittir. 6=> 1 2 3 Mükemmel sayıdır.
	public static void mukemmelSayi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mukemmel sayi icin sayi giriniz");
		int number = scanner.nextInt();
		int divisorTotal = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				divisorTotal += i;
			}
		}
		if (divisorTotal == number) {
			System.out.println(number + " sayisi mukemmel sayidir");
		} else {
			System.out.println(number + " sayisi mukemmel sayi degildir");
		}
	}
}
