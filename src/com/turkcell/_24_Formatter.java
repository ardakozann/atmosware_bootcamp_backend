package com.turkcell;

public class _24_Formatter {
	public static void main(String[] args) {
		// S(String) D(Decimal) F(Formatter) SeDeF
		String str = "Java verileri";
		int decimal = 44;
		double virgul = 35.44;
		
		System.out.print("alt satira gecme");
		System.out.println("alt satira gecebilirsin");
		System.out.println();
		System.out.printf("%s %d %f", str, decimal, virgul);
		System.out.println();
		System.out.printf("%25s %d %f", str, decimal, virgul);
		System.out.println();
		//
		System.out.printf("%-25s %d %25.2f", str, decimal, virgul);
	}
}
