package com.turkcell;

public class _15_StringBuilder {
	
	public static void main(String[] args) {
		
		String str1 = "Java", str2 = "Spring", str3 = "database";
		
		// Birleştirmek
		// 1 artır operant
		String minus = str1 + str2 + str3;
		System.out.println(minus);
		
		// 2 String concat
		String strConcat = str1.concat(str2).concat(str3);
		System.out.println(strConcat);
		
		// 3 StringBuilder :hızlı (non thread safe)
		StringBuilder builder = new StringBuilder();
		builder.append(str1).append(str2).append(str3);
		String cast = builder.toString();
		System.out.println(cast);
		
		// 4 StringBuffer : thread safe
		StringBuffer buffer = new StringBuffer();
		buffer.append(str1).append(str2).append(str3);
		String cast2 = builder.toString();
		System.out.println(cast2);
	}
	
}
