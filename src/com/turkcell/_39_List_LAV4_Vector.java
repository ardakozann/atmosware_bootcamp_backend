package com.turkcell;

import java.util.Vector;

public class _39_List_LAV4_Vector {
	
	// vector
	public static void vectorLoop() {
		// Vector: Java 1.2 sürümünden bu zamana kadar gelen dinamik dizi için
		// kullanabilirsiniz
		// java.util paketinden gelir
		// defaultta 10 eleman olarak çalışır.
		
		// Generics olmadan yazılan vector
		Vector vector = new Vector();
		vector.add("Malatya");
		vector.add("Balikesir");
		vector.add("Adana");
		vector.add("Malatya");
		System.out.println("Size:" + vector.size());
		System.out.println("\n ***** Generics olmadan yazılan vector ***** ");
		for (Object temp : vector) {
			System.out.print(temp + " ");
		}
		
		// Generics olan yazılan vector
		Vector<String> vector2 = new Vector<String>();
		vector2.add("Malatya");
		vector2.add("Balikesir");
		vector2.add("Adana");
		vector2.add("Malatya");
		System.out.println("Size:" + vector2.size());
		System.out.println("\n ***** Generics olan yazılan vector ***** ");
		for (String temp : vector2) {
			System.out.print(temp + " ");
		}
		
		// Generics olan yazılan vector
		Vector<String> vector3 = new Vector<String>(4);
		vector3.add("Malatya");
		vector3.add("Balikesir");
		vector3.add("Adana");
		vector3.add("Malatya");
		System.out.println("Size:" + vector3.size());
		System.out.println("\n ***** Generics olan yazılan vector ***** ");
		for (String temp : vector3) {
			System.out.print(temp + " ");
		}
		
	}
	
	public static void main(String[] args) {
		vectorLoop();
	}
	
}
