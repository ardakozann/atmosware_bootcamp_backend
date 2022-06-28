package com.turkcell;

import java.util.Random;

public class _20x3_2_RandomSumNumberExclue {
	public static void main(String[] args) {
		int randomSum = 0, randomNumber;
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			randomNumber = random.nextInt(10) + 1;
			if (randomNumber % 5 == 0)
				continue;
			randomSum += randomNumber;
		}
		System.out.println(randomSum);
	}
}
