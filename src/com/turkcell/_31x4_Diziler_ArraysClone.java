package com.turkcell;

public class _31x4_Diziler_ArraysClone {
	public static void main(String[] args) {
		int[] dizi1 = { 1, 9, 6, 2 };
		int[] dizi2 = dizi1.clone();
		
		for (int temp : dizi1) {
			System.out.println(temp);
		}
	}
}
