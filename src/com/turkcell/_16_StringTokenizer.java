package com.turkcell;

import java.util.StringTokenizer;

public class _16_StringTokenizer {
	
	public static void main(String[] args) {
		String kelime = "Java+ jsp$jsf servlet~Spring framework springmvc springdata springrest springrest springscurity";
		
		// 1- parçalamak
		String[] parcala = kelime.split(" ");
		for (String temp : parcala) {
			System.out.println(temp);
		}
		
		// 2- parçalamak
		StringTokenizer stringTokenizer = new StringTokenizer(kelime, "+~&$ "); // içerisinde yazan her bir karaktere
																				// göre ayırır
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}
	
}
