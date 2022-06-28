package com.turkcell;

import java.util.Scanner;

public class _29_ {
	// Araştırma ödevi: decoder encoder nedir ?
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		mukemmelSayi(scanner);
		palindrom(scanner);
		asalSayiIterative(scanner);
		fibonacciIterative(scanner);
	}
	
	// Mükemmel sayı : Mükemmel sayı,sayılar teorisinde, kendisi hariç pozitif tam
	// bölenlerinin toplamı kendisine eşit olan sayı.
	// Diğer bir ifadeyle, bir mükemmel sayı, bütün pozitif tam bölenlerinin
	// toplamının yarısına eşittir. 6=> 1 2 3 Mükemmel sayıdır.
	public static void mukemmelSayi(Scanner scanner) {
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
	
	// Palindrom: Klavyeden okunan bir string ifadenin palindrome(tersten okununca
	// da aynı) olup olmadığını kontrol eden bilgisayar programını ?
	public static void palindrom(Scanner scanner) {
		System.out.println("Palindrom icin kelime giriniz");
		String str = scanner.next();
		String temp = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		
		if (str.equals(temp)) {
			System.out.println(str + "'nin tersi " + temp + ". Palindromdur.");
		} else {
			System.out.println(str + "'nin tersi " + temp + ". Palindrom degildir.");
		}
	}
	
	// asal sayı nedir ? iterative , recursive
	public static void asalSayiIterative(Scanner scanner) {
		System.out.println("Asal sayi icin sayi giriniz(Iterative)");
		int asalSayi = scanner.nextInt();
		int quotient = 0;
		
		for (int i = 2; i < asalSayi; i++) {
			if (asalSayi % i == 0)
				quotient++;
		}
		if (quotient == 0)
			System.out.println(asalSayi + " asal sayidir.");
		else
			System.out.println(asalSayi + " asal sayi degildir.");
	}
	
	// public static void asalSayiRecursive(int asalSayi) {
	// int quotient;
	// if (facNumber < 0)
	// throw new ArdaKozanException("Sifirdan kucuk sayi girmeyiniz");
	// if (asalSayi == quotient || facNumber == 1) {
	// return 1;
	// }
	// return facNumber * recursiveFactoriyel(facNumber - 1);
	// }
	
	// fibonacci nedir ? iterative , recursive
	public static void fibonacciIterative(Scanner scanner) {
		System.out.println("Fibonacci icin kac sira ilerlemek istediginizi yaziniz");
		int arrayLength = scanner.nextInt();
		int[] fibonacci = new int[arrayLength];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		System.out.println("Fibonacci dizisi :");
		System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			System.out.print(fibonacci[i] + " ");
		}
		System.out.println();
		System.out.println("Fibonacci dizisinin recursive ile yapimi:");
		System.out.print("1 1 ");
		fibonacciRecursive(1, 1, arrayLength - 2);
	}
	
	public static int fibonacciRecursive(int number1, int number2, int count) {
		System.out.print((number1 + number2) + " ");
		if (count == 1) {
			return 1;
		}
		return fibonacciRecursive(number2, number1 + number2, count - 1);
	}
}
