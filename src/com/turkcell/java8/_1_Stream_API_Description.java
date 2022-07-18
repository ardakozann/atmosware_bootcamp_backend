package com.turkcell.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Java 8 ile gelmiş fonsiyonel bir programlamadır.
// Verileri hızlı ve efektif olarak işlem yapmamıza olabak sağlar.
// Veri yapıları değildir bundan dolayı var olan kaynağı değiştirmez.
// Java.util.stream kütüphanesinden gelir.
//
// BaseStream interfacesinden türer.
// Çeşitleri: intStream,LongStream,DoubleStream,Stream

// Stream: 2 grup çalışma sitili vardır.
// 1-) Sequential (Senkron: sadece 1 işlem yapar)
// 2-) Paralel (Asenkron:Aynı anda birden fazla işlem yapabilir.)
public class _1_Stream_API_Description {
	
	// Dizi ile ==> 2 ile bölünebilen sayıları toplayın
	public static void basicArrayExamples() {
		// Diziyle
		int[] dizi = { 1, 2, 3, 4, 5 };
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] % 2 == 0)
				toplam += dizi[i];
		}
		System.out.println(toplam);
	}
	
	// Stream ile ==> 2 ile bölünebilen sayıları toplayın
	// stream ile Lambda expressiın çok kullanılır.
	public static void basicStreamExamples() {
		List<Integer> listem1 = List.of(1, 2, 3, 4, 5);
		List<Integer> listem2 = Arrays.asList(1, 2, 3, 4, 5);
		
		int toplam = listem2.stream().filter(temp -> temp % 2 == 0).reduce(0, (x, y) -> x + y);
		System.out.println(toplam);
		
		// Predicate: java.util.function
		Predicate<Integer> ciftSayilar = temp -> temp % 2 == 0;
		int toplam2 = listem2.stream().filter(ciftSayilar).reduce(0, (x, y) -> x + y);
		System.out.println(toplam2);
	}
	
	public static void main(String[] args) {
		// int[] dizi = { 1, 2, 3, 4, 5, 6 };
		// IntStream intStream = Arrays.stream(dizi);
		
		basicArrayExamples();
		basicStreamExamples();
	}
	
}