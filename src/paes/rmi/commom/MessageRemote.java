package paes.rmi.commom;

import java.rmi.Remote;
import java.rmi.RemoteException;

//declare the remote-accessed methods
public interface MessageRemote  extends Remote {
    String getMessage() throws RemoteException;
}
