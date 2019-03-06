package client;

import java.io.IOException;
import server.Action;
import server.MessageBox;

public class ClientListener implements Runnable {
	private Client client;
	private ClientHandler handler;

	public ClientListener(Client client) {
		this.client = client;
		this.handler = new ClientHandler(client);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				MessageBox mb = (MessageBox)client.getInput().readObject();
				//handler.handle(mb);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
