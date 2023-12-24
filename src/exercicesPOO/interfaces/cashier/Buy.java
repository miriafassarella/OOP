package exercicesPOO.interfaces.cashier;

import exercicesPOO.interfaces.imprimer.Printable;
import exercicesPOO.interfaces.payment.Authorization;

public class Buy implements Authorization, Printable{
	
	private double totalValue;
	private String product;
	private String clientName;

	 
	
	//implementando uma interface, seguindo seu contrato.
	//Ela segue o contrato quando ela implementa todos os metodos de authorization
	 //sobrescreve de Authorization
	
	@Override
	public double getTotalValue() {
		return this.totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Override
	public String getPageHeader() {
		
		return this.getProduct() + " = " + this.getTotalValue();
	}

	@Override
	public String getBodyPage() {
		
		return this.getClientName();
	}
	
	

}
