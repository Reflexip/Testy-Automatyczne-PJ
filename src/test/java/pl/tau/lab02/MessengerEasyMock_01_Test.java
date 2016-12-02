package pl.tau.lab02;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import org.easymock.EasyMockRunner;
import org.junit.Before;
import org.junit.Test;
import pl.tau.lab02.app.Messenger;
import pl.tau.lab02.messenger.ConnectionStatus;
import pl.tau.lab02.messenger.MessageService;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import pl.tau.lab02.messenger.MalformedRecipientException;
import pl.tau.lab02.messenger.SendingStatus;


@RunWith(EasyMockRunner.class)
public class MessengerEasyMock_01_Test {
    
    private final String VALID_SERVER = "inf.ug.edu.pl";
    private final String INVALID_SERVER = "inf.ug.edu.eu";    
    private final String VALID_MESSAGE = "Some message";
    private final String INVALID_MESSAGE = "cz";
    
    //System under tests
    private Messenger messenger;
    private MessageService mock;
    
    @Before
    public void setUp(){
        mock = createMock(MessageService.class);
        messenger = new Messenger(mock);
    }
    
    @Test
    public void checkValidServerConnection(){
        expect(mock.checkConnection(VALID_SERVER)).andReturn(ConnectionStatus.SUCCESS);
        replay(mock);
        assertEquals(0, messenger.testConnection(VALID_SERVER));  
    }
    
    @Test
    public void checkInvalidServerConnection(){
        expect(mock.checkConnection(INVALID_SERVER)).andReturn(ConnectionStatus.FAILURE);
        replay(mock);    
        assertEquals(1, messenger.testConnection(INVALID_SERVER));  
    }
    
    @Test
	public void sendingStatusValidServerValidMessageTest() throws MalformedRecipientException {
		expect(mock.send(VALID_SERVER, VALID_MESSAGE)).andReturn(SendingStatus.SENT);
		replay(mock);
		assertEquals(0, messenger.sendMessage(VALID_SERVER, VALID_MESSAGE));
	}

	@Test
	public void sendingStatusValidServerInvalidMessageTest() throws MalformedRecipientException {
		expect(mock.send(VALID_SERVER, INVALID_MESSAGE)).andThrow(new MalformedRecipientException()).andReturn(SendingStatus.SENDING_ERROR);
		replay(mock);
		assertEquals(2, messenger.sendMessage(VALID_SERVER, INVALID_MESSAGE));
	}

	@Test
	public void sendingStatusInvalidServerValidMessageTest() throws MalformedRecipientException {
		expect(mock.send(INVALID_SERVER, VALID_MESSAGE)).andReturn(SendingStatus.SENDING_ERROR);
		replay(mock);
		assertEquals(1, messenger.sendMessage(INVALID_SERVER, VALID_MESSAGE));
	}

	@Test
	public void sendingStatusInvalidServerInvalidMessageTest() throws MalformedRecipientException {
		expect(mock.send(INVALID_SERVER, INVALID_MESSAGE)).andReturn(SendingStatus.SENDING_ERROR);
		replay(mock);
		assertEquals(1, messenger.sendMessage(INVALID_SERVER, INVALID_MESSAGE));
	}
    
    
    
    
}
