package com.turkcell.interfacex;

// interface: bir arayüzdür
// önce söz veriyorum: kilo vereceğim imza (Gövdesiz metot)
// spor salona gitmek (Gövdeli metotut)

// gövdeli metot - gövdesiz metot yazabilirsiniz
// keyword: implements
// istediğimiz kadar implement yazıp virgülle ekleyebiliriz.
// polymorphism yapabiliriz.

// abstraction=interface+ abstact

// Access Modifier
// inheritance : public ,private ,protected , default(-) new ile
// oluşturabilirsin , 1tane extends
// abstract : public ,protected , default(-) new ile oluşturamazsın , 1tane
// extends
// interface : public ,protected , default(-) new ile oluşturamazsın , Ntane
// implements

// inheritance-abstract-interface
// temiz kod yazmamıza olanak sağlar
// polymorphism sağlar
// maliyeti düşürür.
// kod karmaşıklığından kurtarır.
// az kod çok iş

// abstract -interface ortak özellikleri
// polymorphism yapabiliriz.
// soyutmalama yapabiliriz
// gövdeli metot yazabiliriz.
// gövdesiz metot yazabiliriz.

// abstract -interface farklı özellikleri
// abstract ==>ortak özelliklerde kullanmak
// extends(1),
// IS-A

// interface ==> farklı ortak özelliklerde
// implements(N)
// CAN-DO
// 100 % soyutlamadır
// public static int sayi=44; //sabit değişken oluşturabilirsiniz

public interface IInterfaceTutorials {
	
	public void siteGit();
	
	public void sepetEkle();
	
	public void ode();
	
	public String al(int sayi);
	
}