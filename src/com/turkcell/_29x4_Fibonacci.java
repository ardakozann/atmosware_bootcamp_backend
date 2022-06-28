package com.turkcell;

import java.util.Scanner;

public class _29x4_Fibonacci {
	
	public static void main(String[] args) {
		fibonacciIterative();
	}
	
	public static void fibonacciIterative() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibonacci icin kac sira ilerlemek istediginizi yaziniz");
		int arrayLength = scanner.nextInt();
		int[] fibonacci = new int[arrayLength];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		System.out.println("Fibonacci dizisi :");
		System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			System.out.print(fibonacci[i] + " ");
		}
		System.out.println();
		System.out.println("Fibonacci dizisinin recursive ile yapimi:");
		System.out.print("1 1 ");
		
		// Fibonacci recursive ile çözümü
		fibonacciRecursive(1, 1, arrayLength - 2);
	}
	
	public static int fibonacciRecursive(int number1, int number2, int count) {
		System.out.print((number1 + number2) + " ");
		if (count == 1) {
			return 1;
		}
		return fibonacciRecursive(number2, number1 + number2, count - 1);
	}
	
}
