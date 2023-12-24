package exercicesPOO.constructor;

public class Livre {
	
	String auteur;
	int pages;
	
	Livre(String auteur){
		this.auteur = auteur;
	}
	
	Livre(String auteur, int pages){
		this(auteur);
		this.pages = pages;
	}

	public static void main(String[] args) {
		Livre livre1 = new Livre("Herbet Schildt");
		
		Livre livre2 = new Livre("Harvey Deitel", 968);
		
		System.out.println(livre1.auteur + " - " + livre1.pages);
		
		System.out.println(livre2.auteur + " - " + livre2.pages);
	}
}
