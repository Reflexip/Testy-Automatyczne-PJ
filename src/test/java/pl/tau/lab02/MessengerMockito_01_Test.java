/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tau.lab02;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import pl.tau.lab02.app.Messenger;
import pl.tau.lab02.messenger.ConnectionStatus;
import pl.tau.lab02.messenger.MalformedRecipientException;
import pl.tau.lab02.messenger.MessageService;
import pl.tau.lab02.messenger.MessageServiceSimpleImpl;
import pl.tau.lab02.messenger.SendingStatus;


@RunWith(MockitoJUnitRunner.class)
public class MessengerMockito_01_Test {

	private static final String VALID_SERVER = "inf.ug.edu.pl";
	private static final String VALID_MESSAGE = "some message";
	private static final String INVALID_SERVER = "inf.ug.edu.eu";
	private static final String INVALID_MESSAGE = "ab";

	@Mock
	MessageService messageService;
	@InjectMocks
	Messenger message = new Messenger(new MessageServiceSimpleImpl());

	@Test
	public void connectionStatusValidServerTest() {
		when(messageService.checkConnection(VALID_SERVER)).thenReturn(ConnectionStatus.SUCCESS);
		assertEquals(0, message.testConnection(VALID_SERVER));
	}
	
	@Test
	public void connectionStatusInvalidServerTest() {
		when(messageService.checkConnection(INVALID_SERVER)).thenReturn(ConnectionStatus.FAILURE);
		assertEquals(1, message.testConnection(INVALID_SERVER));
	}

	@Test
	public void sendingStatusValidServerValidMessageTest() throws MalformedRecipientException {
		when(messageService.send(VALID_SERVER, VALID_MESSAGE)).thenReturn(SendingStatus.SENT);
		assertEquals(0, message.sendMessage(VALID_SERVER, VALID_MESSAGE));
	}

	@Test
	public void sendingStatusValidServerInvalidMessageTest() throws MalformedRecipientException {
		when(messageService.send(VALID_SERVER, INVALID_MESSAGE)).thenThrow(new MalformedRecipientException())
				.thenReturn(SendingStatus.SENDING_ERROR);
		assertEquals(2, message.sendMessage(VALID_SERVER, INVALID_MESSAGE));
	}

	@Test
	public void sendingStatusInvalidServerValidMessageTest() throws MalformedRecipientException {
		when(messageService.send(INVALID_SERVER, VALID_MESSAGE)).thenReturn(SendingStatus.SENDING_ERROR);
		assertEquals(1, message.sendMessage(INVALID_SERVER, VALID_MESSAGE));
	}

	@Test
	public void sendingStatusInvalidServerInvalidMessageTest() throws MalformedRecipientException {
		when(messageService.send(INVALID_SERVER, INVALID_MESSAGE)).thenReturn(SendingStatus.SENDING_ERROR);
		assertEquals(1, message.sendMessage(INVALID_SERVER, INVALID_MESSAGE));
	}
}