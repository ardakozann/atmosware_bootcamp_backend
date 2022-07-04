package com.turkcell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class _36_Socket_Programming3_twoway_x2_String_Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String receiveMessage = null; // mesaj almak
		String sendMessage; // mesaj göndermek
		
		try {
			Socket socket = new Socket("localhost", 8685);
			
			// Client veri gönderecek
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			// serverdan gelen veriyi almak
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
			System.out.println("Clienttaki ilk mesajinizi yaziniz.");
			
			while (true) {
				// clientten veri almak
				receiveMessage = bufferedReader.readLine();
				printWriter.println(receiveMessage);
				printWriter.flush();
				if ((receiveMessage = bufferedReader2.readLine()) != null) {
					System.out.println("Client: " + receiveMessage);
					_36_Socket_Programming_twoway_Write.toWrite("Client: " + receiveMessage);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
