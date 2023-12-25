package ioc.di.notifier;

import ioc.di.model.Client;

public class NotifierEmail implements Notifier {
	
	@Override
	public void notifier(Client client, String message) {
		System.out.printf("Notifying the customer %s via email %s: %s\n",
				client.getName(), client.getMail(), message);
}
}