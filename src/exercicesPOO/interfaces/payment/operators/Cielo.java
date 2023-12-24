package exercicesPOO.interfaces.payment.operators;

import exercicesPOO.interfaces.payment.Authorization;
import exercicesPOO.interfaces.payment.Card;
import exercicesPOO.interfaces.payment.Operator;

public class Cielo implements Operator {

	@Override
	public boolean authorize(Authorization authorization, Card card) {
		
		return card.getCardNumber().startsWith("123") && authorization.getTotalValue() < 100;
	}

}
