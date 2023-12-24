package exercicesPOO.composition;

public class Main {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Miria Fassarella";
		person1.nas = "978.345.345";
		person1.yearOfBirth = 1994;
		
		Person person2 = new Person();
		person2.name = "Adriano Braga";
		person2.nas = "978.345.345";
		person2.yearOfBirth = 1983;
		
		Car car1 = new Car();
		car1.model = "Civic";
		car1.color = "White";
		car1.yearOfManufacture = 2017;
		car1.owner = person1;
		
		Car car2 = new Car();
		car2.model = "Infinity";
		car2.color = "Red";
		car2.yearOfManufacture = 2020;
		car2.owner = person2;
		
		System.out.println("Model: " + car1.model);
		System.out.println("Color: " + car1.color);
		System.out.println("Manufacture: " + car1.yearOfManufacture);
		System.out.println("Owner: " + car1.owner.name);
		
		System.out.println("--------------------------");
		System.out.println("Model: " + car2.model);
		System.out.println("Color: " + car2.color);
		System.out.println("Manufacture: " + car2.yearOfManufacture);
		System.out.println("Owner: " + car2.owner.name);
	}

}
