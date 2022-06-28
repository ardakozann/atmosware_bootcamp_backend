package com.turkcell;

public class _13_Cast {
	
	public static void main(String[] args) {
		// cast
		// 1 fill
		float f1 = 44.55f;
		float f2 = (float) 44.55;
		long l1 = 1245455445L;
		
		// 2 küçükten büyüğe
		byte b1 = 12;
		long l2 = b1; // veri kaybı yoktur
		
		long l3 = 1515555L;
		byte b3 = (byte) l3;// veri kaybı vardır
		
		// 3
		int primitive = 44;
		Integer wrapper = primitive; // boxing: primitive type => wrapper'a çevirmek
		wrapper = null;
		System.out.println(wrapper);
		
		Double wrapper2 = 454.15;
		double primitive2 = wrapper2; // unboxing
		
		// 4 String ==> int
		String str = "44";
		System.out.println(12 + 14);
		System.out.println(str + 14);
		int cast1 = Integer.valueOf(str); // object (wrapper yapısı)
		int cast2 = Integer.parseInt(str); // primitive
		System.out.println(cast1 + 14);
		System.out.println(cast2 + 14);
		
		// 5 int ==> String
		int number = 66;
		String cast3 = String.valueOf(number); // wrapper
		String cast4 = Integer.toString(number); // primitive
		// Integer.toString ile String.valueOf farkını araştır
		System.out.println(cast3 + 14);
		System.out.println(cast4 + 14);
		
		//
	}
	
}
