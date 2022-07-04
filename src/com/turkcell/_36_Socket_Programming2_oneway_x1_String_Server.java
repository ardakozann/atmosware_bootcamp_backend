package com.turkcell;

import java.io.DataInputStream;
import java.net.ServerSocket;

public class _36_Socket_Programming2_oneway_x1_String_Server {
	
	// One Way (Client-Server string examples)
	// Client, Servera veri göndersin.
	// Server gelen datayı alsın ve büyük harflere ve length hesaplasın algoritma ?
	
	// Unutma:
	// 1-) Öncelikle Server'ı çalıştırmalısın.
	// 2-) PSVM ==> server'da olur.
	// java.net (ServerSocket için)
	
	// Unutma öncelikle Server'ı çalıştırmalısın.
	// Sonra client'i çalıştır.
	
	public static void serverMethod() {
		String clientValue, bigLetter;
		System.out.println("Server hazir...");
		System.out.println("Port: " + _36_Socket_Programming.port);
		try (DataInputStream dataInputStream = new DataInputStream(
				new ServerSocket(_36_Socket_Programming.port).accept().getInputStream())) {
			
			clientValue = dataInputStream.readUTF();
			bigLetter = clientValue.toUpperCase();
			System.out.println(bigLetter);
			System.out.println("Harf sayisi: " + bigLetter.length());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Uzun yol
	// public static void serverMethod2() {
	// try {
	// port = random();
	// System.out.println("P yet : port eklenmemiş
	// // java.net.BindExceptort: " + port);
	//
	// // Socket is not boundion: Address already in use : bind : Aynı portu tekrar
	// // kullandınız
	// ServerSocket socket = new ServerSocket(port);
	// Socket successPort = socket.accept();
	// System.out.println("Server hazır...");
	// InputStreamReader inputStreamReader = new
	// InputStreamReader(successPort.getInputStream());
	// BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	//
	// String str = bufferedReader.readLine();
	// System.out.println("Client: " + str);
	//
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	
	public static void main(String[] args) {
		serverMethod();
	}
}
