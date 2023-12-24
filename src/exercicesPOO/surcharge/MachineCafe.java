package exercicesPOO.surcharge;

public class MachineCafe {

	
	int sucreDisponible;
	
	void fairerCafe(int quantiteSucre) {
		if(sucreDisponible < quantiteSucre) {
			System.out.println("Il n'a pas assez de sucre pour faire ton cafe :(");
		}else {
			sucreDisponible -= quantiteSucre;
			System.out.println("On prepare ton cafe avec " + quantiteSucre + " de sucre :)");
		}
	}
	
	void fairerCafe() {
		fairerCafe(10);
	}
}
