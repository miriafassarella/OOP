package exercicesPOO.varargs;

public class BillingService {
	
	void pay(Invoice invoice, String... mailBilling) {
		System.out.printf("Invoice %d, of the total price R%.2f, it was paid!%n",
				invoice.number, invoice.priveTotal);
		
		for(String mail : mailBilling) {
			System.out.printf("Invoice %d was sent to %s%n", invoice.number, mail);
		}
	}
	
	void average(double number1, double number2, double ...others) {
		
		double totalPartial = number1 + number2;
		int numberOfElements = others.length + 2;
		
		for(double other : others) {
			totalPartial += other;
		}
		System.out.println( "This is the average : " + (totalPartial /numberOfElements));
		
		
	}
	
	

}
