package exercicesPOO.encapsulation.trainwreck.service;

import exercicesPOO.encapsulation.trainwreck.Rental;

public class RentalService {

	public double confirmRental(Rental rental) {
	/*------------here is the problem-----------------------------*/
		double totalDaily = rental.getVehicle().getGroup()
				.getDailyValue() * rental.getDailyAmount();
	/*-----------------------------------------------------------*/	
		rental.getVehicle().setAvailable(false);
		return totalDaily;
	}
	
}
