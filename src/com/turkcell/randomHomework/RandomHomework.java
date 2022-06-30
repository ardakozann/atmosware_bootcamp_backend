package com.turkcell.randomHomework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class RandomHomework {
	
	static Scanner scanner;
	
	private void determineHomework() throws IOException {
		List<String> students = takeStudents();
		List<String> homeworks = takeHomeworks();
		List<String> afterMatch = randomMatch(students, homeworks);
	}
	
	private static List<String> takeStudents() throws IOException {
		File studentFile = fileFunction("Ogrenciler");
		return convertToList(studentFile);
	}
	
	private static List<String> takeHomeworks() throws IOException {
		File homeworkFile = fileFunction("Odevler");
		return convertToList(homeworkFile);
	}
	
	private static List<String> randomMatch(List<String> homeworks, List<String> students) {
		List<String> afterMatch = null;
		int min = Math.min(students.size(), homeworks.size());
		Random random = new Random();
		int randomIndex = 0;
		for (int i = min - 1; i >= 0; i--) {
			randomIndex = random.nextInt(i);
			afterMatch.add(students.get(i) + " - " + homeworks.get(randomIndex));
		}
		return afterMatch;
	}
	
	private static void writeToFile(List<String> afterMatched) {
		
	}
	
	private static File fileFunction(String name) {
		
		System.out.println(name + "in oldugu dosya ismini giriniz:");
		scanner = new Scanner(System.in);
		String fileName = scanner.next();
		return new File("C:\\turkcell\\" + fileName + ".txt");
	}
	
	private static List<String> convertToList(File file) throws IOException {
		Stream<String> stream = Files.lines(Paths.get(file.getPath()));
		return stream.toList();
	}
	
	public static void main(String[] args) {
		
	}
}
