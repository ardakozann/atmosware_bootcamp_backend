package com.turkcell.randomHomework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomHomework {
	
	static Scanner scanner;
	
	private static void determineHomework() throws IOException {
		List<String> students = takeStudents();
		List<String> homeworks = takeHomeworks();
		String[] homeworksShuffle = toShuffle(homeworks);
		List<String> afterMatch = randomMatch(homeworksShuffle, students);
		writeToFile(afterMatch);
	}
	
	// dosyadaki öğrencileri liste halinde almak
	private static List<String> takeStudents() throws IOException {
		File studentFile = fileFunction("Ogrencilerin");
		return convertToList(studentFile);
	}
	
	// Dosyadaki ödevleri liste halinde almak
	private static List<String> takeHomeworks() throws IOException {
		File homeworkFile = fileFunction("Odevlerin");
		return convertToList(homeworkFile);
	}
	
	// karıştırılan ödevleri ve öğrencileri eşleştirmek
	private static List<String> randomMatch(String[] homeworks, List<String> students) {
		ArrayList<String> afterMatch = new ArrayList<String>();
		int min = Math.min(students.size(), homeworks.length);
		for (int i = 0; i < min; i++) {
			afterMatch.add(students.get(i) + " - " + homeworks[i]);
		}
		return afterMatch;
	}
	
	// Karıştırılan ödevleri ve öğrencileri yan yana yazdırmak
	private static void writeToFile(List<String> afterMatched) throws IOException {
		
		File file = fileFunction("Odevlerin dagitilacak");
		if (file.createNewFile()) {
			try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getPath(), true))) {
				for (int i = 0; i < afterMatched.size(); i++) {
					bufferedWriter.write(afterMatched.get(i));
					bufferedWriter.newLine();
				}
				bufferedWriter.flush();
				System.out.println("Odev dagitimi basarili");
			} catch (Exception e) {
				System.out.println("Odev dagitimi basarisiz");
			}
		} else {
			System.out.println("Dosya zaten mevzut. Bu yuzden odevler dagitilamadi.");
		}
		
	}
	
	// File nesnesine path i atamak
	private static File fileFunction(String name) {
		
		System.out.println(name + " oldugu dosya ismini giriniz:");
		scanner = new Scanner(System.in);
		String fileName = scanner.next();
		return new File("C:\\turkcell\\" + fileName + ".txt");
	}
	
	// Ödevleri dizi içerisinde sırasını karıştırmak
	private static String[] toShuffle(List<String> homeworks) {
		// List tipini shuffle için diziye atama
		String[] homeworksArray = new String[homeworks.size()];
		
		for (int i = 0; i < homeworks.size(); i++) {
			homeworksArray[i] = homeworks.get(i);
		}
		
		Random random = new Random();
		// Dizide shuffle yapma
		for (int i = homeworks.size() - 1; i > 0; i--) {
			
			int j = random.nextInt(i);
			
			String temp = homeworksArray[i];
			homeworksArray[i] = homeworksArray[j];
			homeworksArray[j] = temp;
		}
		return homeworksArray;
	}
	
	// Dosya içeriğindeki metinleri her bir satırı liste şeklinde geri döndürmek
	private static List<String> convertToList(File file) throws IOException {
		return Files.lines(Paths.get(file.getPath())).toList();
	}
	
	public static void main(String[] args) throws IOException {
		determineHomework();
	}
}
