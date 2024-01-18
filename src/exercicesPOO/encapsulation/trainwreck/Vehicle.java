package exercicesPOO.encapsulation.trainwreck;

public class Vehicle {

	private String plate;
	private boolean available = true;
	private VehicleGroup group;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String plate, VehicleGroup group) {
		this.plate = plate;
		this.group = group;
	}
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}

	public VehicleGroup getGroup() {
		return group;
	}

	public void setGroup(VehicleGroup group) {
		this.group = group;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public double getDailyValue() {
	
		return group.getDailyValue();
	}
	
	
}
