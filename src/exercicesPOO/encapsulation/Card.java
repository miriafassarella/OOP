package exercicesPOO.encapsulation;

public class Card {

	public static final double DEPOSIT_FEE = 0.10;
	public static final double MINIMUM_DEPOSIT_AMOUNT = 50;
	
	private String owner;
	private double balance;
	
	public Card(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void debit(double debitValue) {
		if(getBalance() < debitValue) {
			throw new RuntimeException("Saldo insuficiente para pagamento.");
		}
		this.balance -= debitValue;
	}
	public void deposit(double depositValue) {
		if(depositValue < MINIMUM_DEPOSIT_AMOUNT) {
			throw new IllegalArgumentException(String.format(
					"Valor do depósito não pode ser menor que %.2f",
					MINIMUM_DEPOSIT_AMOUNT));
		}
		this.balance += depositValue - DEPOSIT_FEE;
	}
}
