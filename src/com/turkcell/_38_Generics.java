package com.turkcell;

// Generics:
// <>
// Türk problemlerini çözer
// casting ile uğraşmazsınız
// dynamics
// var ==> java 10 gelen (Object)
// Tüm referans tipleri barındırır.

// Generic class
public class _38_Generics<T> {
	
	// Generics Object variable
	private T data;
	
	// getter and setter
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	// normaş method
	public void normalMethod(String data) {
		System.out.println(data);
	}
	
	// Generic method
	public <K> void genericsMethod1(K data) {
		System.out.println(data);
	}
	
	public <K> void genericsMethod2(K data1, K data2) {
		System.out.println(data);
	}
	
	// constructors
	public _38_Generics() {
		super();
	}
	
	public _38_Generics(T data) {
		super();
		this.data = data;
	}
	
	public static void main(String[] args) {
		
		// dinamik bir veri gönderim şekli
		System.out.println("**** dinamik bir veri ****");
		_38_Generics sinif = new _38_Generics();
		sinif.setData(true);
		System.out.println(sinif.getData());
		
		// generic methods
		System.out.println("**** Generic Method ****");
		sinif.normalMethod("kelime");
		sinif.genericsMethod1(44);
		sinif.genericsMethod2(true, "merhabalar");
		
		// dinamik bir veri parametreli constructor gönderim şekli
		System.out.println("**** dinamik bir veri parametreli constructor");
		_38_Generics sinif2 = new _38_Generics("const");
		System.out.println(sinif2.getData());
		
		// generic type
		System.out.println("**** dinamik generics bir veri parametreli constructor ****");
		_38_Generics<Boolean> sinif3 = new _38_Generics();
		sinif3.setData(true);
		System.out.println(sinif3.getData());
	}
}
