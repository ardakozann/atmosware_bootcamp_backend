package com.turkcell;

// enum class interface
// Java 5 gelen özelliktir.
// type safe sağlar
// enum class interface
// new oluşturulmaz ==> enum, interface , abstract
// enum saymaya sıfırdan başlar
// değişkenlerde final kullanmak bize sadece getter metodunu gelir
// constructorde private oluşturmak new yani instance oluşmasına izin vermek
public class _28_EnumMainTest2 {
	
	public static void main(String[] args) {
		_28_EnumConstructor enumConstructor = _28_EnumConstructor.BUYUK;
		System.out.println(enumConstructor);
		System.out.println("SIRA : " + enumConstructor.ordinal());
		System.out.println("Key  : " + enumConstructor.getKey());
		System.out.println("Value: " + enumConstructor.getValue());
		
		String str = _28_EnumConstructor.BUYUK.toString();
		System.out.println(str);
		
		String str2 = _28_EnumConstructor.BUYUK.getValue().toString();
		System.out.println(str2);
		
		System.out.println("*****************************************");
		for (_28_EnumConstructor temp : _28_EnumConstructor.values()) {
			System.out.println(temp + " " + temp.getKey() + " " + temp.getValue());
		}
	}
	
}
