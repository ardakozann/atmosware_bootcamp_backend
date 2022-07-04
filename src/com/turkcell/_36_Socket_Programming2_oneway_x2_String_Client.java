package com.turkcell;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class _36_Socket_Programming2_oneway_x2_String_Client {
	
	// Server method
	public static void clientMethod() {
		
		String vocabulary = JOptionPane.showInputDialog("Lutfen birseyler yaziniz.");
		
		try (DataOutputStream dataOutputStream = new DataOutputStream(
				new Socket(_36_Socket_Programming.ipAddress, _36_Socket_Programming.port).getOutputStream())) {
			dataOutputStream.writeUTF(vocabulary);
		} catch (IOException e) {
			System.out.println("Client method IOException error");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Client method error");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		clientMethod();
	}
}
