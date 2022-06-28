package com.turkcell;

import java.util.Arrays;

public class _31x2_Dziler {
	
	public static void main(String[] args) {
		
		int[] dizi = { 1, 9, 6, 2 };
		int[] dizi2 = { 1, 9, 6, 2 };
		// dizileri sıralamak için kullanılır
		// Arrays.sort(dizi); // 1 2 6 9
		
		// Arrays.equals var bir de
		
		// Arrays.binarySearch()
		int number = 9;
		int result = Arrays.binarySearch(dizi, number);
		if (result > 0) {
			System.out.println("Aradığınız sayı " + number + " vardır. " + result + ". indistedir ");
		} else {
			System.out.println("Aradığınız yoktur ");
		}
		
		// forEach
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
	}
}
