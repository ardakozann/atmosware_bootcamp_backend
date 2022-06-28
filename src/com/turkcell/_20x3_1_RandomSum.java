package com.turkcell;

import java.util.Random;

public class _20x3_1_RandomSum {
	
	public static void main(String[] args) {
		Random rastgele = new Random();
		int total = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println();
			total += rastgele.nextInt(10) + 1;
		}
		System.out.println("Random sayi toplamları: " + total);
	}
	
}
