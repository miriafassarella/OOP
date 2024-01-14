package exercicesPOO.encapsulation;

import exercicesPOO.encapsulation.service.DepositReceiptPixService;
import exercicesPOO.encapsulation.service.OnlinePaymentService;

public class Principal {

	public static void main(String[] args) {
		
		var supermarket = new Establishment("Super C");
		var card = new Card("Miriã Fassarella");
		
		var depositService = new DepositReceiptPixService();
		Receipt receiptDeposit = depositService.makeDeposit(card, 500);
		receiptDeposit.print();
		
		var paymentService = new OnlinePaymentService();
		Receipt receiptPayment = paymentService.makePayment(supermarket,
				card, 100);
		receiptPayment.print();
		
		
		
		System.out.printf("Woner: %s%n", card.getOwner());
		System.out.printf("Balance: R$%.2f%n", card.getBalance());
	}
}
