package socket_c;

import java.io.*;
import java.net.*;

public class client {
	public static void main(String args[]) throws Exception{
		Socket s = new Socket("localhost", 7777);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String st = br.readLine();
			dout.writeUTF(st);
			if(st.equalsIgnoreCase("exit"))
				break;
		}
		s.close();
		
	}
}


