package pl.tau.lab02.messenger;

public interface MessageService {
		
	ConnectionStatus checkConnection(String server);	
	SendingStatus send(String server, String message) throws MalformedRecipientException;

}
