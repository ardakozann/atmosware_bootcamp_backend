package com.turkcell.fileIOHomework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class _35_FileIO4_Homework {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int chooise() {
		System.out.println("Secim yapiniz");
		System.out.println(
				"1-)Dosya olustur\n2-)Dosya Yaz\n3-)Dosya Oku\n4-)Dosya Sil\n5-)Dosya Bilgileri\n6-)Rol degistir\n7-)Butun Dosyalar\n0-)Cikis");
		return scanner.nextInt();
	}
	
	private static void mainMethod(int roles) throws IOException {
		int key = chooise();
		
		switch (key) {
			case 1:
				if (roles == 1) {
					System.out.println("*** Dosya Olusturmak ***");
					createDataFile();
				} else {
					System.out.println("Yetkiniz yok.");
				}
				break;
			case 2:
				if (roles <= 2) {
					System.out.println("*** Dosya Yaz ***");
					writeDataFile();
				} else {
					System.out.println("Yetkiniz yok.");
				}
				break;
			case 3:
				System.out.println("*** Dosya Oku ***");
				readDataFile();
				break;
			case 4:
				if (roles == 1) {
					System.out.println("*** Dosya Sil ***");
					deleteDataFile();
				} else {
					System.out.println("Yetkiniz yok.");
				}
				break;
			case 5:
				System.out.println("*** Dosya Bilgileri ***");
				dataFileInformation();
				break;
			case 6:
				System.out.println("*** Rol Secimi ***");
				roles = chooiseRole();
				break;
			case 7:
				System.out.println("*** Butun Dosyalar ***");
				allFiles();
				break;
			case 0:
				System.out.println("Cikis yapildi.");
				System.exit(0);
				break;
			default:
				System.out.println("Farkli bir deger girdiniz, yeniden deneyiniz.");
		}
	}
	
	// rol seçme
	private static int chooiseRole() {
		int rol = 0;
		while (rol < 1 || rol > 3) {
			System.out.println("Rol seciniz:");
			System.out.println("1-ADMIN\n2-WRITER\n3-USER");
			rol = scanner.nextInt();
		}
		return rol;
	}
	
	// Dosya hakkindaki bilgiler
	private static void dataFileInformation() throws IOException {
		
		allFiles();
		File file = fileFunction();
		
		if (file.exists()) {
			System.out.println("Calisabilen dosya mi : " + file.canExecute());
			System.out.println("Okunabilen dosya mi : " + file.canRead());
			System.out.println("Yazilabilen dosya mi : " + file.canWrite());
			System.out.println("Gizli dosya mi : " + file.isHidden());
			System.out.println("class: " + file.getClass());
			System.out.println("absolute path " + file.getAbsolutePath());
			System.out.println("normal path " + file.getPath());
			System.out.println("Canonical path " + file.getCanonicalPath());
			System.out.println("parent: " + file.getParent());
			System.out.println("name : " + file.getName());
			System.out.println("toplam karakter sayisi : " + file.length());
			System.out.println("Degisiklik Tarihi: " + new Date(file.lastModified()));
		}
		
	}
	
	// Dosa silme
	private static void deleteDataFile() {
		allFiles();
		File file = fileFunction();
		if (file.exists()) {
			System.out.println("Dosya silindi");
			file.delete();
		} else {
			System.out.println("Dosya silinemedi veya bulunamadi.");
		}
	}
	
	// Dosya içeriğini okuma
	private static void readDataFile() throws IOException {
		allFiles();
		File file = fileFunction();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()))) {
			StringBuilder stringBuilder = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuilder.append("\n" + line);
			}
			System.out.println(stringBuilder + "\n");
		} catch (Exception e) {
			
		}
		
	}
	
	// Dosyaya yazı yazma
	private static void writeDataFile() {
		
		allFiles();
		File file = fileFunction();
		
		if (!file.exists()) {
			System.out.println("Dosya mevcut degil.");
			return;
		}
		System.out.println("Dosya icerisine yazdirmak istediginizi yaziniz.");
		scanner = new Scanner(System.in);
		String toWrite = scanner.nextLine();
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getPath(), true))) {
			bufferedWriter.write(toWrite);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			System.out.println("Ekleme basarili");
		} catch (Exception e) {
			System.out.println("Ekleme basarisiz");
		}
	}
	
	// Dosya yaratma
	private static void createDataFile() throws IOException {
		String path = dataMerge(null);
		File file = new File(path);
		if (file.createNewFile()) {
			System.out.println(file.getName() + " Dosya olusturuldu");
		} else {
			System.out.println("Olusturulmadı");
		}
	}
	
	// path i birleştirme
	// Burada eğer dosya oluşturmadan geliniyorsa fileName null geliyor ve fileName
	// istiyor.
	// Eğer dosya okuma silme gibi metotlardan geliyorsa fileName geliyor zaten
	private static String dataMerge(String fileName) {
		StringBuilder stringBuilder = new StringBuilder("C:\\turkcell\\");
		if (fileName == null) {
			fileName = createDataPath();
		}
		stringBuilder.append(fileName).append(".txt");
		return stringBuilder.toString();
	}
	
	// Dosya ismini döndürüyor
	private static String createDataPath() {
		System.out.println("Dosya ismi giriniz:");
		return scanner.next();
	}
	
	// Dosya ismi girildikten sonra File nesnesine bunu atayıp file nesnesi
	// döndürüyor
	private static File fileFunction() {
		
		System.out.println("Dosya ismini giriniz.");
		String fileName = scanner.next();
		String filePath = dataMerge(fileName);
		return new File(filePath);
	}
	
	// tüm dosyaları gösteriyor
	private static void allFiles() {
		
		System.out.println("\nDizin : C:\\turkcell");
		System.out.println("#########################");
		for (File temp : new File("C:\\turkcell").listFiles()) {
			System.out.println(temp.getName());
		}
		System.out.println("#########################\n");
	}
	
	public static void main(String[] args) {
		try {
			int rol = chooiseRole();
			for (;;) {
				mainMethod(rol);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
