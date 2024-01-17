package exercicesPOO.encapsulation.trainwreck;

public class Rental {
	
	private Vehicle vehicle;
	private int dailyAmount;
	
	public Rental() {
		
	}
	
	public Rental(Vehicle vehicle, int dailyAmount) {
		this.vehicle = vehicle;
		this.dailyAmount = dailyAmount;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getDailyAmount() {
		return dailyAmount;
	}

	public void setDailyAmount(int dailyAmount) {
		this.dailyAmount = dailyAmount;
	}
	
}
