package paes.javaSocket.serverSide;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) {

        String corpo = "<h1>Oi! Boa Noite!</h1>";

        String html = "HTTP/1.1 200\n" +
                "Host: www.teste.com\n" +
                corpo;

        try {
            ServerSocket ss = new ServerSocket(80);

            Socket s = ss.accept();
            s.getOutputStream().write(html.getBytes());

            ss.close();
            s.close();
        }

        catch (Exception e) { e.printStackTrace(); }
    }
}
