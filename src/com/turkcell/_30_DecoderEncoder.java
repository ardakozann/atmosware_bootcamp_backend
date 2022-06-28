package com.turkcell;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class _30_DecoderEncoder {
	
	// Decoder Encoder
	// Encoder : yazılımda Bir kelimeyi belli bir formatta şifreleme için kullanılır
	// Decoder : yazılımda şifrelenmiş bir kodu, çözmek için kullanılır
	// Base64 kütüphanesi kullanılır
	// Encoder-Decoder JWT en çok kullanıyoruz.
	// Neden kullanılıyoruz = Büyük verilerde daha az yer kaplar.
	// Decoder-Encoder, MD5 SHA ile karıştırmayalım.
	
	// Kullanıcıdan veri almak
	public static String getDataFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir seyler yaziniz..");
		String vocabulary = scanner.nextLine();
		return vocabulary;
	}
	
	// Encoder method
	public static String getEncoderData(String vocabulary) {
		Encoder encoder = Base64.getEncoder();
		String encrypted = encoder.encodeToString(vocabulary.getBytes());
		return encrypted;
	}
	
	// Decoder method
	public static String getDecoderData(String vocabulary) {
		Decoder decoder = Base64.getDecoder();
		String solved = new String(decoder.decode(vocabulary));
		return solved;
	}
	
	public static void encoderDecoderMainMethod() {
		String kelime = getDataFromUser();
		System.out.println("ilk hali: " + kelime);
		
		// Encoder(Şifreleme)
		String encrypted = getEncoderData(kelime);
		System.out.println("sifrelenmis data" + encrypted);
		
		// Decoder(Çözmek)
		String solved = getDecoderData(getEncoderData(kelime));
		System.out.println("cozulmus data: " + solved);
	}
	
	public static void main(String[] args) {
		encoderDecoderMainMethod();
	}
}
