package exercicesPOO.encapsulation;

import java.io.Serializable;

public class Card implements Serializable{

	
	private static final long serialVersionUID = 1L;
	public static final double DEPOSIT_FEE = 0.10;
	public static final double MINIMUM_DEPOSIT_AMOUNT = 50;
	
	private String owner;
	private double balance;
	private boolean active;
	
	public Card() {
		
	}
	public Card(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	public boolean isActive() {
		return active;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setOwner(String owner) {
		this.owner = owner;
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
