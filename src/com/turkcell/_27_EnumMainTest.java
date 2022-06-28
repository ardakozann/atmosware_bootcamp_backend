package com.turkcell;

public class _27_EnumMainTest {
	
	public static void main(String[] args) {
		System.out.println(_27_Enum.CARSAMBA);
		
		_27_Enum enum1 = _27_Enum.CARSAMBA;
		System.out.println(enum1);
		System.out.println("Sira: " + enum1.ordinal());
		System.out.println("Values: " + _27_Enum.values()[2]);
		
		System.out.println();
		
		for (_27_Enum temp : _27_Enum.values()) {
			System.out.println(temp);
		}
	}
	
}
