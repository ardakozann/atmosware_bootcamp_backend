package com.turkcell;

import java.util.Scanner;

public class _32_Diziler_x0_Login {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		login();
	}
	
	public static void login() {
		String[][] usernameAndPassword = new String[4][2];
		
		for (int i = usernameAndPassword.length - 1; i >= 0; i--) {
			usernameAndPassword[i][0] = inputUsername();
			usernameAndPassword[i][0] = inputPassword();
			
		}
	}
	
	public static String inputUsername() {
		System.out.println("Username giriniz");
		return scanner.next();
	}
	
	public static String inputPassword() {
		System.out.println("Password giriniz");
		return scanner.next();
	}
	
}
