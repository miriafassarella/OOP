package exercicesPOO.interfaces;

import exercicesPOO.interfaces.cashier.Buy;
import exercicesPOO.interfaces.cashier.Checkout;
import exercicesPOO.interfaces.imprimer.Printer;
import exercicesPOO.interfaces.imprimer.printers.PrinterEpson;
import exercicesPOO.interfaces.imprimer.printers.PrinterHP;
import exercicesPOO.interfaces.payment.operators.RedeCard;
import exercicesPOO.interfaces.payment.Card;
import exercicesPOO.interfaces.payment.Operator;
import exercicesPOO.interfaces.payment.operators.Cielo;

public class Main {
	
	public static void main(String[] args) {
		
		Operator operator = new RedeCard();
		Printer printer = new PrinterHP();
		
		
		Card card = new Card();
		card.setHolderName("Miria Fassarella");
		card.setCardNumber("456");
		
		Buy buy = new Buy();
		buy.setClientName("Miria Fassarella Braga");
		buy.setProduct("Soap");
		buy.setTotalValue(150);
		
		Checkout checkout = new Checkout(operator, printer);
		checkout.buyClose(buy, card);
		
	}

}
