package com.turkcell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List : LAV
// List bir interface'dir
// LinkedList: Araya yerleştirme, silme işlemlerinde biçilmiş kaftan
// ArrayList: Ekleme ve Arama için biçilmiş kaftan
// Vector: veri defaulta 10, bunun dolacağını anladığında dinamik olarak Hafıza
// uzayı artırır.
public class _39_List_LAV<T> {
	
	// Liste döngüsü
	public static void listLoop() {
		// Java 1.7 gelen diamond operator
		List<String> listem = new ArrayList<String>();
		listem.add("Malatya");
		listem.add("Balikesir");
		listem.add("Adana");
		listem.add("Malatya");
		
		// get: listedeki veriye erişmek için kullanılır.
		System.out.println(listem.get(0));
		
		// size: eleman sayısı
		System.out.println("Eleman sayisi: " + listem.size());
		
		// indexOf: Sıfırdan başlar aramaya
		// Yoksa -1 döner
		System.out.println("indexOf: " + listem.indexOf("Malatya"));
		
		// lastIndexOf: Sıfırdan başlar aramaya
		// Yoksa -1 döner
		System.out.println("lastIndexOf: " + listem.lastIndexOf("Malatya"));
		
		// 1-) iterative for döngü
		System.out.println("FOR ITERATIVE DONGUSU");
		for (int i = 0; i < listem.size(); i++) {
			System.out.print(listem.get(i) + " ");
		}
		System.out.println();
		
		// 2-) iterative for each döngü
		System.out.println("FOR EACH DONGUSU");
		for (String temp : listem) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// 3-) Iterator Dongu: java.util paketinden türer
		// Daha hızlı deniyor ???
		System.out.println("ITERATOR DONGU");
		// Iterator iterator = listem.iterator();
		Iterator<String> iterator = listem.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		
		// 4-) Java 8 gelen Stream API forEach
		System.out.println("STREAM API FOREACH");
		listem.stream().forEach(System.out::println);
		
		System.out.println("STREAM API FOREACH KISASI");
		listem.forEach(System.out::println);
		
		System.out.println();
		
		// isEmpty: Boş mu ?
		System.out.println("Bos mu : " + listem.isEmpty());
		
		// subList: Listeden istediğimiz aralıkta veri göndersin
		System.out.println("**** subList ****");
		// 0 <= x < 3
		for (String temp : listem.subList(0, 3)) {
			System.out.print(temp + " ");
		}
		
		System.out.println();
		
		// remove: Listedeki veriyi siler
		listem.remove(0);
		listem.remove("Adana");
		
		// clear(): Listedeki tüm elemanları siler
		// listem.clear();
		listem.forEach(System.out::println);
		
		System.out.println();
		
		List<String> yeniListem = new ArrayList<>();
		yeniListem.add("44");
		yeniListem.add("34");
		yeniListem.addAll(listem);
		yeniListem.forEach(System.out::println);
		
		// toArray() ==> Listeyi Array'e çevirmek için kullanýrýz.
		// Dikkat: Object türündendir Eðer Integer vs çevirmek istersem
		// önce String'e sonra Integer'a çevirmelisin
		// List ==> Array
		System.out.println("\n**** List To Array dongusu ****");
		Object[] dizi = listem.toArray();
		for (Object temp : dizi) {
			System.out.print(temp + " ");
		}
	}
	
	public static void main(String[] args) {
		listLoop();
	}
	
}
