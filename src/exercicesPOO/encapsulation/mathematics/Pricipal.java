package exercicesPOO.encapsulation.mathematics;

public class Pricipal {
	
	public static void main(String[] args) {
		
		/*Calculator calculator = new Calculator();*/
		
		double areaOfSquare = Calculator.calculateAreaOfSquare(5.2);

		double areaOfCircle = Calculator.calculateAreaOfCircle(10.5);
		
		System.out.printf("PI: %.2f%n", Calculator.Pi);
		
		System.out.printf("Area of square: %.2f%n", areaOfSquare);
		System.out.printf("Area of circle: %.2f%n", areaOfCircle);
	}
	
}