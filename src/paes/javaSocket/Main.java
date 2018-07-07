package paes.javaSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main {
	public static void main(String[] args) {
		
		OutputStream os = null;
		InputStream is = null;
		
		while (true) {
			try {
				Socket s = new Socket("10.15.0.198",8888);
				
				os = s.getOutputStream();
				os.write("H".getBytes());
				
				is = s.getInputStream();
				
				int x = is.read();
				String y = "";
				
				do {
					y += (char) x;
					x = is.read();
					System.out.println(y);
				} while(x != -1);
				
				System.out.println(y);
				
				s.close();
				os.close();
				is.close();
			} 
			
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
