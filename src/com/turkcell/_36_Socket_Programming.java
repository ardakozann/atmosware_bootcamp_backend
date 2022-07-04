package com.turkcell;

import java.util.Random;

public class _36_Socket_Programming {
	// Dağıtık Programlama (distributed System) :Aynı networkteki bilgisayarların
	// birbiriyle haberleşmesine denilir.
	// Senkron : Aynı anda tek bir işlem yapabilme yeteneğidir.
	// ASenkron : Aynı anda birden fazla işlem yapabilme yeteneğidir.
	// TCP/IP UDP (Client:istemci(Hizmet alan) Server:Hizmet veren :
	// TCP/IP ~ UDP ==> Ağdaki Bilgisayarların birbiriyle haberleşmesini sağlayan
	// protokol adıdır.
	
	// TCP/IP ile UDP arasındaki farklar
	// TCP/IP: güvenli ,karşı tarafa data gidip gitmediğini kontrol eder. Yavaştır.
	// UDP:güvensizdir,karşı tarafa data gidip gitmediğini kontrol etmeezzzzzz.
	// Hızlıdır. Canlı Live Stream (Online system)
	
	// RPC > RMI (Java): Remote Method Invocation: Farklı sunuculardaki metotları
	// çağırıp işlem
	// yapılması durumudur.
	
	// 2^16=65536 port sayısı (Kapı)
	// 0<=X<=1023 (Well-Know-Port)
	// SSH:22
	// FTP:20
	// HTTP:80, 443
	
	// 1024<=Y<=49151 ( Registered Port):sabitlenmiş
	// Mongo: 27017
	// Postgresql:5432
	// Mysql:3306
	
	// 49152<=X<=65535 Dynamic Port
	
	public static int port = 9696;
	public static String ipAddress = "localhost"; // 127.0.0.1
	
	private static int randomInt() {
		Random random = new Random();
		int low = 49152;
		int high = 65536;
		int result = random.nextInt(high - low) + low;
		return result;
	}
	
	public _36_Socket_Programming() {
		
	}
	
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 16)); // 65536 port
		//
	}
	
}
