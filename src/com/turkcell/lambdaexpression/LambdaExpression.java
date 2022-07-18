package com.turkcell.lambdaexpression;

// Lambda Expression (Lambda Function)
// Tek başına bir anlam ifade etmez.
// Java 8 gelen özelliklerdir.
// Okunabilir(readibility) yazılabilir(writability) ve hızlı kodlar yazmak
// sade kodlarla işlem yaparız.
// Lambda tek başına anlamsızdır.

// Lambda Arkasında Güç :JVM arkadaki lambdaları birer interface çevirir.

// Lambda Function
// kullanmak için interface oluşturmalıyız.
// güçünü interface alır.
// stream api ile çok kullanılır.

// interface
// dikkat sadece public ve -(default) yazabiliriz
// private ve protected yazamam

// Normal bir metot ======> Lambda Expression
// public void deneme() ==> {} (x)->{x*5}

// kullanımı java () ->{}
// kullanımı javascript () =>{}

// Java 8 gelen bir özellik
// @FunctionalInterface ==> interface 1 tane gövdesiz metot yazabilirsin başka
// yazamazsın

// Lambda Expression yazarken dikkat edeceğimiz hususlar
// 1-) @FunctionInterface ==> 1 tane gövdesiz metot yaz
// 2-) Parametre sayısı ve türü çağıranda aynı olmalı (temp)=>{}
// 3-) return varsa return türü yazılır

// interface 1 tane gövdesiz metot yazabilirsin başka yazamazsın
@FunctionalInterface
interface ILambdaExpressionData {
	public void deneme(String adi);
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		// Normal Interface
		ILambdaExpressionData expressionData = new ILambdaExpressionData() {
			
			@Override
			public void deneme(String adi) {
				System.out.println(adi + "normal interface yapısı");
				
			}
		};
		expressionData.deneme("argüman verdim ");
		
		// Lambda Expression Interface
		ILambdaExpressionData expressionData2 = (temp) -> {
			System.out.println(temp + " function interface yapısı");
		};
		expressionData2.deneme("argüman verdim ");
	}
	
}