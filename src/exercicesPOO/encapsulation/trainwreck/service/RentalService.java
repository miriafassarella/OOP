package exercicesPOO.encapsulation.trainwreck.service;

import exercicesPOO.encapsulation.trainwreck.Rental;

public class RentalService {

	public void confirmRental(Rental rental) {
	/*------------here is the problem-----------------------------*/
	/* double totalDaily = rental.getDailyValue() * rental.getDailyAmount(); */
	/*-----------------------------------------------------------*/	
		double totalDaily = rental.calculateTotalDaily();
		rental.reserveVihicle();
		
	}
	
}
