package ioc.di.notifier;

import ioc.di.model.Client;

public interface Notifier {
	
	void notifier(Client client, String message);

}
