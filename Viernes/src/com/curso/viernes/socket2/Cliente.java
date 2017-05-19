package com.curso.viernes.socket2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 6666);

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "", str2 = "";
		
		while(!str.equals("stop")) {
			str = br.readLine();
			
			dout.writeUTF(str);
			dout.flush();
			
			str2 = din.readUTF();
			System.out.println("El servidor dice: " + str2);
			
		}
		dout.close();
		s.close();
	}
}
