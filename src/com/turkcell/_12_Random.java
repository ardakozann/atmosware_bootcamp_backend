package com.turkcell;

import java.util.Random;

public class _12_Random {
	public static void main(String[] args) {
		// random
		double mathRandom = Math.round(Math.random() * 4 + 1);
		System.out.println(mathRandom);
		
		// class düzeyinde (object)
		Random random = new Random();
		int classRandom = random.nextInt(4) + 1;
		System.out.println(classRandom);
		
	}
}
