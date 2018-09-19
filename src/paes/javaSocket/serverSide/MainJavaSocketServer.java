package paes.javaSocket.serverSide;

import java.net.ServerSocket;
import java.net.Socket;

public class MainJavaSocketServer {
    public static void main(String[] args) {

        String corpo = "<h1>Oi! Boa Noite!</h1>";

        String html = "HTTP/1.1 200 Ok\n" +
                "Content-Type: text/html; charset = UTF-8\n" +
                "Content-Length: " + corpo.length() + "\n\n" +
                corpo;

        System.out.println(html);
        try {
            //Create a new service receiving in 80 door
            ServerSocket ss = new ServerSocket(80);

            //Waiting for the requisitions
            Socket s = ss.accept();
            s.getOutputStream().write(html.getBytes());

            ss.close();
            s.close();
        }
        
        catch (Exception e) { e.printStackTrace(); }
    }
}
