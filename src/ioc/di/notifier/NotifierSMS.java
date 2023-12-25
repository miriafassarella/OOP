package ioc.di.notifier;

import ioc.di.model.Client;

public class NotifierSMS implements Notifier{

	@Override
	public void notifier(Client client, String message) {
		System.out.printf("Notifying the customer %s via phone %s: %s\n",
				client.getName(), client.getPhone(), message);
	}
}
