package exercicesPOO.interfaces.payment.operators;

import exercicesPOO.interfaces.payment.Authorization;
import exercicesPOO.interfaces.payment.Card;
import exercicesPOO.interfaces.payment.Operator;

public class RedeCard implements Operator {

	@Override
	public boolean authorize(Authorization authorization, Card card) {
		
		return card.getCardNumber().startsWith("456") && authorization.getTotalValue() < 200;
	}

}
