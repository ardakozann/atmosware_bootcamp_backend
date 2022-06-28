package com.turkcell;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// NOT: birden fazla metotla yapalım
// kullanıcıdan alınan sayı kadar dizi elemanı olsun rastgele 1-10 arasındaki bu
// sayıları bir diziye atayalım
// sonra bu diziyi başka bir diziye clone edelim.
// clonelanmış bu dizi bu sayıları küçükten büyüğe doğru sıralayın
// (Arrays.sort())
// en küçük sayıyı ve en büyük sayıyı bulalım ? ( diziyele yapalım)
// bu sayıların toplamını ?
// bu sayıların ortalaması ?

// bu dizideki elemanlardan tek sayılardan kaç tane ve tek sayı toplamları (tek
// sayı dizisi)
// bu dizideki elemanlardan çift sayılardan kaç tane ve çift sayı toplamları
// (çift sayı dizisi)
// dizilerde en büyük ile 25 karşılatıralım dizideki eleman 25 büyük mü
// dizideki elemanlardan 5 sayısı var mı ? (java.util.Arrays.binarySearch())
// dizideki tekrar eden sayıları bir dizide göstrerelim ?
// dizideki tekrar eden sayılar yerine 1 kere tekrar sayı göstersin (tekrarsız
// dizi elemanları)
public class _32_Diziler_x2_AllInOne {
	public static void main(String[] args) {
		int[] sampleArray = inputArray();
		sampleArray = fillRandom(sampleArray);
		int[] cloneArray = cloneAndSort(sampleArray);
		findMaxAndMin(cloneArray);
		allOfSums(cloneArray);
		checkMaximumValue(cloneArray);
		binarySearch(cloneArray);
		multipleValues(cloneArray);
		withoutMultipleValues(cloneArray);
	}
	
	public static int[] inputArray() {
		System.out.println("Dizinin boyutunu giriniz:");
		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		if (arrayLength > 0) {
			return new int[arrayLength];
		}
		return null;
	}
	
	public static int[] fillRandom(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
		}
		System.out.println("Dizinin elemanlari     : " + Arrays.toString(array));
		return array;
	}
	
	public static int[] cloneAndSort(int[] array) {
		int[] cloneArray = array.clone();
		Arrays.sort(cloneArray);
		System.out.println("Dizinin siralanmis hali: " + Arrays.toString(cloneArray));
		return cloneArray;
	}
	
	public static void findMaxAndMin(int[] array) {
		int max = array[array.length - 1];
		int min = array[0];
		System.out.println("Dizinin maksimum degeri: " + max);
		System.out.println("Dizinin minimum degeri : " + min);
	}
	
	public static void allOfSums(int[] array) {
		int sumOfEvenNumber = 0, sumOfOddNumber = 0, countOfEvenNumber = 0, countOfOddNumber = 0;
		Set<Integer> evenNumbersInSet = new HashSet<Integer>();
		Set<Integer> oddNumbersInSet = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sumOfEvenNumber += array[i];
				countOfEvenNumber++;
				evenNumbersInSet.add(array[i]);
			} else {
				sumOfOddNumber += array[i];
				countOfOddNumber++;
				oddNumbersInSet.add(array[i]);
			}
		}
		Integer[] evenNumbersInArray = new Integer[evenNumbersInSet.size()];
		Integer[] oddNumbersInArray = new Integer[oddNumbersInSet.size()];
		evenNumbersInSet.toArray(evenNumbersInArray);
		oddNumbersInSet.toArray(oddNumbersInArray);
		
		System.out.println("Dizideki cift sayilar : " + Arrays.toString(evenNumbersInArray));
		System.out.println("Dizideki cift sayilarin toplami : " + sumOfEvenNumber);
		System.out.println("Dizideki cift sayilarin adeti : " + countOfEvenNumber);
		
		System.out.println("Dizideki tek sayilar : " + Arrays.toString(oddNumbersInArray));
		System.out.println("Dizideki tek sayilarin toplami : " + sumOfOddNumber);
		System.out.println("Dizideki tek sayilarin adeti : " + countOfOddNumber);
		
	}
	
	public static void checkMaximumValue(int[] array) {
		if (array[array.length - 1] > 25) {
			System.out.println("Dizinin maksimum degeri 25'den buyuktur.");
		} else {
			System.out.println("Dizinin maksimum degeri 25 veya 25'den kucuktur");
		}
	}
	
	public static void binarySearch(int[] array) {
		int checkFive = Arrays.binarySearch(array, 5);
		checkFive += 1;
		if (checkFive < 0) {
			System.out.println("Dizide 5 sayisi bulunamamistir.");
		} else {
			System.out.println("Dizide 5 sayisi " + checkFive + ". siradadir.");
		}
	}
	
	public static void multipleValues(int[] array) {
		Set<Integer> arrayWithMultipleValues = new TreeSet<Integer>();
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] == array[i]) {
				arrayWithMultipleValues.add(array[i - 1]);
			}
		}
		Integer[] tempArray = new Integer[arrayWithMultipleValues.size()];
		arrayWithMultipleValues.toArray(tempArray);
		System.out.println("Yinelenen degerler ile olusturulan dizi : " + Arrays.toString(tempArray));
	}
	
	public static void withoutMultipleValues(int[] array) {
		Set<Integer> arrayWithoutMultipleValues = (Set<Integer>) Arrays.stream(array).boxed()
				.collect(Collectors.toSet());
		Integer[] temp = new Integer[arrayWithoutMultipleValues.size()];
		arrayWithoutMultipleValues.toArray(temp);
		Arrays.sort(temp);
		System.out.println("Dizide birden fazla elemanlarin cikarilmis hali : " + Arrays.toString(temp));
	}
}
