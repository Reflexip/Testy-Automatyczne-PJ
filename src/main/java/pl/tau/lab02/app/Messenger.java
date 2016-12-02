package pl.tau.lab02.app;

import static pl.tau.lab02.messenger.ConnectionStatus.FAILURE;
import static pl.tau.lab02.messenger.ConnectionStatus.SUCCESS;
import pl.tau.lab02.messenger.MalformedRecipientException;
import pl.tau.lab02.messenger.MessageService;
import pl.tau.lab02.messenger.SendingStatus;
import static pl.tau.lab02.messenger.SendingStatus.SENDING_ERROR;
import static pl.tau.lab02.messenger.SendingStatus.SENT;


public class Messenger {

	private MessageService ms;

	public Messenger(MessageService ms) {
		this.ms = ms;
	}

	public int testConnection(String server) {
		switch (ms.checkConnection(server)) {
		case FAILURE:
			return 1;
		case SUCCESS:
			return 0;
		}
		return 1;
	}

	public int sendMessage(String server, String message) {
		int result = -1;
                
		try {
			SendingStatus sStatus = ms.send(server, message);
			switch (sStatus) {
			case SENT:
				result = 0;
				break;
			case SENDING_ERROR:
				result = 1;
				break;
			default:
				result = -1;
			}

		} catch (MalformedRecipientException e) {
			result = 2;
		}
		return result;
	}
}
