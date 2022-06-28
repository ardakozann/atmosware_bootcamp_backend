package com.turkcell;

import java.util.Scanner;

public class _06_NumberSystem {
	public static void main(String[] args) {
		// 1. dereceden 2 bilinmeyenli denklem
		int y, x = 5, k = 3;
		y = 3 * x + 4 * k;
		System.out.println(y);
		
		// Celcius'u Fahrenhayt'a çeviren
		int celcius, fahrenhayt;
		celcius = 10;
		fahrenhayt = (celcius * 9 / 5) + 32;
		System.out.println(fahrenhayt);
		
		// Kullanıcıdan alınan 2 sayıda dört işlem
		Scanner fromUser = new Scanner(System.in);
		int number1 = fromUser.nextInt();
		int number2 = fromUser.nextInt();
		
		int sum = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		int modulus = number1 % number2;
		System.out.println("Toplam: " + sum);
		System.out.println("Fark  : " + subtraction);
		System.out.println("Çarpım: " + multiplication);
		System.out.println("Bolum : " + division);
		System.out.println("Mod   : " + modulus);
	}
}
