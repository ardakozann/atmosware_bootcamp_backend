package com.turkcell;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// DOSYA BİLGİLERİNİ ÖDEV OLARAK YAP (hoca yaptı githubından al)

// step1 File için crud işlemi yapacak bir algoritma yapınız.
// step2 oluşturulan her bir dosyaya enum ile ADMIN(yazma okuma oluşturma
// yetkisi),WRITER(yazma ve okuma yetkisi), USER(okuma yetkisi) rolleri en sola
// yazalım ==> ADMIN 30/Haziran/2022 12:26:01 yazdımmm
// step3 Bir dosya okuyacak başka bir dosyaya verileri yazacak (object)
// step4 Bu projemiz şunu da yapsın
// person.txt, homework.txt diye bir dosyamız olsun
// person kişi ismi ve soyismi olacak
// homeowrk.txt dosyasında verilecek ödevler olacak.
// Bilgisayar random olarak kişiye ödev verecek
public class _35_FileIO4_FileCommonExamples {
	private static Scanner klavye = new Scanner(System.in);
	
	private static String MY_PATH = "";
	
	// Chooise method
	public static int chooise() {
		
		System.out.println("Secim yapiniz");
		System.out.println("0-) Cikis\n1-) Dosya olustur.\n2-) Dosya yaz.\n3-) Dosya oku.\n4-) Dosya sil.");
		
		return klavye.nextInt();
	}
	
	public static void mainMethod() throws IOException {
		
		int key = chooise();
		switch (key) {
			case 0: {
				systemExist();
				break;
			}
			case 1: {
				createDataFile();
				break;
			}
			case 2: {
				writeDataFile();
				break;
			}
			case 3: {
				readDataFile();
				break;
			}
			case 4: {
				deleteDataFile();
				break;
			}
			default:
				System.out.println("Secim disinda bir deger girdiniz...");
		}
	}
	
	private static void systemExist() {
		// TODO Auto-generated method stub
		System.out.println("*** Cikis ***");
		System.exit(0);
	}
	
	// create path
	private static String createPath() {
		klavye = new Scanner(System.in);
		System.out.println("Dosya adini giriniz...");
		String fileName = klavye.nextLine();
		_35_FileIO4_FileClass pathClass = new _35_FileIO4_FileClass(dataMerge(fileName));
		return pathClass.getPath();
	}
	
	// create method
	private static void createDataFile() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("*** Dosya olusturmak ***");
		String path = createPath();
		MY_PATH = path;
		File file = new File(path);
		if (file.createNewFile()) {
			System.out.println(file.getAbsolutePath() + " Dosya olusturuldu");
		}
	}
	
	private static String dataMerge(String data) {
		StringBuilder builder = new StringBuilder();
		builder.append("C:\\turkcell\\").append(data).append(".txt");
		return builder.toString();
	}
	
	// write method
	private static void writeDataFile() {
		// TODO Auto-generated method stub
		System.out.println("*** Dosya yazmak ***");
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_PATH, true))) {
			klavye = new Scanner(System.in);
			System.out.println("Dosya yazmak icin birseyler yaziniz...");
			String vocabulary = klavye.nextLine();
			bufferedWriter.write(vocabulary);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// read method
	private static void readDataFile() {
		// TODO Auto-generated method stub
		System.out.println("*** Dosya okumak ***");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(MY_PATH))) {
			StringBuilder builder = new StringBuilder();
			String okunan = "", satir = "";
			while ((satir = bufferedReader.readLine()) != null) {
				builder.append(satir);
			}
			System.out.println(okunan);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Okumada bir sorun olustu");
			e.printStackTrace();
		}
	}
	
	// delete method
	private static void deleteDataFile() {
		// TODO Auto-generated method stub
		System.out.println("*** Dosya silmek ***");
	}
	
	public static void main(String[] args) {
		try {
			for (;;) {
				mainMethod();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
