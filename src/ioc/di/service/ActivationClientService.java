package ioc.di.service;

import ioc.di.model.Client;
import ioc.di.notifier.Notifier;

public class ActivationClientService {

	Notifier notifier;
	
	public ActivationClientService(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void activate(Client client) {
		client.activate();
		
		notifier.notifier(client, "your registration in the system is active.");
	}
	}
	
	
