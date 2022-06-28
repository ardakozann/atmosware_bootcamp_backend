package com.turkcell;

import java.util.Scanner;

public class _29x2_Palindrom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrom();
	}
	
	public static void palindrom() {
		Scanner scanner = new Scanner(System.in);
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
}
