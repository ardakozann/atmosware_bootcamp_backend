package com.turkcell;

import java.util.Scanner;

public class _20x91_Radar {
	
	private static int AMOUNT = 0;
	private static int COUNT = 0;
	
	public static void main(String[] args) {
		// kullanıcı tarafından girilen sayının:
		// hız:80 hızlı yavaşlayın para cezası: 800TL
		// hız: 95 orta hızlı yavaşlayın para cezası: 1200 TL
		// hız: 120 çok hızlı yavaşlayın para cezası: 2000 TL
		Scanner scanner = new Scanner(System.in);
		radar(scanner);
		
	}
	
	public static void radar(Scanner scanner) {
		int speed;
		boolean exit = false;
		
		while (!exit) {
			speed = getValue(scanner);
			chooseLevel(speed);
			
			System.out.println("Cikmak istiyor musunuz ?");
			exit = scanner.nextBoolean();
		}
		
	}
	
	public static int getValue(Scanner scanner) {
		
		System.out.println("Hizinizi giriniz: ");
		return Math.abs(scanner.nextInt());
	}
	
	public static void chooseLevel(int speed) {
		int level1 = 80;
		int level2 = 95;
		int level3 = 120;
		
		if (speed > level1) {
			AMOUNT += 800;
			System.out.println("Hizli, yavaslayin. Ceza 800TL. Toplam odemeniz: " + AMOUNT);
			COUNT++;
		} else if (speed > level2) {
			AMOUNT += 1200;
			System.out.println("Orta hizli, yavaslayin. Ceza 1200TL. Toplam odemeniz: " + AMOUNT);
			COUNT++;
		} else if (speed > level3) {
			AMOUNT += 2000;
			System.out.println("Cok hizli, yavaslayin. Ceza 2000TL . Toplam odemeniz: " + AMOUNT);
			COUNT++;
		} else {
			System.out.println("Hiziniz, hiz sinirlari icerisinde.");
		}
		System.out.println("Toplam ceza sayisi: " + COUNT);
	}
}
