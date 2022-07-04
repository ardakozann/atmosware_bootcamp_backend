package com.turkcell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class _36_Socket_Programming3_twoway_x1_String_Server {
	
	public static void main(String[] args) {
		String receiveMessage; // mesaj almak
		String sendMessage = null; // mesaj göndermek
		System.out.println("Server hazir");
		
		try {
			ServerSocket serverSocket = new ServerSocket(8685);
			Socket socket = serverSocket.accept();
			
			OutputStream outputStream = socket.getOutputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
			
			while (true) {
				if ((receiveMessage = receiveRead.readLine()) != null) {
					System.out.println("Server: " + receiveMessage);
				}
				receiveMessage = bufferedReader.readLine();
				printWriter.println(receiveMessage);
				printWriter.flush();
				_36_Socket_Programming_twoway_Write.toWrite("Server: " + receiveMessage);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
