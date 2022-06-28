package com.turkcell;

import java.util.Arrays;

public class _31x3_Diziler_Equals {
	public static void main(String[] args) {
		
		int[] dizi = { 1, 9, 6, 2 };
		int[] dizi2 = { 1, 9, 6, 2 };
		
		if (Arrays.equals(dizi, dizi2)) {
			System.out.println("Aynı");
		} else {
			System.out.println("Degil");
		}
	}
}
