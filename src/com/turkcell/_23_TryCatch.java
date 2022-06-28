package com.turkcell;

public class _23_TryCatch {
	
	public static void main(String[] args) {
		try {
			// istisna meydana gelecek kodlar
			int number = 4 / 0;
			System.out.println(number);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("hata meydana geldi");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
	}
	
}
