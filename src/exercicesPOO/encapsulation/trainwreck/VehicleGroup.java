package exercicesPOO.encapsulation.trainwreck;

public class VehicleGroup {

	private String name;
	private double dailyValue;
	
	public VehicleGroup() {
		
	}
	public VehicleGroup(String name, double dailyValue) {
		this.name = name;
		this.dailyValue = dailyValue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDailyValue() {
		return dailyValue;
	}
	public void setDailyValue(double dailyValue) {
		this.dailyValue = dailyValue;
	}
	
}
