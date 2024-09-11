package socket_s;

import java.io.*;
import java.net.*;

public class server {
	public static void main(String args[]) throws Exception{
		ServerSocket s = new ServerSocket(7777);
		Socket ss = s.accept();
		System.out.println("connected");
		DataInputStream dout = new DataInputStream(ss.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String str = dout.readUTF();
			System.out.println("client :"+str);
			if(str.equalsIgnoreCase("exit"))
				break;
		}
		ss.close();
	}
}
