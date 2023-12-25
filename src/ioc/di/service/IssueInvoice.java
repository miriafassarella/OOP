package ioc.di.service;

import ioc.di.model.Client;
import ioc.di.model.Product;
import ioc.di.notifier.Notifier;

public class IssueInvoice {
	
	Notifier notifier;
	
	public IssueInvoice(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void issue(Client client, Product product) {
		
		notifier.notifier(client, "The product invoice" + product.getName() +
				"was issued!");
	}

}
