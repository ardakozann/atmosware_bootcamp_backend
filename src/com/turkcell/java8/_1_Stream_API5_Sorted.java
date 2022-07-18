package com.turkcell.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// forEach
public class _1_Stream_API5_Sorted {
	
	public static void streamTuto1() {
		
		List<String> listem = Arrays.asList("malatya", "istanbul", "ankara", "malatya", "bursa", "bolu");
		
		// Sorted() ==> Küçükten büyüðe sýralama
		// List<String> listem2 = listem.stream().sorted().collect(Collectors.toList());
		
		// reverse() ==> Büyükten küçüðe sýralama
		List<String> listem2 = listem.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		listem2.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		streamTuto1();
	}
	
}