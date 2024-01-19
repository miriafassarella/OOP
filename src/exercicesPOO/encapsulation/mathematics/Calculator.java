package exercicesPOO.encapsulation.mathematics;

public class Calculator {
	
	/*utility class*/
	private Calculator() {
		
	}
	
	public static final double Pi = 3.14159265358979323846;
	
	public static double calculateAreaOfSquare(double average) {
		return average * average;
	}

	public static double calculateAreaOfCircle(double radius) {
		return radius * radius * Calculator.Pi;
	}
	}

