package exercicesPOO.encapsulation.trainwreck;

import exercicesPOO.encapsulation.trainwreck.service.RentalService;

public class Principal {

	VehicleGroup group = new VehicleGroup("group 1", 7);
	Vehicle vehicle = new Vehicle("DF4RF6", group);
	Rental rental = new Rental(vehicle, 2);
	
	RentalService rentalService = new RentalService();
	
	
	
}
