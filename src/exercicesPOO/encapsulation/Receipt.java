package exercicesPOO.encapsulation;

public class Receipt {
	
	public String woner;
	public String description;
	public double cashValue;

	public Receipt(String woner, String description,
			double cashValue) {
		
		this.woner = woner;
		this.description = description;
		this.cashValue = cashValue;
		
	}
	
	public void print() {
		System.out.println("--------------");
		System.out.printf("Receipt to %s%n", woner);
		System.out.printf("%s -> %.2f%n", description, cashValue);
		System.out.println("---------------");
	}
}
