package com.turkcell;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _40_List_HLT1 {
	
	// Set:
	// Tekrarsız verileri kullanmak içindir
	// Hashset: Rastgele sırada göster ve tekrarsız
	// LinkedHashSet: Eklediğimiz sırada göster ve tekrarsız
	// TreeSet: Küçükten büyüğe tekrarsız
	public static void linkedHastSetTutorials() {
		Set<String> iller = new LinkedHashSet<String>(); // Eklediğimiz sırada
		iller.add("Malatya");
		iller.add("Elazig");
		iller.add("Bingol");
		iller.add("Diyarbakir");
		iller.add("Malatya");
		iller.add("Malatya");
		
		for (String temp : iller) {
			System.out.println(temp);
		}
		
		iller.remove("Bingol");
		
		System.out.println("******************");
		
		Iterator<String> iterator = iller.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("******************");
	}
	
	public static void hastSetTutorials() {
		Set<String> iller = new HashSet<String>(); // Restgele
		iller.add("Malatya");
		iller.add("Elazig");
		iller.add("Bingol");
		iller.add("Diyarbakir");
		iller.add("Malatya");
		iller.add("Malatya");
		
		for (String temp : iller) {
			System.out.println(temp);
		}
		
		System.out.println("******************");
		
		Iterator<String> iterator = iller.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("******************");
		
		// set ==> array'e çevirmek
		iller.toArray();
		
		// eleman sayýsý
		iller.size();
		
		// boþ mu
		iller.isEmpty();
		
		// listede verileri temizlemek
		iller.clear();
	}
	
	public static void treeSetTutorials() {
		Set<String> iller = new TreeSet<String>(); // Küçükten büyüğe sıralama
		iller.add("Malatya");
		iller.add("Elazig");
		iller.add("Bingol");
		iller.add("Diyarbakir");
		iller.add("Malatya");
		iller.add("Malatya");
		
		for (String temp : iller) {
			System.out.println(temp);
		}
		
		System.out.println("******************");
		
		Iterator<String> iterator = iller.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("******************");
	}
	
	public static void main(String[] args) {
		linkedHastSetTutorials();
		hastSetTutorials();
		treeSetTutorials();
	}
}
