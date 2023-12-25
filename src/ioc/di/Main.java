package ioc.di;

import ioc.di.model.Client;
import ioc.di.notifier.NotifierEmail;
import ioc.di.notifier.NotifierSMS;
import ioc.di.service.ActivationClientService;

public class Main {

	public static void main(String[] args) {
		Client jean = new Client("Jean","jean@gmail.com", "234567788" );
		Client marie = new Client("Marie","marie@gmail.com", "099876445" );
		
		NotifierSMS notifier = new NotifierSMS();
		
		ActivationClientService activationClient = new ActivationClientService(notifier);
		activationClient.activate(marie);
		activationClient.activate(jean);
		
		
	}
}
