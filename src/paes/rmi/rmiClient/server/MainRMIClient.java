package paes.rmi.rmiClient.server;

import paes.rmi.commom.MessageRemote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainRMIClient {
    public static void main(String[] args) {
        try {
            //Connect to the RMI stub registry (server side)
            Registry r = LocateRegistry.getRegistry("127.0.0.1", 8040);

            //search the remote object (defined in the server)
            MessageRemote i = (MessageRemote) r.lookup("Message");
            System.out.println("Remote Message: " + i.getMessage());
        }
        catch (Exception e) { e.printStackTrace(); }
    }

}
