package com.turkcell;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class _0_My_Jar_Hamit_Mizrak {
	private static Scanner klavye = new Scanner(System.in);
	
	// user scanner data
	public static String userScanner() {
		System.out.println("+++++++++++\nbir seyler giriniz");
		String value = klavye.nextLine();
		return value;
	}
	
	// String ters yazmak (StringReverse) ==>Girilen kelimeyi ters yazdıran
	public static String stringReverse() {
		String temp = ""; // nullPointerException
		try {
			String data = userScanner();
			for (int i = data.length() - 1; i >= 0; i--) {
				temp = temp + data.charAt(i);
			}
			System.out.println(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	// girilen bir simgenin harf mi, sayı mı , özel simge mi
	
	// Palindrom
	// Girilen bir kelimenin tersten okunuşu ve düzden okunuşu aynı ise
	public static boolean isPalindrom() {
		try {
			String orijinalData = userScanner();
			String changeData = "";
			for (int i = orijinalData.length() - 1; i >= 0; i--) {
				changeData += orijinalData.charAt(i);
			}
			if (orijinalData.equals(changeData)) {
				System.out.println("Palindromdur");
				return true;
			} else {
				System.out.println("Palindrom Değildir");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// faktöriyel
	public static boolean isFactoriyel() {
		try {
			int number = Integer.valueOf(userScanner());
			long factoriyelNumber = 1; // çarpmadan etkisiz eleman 1
			
			if (number < 0)
				System.out.println("Sıfırdan küçük giremezsiniz");
			else if (number == 0 || number == 1)
				System.out.println("0! veya 1! cevabı : 1 ");
			else {
				for (int i = number; i >= 1; i--) {
					factoriyelNumber *= i;
				}
				System.out.println("Sonuç: " + factoriyelNumber);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// vki (kilo/boy)*boy
	public static String vki(double kilo, double boy) {
		double result = (kilo / boy) * boy;
		System.out.println(result);
		return null;
	}
	
	// degreeToFahrenhayt degree*9/5+32
	public static double degreeToFahrenhayt(double degree) {
		return (degree * 9) / 5 + 32;
	}
	
	// isOddEvenNumber
	public static boolean isOddEvenNumber(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}
	
	// devam etmek için bir tuş basınız
	public static void continuesScanner() {
		System.out.println("Devam etmek için bir Tuşa basınız");
		klavye.nextLine();
	}
	
	// nowDateString
	public static String nowDateString() {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss", locale);
		Date date = new Date();
		return simpleDateFormat.format(date);
	}
	
	// isNegativePositive
	public static boolean isNegativePositive(int number) {
		if (number < 0)
			return false;
		return true;
	}
	
	// asal sayi asal degildir ==> 6/6 6/1 6/2 6/3
	// en küçük ve tek çift sayı 2'dir
	public static boolean isPrime(int number) {
		boolean result = false;
		if (number < 0)
			System.out.println("Sıfırdan Küçük Sayı veremezsiniz");
		else if (number == 2)
			System.out.println("en küçük ve tek çift sayı 2 Asal sayı");
		else {
			// 2 3 5 7 11 13 17 19
			// asal sayı : 1 ve kendisine bölünenler asaldır
			for (int i = 2; i < number; i++) {
				// sayı 2'e bölünüyorsa asal sayı değildir
				// eğer sayı döngüdeki bir sayıya bölünüyorsa asal sayı değildir
				if (number % i == 0)
					result = true;
			}
			if (result) {
				System.out.println("Asal sayı değildir");
			} else {
				System.out.println(number + " sayısı Asal sayıdır");
			}
		}
		return false;
	}
	
	// startDownUpDiagonal (Dizi)
	
	// decoder encoder
	
	// fibonacci
	
	// Mükemmel sayi
	
	// değişken kullanmadan 2 sayıyı değiştirmek
	
	// isLetter isDigit
	
	// Random UUID
	
	// Password Mask
	// Ebob
	// Ekok
	// diziler
	// Linear Search
	// Binary Search
	
	public static void main(String[] args) {
		// stringReverse();
		// isPalindrom();
		// isFactoriyel();
		System.out.println("deneme");
		isPrime(15);
	}
}
