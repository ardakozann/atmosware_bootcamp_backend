package com.turkcell;

import java.util.Scanner;

public class _20x7_VizeFinal {
	
	public static void main(String[] args) {
		
		// kullanıcıdan alınan vize ve final notuna göre geçme(ortalama)
		
	}
	
	public static Double average(int number1, int number2) {
		return (double) (0.4 * number1) + (0.6 * number2);
	}
	
	public static boolean checkIfExamsBetweenZeroAndHundred(int sinav1, int sinav2) {
		return sinav1 < 0 || sinav1 > 100 || sinav2 < 0 || sinav2 > 100;
	}
	
	public static void calculate() {
		
		Scanner scanner = new Scanner(System.in);
		int sinav1, sinav2;
		double average;
		boolean exit = false;
		while (!exit) {
			System.out.println("Vize notunuzu giriniz: ");
			sinav1 = scanner.nextInt();
			System.out.println("Final notunuzu giriniz:");
			sinav2 = scanner.nextInt();
			if (checkIfExamsBetweenZeroAndHundred(sinav1, sinav2)) {
				System.out.println("Sinav notlari 0 ile 100 arasinda olmalidir");
				continue;
			}
			
			average = average(sinav1, sinav2);
			
			// not ortalaması: ortalama<50 altında ise kaldı
			if (average < (double) 50)
				System.out.println("Kaldi");
			// not ortalaması: ortalama==50 Geçti
			else if (average == 50)
				System.out.println("Gecti");
			// not ortalaması: 55<=x<=70 BB
			else if (average < 70)
				System.out.println("Notunuz BB");
			// not ortalaması: 70<=x<=84 BA
			else if (average < 85)
				System.out.println("Notunuz BA");
			// not ortalaması: 84<=x<=100 AA
			else
				System.out.println("Notunuz AA");
			
			System.out.println("Sistemden cikmak istiyor musunuz ?");
			exit = scanner.nextBoolean();
		}
		
	}
}
