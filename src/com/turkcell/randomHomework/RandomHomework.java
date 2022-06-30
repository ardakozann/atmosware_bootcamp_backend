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
import java.util.stream.Stream;

public class RandomHomework {
	
	static Scanner scanner;
	
	private static void determineHomework() throws IOException {
		List<String> students = takeStudents();
		List<String> homeworks = takeHomeworks();
		String[] homeworksShuffle = toShuffle(homeworks);
		List<String> afterMatch = randomMatch(homeworksShuffle, students);
		writeToFile(afterMatch);
	}
	
	private static List<String> takeStudents() throws IOException {
		File studentFile = fileFunction("Ogrencilerin");
		return convertToList(studentFile);
	}
	
	private static List<String> takeHomeworks() throws IOException {
		File homeworkFile = fileFunction("Odevlerin");
		return convertToList(homeworkFile);
	}
	
	private static List<String> randomMatch(String[] homeworks, List<String> students) {
		ArrayList<String> afterMatch = new ArrayList<String>();
		int min = Math.min(students.size(), homeworks.length);
		for (int i = 0; i < min; i++) {
			afterMatch.add(students.get(i) + " - " + homeworks[i]);
		}
		return afterMatch;
	}
	
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
	
	private static File fileFunction(String name) {
		
		System.out.println(name + " oldugu dosya ismini giriniz:");
		scanner = new Scanner(System.in);
		String fileName = scanner.next();
		return new File("C:\\turkcell\\" + fileName + ".txt");
	}
	
	private static String[] toShuffle(List<String> homeworks) {
		
		String[] homeworksArray = new String[homeworks.size()];
		
		for (int i = 0; i < homeworks.size(); i++) {
			homeworksArray[i] = homeworks.get(i);
		}
		
		Random random = new Random();
		
		for (int i = homeworks.size() - 1; i > 0; i--) {
			
			int j = random.nextInt(i);
			
			String temp = homeworksArray[i];
			homeworksArray[i] = homeworksArray[j];
			homeworksArray[j] = temp;
		}
		return homeworksArray;
	}
	
	private static List<String> convertToList(File file) throws IOException {
		Stream<String> stream = Files.lines(Paths.get(file.getPath()));
		return stream.toList();
	}
	
	public static void main(String[] args) throws IOException {
		determineHomework();
	}
}
