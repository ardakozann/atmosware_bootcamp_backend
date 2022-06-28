package com.turkcell;

import java.util.Scanner;

public class _26_UseOwnException {
	
	public static void main(String[] args) throws ArdaKozanException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sayi giriniz");
		int number = scanner.nextInt();
		if (number < 0) {
			throw new ArdaKozanException("Sifirden kucuk giremezsiniz");
		} else {
			System.out.println(Math.pow(number, 2));
		}
	}
}
