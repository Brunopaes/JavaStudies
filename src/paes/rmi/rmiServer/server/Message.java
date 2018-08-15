package paes.rmi.rmiServer.server;

import paes.rmi.commom.MessageRemote;

public class Message implements MessageRemote {

    @Override
    public String getMessage() {
        return "Teste RMI - Paes";
    }
}
