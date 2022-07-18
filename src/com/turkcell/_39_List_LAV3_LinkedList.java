package com.turkcell;

import java.util.ArrayList;
import java.util.List;

public class _39_List_LAV3_LinkedList {
	
	public static void listLoop() {
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya");
		listem.add("Balikesir");
		listem.add("Adana");
		listem.add("Malatya");
		
		listem.stream().forEach(i -> System.out.println(i));
		listem.stream().map(i -> i += "123").forEach(i -> System.out.println(i));
		
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listLoop();
	}
	
}
