package exercicesPOO.surcharge;

public class TestMachineCafe {
	
	public static void main(String[] args) {
		
		MachineCafe machine1 = new MachineCafe();
		
		machine1.sucreDisponible = 30;
		
		machine1.fairerCafe(10);
		machine1.fairerCafe(15);
		machine1.fairerCafe();
	}

}
