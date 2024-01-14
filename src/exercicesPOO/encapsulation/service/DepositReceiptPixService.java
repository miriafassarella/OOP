package exercicesPOO.encapsulation.service;

import exercicesPOO.encapsulation.Card;
import exercicesPOO.encapsulation.Receipt;

public class DepositReceiptPixService {
	
	public Receipt makeDeposit (Card card, double depositValue) {
		
		card.deposit(depositValue);;
		
		return new Receipt(card.getOwner(), "Deposit", depositValue);
	} 

}
