package exercicesPOO;

public class Voiture {
	
	String fabricant;
	String modele;
	String  couleur;
	int annee;
	
	Proprietaire proprietaire;
	
	void demarrerVoiture() {
		
		if(modele == null) {
			return; //faire attention
		}
		System.out.println("Démarrer la voiture "+ modele);
	}

}


