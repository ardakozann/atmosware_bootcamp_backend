package com.turkcell;

import java.util.Scanner;

public class _29x3_AsalSayi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asalSayiIterative();
	}
	
	public static void asalSayiIterative() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Asal sayi icin sayi giriniz(Iterative)");
		int asalSayi = scanner.nextInt();
		int quotient = 0;
		
		for (int i = 2; i < asalSayi; i++) {
			if (asalSayi % i == 0)
				quotient++;
		}
		System.out.println("ITERATE ISLEM");
		if (quotient == 0)
			System.out.println(asalSayi + " asal sayidir.");
		else
			System.out.println(asalSayi + " asal sayi degildir.");
		asalSayiRecursive(asalSayi, 2);
	}
	
	public static int asalSayiRecursive(int asalSayi, int count) {
		if (asalSayi % count == 0) {
			System.out.println("--------\nRECURSIVE ISLEM");
			if (count == asalSayi) {
				System.out.println(asalSayi + " asal sayidir.");
			} else {
				System.out.println(asalSayi + " asal sayi degildir.");
			}
			return 0;
		}
		return asalSayiRecursive(asalSayi, count + 1);
	}
}
