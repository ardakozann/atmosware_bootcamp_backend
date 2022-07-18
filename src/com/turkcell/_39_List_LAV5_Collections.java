package com.turkcell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Collections
public class _39_List_LAV5_Collections {
	
	// Collections:
	// Java.util paketinden gelir
	// Java.util.Collections.sort(listem);
	// Collections.sort(listem);
	public static void vectorLoop() {
		// Java 1.7 gelen diamond operator
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya");
		listem.add("Balikesir");
		listem.add("Adana");
		listem.add("Zonguldak");
		
		// sort: Küçükten büyüğe doğru sıralama işlemi
		Collections.sort(listem);
		System.out.println();
		// reverse: Listeyi tersine çevirir
		// shuffle: rastgele karıştırır.
		
		// binarySearch: ikili arama
		// Dikkat: önce küçükten büyüğe doğru sıralamasın(sort)
		System.out.println(Collections.binarySearch(listem, "Balikesir"));
		
		System.out.println("**** ITERATOR DONGUSU ****");
		Iterator<String> iterator = listem.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Unmodifiable: bundan sonra listeye veri eklemeyi engelleme
		listem = Collections.unmodifiableList(listem);
		listem.add("yeni Data");
		
	}
	
	public static void main(String[] args) {
		vectorLoop();
	}
	
}
