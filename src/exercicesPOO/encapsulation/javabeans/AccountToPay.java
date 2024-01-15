package exercicesPOO.encapsulation.javabeans;

import java.io.Serializable;

public class AccountToPay implements Serializable{
	
	private String description;
	private double balance;
	private String dueDate;
	private boolean paid;
	
	Supplier supplier;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public boolean isPending() {
		return !isPaid();
	}
	public void pay() {
		if(isPaid()) {
			throw new RuntimeException("A conta já foi paga!");
		}
		setPaid(true);	
	}
	public void cancelPayment() {
		if(isPending()) {
			throw new RuntimeException("A conta ainda não foi paga!");
			
		}else {
			paid = false;
		}
		
	}

}
