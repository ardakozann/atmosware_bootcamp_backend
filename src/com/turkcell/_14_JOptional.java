package com.turkcell;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _14_JOptional {
	
	public static void main(String[] args) {
		
		// Scanner
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int number1 = klavye.nextInt();
		// klavye.hasNextInt();
		System.out.println(Math.pow(number1, number1));
		
		// JOptional
		String str = JOptionPane.showInputDialog("Lütfen bir sayi giriniz");
		int number2 = Integer.valueOf(str);
		int number3 = Integer.parseInt(str);
		int number4 = Integer.valueOf(JOptionPane.showInputDialog("Lütfen bir sayi giriniz"));
		System.out.println(number2 + 4);
		System.out.println(number4 + 4);
		
		// Character kütüphanesine bak
		// String girilen bir şeyi int mi diye bakmak için hasNextInt hastNext komutları
		// var
		String str2 = JOptionPane.showInputDialog("Bir sey yaziniz");
		// boolean str2ToString = Character.isDigit(str2ToString);
		// boolean str2ToString2 = String.
		
	}
	
}
