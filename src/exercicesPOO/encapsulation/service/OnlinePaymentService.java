package exercicesPOO.encapsulation.service;

import exercicesPOO.encapsulation.Card;
import exercicesPOO.encapsulation.Establishment;
import exercicesPOO.encapsulation.Receipt;

public class OnlinePaymentService {

	public Receipt makePayment(Establishment establishment,
			Card card, double valuePayment) {
		
		
		
		card.debit(valuePayment);;
		
		return new Receipt(card.getOwner(), "Payment", valuePayment);
	}
}
