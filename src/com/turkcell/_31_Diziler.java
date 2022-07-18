package com.turkcell;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _31_Diziler {
	
	public static void main(String[] args) {
		int[] dizi = new int[6];
		dizi[0] = 1;
		dizi[3] = 9;
		dizi[4] = 6;
		dizi[5] = 2;
		
		Arrays.sort(dizi);
		Collectors.toList();
		// iterative for
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		
		System.out.println("\n***************");
		
		// forEach dongusu:sadece ekranda gostermek istiyorsak
		// forEach dongusu:indisi numarası bize gerekmiyorsa
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
		
	}
}
