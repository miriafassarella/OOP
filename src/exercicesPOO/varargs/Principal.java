package exercicesPOO.varargs;

public class Principal {

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		invoice.number = 123;
		invoice.priveTotal = 1293.55;
		
		
		 BillingService billingService = new BillingService(); 
			/* String[] mailBilling = {"miria@gmail.com"}; */
		 
		
		
		
			/* billingService.pay(invoice, new String[] {"miria@gmail.com"}); */ 
		 
			/*
			 * billingService.pay(invoice, new String[0]); billingService.pay(invoice, new
			 * String[]{});
			 */
		 /*billingService.pay(invoice, ...mailBilling: "miria@gmail.com");  ???*/ 
		 billingService.pay(invoice);
	}
	
}
