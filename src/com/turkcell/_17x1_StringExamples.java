package com.turkcell;

import java.util.Scanner;

public class _17x1_StringExamples {
	
	public static void main(String[] args) {
		
		// Kullanıcıdan alınan iki sayının dört işlem
		Scanner scanner = new Scanner(System.in);
		System.out.println("2 Adet sayi giriniz");
		int sayi1 = scanner.nextInt();
		int sayi2 = scanner.nextInt();
		// toplama
		System.out.println("Toplam : " + (sayi1 + sayi2));
		// çıkarma
		System.out.println("Fark   : " + (sayi1 - sayi2));
		// çarpma
		System.out.println("Carpim : " + (sayi1 * sayi2));
		// bölme
		System.out.println("Bolme  : " + (sayi1 / sayi2));
		// bölümünden kalan
		System.out.println("Mod    : " + (sayi1 % sayi2));
		// bu iki sayıdan küçük olanın karekökü
		System.out.println("Kucuk olanin karekoku             : " + Math.sqrt(Math.min(sayi1, sayi2)));
		// bu iki sayıdan küçük olanın mutlak değeri
		System.out.println("Kucuk olanin mutlak degeri        : " + Math.abs(Math.min(sayi1, sayi2)));
		// bu iki sayıdan küçük olanın alt değer büyük üst değer
		System.out.println(
				"Uslu sayı (Kucuk taban, buyuk us) : " + Math.pow(Math.min(sayi1, sayi2), Math.max(sayi1, sayi2)));
		
		System.out.println("**********************");
		
		// Örnek 2 (password repassword)
		System.out.println("Password giriniz 2 defa");
		String password = scanner.next();
		String rePassword = scanner.next();
		if (password.equals(rePassword)) {
			System.out.println("Şifre dogru");
		} else {
			System.out.println("Şifre yanlis");
		}
		
		// Örnek 3 girilen karakter harf mi sayı mı özel karakter mi ?
		
		System.out.println("Karakter giriniz:");
		char character = scanner.next().charAt(0);
		if (Character.isLetter(character)) {
			System.out.println("Karakter bir harftir.");
		} else if (Character.isDigit(character)) {
			System.out.println("Karakter bir sayidir.");
		} else {
			System.out.println("Karakter bir ozel karakterdir.");
		}
	}
	
}
