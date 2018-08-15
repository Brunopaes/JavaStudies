package paes.rmi.rmiServer.server;

import paes.rmi.commom.MessageRemote;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MainRMIServer {
    public static void main(String[] args) {

        try {

            //Generate the Stub - a copy of the object in the client side
            MessageRemote m = (MessageRemote) UnicastRemoteObject.exportObject(new Message(), 0);

            //Service start at 8040 port
            LocateRegistry.createRegistry(8040);

            //Register the stub with the message name - "DNS" server
            LocateRegistry.getRegistry(8040).bind("Message", m);
            System.out.println("Starting service...");
        }

        catch (Exception e) { e.printStackTrace(); }

    }
}
