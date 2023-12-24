package exercicesPOO.interfaces.cashier;

import exercicesPOO.interfaces.imprimer.Printer;
import exercicesPOO.interfaces.payment.Card;
import exercicesPOO.interfaces.payment.Operator;

public class Checkout {
	
	private Operator operator;
	private Printer printer;
	
	public Checkout(Operator operator, Printer printer) {
		
		this.operator = operator;
		this.printer = printer;
	}
	
	public void buyClose(Buy buy, Card card) {
		boolean authorization = this.operator.authorize(buy, card);
		
		if(authorization) {
			this.printer.printOut(buy);
		}else {
			System.out.println("Payment was denied!");
		}
	}

	
}
